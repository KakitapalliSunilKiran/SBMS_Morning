We have seen different ways of communicating with Database

1. Predefined methods
2. Derived methods
3. Query
4. Native Query 
5. Example
6. Criteria builder (No Jpa (dynamic filters))

Identity generators 
==================
Identity
Auto
Table
Sequence
UUID 
=========================================================
What are different types of Association Mappings in JPA
=================================================
{
  "name": "Kiran",
  "email": "sunil@yahoo.com",
  "phone": "9876543210",
  "userAddress":[ {
    "city": "Chennai",
    "country": "India"
  },
  {
    "city": "Bombay",
    "country": "India"
  }
  ]

}
==================================================

{
  "name": "Kiran",
  "email": "sunil@yahoo.com",
  "phone": "9876543210",
  "userAddress":{
    "city": "Chennai",
    "country": "India"
  }
}

UserDetails has UserAddress or not

in the table level how the mapping will be happened 

uid name email phone  aid  
=========================


aid city country
================

@OneToOne(cascade,fetchType)
@JoinColumn
=============================================================================
select ud1_0.id,ud1_0.email,ud1_0.name,ud1_0.phone,ua1_0.aid,ua1_0.city,ua1_0.country from user_details ud1_0 left join user_address ua1_0 on ua1_0.aid=ud1_0.user_aid where ud1_0.id=?
Hibernate: select ud1_0.id,ud1_0.email,ud1_0.name,ud1_0.phone,ua1_0.aid,ua1_0.city,ua1_0.country from user_details ud1_0 left join user_address ua1_0 on ua1_0.aid=ud1_0.user_aid where ud1_0.id=?
Hibernate: select ua1_0.aid,ua1_0.city,ua1_0.country from user_address ua1_0 where ua1_0.aid=?
Hibernate: insert into user_address (city,country,aid) values (?,?,?)
Hibernate: insert into user_details (email,name,phone,user_aid,id) values (?,?,?,?,?)

