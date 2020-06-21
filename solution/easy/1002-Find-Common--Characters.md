# 1002. Find Common Characters

Given an array A of strings made only from lowercase letters, return a list of all characters that show up in all strings within the list (including duplicates).  For example, if a character occurs 3 times in all strings but not 4 times, you need to include that character three times in the final answer.

You may return the answer in any order.

**Example 1:**
Input: ["bella","label","roller"]
Output: ["e","l","l"]
Example 2:

Input: ["cool","lock","cook"]
Output: ["c","o"]

**Note:**
1 <= A.length <= 100
1 <= A[i].length <= 100
A[i][j] is a lowercase letter


## Solution:

本題主要是計算出陣列中出現的每個字母(char)出現在其他陣列中的次數．

## Code:


```js
 /**
   * @param {string[]} A
   * @return {string[]}
   */
  var commonChars = function(A) {
    let output = [];
    let set = {};

    //Count letters in each word
    A.forEach((word, wordIndex) => {
      word.split('').forEach(letter => {
        if(!set[letter]){
          if(wordIndex === 0){
            set[letter] = [1];
          }
        }
        else{
          if(!set[letter][wordIndex]){
              set[letter][wordIndex] = 1;
          } else{
              set[letter][wordIndex]++;
          }
        }
      });
    });

    //Check min letters count in each word
    Object.keys(set).forEach(letter => {
      if(set[letter].length === A.length){
        let length = Math.min(...set[letter]);
        if(length){
          output.push(...Array(length).fill(letter));
        }
      }
    });

    return output;
  };
```
