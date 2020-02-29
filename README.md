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

 ##Persistence
Using Hibernate
