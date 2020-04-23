# Online-Bank-UserFront
Online Bank With Java, Angular 2 and Spring

#Notes
## Thymeleaf syntax
`<div th:fragment="common-header" ></div>`
**th** = thymeleaf
can have other keywords
**fragment** = Assigning/registering the section, reference so that can be used from other templates 

`<head th:replace="common/header :: common-header"/>`
**replace** = replaces section using given fragment 
**common/header** = same level of index so common is used, relative path of folder
**::** = calls a fragment
**common-header** = fragment name

`<div class="bg-danger" th:if="${param.error}">
                Invalid username and secret.
     </div>`
**th:if="${param.error}"** = if true the div will be displayed





## Spring syntax
`@Controller` annotation
registers the class as a controller

`@RequestMapping("/")`
register path mapping for root path

`@Transactional` annotation
transaction propagation are handled automatically

`"redirect:/index"`
redirects to given path (to index) spring boot automatically handles because thymeleaf(template engine) is added
the return string will be recognized as template name (index.html)

`<form class="form-horizontal" method="post" th:action="@{/signup}">`
submits form in post method
th:action="@{/signup}" = points to path /signup

`<input type="text" th:value="${user.firstName}" id="firstName" name="firstName" roleId="firstname"  placeholder="Enter your first name" required="required"/>`
th:value="${user.firstName}" = assumes a user object is already binding to html with field firstName which are defined in the user Domain Object
name="firstName" = has to be same as the field defined in the Domain Object (domain/User.java line 15 firstName)

`@RequestMapping(value = "/signup", method = RequestMethod.GET)`
get method

`public String signupPost(@ModelAttribute("user") User user, Model model)`
@ModelAttribute("user") = retrieve a variable "user" from context of the submitted html form
User user = Then gives the value to the User object defined and bind it to the new user instance


`@OneToMany(mappedBy = "primaryAccount", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
@JsonIgnore
private List<PrimaryTransaction> primaryTransactionList;`
**CascadeType.ALL**: Any action updated will be propagated to related class
**FetchType.LAZY**: When instantiating PrimaryAccount class it will not fetch any values from primaryTransactionList unless needed
**@JsonIgnore**: Rounded reference relationship, when trying de-serialize to json format it will go into an infinite loop.
This will break the loop by ignoring when trying to return the json format of the object
 
`@Column(name = "userId", nullable = false, updatable = false)
     private Long userId;`
**nullable**:Cannot be empty
**updatable**: Cannot be updated

`findBy` example findByUsername in `public interface UserDao extends CrudRepository<User, Long> {`
Spring boot identifies findBy in the naming pattern and it will recognize that we are trying to retrieve a specific data.
It will assume that we have username in User class.

##Spring Security

        `httpSecurity
                .authorizeRequests()
                .antMatchers(PUBLIC_MATCHERS)
                .permitAll().anyRequest().authenticated();`
Authorization for all matchers in PUBLIC_MATCHERS will permitted otherwise any request which does not match will be authenticated

        `httpSecurity
                .csrf().disable().cors().disable()
                .formLogin().failureUrl("/index?error").defaultSuccessUrl("/userFront").loginPage("/index").permitAll()
                .and()
                .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/index?logout").deleteCookies("remember-me").permitAll()
                .and()
                .rememberMe();`
csrf and cors disabled protection from cors attacks  and avoid cross origin issues
deleteCookies("remember-me") will delete cookies of remember me function and disable user remember me function 
rememberMe() adds remember me function         

**GrantedAuthority**: Represents an authority granted to an _Authentication_ object.

**Authentication**: Represents the token for an authentication request or for an authenticated principal once the request has been processed by the AuthenticationManager.authenticate(Authentication) method.

**UserDetailsService**: Core interface which loads user-specific data. It is used throughout the framework as a user DAO and is the strategy used by the DaoAuthenticationProvider.

 ##Persistence
Using Hibernate


#DDL
CREATE SCHEMA `onlinebanking` ;