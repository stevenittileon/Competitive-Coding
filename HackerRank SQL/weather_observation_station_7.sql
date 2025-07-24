select distinct CITY as ciudad
from STATION
where CITY regexp '[aeiou]$';
/*
Query the list of CITY names ending with vowels (i.e., a, e, i, o, or u) from STATION. 
Your result cannot contain duplicates.
*/