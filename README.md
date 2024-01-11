================================= Interview Quetions =====================================================

=========================== Core Java ==================================
1)  How HashMap workes internally
2) Java support for multiple inheritence ?




================================ JDK-8 =================================
1) Funtional interface ?
2) JVM level changes in jdk-8 ?

======================================== Collection Framework =================================
1) Insertion and reading which operation is good in HashSet and TreeSet


===============================================================================================

1) How to configure load balancer ?


========================= Spring ==============================

1) DI --> Dependency Injetion 

			1) Setter Injection
			2) COnstructor Injection
			3) Fileds Injection
			
2) Which Is the Best Way of Injecting Beans and Why	?
		1) Setter injection --> is for Optional fileds 
		2) COnstruction injection --> is for mandatory dependencies and constructor injection allows injecting values to immutable fileds and makes testing easier  
		
3) Difference Between BeanFactory and ApplicationContext?
         1) Bean Factory --> Bean Factory is interface represent a container that provides and manage bean instances and default implementation is lazy initilization when getBean() method called 
		 2) ApplicationContext --> ApplicationContext is interface that contains all the information (Bean & Metadata), it extends bean factory interface and its provide eager intantiation of beans when the application starts.
		 
4) What Is a Spring Bean?

	Spring Beans are the Java objects that are initialized by the Spring IOC Container.
	And default bean scope is Singleton.
		
		
5) Bean define and Difference ?

	1) Singleton       --> This creates a single bean instance per Spring IoC container
	2) Prototype       --> This creates a new bean instance each time when requested
	3) Request         --> This creates a single bean instance per HTTP request. It is valid only in the context of a web application
	4) Session         --> This creates a single bean instance per HTTP session. It is valid only in the context of a web application
	5) Global Session  --> This creates a single bean instance per global HTTP session. It is valid only in the context of a portal application
	
	
	@Scope("Prototype")
	
	
6) Bean Lifecycle -->
		1) Bean defination loaded
		2) Post Processor Bean Defination
		3) Intantiation Beans & Setters Callled   --> Dependency Injetion
		4) Create and initialize Beans (Bean Post Processors) --> 1) BPP 2) Initializer 3) BPP
		5) Bean Ready for use
=======================================================================================================
============================================ MicroServices =========================================
1) What are the Design patters 
2) How to configure Mucroservice

Design Patterns -->

1) SAGA (choreography and orchestration)
2) CQRS
3) API Gateway
4) Circuite Breaker 


================================================================== Design Patterns =========================s
1) builder Design pattern ?

============================== Data Base ================================

1) difference between primary key and unique key

2) difference between trunc and delete

3) types of index in Database
4) How Store procedure is differ from Query ?
			Store Procedure is more faster and performence is good for Store procedure 
		1) Stored procedure will not compile again and again where simple Query compile every time then execute.
		2) Stored procedure execute server side that's why it reduces network traffic. SQL query also executes on server also but if you have big query then it will take   more time comparison to Stored Procedure to traverse from client side to server.	





=========================== Company asked quetions ==========================

========================= LTI Mindtree ====================

1) FInd count of male and female employee using jdk 8 based on the department
2) Java is better java   --> find duplicate from string using java 8 
3) circuitebreaker design pattern 
4) crucicle algorithm
5) Stratigic design patter 
6) difference between --> qualifier and required annotation
7) difference between --> prototype and session
8) How you define OnetoMany and manytoOne ?
9) difference between What is SOA and microservice architecture ?

================ Global Logic - MR round =================

1) What is invalidClass-exception 
2) Design SMS notification system 
3) CAP Thorem 
4) How to configure Authentication and authorization / where to configure - Security
5) One user can use one time credit card in a. month (So for an user - pmne transaction is allowed per User) - some microservices concept - retryAttempt
6)  What else we can perfomr on API gateway level - 
7) What is partitioning
8) Docker run command 
9) What basis you will choose MYSQL or noSQL db for your application


============== Inspera ===========================
1) A applicartion is work as scheduler which sent notificatiopn to user, so that applicartion we have deployed on 20 System - then it will send notification 20 times to same         user. so how can we restrict 
2) Out of 10 setter how can you generate only 8 setter methods (if used Lombok )
3) How to define more then one primary key using JPA entity ( @Embedded annotation )
4) If any Rest End point having performence issue, then what would be the steps to figure it out.
5) Write a program - one thread print even and one thread pring odd 
6) Difference between @Autowired & @Bean Annotation
7) What is use of Parallel Stream
8) 



