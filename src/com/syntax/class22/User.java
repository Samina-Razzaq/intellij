package com.syntax.class22;
//Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
// Create a subclass  userInfo that will have user address variable and
// it also being initialized through constructor call.
// Print users name, mobile number and address in userDetails method. Test your code.
public class User {
    String name;
    String mobileNumber;

    public User(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
}
class UserInfo extends  User{
    String address;
    public UserInfo(String name, String mobileNumber, String address) {
        super(name,mobileNumber );
        this.address = address;
    }
void userDetail(){
    System.out.println(name+" "+mobileNumber+" "+address);

}

}class Tester{
    public static void main(String[] args) {
        UserInfo tester=new UserInfo("Samina", "456-786-9876", "st 6788");
   tester.userDetail();
    }
}