       IDENTIFICATION DIVISION.
       PROGRAM-ID. TEST-HELLO-WORLD.

       DATA DIVISION.
       WORKING-STORAGE SECTION.
       01  WS-ACTUAL               PIC X(50).
       01  WS-EXPECTED             PIC X(50) VALUE "Hello World!".

       PROCEDURE DIVISION.
           PERFORM SAYS-HELLO-WORLD

           DISPLAY "All tests ran successfully"
           STOP RUN.

       SAYS-HELLO-WORLD.
           CALL "CODADVENT-HELLO-WORLD" USING WS-ACTUAL
           IF WS-ACTUAL NOT = WS-EXPECTED
               DISPLAY "FAIL says_hello_world"
               DISPLAY "  expected: " FUNCTION TRIM(WS-EXPECTED)
               DISPLAY "  actual:   " FUNCTION TRIM(WS-ACTUAL)
               MOVE 1 TO RETURN-CODE
               STOP RUN
           END-IF.

       END PROGRAM TEST-HELLO-WORLD.
