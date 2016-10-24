# hocviencnttspringtransaction
http://www.journaldev.com/2603/spring-transaction-management-jdbc-example

We will create a simple Spring JDBC project where we will update multiple tables in a single transaction. The transaction should commit only when all the JDBC statements execute successfully otherwise it should rollback to avoid data inconsistency.

DATABASE
CREATE TABLE `Customer` (
  `id` int(11) unsigned NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `Address` (
  `id` int(11) unsigned NOT NULL,
  `address` varchar(20) DEFAULT NULL,
  `country` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
