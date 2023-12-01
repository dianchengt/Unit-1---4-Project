public class PasswordChecker{

  private String password;
  private int randNum;

  // constructor with no parameters
  public PasswordChecker(){
    password = "";
    randNum = 0;
  }

  // constructor with two parameters
  public PasswordChecker(String password, int randNum){
    this.password = password;
    this.randNum = randNum;
  }

  // a simple getter method that returns the password that the user enters as a string. 
  public String getPassword(){
    return password;
  }

  // a simple setter method that changes the user’s password to the new password that was entered as the parameter. This method doesn’t return any values.
  public void changePassword(String newPassword){
    password = newPassword;
  }


  // a toString() method that returns the user's password in a sentence.
  public String toString(){
    return "Your current password is " + password;
  }
  
  // a boolean method that checks if the length of the user’s password is at least 7. If the password is at least 7 characters, the method returns true, otherwise, it returns false. 
  public boolean checkNumOfChars(){
    if(!(password.length() >= 7)){
      return false;
    }else{
      return true;
    }
  }

  //  a boolean method that iterates through the password character by character using a for loop and checks if any of the characters is a number. If the character is a number, the method is automatically terminated and will return true, otherwise, it returns false.
  public boolean checkForNum(){
    boolean result = true;
    for(int i = 0; i < password.length(); i ++){
      String character = password.substring(i, i + 1);
      if(character.equals("1") || character.equals("2") || character.equals("3") || character.equals("4") || character.equals("5") || character.equals("6") || character.equals("7") || character.equals("8") || character.equals("9") || character.equals("0")){
        result = true;
        break;
      }else{
        result = false;
      }
    }
    return result;
  }

  // a boolean method that iterates through the password character by character using a for loop and checks if any of the characters is an uppercase letter. If the character is an uppercase letter, the method is automatically terminated and will return true, otherwise, it returns false.
  public boolean checkForUpperCase(){
    boolean result = true;
    for(int i = 0; i < password.length(); i ++){
      String character = password.substring(i, i + 1);
      if(character.equals("A") || character.equals("B") || character.equals("C") || character.equals("D") || character.equals("E") || character.equals("F") || character.equals("G") || character.equals("H") || character.equals("I") || character.equals("J") || character.equals("K") || character.equals("L") || character.equals("M") || character.equals("N") || character.equals("O") || character.equals("P") || character.equals("Q") || character.equals("R") || character.equals("S") || character.equals("T") || character.equals("U") || character.equals("V") || character.equals("W") || character.equals("X") || character.equals("Y") || character.equals("Z")){
        result = true;
        break;
      }else{
        result = false;
      }
    }
    return result;
  }


  // a boolean method that iterates through the password character by character using a for loop and checks if any of the characters is a special character (e.g. ! or @). If the character is a special character, the method is automatically terminated and will return true, otherwise, it returns false.
  public boolean checkForSpecialChar(){
    boolean result = true;
    for(int i = 0; i < password.length(); i ++){
      String character = password.substring(i, i + 1);
      if(character.equals("`") || character.equals("~") || character.equals("!") || character.equals("@") || character.equals("#") || character.equals("$") || character.equals("%") || character.equals("^") || character.equals("&") || character.equals("*") || character.equals("(") || character.equals(")") || character.equals("-") || character.equals("_") || character.equals("+") || character.equals("=") || character.equals("[") || character.equals("]") || character.equals("{") || character.equals("}") || character.equals("\\") || character.equals("|") || character.equals("\"") || character.equals("'") || character.equals(":") || character.equals(";") || character.equals("/") || character.equals("?") || character.equals(">") || character.equals("<") || character.equals(".") || character.equals(",")){
        result = true;
        break;
      }else{
        result = false;
      }
    }
    return result;
  }

  // a boolean method that iterates through the password character by character using a for loop and checks if any of the characters is a number as a string. If it is, the string will be parsed into an integer using Integer.parseInt() and added to a total value. If the total value is exactly 30, the method returns true, otherwise, it returns false. 
  public boolean addNum(){
    int num = 0;
    for(int i = 0; i < password.length(); i ++){
      String character = password.substring(i, i + 1);
      if(character.equals("1") || character.equals("2") || character.equals("3") || character.equals("4") || character.equals("5") || character.equals("6") || character.equals("7") || character.equals("8") || character.equals("9") || character.equals("0")){
        num += Integer.parseInt(character);
      }
    }
    if(num == 30){
      return true;
    }else{
      return false;
    }
  }

  // a boolean method that uses the indexOf() method to check if any of the months is contained in the password. If the index of any month is greater than or equal to 0 (which means that the string exists somewhere in the password), the method returns true, otherwise, it returns false. 
  public boolean containMonth(){
    String passwordLowerCase = password.toLowerCase();
    if(passwordLowerCase.indexOf("januray") >= 0|| passwordLowerCase.indexOf("february") >= 0|| passwordLowerCase.indexOf("march") >= 0 || passwordLowerCase.indexOf("april") >= 0|| passwordLowerCase.indexOf("may") >= 0 || passwordLowerCase.indexOf("june") >= 0 || passwordLowerCase.indexOf("july") >= 0|| passwordLowerCase.indexOf("august") >= 0 || passwordLowerCase.indexOf("september") >= 0 || passwordLowerCase.indexOf("october") >= 0 || passwordLowerCase.indexOf("november") >= 0 || passwordLowerCase.indexOf("december") >= 0){
      return true;
    }else{
      return false;
    }
  }

  // a boolean method that iterates through the password character by character using a for loop and checks if any of the characters is a single-letter Roman numeral. If the character is a Roman numeral, the method is automatically terminated and will return true, otherwise, it returns false.
  public boolean checkRomanNumeral(){
    boolean result = true;
    for(int i = 0; i < password.length(); i ++){
      String character = password.substring(i, i + 1);
      if(character.equals("I") || character.equals("V") || character.equals("X") || character.equals("L") || character.equals("C") || character.equals("D") || character.equals("M")){
        result = true;
        break;
      }else{
        result = false;
      }
    }
    return result;
  }

  // a string method that uses the random passed into the constructor earlier to set the word of the day to a different word depending on the number that was passed. The method returns the word that the user has to include in their password as a string.
  public String createWordOfTheDay(){
    String wordOfTheDay = "";
    if(randNum == 1){
      wordOfTheDay = "password";
    }else if(randNum == 2){
      wordOfTheDay = "computer";
    }else if(randNum == 3){
      wordOfTheDay = "pizza";
    }else if(randNum == 4){
      wordOfTheDay = "basketball";
    }else{
      wordOfTheDay = "abc";
    }
    return wordOfTheDay;
  }

  // a boolean method that uses the indexOf() method to check if the user’s password contains the word of the day that was generated in the previous method. If the index of the word is greater than or equal to 0 (which means that the string exists somewhere in the password), the method returns true, otherwise, it returns false. 
  public boolean checkWordOfTheDay(){
    String passwordLowerCase = password.toLowerCase();
    if(passwordLowerCase.indexOf(createWordOfTheDay()) != -1){
      return true;
    }else{
      return false;
    }
  }

  // a boolean method that iterates through the password character by character using a for loop and checks if any of the characters is a one-letter symbol of an element from the periodic table. If the character meets that requirement, the method is automatically terminated and will return true, otherwise, it returns false.
  public boolean checkElement(){
    boolean result = true;
    for(int i = 0; i < password.length(); i ++){
      String character = password.substring(i, i + 1);
      if(character.equals("H") || character.equals("K") || character.equals("Y") || character.equals("W") || character.equals("B") || character.equals("C") || character.equals("N") || character.equals("P") || character.equals("O") || character.equals("S") || character.equals("F") || character.equals("I") || character.equals("U") || character.equals("V")){
        result = true;
        break;
      }else{
        result = false;
      }
    }
    return result;
  }

  //  a boolean method that uses the indexOf() method to check if the user’s password contains the answer to a trivia question. If the index of the answer is greater than or equal to 0 (which means that the string exists somewhere in the password), the method returns true, otherwise, it returns false. 
  public boolean checkTriviaQuestionAns(){
    String passwordLowerCase = password.toLowerCase();
    if(passwordLowerCase.indexOf("japan") != -1){
      return true;
    }else{
      return false;
    }
  }

  // a boolean method that uses the indexOf() method to check if the user’s password contains a certain phrase. If the index of the phrase is greater than or equal to 0 (which means that the string exists somewhere in the password), the method returns true, otherwise, it returns false. 
  public boolean mustContainPhrase(){
    String passwordLowerCase = password.toLowerCase();
    if(passwordLowerCase.indexOf("dianiscool") != -1){
      return true;
    }else{
      return false;
    }
  }

  // a boolean method that checks if the length of the user’s password is greater than 40 characters. If the length exceeds 40 characters, the method returns false, otherwise, it returns true.
  public boolean checkIfExceedLength(){
    if(password.length() > 40){
      return false;
    }else{
      return true;
    }
  }

  // a boolean method that artificially makes the password longer, so an indexOutOfBounds error won’t occur. The method then uses a for loop to iterate through the password two characters at a time under the condition that i is less than the original password’s length. But to obtain each of the two characters, the substring() method is applied to the modified, longer password. If any of the two characters combined is 15, the method returns true, otherwise, it returns false.
  public boolean checkAnsToMathProblem(){
    boolean result = true;
    String fakePass = password + "aaa";
    for(int i = 0; i < password.length(); i ++){
      String character = fakePass.substring(i, i + 2);
      if(character.equals("15")){
        result = true;
        break;
      }else{
        result = false;
      }
    }
    return result;
  }

  // a string method that loops 5 times to generate a random number. Each number is matched to a letter or number and will be concatenated with the previous letter(s). After the loop is completed, the method returns the resulting string.  
  public String createCaptcha(){
    String captcha = "";
    for(int i  = 0; i <= 4; i ++){
      int randNum = (int) (Math.random() * 46) + 1;
      if(randNum == 1){
        captcha += "A";
      }else if(randNum == 2){
        captcha += "B";
      }else if(randNum == 3){
        captcha += "C";
      }else if(randNum == 4){
        captcha += "D";
      }else if(randNum == 5){
        captcha += "E";
      }else if(randNum == 6){
        captcha += "F";
      }else if(randNum == 7){
        captcha += "G";
      }else if(randNum == 8){
        captcha += "H";
      }else if(randNum == 9){
        captcha += "I";
      }else if(randNum == 10){
        captcha += "J";
      }else if(randNum == 11){
        captcha += "K";
      }else if(randNum == 12){
        captcha += "L";
      }else if(randNum == 13){
        captcha += "M";
      }else if(randNum == 14){
        captcha += "N";
      }else if(randNum == 15){
        captcha += "O";
      }else if(randNum == 16){
        captcha += "P";
      }else if(randNum == 17){
        captcha += "Q";
      }else if(randNum == 18){
        captcha += "R";
      }else if(randNum == 19){
        captcha += "S";
      }else if(randNum == 20){
        captcha += "T";
      }else if(randNum == 21){
        captcha += "U";
      }else if(randNum == 22){
        captcha += "V";
      }else if(randNum == 23){
        captcha += "W";
      }else if(randNum == 24){
        captcha += "X";
      }else if(randNum == 25){
        captcha += "Y";
      }else if(randNum == 26){
        captcha += "Z";
      }else if(randNum == 27){
        captcha += 1;
      }else if(randNum == 28){
        captcha += 2;
      }else if(randNum == 29){
        captcha += 3;
      }else if(randNum == 30){
        captcha += 4;
      }else if(randNum == 31){
        captcha += 5;
      }else if(randNum == 32){
        captcha += 6;
      }else if(randNum == 33){
        captcha += 7;
      }else if(randNum == 34){
        captcha += 8;
      }else if(randNum == 35){
        captcha += 9;
      }else if(randNum == 36){
        captcha += 0;
      }
    }
    return captcha;
  }

  // a boolean method that takes a string parameter, called generatedCaptcha, generated by the createCaptcha() method. Then, the method uses the indexOf() method to check if the parameter is contained in the user’s password. If the index of generatedCaptcha is greater than or equal to 0, (which means that the string exists somewhere in the password), the method returns true, otherwise, it returns false. 
  public boolean checkCaptcha(String generatedCaptcha){
    if(password.indexOf(generatedCaptcha) != -1){
      return true;
    }else{
      return false;
    }
  }

  //  a boolean method that iterates through the password character by character using a for loop and checks if all the vowels are uppercase. As soon as one of the characters is a lowercase vowel, the method is automatically terminated and returns false, otherwise, it will return true.
  public boolean checkForCapVowels(){
    boolean result = true;
    for(int i = 0; i < password.length(); i ++){
      String character = password.substring(i, i + 1);
      if(character.equals("a") || character.equals("e") || character.equals("i") || character.equals("o") || character.equals("u")){
        result = false;
        break;
      }else{
        result =  true;
      }
    }
    return result;
  }

}
