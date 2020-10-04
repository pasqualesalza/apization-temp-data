package com.stackoverflow.api;

/**
 * How to manually set an authenticated user in Spring Security / SpringMVC
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4672083">https://stackoverflow.com/a/4672083</a>
 */
public class APIzator4672083 {

  public static String registerUser(
    UserRegistrationFormBean userRegistrationFormBean,
    RequestContext requestContext,
    ExternalContext externalContext
  ) {
    try {
      Locale userLocale = requestContext.getExternalContext().getLocale();
      this.userService.createNewUser(
          userRegistrationFormBean,
          userLocale,
          Constants.SYSTEM_USER_ID
        );
      String emailAddress = userRegistrationFormBean
        .getChooseEmailAddressFormBean()
        .getEmailAddress();
      String password = userRegistrationFormBean
        .getChoosePasswordFormBean()
        .getPassword();
      doAutoLogin(
        emailAddress,
        password,
        (HttpServletRequest) externalContext.getNativeRequest()
      );
      return "success";
    } catch (EmailAddressNotUniqueException e) {
      MessageResolver messageResolvable = new MessageBuilder()
        .error()
        .source(UserRegistrationFormBean.PROPERTYNAME_EMAIL_ADDRESS)
        .code("userRegistration.emailAddress.not.unique")
        .build();
      requestContext.getMessageContext().addMessage(messageResolvable);
      return "error";
    }
  }

  private void doAutoLogin(
    String username,
    String password,
    HttpServletRequest request
  ) {
    try {
      // Must be called from request filtered by Spring Security, otherwise SecurityContextHolder is not updated
      UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(
        username,
        password
      );
      token.setDetails(new WebAuthenticationDetails(request));
      Authentication authentication =
        this.authenticationProvider.authenticate(token);
      logger.debug("Logging in with [{}]", authentication.getPrincipal());
      SecurityContextHolder.getContext().setAuthentication(authentication);
    } catch (Exception e) {
      SecurityContextHolder.getContext().setAuthentication(null);
      logger.error("Failure in autoLogin", e);
    }
  }
}
