# Selection Sort Projesi

### Proje 2

---

#### 1. Soru

- [16,21,11,8,12,22] -> Merge Sort

- Yukarıdaki dizinin sort türüne göre aşamalarını yazınız.
- Big-O gösterimini yazınız.

#### Cevap :

- Merge Sort türüne göre aşamaları :

  1. [16,21,11,8,12,22] -> [16,21,11], [8,12,22]
  2. [16,21,11] -> [16,21], [11]
  3. [8,12,22] -> [8,12], [22]
  4. [16,21] -> [16], [21]
  5. [11], [8,12], [22] -> [8,11,12], [22]
  6. [16], [21], [8,11,12], [22] -> [8,11,12,16,21,22]

- Big-O gösterimi: O(n log n) dırr
