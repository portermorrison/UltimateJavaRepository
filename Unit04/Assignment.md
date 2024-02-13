# Unit 4: Iteration Practice Exercises

## StringLoops Demo

1. [`xyzThere`](https://codingbat.com/prob/p136594)

   Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

   ```
   xyzThere("abcxyz") → true
   xyzThere("abc.xyz") → false
   xyzThere("xyz.abc") → true
   ```

1. [`zipZap`](https://codingbat.com/prob/p180759)

   Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

   ```
   zipZap("zipXzap") → "zpXzp"
   zipZap("zopzop") → "zpzp"
   zipZap("zzzopzop") → "zzzpzp"
   ```

## StringLoops Assignment

These exercises are from [CodingBat](https://codingbat.com/java/String-2). Solve them using only the `String` methods listed in the Java Quick Reference, and `for`/`while` loops.

1. [`doubleChar`](https://codingbat.com/prob/p165312)

   Given a string, return a string where for every char in the original, there are two chars.

   ```

   doubleChar('The') → 'TThhee'
   doubleChar('AAbb') → 'AAAAbbbb'
   doubleChar('Hi-There') → 'HHii--TThheerree'

   ```

1. [`countCode`](https://codingbat.com/prob/p123614)

   Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

   ```

   countCode('aaacodebbb') → 1
   countCode('codexxcode') → 2
   countCode('cozexxcope') → 2

   ```

1. [`bobThere`](https://codingbat.com/prob/p175762)

   Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

   ```
   bobThere('abcbob') → true
   bobThere('b9b') → true
   bobThere('bac') → false

   ```

1. [`prefixAgain`](https://codingbat.com/prob/p136417)

   Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string?

   ```

   prefixAgain('abXYabc', 1) → true
   prefixAgain('abXYabc', 2) → true
   prefixAgain('abXYabc', 3) → false

   ```

1. [`sameStarChar`](https://codingbat.com/prob/p194491)

   Returns true if for every '\*' (star) in the string, if there are chars both immediately before and after the star, they are the same.

   ```

   sameStarChar('xy*yzz') → true
   sameStarChar('xy*zzz') → false
   sameStarChar('*xa*az') → true

   ```

1. [`starOut`](https://codingbat.com/prob/p139564)

   Return a version of the given string, where for every star ("`*`") in the string the star and the chars immediately to its left and right are gone. So "`ab*cd`" yields "`ad`" and "`ab**cd`" also yields "`ad`".

   ```

   starOut('ab*cd') → 'ad'
   starOut('ab\*\*cd') → 'ad'
   starOut('sm*eilly') → 'silly'

   ```

1. [`countHi`](https://codingbat.com/prob/p184029)

   Return the number of times that the string "hi" appears anywhere in the given string.

   ```

   countHi('abc hi ho') → 1
   countHi('ABChi hi') → 2
   countHi('hihi') → 2

   ```

1. [`endOther`](https://codingbat.com/prob/p126880)

   Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). In this exercise you may use the `toLowerCase` `String` method even though it's not in the Java Quick Reference.

   ```

   endOther('Hiabc', 'abc') → true
   endOther('AbC', 'HiaBc') → true
   endOther('abc', 'abXabc') → true

   ```

1. [`xyBalance`](https://codingbat.com/prob/p134250)

   We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

   ```

   xyBalance('aaxbby') → true
   xyBalance('aaxbb') → false
   xyBalance('yaaxbb') → false

   ```

1. [`plusOut`](https://codingbat.com/prob/p170829)

   Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.

   ```

   plusOut('12xy34', 'xy') → '++xy++'
   plusOut('12xy34', '1') → '1+++++'
   plusOut('12xy34xyabcxy', 'xy') → '++xy++xy+++xy'

   ```

1. [`catDog`](https://codingbat.com/prob/p111624)

   Return true if the string "cat" and "dog" appear the same number of times in the given string.

   ```

   catDog('catdog') → true
   catDog('catcat') → false
   catDog('1cat1cadodog') → true

   ```

1. [`mixString`](https://codingbat.com/prob/p125185)

   Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

   ```

   mixString('abc', 'xyz') → 'axbycz'
   mixString('Hi', 'There') → 'HTihere'
   mixString('xxxx', 'There') → 'xTxhxexre'

   ```

1. [`repeatSeparator`](https://codingbat.com/prob/p109637)

   Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

   ```

   repeatSeparator('Word', 'X', 3) → 'WordXWordXWord'
   repeatSeparator('This', 'And', 2) → 'ThisAndThis'
   repeatSeparator('This', 'And', 1) → 'This'

   ```