====================================== Problem Solving ============================

1) Find paires of elemen whose sum is equal to given sum ?
2) Write a function which adds two positive  integers , these Strings can be very long (length up to 100) ?
		refer gitHub for solution - 
			1) https://github.com/dineshans/interview-preparation/blob/main/interview-quetion-problems/src/main/java/com/java/interviewproblems/asked/Array/SumOfNumberInputAsString.java
			2) https://github.com/dineshans/interview-preparation/blob/main/interview-quetion-problems/src/main/java/com/java/interviewproblems/asked/Array/SumOf2IntegerWithoutAnyRangeAsStringInput.java

3) Devide an Array in chunks by given splitSize K ?
	Solution - https://github.com/dineshans/interview-preparation/blob/main/interview-quetion-problems/src/main/java/com/java/interviewproblems/asked/Array/DevideArrayInChunksBygivenSplitSize.java

4) Find String which start with String = "do" ?
	Solution -> https://github.com/dineshans/interview-preparation/blob/main/interview-quetion-problems/src/main/java/com/java/interviewproblems/asked/String/FindStringStartWith.java





















====================================================================================================================================
=========================== Notes =============================================

========================= Spring ==============================

1) DI --> Dependency Injetion 

			1) Setter Injection
			2) COnstructor Injection
			3) Fileds Injection
			
2) Which Is the Best Way of Injecting Beans and Why	?
		1) Setter injection --> is for Optional fileds 
		2) COnstruction injection --> is for mandatory dependencies and constructor injection allows injecting values to immutable fileds and makes testing easier  
		
3) Difference Between BeanFactory and ApplicationContext?
         1) Bean Factory --> Bean Factory is interface represent a container that provides and manage bean instances and default implementation is lazy initilization when getBean() method called 
		 2) ApplicationContext --> ApplicationContext is interface that contains all the information (Bean & Metadata), it extends bean factory interface and its provide eager intantiation of beans when the application starts.
		 
4) What Is a Spring Bean?

	Spring Beans are the Java objects that are initialized by the Spring IOC Container.
	And default bean scope is Singleton.
		
		
5) Bean define and Difference ?

	1) Singleton       --> This creates a single bean instance per Spring IoC container
	2) Prototype       --> This creates a new bean instance each time when requested
	3) Request         --> This creates a single bean instance per HTTP request. It is valid only in the context of a web application
	4) Session         --> This creates a single bean instance per HTTP session. It is valid only in the context of a web application
	5) Global Session  --> This creates a single bean instance per global HTTP session. It is valid only in the context of a portal application
	
	
	@Scope("Prototype")
	
	
6) Bean Lifecycle -->
		1) Bean defination loaded
		2) Post Processor Bean Defination
		3) Intantiation Beans & Setters Callled   --> Dependency Injetion
		4) Create and initialize Beans (Bean Post Processors) --> 1) BPP 2) Initializer 3) BPP
		5) Bean Ready for use
		
		
		
=============================================================================================================================================================		
=============================== Spring Annotatios  ===============================================================

Spring Annotations Cheat sheet --> https://medium.com/@sureshkumar_95502/spring-spring-boot-annotations-cheat-sheet-de546e0b03d4

========== Spring core Annotations ===================
1) @Bean --> Create and return bean , spring container calls such methods automatically
2) @PostConstructor & @PreDestroy --> indicates Bean life cycle methods, 
									  1) @PostConstructor --> Its gets executed after the spring bean initilization.
									  2) @PreDestroy --> So its call when bean initialization gets removed from the application context.
3) @Configuration  --> This annotation used on class and its methods will have @Bean annotation / or has data memmbers annotated with @Value annotation
4) @Scope  --> @Scope("prototype") --> indicates Scope of a Bean such as Singleton, Prototype, Session etc.
5) @Lazy --> Bean needs to be create on demand (lazy loading), when there is explicit request.
6) @Autowired  --> Beans needs be automatically creates by Spring container.
7) @Qualifier —-> used along with @Bean or @Autowired to avoid ambiguity during Bean creation by Spring Container
8) @Primary --> When there are multiple qualified Beans, priority is given to the Bean annotated with @Primary

				@Configuration
				public class Config {

				@Bean
				public Employee JohnEmployee() {
				return new Employee("John");
				}

				@Bean
				@Primary
				public Employee TonyEmployee() {
				return new Employee("Tony");
				}
				}

