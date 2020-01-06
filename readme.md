Chapter 1:-
- Setting up Spring
- Spring concepts
	- container
	- dependency injection types
		- getters & setters
		- constructor
	- spring configuration file
	- DI using Setters
		- Types of value
			- value
			- List
			- Set
			- Map
			- Objects
		- Types of setter types
			- `attribute` method
			- `p schema` method
			- `ref` method
			- `inner beans` method
		- Types of initialization & destruction
			- XML config Method (init-method & destroy-method)
			- ImplementingClass (InitializingBean, DisposableBean)
			- Spring Annotations (@PreInit, @PostDestroy)
				- use <context:annotation-config> to enable spring annotations
			- Note : Use `class="org.springframework.context.annotation.CommonAnnotationBeanPostProcessor"` to enable init & destruct.
	- DependencyCheck
		- using `@Required` Annotation
			- to enable @Required annotation support : use class="org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor" in config.xml
		- using `inner beans`
		- Bean scopes
			- singleton
			- prototype
			- request
			- session
			- globalsession
	- Constructor Injection
		- using constructor-arg
			- <value> tag
			- attribute
			- c-schema
		- ambiguity problem
			- to solve we use
				- type (int, double, string)
				- index (index of the constructor)
				- name (name of the attribute)
		
		