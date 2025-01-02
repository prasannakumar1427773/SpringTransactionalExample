# SpringTransactionalExample
Managing transactions in Spring is a key aspect of ensuring data consistency and integrity, especially in applications that interact with databases. Spring provides a robust and flexible framework for managing transactions, making it easier for developers to handle complex transaction scenarios. Here's how Spring manages transactions:

Key Concepts
**Transactional Annotation**: The @Transactional annotation is used to demarcate transaction boundaries declaratively. It can be applied at the class or method level.

**Transaction Manager:** Spring provides various transaction managers (e.g., JpaTransactionManager, DataSourceTransactionManager, HibernateTransactionManager) depending on the persistence technology used.

**Propagation:** Propagation defines how transactions relate to each other. Common propagation behaviors include REQUIRED, REQUIRES_NEW, and MANDATORY.

**Isolation:** Isolation levels control the visibility of transactional changes to other transactions. Common isolation levels include READ_COMMITTED, REPEATABLE_READ, and SERIALIZABLE.

**Rollback Rules:** By default, transactions are rolled back on unchecked exceptions (RuntimeException and its subclasses). You can customize rollback rules using the rollbackFor and noRollbackFor attributes of the @Transactional annotation.