9)  @Component  --> indicates a class as Component, so that it can be recognized by @ComponentScan, automatically and ll Component classes are automatically scanned and loaded by Spring Container
10) @ComponentScan  --> scans one or more packages/subpackages for Components
11) @Service  --> Components in Service Layer need to be annotated with @Service
12) @Repository —-> Components in Repository Layer need to be annotated with @Repository
13) @Controller  -->  is used to mark classes as Spring MVC Controller.
14) @RequestMapping --> the annotation is used to map web requests to Spring Controller methods.
						 Example -->
								@RequestMapping(value = "/ex/foos", method = RequestMethod.GET)
								
15) @Required --> It will be used on Setter Method level and make setter-injection compulsory, so if parameter value should not be null while creating Bean (Mandatory parameter to set )

------------------------------- Spring MVC Annotations ------------------------------------------

1) @Controller  --> annotation is used to indicate that it’s a web controller class
2) @RequestMapping is used with classes and methods to redirect the client request to specific handler method
3) @PathVariable
4) @RequestParam
5) @ModelAttribute
6) @RequestBody and @ResponseBody
7) @RequestHeader and @ResponseHeader

------------------------------ Spring Transactions Annotations -----------------------------------

1) @EnableTransactionManagement --> We can use to enable Transaction with @Configuration while creating @Beans with configuration of bean classess 
1) @Transactional  --> can be applied to methods or classes to indicate that the annotated code should be executed within a transaction

						By default, @Transactional creates a transaction with the default isolation level (usually READ_COMMITTED) and the default propagation behavior (REQUIRED)
						
						@Transactional
						public void createUser(String name, String email) {
						User user = new User(name, email);
						userRepository.save(user);
		}

--------------- different @Transactional   attributes ---------------------
	@Transactional (isolation=Isolation.READ_COMMITTED) --> 
			
1) READ_COMMITTED  -->  A constant indicating that dirty reads are prevented; non-repeatable reads and phantom reads can occur.					
2) READ_UNCOMMITTED  -->  This isolation level states that a transaction may read data that is still uncommitted by other transactions.
3) REPEATABLE_READ  -->  A constant indicating that dirty reads and non-repeatable reads are prevented; phantom reads can occur.
4) SERIALIZABLE -->   A constant indicating that dirty reads, non-repeatable reads, and phantom reads are prevented.

					1) Dirty Reads  --> Transaction A writes records , mean while Transaction B read the same records before Transaction A commits 
										Later, Transaction A decides to rollback and now we have changes in Transaction B that are inconsistent
										So this is dirty read but ransaction B was running in READ_UNCOMMITTED isolation level 
										So it was able to read Transaction A changes before a commit occurred.
					2) Non-Repeatable Reads   --> Transaction "A" reads some record
												  Then Transaction "B" writes that same record and commits.
												  Later Transaction A reads that same record again and may get different values because Transaction B made changes to that record and committed
												  This is a non-repeatable read.
					3) Phantom Reads  --> Transaction "A" reads a range of records
										  Meanwhile, Transaction "B" inserts a new record in the same range that Transaction A initially fetched and commits
										  Later Transaction A reads the same range again
										  and will also get the record that Transaction B just inserted
										  This is a phantom read
										  a transaction fetched a range of records multiple times from the database and obtained different result sets (containing phantom records).

default propagational behavior is REQUIRED. 									  
										  
@Transactional(propagation=Propagation.REQUIRED)

Other options are  REQUIRES_NEW , MANDATORY  , SUPPORTS  , NOT_SUPPORTED  , NEVER  , and  NESTED

1) REQUIRED -->  Indicates that the target method cannot run without an active tx
				 If Any active transaction already started before invocation of this method then it will continue in the same traction or new transaction will begin soon since this method is called 
				 
				 When ever all the records process then only it will commit the transaction or records (Global Commit).
				 
				 So if we want ot commit what we have done before exception then use PROPOGATION = REQUIRED_NEW

