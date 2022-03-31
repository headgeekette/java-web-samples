docker exec -i sprint_database_1 mysql --user demo --password=demopw employees < data/load_departments.dump
docker exec -i sprint_database_1 mysql --user demo --password=demopw employees < data/load_employees.dump
docker exec -i sprint_database_1 mysql --user demo --password=demopw employees < data/load_dept_emp.dump
docker exec -i sprint_database_1 mysql --user demo --password=demopw employees < data/load_dept_manager.dump
docker exec -i sprint_database_1 mysql --user demo --password=demopw employees < data/load_titles.dump
docker exec -i sprint_database_1 mysql --user demo --password=demopw employees < data/load_salaries1.dump
docker exec -i sprint_database_1 mysql --user demo --password=demopw employees < data/load_salaries2.dump
docker exec -i sprint_database_1 mysql --user demo --password=demopw employees < data/load_salaries3.dump

