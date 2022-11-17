<h2 align="center">DS and Algo Program</h3>

### Find Time Complexities

<details>
<summary>Question 1</summary>

1. ```java
    class A{
        int fun1(int n) {
            int m = 0;
            for (int i = 0; i < n; i++) {
                m += 1;
            }
            return m;
        }
    }
   ```
   ```
   Ans:- O(n)
   ```

</details>
<details>
<summary>Question 2</summary>

2. ```java
    class A{
        int fun2(int n) {
            int i, j, m = 0;
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    m += 1;
                }
            }
            return m;
        }
    }
   ```
   ```
   Ans:- O(n^2)
   ```

</details>
<details>
<summary>Question 3</summary>

3. ```java
    class A{
        int fun3(int n) {
            int i, j, m = 0;
            for (i = 0; i < n; i++) {
                for (j = 0; j < i; j++) {
                    m += 1;
                }
            }
            return m;
        }
    }
   ```
   ```
   Ans:- O(n^2)
   ```

</details>
<details>
<summary>Question 4</summary>

4. ```java
    class A{
        int fun4(int n) {
            int i, m = 0;
            i = 1;
            while (i < n) {
                m += 1;
                i = i * 2;
            }
        return m;
        }
    }
   ```
   ```
   Ans:- O(logn)
   ```

</details>
<details>
<summary>Question 5</summary>

5. ```java
    class A{
        int fun5(int n) {
            int i, m = 0;
            i = n;
            while (i > 0) {
                m += 1;
                i = i / 2;
            }
            return m;
        }
    }
   ```
   ```
   Ans:- O(logn)
   ```

</details>
<details>
<summary>Question 6</summary>

6. ```java
    class A{
        int fun6(int n) {
            int i, j, k, m = 0;
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    for (k = 0; k < n; k++) 
                        m += 1;
                }
            }
            return m;
        }
    }
   ```
   ```
   Ans:- O(n^3)
   ```

</details>
<details>
<summary>Question 7</summary>

7. ```java
    class A{
        int fun7(int n) {
            int i, j, k, m = 0;
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    m += 1;
                }
            }
            for (i = 0; i < n; i++) {
                for (k = 0; k < n; k++) {
                    m += 1;
                }
            }
            return m;
        }
    }
   ```
   ```
   Ans:- O(n^2)
   ```

</details>
<details>
<summary>Question 8</summary>

8. ```java
    class A{
        int fun8(int n) {
            int i, j, m = 0;
            for (i = 0; i < n; i++) {
                for (j = 0; j < Math.Sqrt(n); j++) 
                    m += 1;
            }
            return m;
        }
    }
   ```
   ```
   Ans:- O(n^2)
   ```

</details>
<details>
<summary>Question 9</summary>

9. ```java
    class A{
        int fun9(int n) {
            int i, j, m = 0;
            for (i = n; i > 0; i /= 2) {
                for (j = 0; j < i; j++) {
                    m += 1;
                }
            }
            return m;
        }
    }
   ```
   ```
   Ans:- O(n)
   ```

</details>
<details>
<summary>Question 10</summary>

10. ```java
    class A{
        int fun10(int n) {
            int i, j, m = 0;
            for (i = 0; i < n; i++) {
                for (j = i; j > 0; j--) {
                    m += 1;
                }
            }
            return m;
        }
    }
    ```
    ```
    Ans:- O(n^2)
    ```

</details>
<details>
<summary>Question 11</summary>

11. ```java
    class A{
        int fun11(int n) {
            int i, j, k, m = 0;
            for (i = 0; i < n; i++) {
                for (j = i; j < n; j++) {
                    for (k = j + 1; k < n; k++) {
                        m += 1;
                    }
                }
            }
            return m;
        }
    }
    ```
    ```
    Ans:- O(n^3)
    ```

</details>
<details>
<summary>Question 12</summary>

12. ```java
    class A{
        int fun12(int n) {
            int i, j = 0, m = 0;
            for (i = 0; i < n; i++) {
                for (; j < n; j++) {
                    m += 1;
                }
            }
            return m;
        }
    }
    ```
    ```
    Ans:- O(n)
    ```

</details>