2) REQUIRES_NEW --> Every time new transaction has to begin, if any active transaction is runnig, then it will suspende active transaction and start new transaction

					Scenario --> 
								If you processor some records in Database but somewhere some exception occurs while processing of records then all the records will be rollback all the records what ever processed 
								Because ByDefault we use PROPOGATION = REQUIRED and it will use the same active transaction for all So in this case Transaction will set as = rollBackOnly.
								
								So to overcome this problem you can use = PROPOGATION = REQUIRED_NEW --> Every time new transaction will create 


3) MANDATORY -->  method requires an active tx to be running, it no active transaction going on then  it will fail by throwing an exception.
4) SUPPORTS --> method can execute irrespective of active transaction, If active transaction  running, it will participate in the same tx. If executed without a tx it will still execute if no errors.
				Methods which fetch data are the best candidates for this option.
5) NOT_SUPPORTED --> method doesn’t require the transaction context to be propagated
					 Mostly those methods which run in a transaction but perform in-memory operations are the best candidates for this option.
					 
6) NEVER --> method will raise an exception if executed in a transactional process
			 This option is mostly not used in projects.
			 
			 

======================================== Spring-Boot Annotations =================================================================================

1) @SpringBootApplication  --> This annotation is used with main class of Spring Boot Application. @SpringBootApplication is combination of @ComponentScan, @EnableAutoConfiguration and @Configuration
2) @Value — Data members of a Configuration class are automatically loaded from Configuration file(such as application.properties) or initialized to a specific value
3) @ConfigurationProperties — Class annotated with @ConfigurationProperties automatically loads bunch of data members(with matching property names)from Configuration file(such as application.properties)

			example --> 
			
			@Component
			@ConfigurationProperties
			public class CompanyDetails{

			private String company_name;
			private String company_ceo;
			private String head_office_city;
  
			//methods defined by this class...
			}
			#contents of application.properties file
			company_name = WXYZ Company 
			company_ceo = Some One
			head_office_city = Bangalore
			#other configuration properties can be specified here
			
			
4) @Profile  -->  can be used with Configuration or Component classes, to indicate this specific class is available, when application is running in specific profile mode, such as dev, test or production

================================================================== Hibernate - JPA Annotation =========================================================
---------------------------------------- JPA Annotation ------------------------------

1) @Entity — Specifies that a class is an entity and is mapped to a database table. 

2) @Table — Specifies the table name associated with an entity. 

3) @Column — Specifies the strategy for generating primary key values. 

			Data field Validation related — @NotNull, @Max, @Min, @Positive, @Negative, etc…
4) @Id --> Marks a field as the primary key of an entity. 
5) @GeneratedValue -->  Specifies the strategy for generating primary key values, automatically generate unique values for primary key column and used with @Id column

						1) GenerationType.IDENTITY   --> generate the primary key value by the database itself using the auto-increment column option
						
						2) GenerationType.AUTO  --> This is the default GenerationType, if we use @GenerateValue this strategy will use 
													So persistence provider should automatically pick an appropriate strategy for the particular database 
													
						3) GenerationType.TABLE --> persistence provider must use a database table to generate/keep the next unique primary key for the entities.
						
						4) GenerationType.SEQUENCE  --> persistence provider must use a database sequence to get the next unique primary key for the entities.
						
6) @Transient  -->  Filed wont be save in DB 
7) @OneToOne  -->   Defines a one-to-one relationship between two entities.

						1) One-to-one unidirectional

							1) 	@Entity
								@Table(name = "student")
								public class Student {
								
								@OneToOne(cascade = CascadeType.ALL)
								@JoinColumn(name = "student_gfg_detail_id")
								private StudentGfgDetail studentGfgDetail;
								
								}
								
							2) 	@Entity
								@Table(name = "student_gfg_detail")
								public class StudentGfgDetail {
								
								@Id
								@GeneratedValue(strategy = GenerationType.IDENTITY)
								@Column(name = "id")
								private int id;
								
								}
								
					  2) One-to-one bidirectional
					  
					  
						   1) 	@Entity
								@Table(name = "student")
								public class Student {
								
								@OneToOne(cascade = CascadeType.ALL)
								@JoinColumn(name = "student_gfg_detail_id")
								private StudentGfgDetail studentGfgDetail;
								
								}

						   2) @Entity
							  @Table(name = "student_gfg_detail")
								public class StudentGfgDetail {
								 
									@Id
									@GeneratedValue(strategy = GenerationType.IDENTITY)
									@Column(name = "id")
									private int id;
									
									
									@OneToOne(mappedBy = "studentGfgDetail",
									cascade = CascadeType.ALL)
									private Student student;
								}
			
