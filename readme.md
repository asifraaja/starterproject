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
	- PropertyPlaceholder
		- Allows to inject property from property files
		- <context:property-placeholder location="LOCATION_OF_THE PROPERTY_FILE" />
		- Use ${PropertyName} to inject the property
	- Autowiring
		- Inject objects as dependency without using ref tag
		- Types
			- XML
				- ByType 
				- ByName
				- ByConstructor
			- Annotations
				- @Autowired
					- It can be used in all (setter, variableDeclartion & constructor)
				- @Qualifier
					- Should be used along with @Autowired
					- It allows to inject based on the name of the dependencyBean
	- Standalone Collections
		- Create a collection (list, set or map) and use it multiple time using the id of the collection
		- It uses `util` schema.
		- Syntax : <util:COLLECTION_NAME COLLECTION_NAME-class="TYPE_OF_COLLECTION" id="ID"></util>
	- Stereotypes
		- def: Use annotations for DI
		- @Component
			- Creates an object of the class 
			- ByDefault uses camelCase to create instances of object
			- <context:component-scan> must be used in config.xml to use the annotation
				- This tag scans for all the components in the base-package specified & creates objects
				- syntax: <context:component-scan base-package="basePackageName"/> 
		- @Scope
			- sets the scope of the component
			- ByDefault is `singleton`
			- Other scopes are `prototype`, `request`, `session`  & `globalsession`
			- syntax: @Scope(scopeType)
		- @Value
			- Injects the value for a variable
				- PrimitiveTypes
					- `@Value("value")` - straightforward
				- CollectionTypes
					- Create a collection in xml using 'util' schema
					- Then use the name of the util in the annotation
					- syntax: `@Value("#{nameOfUtilCollection}")`
				- Object Types
					- Inject it using `@Autowired` & `@Qualifier` annotations
	- Spring Expression Language
		
		
		