SET SERVEROUTPUT ON;

DECLARE
    m1 NUMBER := &Enter_marks_for_student_1;
    m2 NUMBER := &Enter_marks_for_student_2;
    m3 NUMBER := &Enter_marks_for_student_3;
    grade CHAR(1);
BEGIN
    -- Student 1
    IF m1 >= 35 THEN
        DBMS_OUTPUT.PUT_LINE('Student 1: PASS');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Student 1: FAIL');
    END IF;

    CASE 
        WHEN m1 >= 85 THEN grade := 'A';
        WHEN m1 >= 70 THEN grade := 'B';
        WHEN m1 >= 50 THEN grade := 'C';
        WHEN m1 >= 35 THEN grade := 'D';
        ELSE grade := 'F';
    END CASE;
    DBMS_OUTPUT.PUT_LINE('Grade: ' || grade);
    DBMS_OUTPUT.PUT_LINE('------------------------');

    -- Student 2
    IF m2 >= 35 THEN
        DBMS_OUTPUT.PUT_LINE('Student 2: PASS');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Student 2: FAIL');
    END IF;

    CASE 
        WHEN m2 >= 85 THEN grade := 'A';
        WHEN m2 >= 70 THEN grade := 'B';
        WHEN m2 >= 50 THEN grade := 'C';
        WHEN m2 >= 35 THEN grade := 'D';
        ELSE grade := 'F';
    END CASE;
    DBMS_OUTPUT.PUT_LINE('Grade: ' || grade);
    DBMS_OUTPUT.PUT_LINE('------------------------');

    -- Student 3
    IF m3 >= 35 THEN
        DBMS_OUTPUT.PUT_LINE('Student 3: PASS');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Student 3: FAIL');
    END IF;

    CASE 
        WHEN m3 >= 85 THEN grade := 'A';
        WHEN m3 >= 70 THEN grade := 'B';
        WHEN m3 >= 50 THEN grade := 'C';
        WHEN m3 >= 35 THEN grade := 'D';
        ELSE grade := 'F';
    END CASE;
    DBMS_OUTPUT.PUT_LINE('Grade: ' || grade);
    DBMS_OUTPUT.PUT_LINE('------------------------');
END;
/
