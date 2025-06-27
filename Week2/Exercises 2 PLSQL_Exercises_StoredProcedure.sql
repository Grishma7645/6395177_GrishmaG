-- Drop existing table (safe for re-run)
BEGIN
    EXECUTE IMMEDIATE 'DROP TABLE EMPLOYEES';
EXCEPTION
    WHEN OTHERS THEN NULL;
END;
/

-- Create table
CREATE TABLE EMPLOYEES (
    emp_id NUMBER PRIMARY KEY,
    emp_name VARCHAR2(100),
    salary NUMBER
);
/

-- Insert records
INSERT INTO EMPLOYEES VALUES (101, 'Alice', 60000);
INSERT INTO EMPLOYEES VALUES (102, 'Bob', 45000);
INSERT INTO EMPLOYEES VALUES (103, 'Charlie', 52000);
COMMIT;
/

-- Create stored procedure
CREATE OR REPLACE PROCEDURE get_employee_details (
    p_emp_id IN NUMBER,
    p_name OUT VARCHAR2,
    p_salary OUT NUMBER
)
AS
BEGIN
    SELECT emp_name, salary INTO p_name, p_salary
    FROM EMPLOYEES
    WHERE emp_id = p_emp_id;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        p_name := 'Not Found';
        p_salary := 0;
END;
/

-- Call the procedure
SET SERVEROUTPUT ON;
DECLARE
    v_name VARCHAR2(100);
    v_salary NUMBER;
BEGIN
    get_employee_details(101, v_name, v_salary);
    DBMS_OUTPUT.PUT_LINE('Name: ' || v_name);
    DBMS_OUTPUT.PUT_LINE('Salary: ' || v_salary);
END;
/
