import java.util.Scanner;

public class Main{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);

    // this section sets up the game by welcoming the user and asking them to enter an initial password. Then, it creates an object with one of the constructors with the user's input and a random number. 
    int randNum = (int) (Math.random() * 5) + 1;
    System.out.println("Welcome to The Password Game!");
    System.out.print("Please enter a password: ");
    String input = scan.nextLine();
    PasswordChecker password = new PasswordChecker(input, randNum);
    System.out.println(password.toString());
    String captcha = password.createCaptcha();

     // lines 16 to 491 checks all the requirments using methods made in the PasswordChecker class. As more requirments are added, the code for each section becomes longer because each section checks all the previous requirments as well. 
    while(password.checkNumOfChars() == false){
      System.out.println("Your password must be at least 7 characters");
      System.out.print("Enter a password: ");
      input = scan.nextLine();
      password.changePassword(input);
    }

    System.out.println();

    while(password.checkNumOfChars() == false || password.checkForNum() == false){
      if(password.checkNumOfChars() == false){
        System.out.println("Your password must be at least 7 characters");
      }
      if(password.checkForNum() == false){
        System.out.println("Your password must include a number");
      }
      System.out.print("Enter a password: ");
      input = scan.nextLine();
      password.changePassword(input);
    }

    System.out.println();
   
    while(password.checkNumOfChars() == false || password.checkForNum() == false || password.checkForUpperCase() == false){
      if(password.checkNumOfChars() == false){
        System.out.println("Your password must be at least 7 characters");
      }
      if(password.checkForNum() == false){
        System.out.println("Your password must include a number");
      }
      if(password.checkForUpperCase() == false){
        System.out.println("Your password must include an uppercase letter");
      }
      System.out.print("Enter a password: ");
      input = scan.nextLine();
      password.changePassword(input);
    }

    System.out.println();
   
    while(password.checkNumOfChars() == false ||password.checkForNum() == false || password.checkForUpperCase() == false || password.checkForSpecialChar() == false){
      if(password.checkNumOfChars() == false){
        System.out.println("Your password must be at least 7 characters");
      }
      if(password.checkForNum() == false){
        System.out.println("Your password must include a number");
      }
      if(password.checkForUpperCase() == false){
        System.out.println("Your password must include an uppercase letter");
      }
      if(password.checkForSpecialChar() == false){
        System.out.println("Your password must include a special character");
      }
      System.out.print("Enter a password: ");
      input = scan.nextLine();
      password.changePassword(input);
    }

    System.out.println();

    while(password.checkNumOfChars() == false ||password.checkForNum() == false || password.checkForUpperCase() == false || password.checkForSpecialChar() == false || password.addNum() == false){
      if(password.checkNumOfChars() == false){
        System.out.println("Your password must be at least 7 characters");
      }
      if(password.checkForNum() == false){
        System.out.println("Your password must include a number");
      }
      if(password.checkForUpperCase() == false){
        System.out.println("Your password must include an uppercase letter");
      }
      if(password.checkForSpecialChar() == false){
        System.out.println("Your password must include a special character");
      }
      if(password.addNum() == false){
        System.out.println("The digits in your password must add up to 30");
      }
      System.out.print("Enter a password: ");
      input = scan.nextLine();
      password.changePassword(input);
    }

    System.out.println();

    while(password.checkNumOfChars() == false ||password.checkForNum() == false || password.checkForUpperCase() == false || password.checkForSpecialChar() == false || password.addNum() == false || password.containMonth() == false){
      if(password.checkNumOfChars() == false){
        System.out.println("Your password must be at least 7 characters");
      }
      if(password.checkForNum() == false){
        System.out.println("Your password must include a number");
      }
      if(password.checkForUpperCase() == false){
        System.out.println("Your password must include an uppercase letter");
      }
      if(password.checkForSpecialChar() == false){
        System.out.println("Your password must include a special character");
      }
      if(password.addNum() == false){
        System.out.println("The digits in your password must add up to 30");
      }
      if(password.containMonth() == false){
        System.out.println("Your password must include a month of the year");
      }
      System.out.print("Enter a password: ");
      input = scan.nextLine();
      password.changePassword(input);
    }

    System.out.println();

    while(password.checkNumOfChars() == false ||password.checkForNum() == false || password.checkForUpperCase() == false || password.checkForSpecialChar() == false || password.addNum() == false || password.containMonth() == false || password.checkRomanNumeral() == false){
      if(password.checkNumOfChars() == false){
        System.out.println("Your password must be at least 7 characters");
      }
      if(password.checkForNum() == false){
        System.out.println("Your password must include a number");
      }
      if(password.checkForUpperCase() == false){
        System.out.println("Your password must include an uppercase letter");
      }
      if(password.checkForSpecialChar() == false){
        System.out.println("Your password must include a special character");
      }
      if(password.addNum() == false){
        System.out.println("The digits in your password must add up to 30");
      }
      if(password.containMonth() == false){
        System.out.println("Your password must include a month of the year");
      }
      if(password.checkRomanNumeral() == false){
        System.out.println("Your password must include a single letter roman numeral");
      }
      System.out.print("Enter a password: ");
      input = scan.nextLine();
      password.changePassword(input);
    }

    System.out.println();

    while(password.checkNumOfChars() == false ||password.checkForNum() == false || password.checkForUpperCase() == false || password.checkForSpecialChar() == false || password.addNum() == false || password.containMonth() == false || password.checkRomanNumeral() == false || password.checkWordOfTheDay() == false){
      if(password.checkNumOfChars() == false){
        System.out.println("Your password must be at least 7 characters");
      }
      if(password.checkForNum() == false){
        System.out.println("Your password must include a number");
      }
      if(password.checkForUpperCase() == false){
        System.out.println("Your password must include an uppercase letter");
      }
      if(password.checkForSpecialChar() == false){
        System.out.println("Your password must include a special character");
      }
      if(password.addNum() == false){
        System.out.println("The digits in your password must add up to 30");
      }
      if(password.containMonth() == false){
        System.out.println("Your password must include a month of the year");
      }
      if(password.checkRomanNumeral() == false){
        System.out.println("Your password must include a single letter roman numeral");
      }
      if(password.checkWordOfTheDay() == false){
        System.out.println("Your password must include the word of the day (" + password.createWordOfTheDay() + ")");
      }
      System.out.print("Enter a password: ");
      input = scan.nextLine();
      password.changePassword(input);
    }

    System.out.println();
    
    while(password.checkNumOfChars() == false ||password.checkForNum() == false || password.checkForUpperCase() == false || password.checkForSpecialChar() == false || password.addNum() == false || password.containMonth() == false || password.checkRomanNumeral() == false || password.checkWordOfTheDay() == false || password.checkElement() == false){
      if(password.checkNumOfChars() == false){
        System.out.println("Your password must be at least 7 characters");
      }
      if(password.checkForNum() == false){
        System.out.println("Your password must include a number");
      }
      if(password.checkForUpperCase() == false){
        System.out.println("Your password must include an uppercase letter");
      }
      if(password.checkForSpecialChar() == false){
        System.out.println("Your password must include a special character");
      }
      if(password.addNum() == false){
        System.out.println("The digits in your password must add up to 30");
      }
      if(password.containMonth() == false){
        System.out.println("Your password must include a month of the year");
      }
      if(password.checkRomanNumeral() == false){
        System.out.println("Your password must include a single letter roman numeral");
      }
      if(password.checkWordOfTheDay() == false){
        System.out.println("Your password must include the word of the day (" + password.createWordOfTheDay() + ")");
      }
      if(password.checkElement() == false){
        System.out.println("Your password must include an element from the peridoic table whose symbol is one letter");
      }
      System.out.print("Enter a password: ");
      input = scan.nextLine();
      password.changePassword(input);
    }

    System.out.println();
    
    while(password.checkNumOfChars() == false ||password.checkForNum() == false || password.checkForUpperCase() == false || password.checkForSpecialChar() == false || password.addNum() == false || password.containMonth() == false || password.checkRomanNumeral() == false || password.checkWordOfTheDay() == false || password.checkElement() == false || password.checkTriviaQuestionAns() == false){
      if(password.checkNumOfChars() == false){
        System.out.println("Your password must be at least 7 characters");
      }
      if(password.checkForNum() == false){
        System.out.println("Your password must include a number");
      }
      if(password.checkForUpperCase() == false){
        System.out.println("Your password must include an uppercase letter");
      }
      if(password.checkForSpecialChar() == false){
        System.out.println("Your password must include a special character");
      }
      if(password.addNum() == false){
        System.out.println("The digits in your password must add up to 30");
      }
      if(password.containMonth() == false){
        System.out.println("Your password must include a month of the year");
      }
      if(password.checkRomanNumeral() == false){
        System.out.println("Your password must include a single letter roman numeral");
      }
      if(password.checkWordOfTheDay() == false){
        System.out.println("Your password must include the word of the day (" + password.createWordOfTheDay() + ")");
      }
      if(password.checkElement() == false){
        System.out.println("Your password must include an element from the peridoic table whose symbol is one letter");
      }
      if(password.checkTriviaQuestionAns() == false){
        System.out.println("Your password must include the answer to this question: In what country did the first Starbucks open outside of North America?");
      }
      System.out.print("Enter a password: ");
      input = scan.nextLine();
      password.changePassword(input);
    }

    System.out.println();

    while(password.checkNumOfChars() == false ||password.checkForNum() == false || password.checkForUpperCase() == false || password.checkForSpecialChar() == false || password.addNum() == false || password.containMonth() == false || password.checkRomanNumeral() == false || password.checkWordOfTheDay() == false || password.checkElement() == false || password.checkTriviaQuestionAns() == false || password.mustContainPhrase() == false){
      if(password.checkNumOfChars() == false){
        System.out.println("Your password must be at least 7 characters");
      }
      if(password.checkForNum() == false){
        System.out.println("Your password must include a number");
      }
      if(password.checkForUpperCase() == false){
        System.out.println("Your password must include an uppercase letter");
      }
      if(password.checkForSpecialChar() == false){
        System.out.println("Your password must include a special character");
      }
      if(password.addNum() == false){
        System.out.println("The digits in your password must add up to 30");
      }
      if(password.containMonth() == false){
        System.out.println("Your password must include a month of the year");
      }
      if(password.checkRomanNumeral() == false){
        System.out.println("Your password must include a single letter roman numeral");
      }
      if(password.checkWordOfTheDay() == false){
        System.out.println("Your password must include the word of the day (" + password.createWordOfTheDay() + ")");
      }
      if(password.checkElement() == false){
        System.out.println("Your password must include an element from the peridoic table whose symbol is one letter");
      }
      if(password.checkTriviaQuestionAns() == false){
        System.out.println("Your password must include the answer to this question: In what country did the first Starbucks open outside of North America?");
      }
      if(password.mustContainPhrase() == false){
        System.out.println("Your password must include this phrase: DianIsCool");
      }
      System.out.print("Enter a password: ");
      input = scan.nextLine();
      password.changePassword(input);
    }

    System.out.println();

    while(password.checkNumOfChars() == false ||password.checkForNum() == false || password.checkForUpperCase() == false || password.checkForSpecialChar() == false || password.addNum() == false || password.containMonth() == false || password.checkRomanNumeral() == false || password.checkWordOfTheDay() == false || password.checkElement() == false || password.checkTriviaQuestionAns() == false || password.mustContainPhrase() == false || password.checkIfExceedLength() == false){
      if(password.checkNumOfChars() == false){
        System.out.println("Your password must be at least 7 characters");
      }
      if(password.checkForNum() == false){
        System.out.println("Your password must include a number");
      }
      if(password.checkForUpperCase() == false){
        System.out.println("Your password must include an uppercase letter");
      }
      if(password.checkForSpecialChar() == false){
        System.out.println("Your password must include a special character");
      }
      if(password.addNum() == false){
        System.out.println("The digits in your password must add up to 30");
      }
      if(password.containMonth() == false){
        System.out.println("Your password must include a month of the year");
      }
      if(password.checkRomanNumeral() == false){
        System.out.println("Your password must include a single letter roman numeral");
      }
      if(password.checkWordOfTheDay() == false){
        System.out.println("Your password must include the word of the day (" + password.createWordOfTheDay() + ")");
      }
      if(password.checkElement() == false){
        System.out.println("Your password must include an element from the peridoic table whose symbol is one letter");
      }
      if(password.checkTriviaQuestionAns() == false){
        System.out.println("Your password must include the answer to this question: In what country did the first Starbucks open outside of North America?");
      }
      if(password.mustContainPhrase() == false){
        System.out.println("Your password must include this phrase: DianIsCool");
      }
      if(password.checkIfExceedLength() == false){
         System.out.println("Your password cannot be longer than 40 characters");
      }
      System.out.print("Enter a password: ");
      input = scan.nextLine();
      password.changePassword(input);
    }

    System.out.println();

    while(password.checkNumOfChars() == false ||password.checkForNum() == false || password.checkForUpperCase() == false || password.checkForSpecialChar() == false || password.addNum() == false || password.containMonth() == false || password.checkRomanNumeral() == false || password.checkWordOfTheDay() == false || password.checkElement() == false || password.checkTriviaQuestionAns() == false || password.mustContainPhrase() == false || password.checkIfExceedLength() == false || password.checkAnsToMathProblem() == false){
      if(password.checkNumOfChars() == false){
        System.out.println("Your password must be at least 7 characters");
      }
      if(password.checkForNum() == false){
        System.out.println("Your password must include a number");
      }
      if(password.checkForUpperCase() == false){
        System.out.println("Your password must include an uppercase letter");
      }
      if(password.checkForSpecialChar() == false){
        System.out.println("Your password must include a special character");
      }
      if(password.addNum() == false){
        System.out.println("The digits in your password must add up to 30");
      }
      if(password.containMonth() == false){
        System.out.println("Your password must include a month of the year");
      }
      if(password.checkRomanNumeral() == false){
        System.out.println("Your password must include a single letter roman numeral");
      }
      if(password.checkWordOfTheDay() == false){
        System.out.println("Your password must include the word of the day (" + password.createWordOfTheDay() + ")");
      }
      if(password.checkElement() == false){
        System.out.println("Your password must include an element from the peridoic table whose symbol is one letter");
      }
      if(password.checkTriviaQuestionAns() == false){
        System.out.println("Your password must include the answer to this question: In what country did the first Starbucks open outside of North America?");
      }
      if(password.mustContainPhrase() == false){
        System.out.println("Your password must include this phrase: DianIsCool");
      }
      if(password.checkIfExceedLength() == false){
         System.out.println("Your password cannot be longer than 40 characters");
      }
      if(password.checkAnsToMathProblem() == false){
        System.out.println("Your password must include answer to this math problem: ((e^iπ) + 2) * 15");
      }
      System.out.print("Enter a password: ");
      input = scan.nextLine();
      password.changePassword(input);
    }

    System.out.println();

    while(password.checkNumOfChars() == false ||password.checkForNum() == false || password.checkForUpperCase() == false || password.checkForSpecialChar() == false || password.addNum() == false || password.containMonth() == false || password.checkRomanNumeral() == false || password.checkWordOfTheDay() == false || password.checkElement() == false || password.checkTriviaQuestionAns() == false || password.mustContainPhrase() == false || password.checkIfExceedLength() == false || password.checkAnsToMathProblem() == false || password.checkCaptcha(captcha) == false){
      if(password.checkNumOfChars() == false){
        System.out.println("Your password must be at least 7 characters");
      }
      if(password.checkForNum() == false){
        System.out.println("Your password must include a number");
      }
      if(password.checkForUpperCase() == false){
        System.out.println("Your password must include an uppercase letter");
      }
      if(password.checkForSpecialChar() == false){
        System.out.println("Your password must include a special character");
      }
      if(password.addNum() == false){
        System.out.println("The digits in your password must add up to 30");
      }
      if(password.containMonth() == false){
        System.out.println("Your password must include a month of the year");
      }
      if(password.checkRomanNumeral() == false){
        System.out.println("Your password must include a single letter roman numeral");
      }
      if(password.checkWordOfTheDay() == false){
        System.out.println("Your password must include the word of the day (" + password.createWordOfTheDay() + ")");
      }
      if(password.checkElement() == false){
        System.out.println("Your password must include an element from the peridoic table whose symbol is one letter");
      }
      if(password.checkTriviaQuestionAns() == false){
        System.out.println("Your password must include the answer to this question: In what country did the first Starbucks open outside of North America?");
      }
      if(password.mustContainPhrase() == false){
        System.out.println("Your password must include this phrase: DianIsCool");
      }
      if(password.checkIfExceedLength() == false){
         System.out.println("Your password cannot be longer than 40 characters");
      }
      if(password.checkAnsToMathProblem() == false){
        System.out.println("Your password must include answer to this math problem: ((e^iπ) + 2) * 15");
      }
      if(password.checkCaptcha(captcha) == false){
        System.out.println("Your password must include the following CAPTCHA: " + captcha);
      }
      System.out.print("Enter a password: ");
      input = scan.nextLine();
      password.changePassword(input);
    }

    System.out.println();

    while(password.checkNumOfChars() == false ||password.checkForNum() == false || password.checkForUpperCase() == false || password.checkForSpecialChar() == false || password.addNum() == false || password.containMonth() == false || password.checkRomanNumeral() == false || password.checkWordOfTheDay() == false || password.checkElement() == false || password.checkTriviaQuestionAns() == false || password.mustContainPhrase() == false || password.checkIfExceedLength() == false || password.checkAnsToMathProblem() == false || password.checkCaptcha(captcha) == false || password.checkForCapVowels() == false){
      if(password.checkNumOfChars() == false){
        System.out.println("Your password must be at least 7 characters");
      }
      if(password.checkForNum() == false){
        System.out.println("Your password must include a number");
      }
      if(password.checkForUpperCase() == false){
        System.out.println("Your password must include an uppercase letter");
      }
      if(password.checkForSpecialChar() == false){
        System.out.println("Your password must include a special character");
      }
      if(password.addNum() == false){
        System.out.println("The digits in your password must add up to 30");
      }
      if(password.containMonth() == false){
        System.out.println("Your password must include a month of the year");
      }
      if(password.checkRomanNumeral() == false){
        System.out.println("Your password must include a single letter roman numeral");
      }
      if(password.checkWordOfTheDay() == false){
        System.out.println("Your password must include the word of the day (" + password.createWordOfTheDay() + ")");
      }
      if(password.checkElement() == false){
        System.out.println("Your password must include an element from the peridoic table whose symbol is one letter");
      }
      if(password.checkTriviaQuestionAns() == false){
        System.out.println("Your password must include the answer to this question: In what country did the first Starbucks open outside of North America?");
      }
      if(password.mustContainPhrase() == false){
        System.out.println("Your password must include this phrase: DianIsCool");
      }
      if(password.checkIfExceedLength() == false){
         System.out.println("Your password cannot be longer than 40 characters");
      }
      if(password.checkAnsToMathProblem() == false){
        System.out.println("Your password must include answer to this math problem: ((e^iπ) + 2) * 15");
      }
      if(password.checkCaptcha(captcha) == false){
        System.out.println("Your password must include the following CAPTCHA: " + captcha);
      }
      if(password.checkForCapVowels() == false){
        System.out.println("All vowels in your password must be capitalized");
      }
      System.out.print("Enter a password: ");
      input = scan.nextLine();
      password.changePassword(input);
    }

    // this section hides the previous conversation between the user and the console by printing 50 empty lines. This way the user can't just copy and paste their last password. 
    for (int i = 0; i < 50; i++) {
        System.out.println();
    }

    // After all the requirments have been met, the program will ask the user to retype the last password that they entered, which meets all the requirments. If they retype the exact same password, they win the game, otherwise, they lose. 
    System.out.println("Your password is strong enough!");
    System.out.println("Confrim your password by retyping it: ");
    String userAns = scan.nextLine();
    if(userAns.equals(password.getPassword())){
      System.out.println("Congrats! You've successfully created your password.");
    }else{
      System.out.println("Sorry, we couldn't create a password for you. Check your spelling and try again.");
    }
  }
}