8) @OneToMany  -->  Defines a one-to-many relationship between two entities. 

					Table A and Table B indicates that - One row in Table A links to many rows of Tabel B But One row of Table A will be link to One Row of Table B
					
					public class Trade {
					
						@OneToMany(cascade = CascadeType.ALL, mappedBy = "tradeId")
						private List<CashFlow> cashflow;
					
					}
					
					public class CashFlow {
					
						@Column(name = "TRADEID")
						private Long tradeId;
					
					}

9) @ManyToOne -->  Defines a many-to-one relationship between two entities. 

						@Embeddable
						public class TSEmbeddableId { 
						
							@ManyToOne
							@JoinColumn(name = "SEQUENCEID")
							private TSTradeMessage tsTradeMessage;

						}
						
						@Table(name = "TS_TRADEMESSAGE")
						public class TSTradeMessage { 
						
											
						@Id
						@Column(name = "SEQUENCEID")
						private Integer sequenceId;
						
						}
						
						
				

10)@ManyToMany  -->  Defines a many-to-many relationship between two entities. 
					
						It will create a new table where it will store Employee_id and Project_id --> id from both table
								
								
								@Entity
								@Table(name = "Project")
								public class Project {    
 
								@ManyToMany(mappedBy = "projects")
								private Set<Employee> employees = new HashSet<>(); // any type of collection even List also can use here
								
								}
								
								
								@Entity
								@Table(name = "Employee")
								public class Employee { 
								
								@ManyToMany(cascade = { CascadeType.ALL })
								@JoinTable(
								name = "Employee_Project", 
								joinColumns = { @JoinColumn(name = "employee_id") }, 
								inverseJoinColumns = { @JoinColumn(name = "project_id") } )
								Set<Project> projects = new HashSet<>();
								
								}
						
								

11) @JoinColumn  -->  Specifies the foreign key column for a relationship. 

12) @Embedded -->  Specifies a persistent field or property of an entity whose value is an instance of an embeddable class. 

13) @NamedQuery -->  Declares a named query for an entity. 

14) @NamedNativeQuery --> Declares a named native SQL query for an entity. 


------------------------------------ Hibernate Annotation ------------------------------
		
1) @Cascade: Specifies the cascade behavior for associations. 

				CascadeType.ALL   -->  is a cascading type in Hibernate that specifies that all state transitions (create, update, delete, and refresh) should be cascaded from the parent entity to the child entities.
				CascadeType.PERSIST   --> is a cascading type in Hibernate that specifies that the create (or persist) operation should be cascaded from the parent entity to the child entities.
				CascadeType.MERGE     --> is a cascading type in Hibernate that specifies that the update (or merge) operation should be cascaded from the parent entity to the child entities.
				CascadeType.REMOVE    --> is a cascading type in Hibernate that specifies that the delete operation should be cascaded from the parent entity to the child entities.
				CascadeType.REFRESH   --> is a cascading type in Hibernate that specifies that the refresh operation should be cascaded from the parent entity to the child entities.
				CascadeType.DETACH    --> is a cascading type in Hibernate that specifies that the detach operation should be cascaded from the parent entity to the child entities.
				CascadeType.REPLICATE --> is a cascading type in Hibernate that specifies that the replicate operation should be cascaded from the parent entity to the child entities.
				CascadeType.SAVE_UPDATE  --> is a cascading type in Hibernate that specifies that the save or update operation should be cascaded from the parent entity to the child entities.

2) @Fetch: Specifies the fetching strategy for associations. 

3) @LazyToOne: Specifies the lazy loading behavior for a to-one association. 

4) @LazyCollection: Specifies the lazy loading behavior for a collection association. 

5) @BatchSize: Specifies the batch size for loading a collection association. 

6) @Cacheable: Enables caching for an entity or a collection. 

7) @Cache: Specifies the cache region and cache strategy for an entity or a collection. 

8) @Formula: Defines a computed property using an SQL formula. 

9) @NaturalId: Marks a property as a natural identifier. 

10) @Filter: Defines a filter condition to be applied to a collection association. 

11) @Where: Specifies a SQL WHERE condition to be applied to a collection association. 

12) @Type: Specifies the Hibernate type for a property. 

