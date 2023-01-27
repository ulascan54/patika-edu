# Selection Sort Projesi

### Proje 3

---

#### 1. Soru

- [7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary-Search-Tree aşamalarını yazınız.

- Örnek: root x'dir. root'un sağından y bulunur. Solunda z bulunur vb.

#### Cevap :

- Binary-Search-Tree aşamaları :

  - Adım 1: 7 'yi kök olarak alalım.
    ```
    7
    ```
  - Adım 2: 5, 7'nin soldaki çocuğu.
    ```
        7
       /
      5
    ```
  - Adım 3: 1, 5' in soldaki çocuğu.

    ```
         7
        /
       5
      /
    1
    ```

  - Adım 4: 8, 7'nin sağdaki çocuğu.

    ```
         7
        / \
       5   8
     /
    1
    ```

  - Adım 5: 3, 5'in solunda 1'in sağındaki cocuğudur.

    ```
        7
       / \
      5   8
     /
    1
     \
      3
    ```

  - Adım 6: 6, 5'in sağındaki çocuğudur.

    ```
        7
       / \
      5   8
     / \
    1   6
     \
      3
    ```

  - Adım 7: 0, 1 'in solundaki çocuğudur.
    ```
            7
           / \
          5   8
         /  \
        1   6
       /
      0
       \
        3
    ```
  - Adım 8: 9, 8'in sağındaki çocuğudur.
    ```
          7
         / \
        5   8
       /     \
      1       9
     /
    0
     \
      3
    ```
  - Adım 9: 4, 6'nın solundaki çocuğudur.

    ```
            7
           / \
          5   8
         /     \
        1       9
       /
      0
       \
        3
         \
          4
    ```

  - Adım 10: 2, 4 'ün solundaki çocuğudur.
    ```
          7
         / \
        5   8
       /     \
      1       9
     /
    0
     \
      3
     /  \
    2    4
    ```