13) @Any: Maps a polymorphic association to any entity type. 

14) @TypeDef: Defines a custom Hibernate type. 

======================================== Rest API Annotations ================================================================================

1) @RestController --> Class annotated with @RestController exposes REST End points, its combination of - @Controller and @ResponseBody annotation
2) @RequestBody --> used with method parameter of REST end point. This annotation automatically deserializes the body(of Http request) into a Model or Entity object.

		Example --> 
			@RestController
			class EmployeeController{
			@PostMapping("/create")
			ResponseEntity<Employee> createEmployee(@RequestBody Employee emp){}
			}
			
3) @PathVariable --> used with method parameter of REST end point. It automatically retrieves a Path variable into the method parameter of REST end point.

					  Example -->
							@RestController
							class EmployeeController{
							@GetMapping("/employee/{eid}")
							Employee getEmployee(@PathVariable("eid") Integer empid){}
							
4) @RequestParam —->  used with method parameter of REST end point. It automatically retrieves a Query parameter into the method parameter of REST end point.

					   Example --> 
									@RestController
									class EmployeeController{
									@GetMapping(“/emp”)
									Employee getEmployee(@RequestParam Integer empid){}
									}
									
5) @RequestHeader  --> used with method parameter of REST end point. It automatically retrieved value from a specified HTTP header and populates the value into the method parameter.

				Example --> 
							need access to a specific header, we can configure @RequestHeader with the header name:
							@GetMapping("/greeting")
							public ResponseEntity<String> greeting(@RequestHeader(HttpHeaders.ACCEPT_LANGUAGE) String language) {}
							
							
							All Header at once --> 
							public ResponseEntity<String> listAllHeaders(
							@RequestHeader Map<String, String> headers) {}
							
							
							
-------------------------- HTTP method -------------------------------

6) @GetMapping — to retrieve one or more resource(such as Employee) details
7) PostMapping — to create a new resource
8) @PutMapping — to update an existing resource
9) @DeleteMapping — to delete an existing resource

------------------------ REST API Exception Handling annotations -----------------------
10) @ExceptionHandler --> is used to handle specific exceptions, The annotated method is invoked when the specified exceptions are thrown from a @Controller
11) @ControllerAdvice --> annotation is used to define a class that will handle exceptions globally across all controllers. Its methods are annotated with @ExceptionHandler, @InitBinder, and @ModelAttribute annotations.

						  Example -->

							@ControllerAdvice
							public class GlobalExceptionHandler {

							@ExceptionHandler(ApplicationException.class)
							public ResponseEntity<String> handleApplicationException(ApplicationException ex) {

							return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
							}
							}
							
============================================= MicroServices ===========================================================
1) 

============================================= Core-Java =============================================================

1) HashMap --> HashMap implementation is based on the hash table data structure, And AbstractMap class that implements the Map.
			   HashMap class extends AbstractMap class  
			   
			   1) HashMap allow only one null key and multiple null values
			   2) HashMap class does not preserve insertion order
			   3) HashMap uses hashCode() and equals() methods on keys for the get and put operations. 
			   
Internal Working of HashMap -->
			
			   1) HashMap uses its static inner class Node<K,V> for storing map entries
			   2) HashMap uses multiple buckets and each bucket points to a Singly Linked List where the entries (nodes) are stored.
			   3) If key is already available with Same hashCode then euals method will check on the keys names and if that key is already available then it will reture true and key will be override  on the same entry (node)
HashMap implementation changes - JDK-1.7 was using linkedList to store the nodes but in JDK-8 its got change into BST (Self balancing tree) after a thresold is crossed - 
static final int TREEIFY_THRESHOLD = 8;
									
The Reason for chnages - linked lists the worst-case time is O(n)
In BST - worst case -   O(log⁡n) 

So once Thresold values reached to defined Thresold then rehashing will be performed and all entries of the map will be copy to new entries added in new HashMap 
If the bucket size is 16 and the load factor is 0.75 then the threshold value is 12.
								 
Complexcity - In case of search, insertion and deletion --> 
								1) If all the key stores to differentdifferent bucket the - then search, insert and deletion -  O(1)
								2) In the worst case, where all the entries go to the same bucket and the singly linked list stores these entries - O(N)
								3) In a case where the threshold for converting this linked list to a self-balancing binary search tree - O(log(n))
			

				


