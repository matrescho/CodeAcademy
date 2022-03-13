public class homeWorkStrings {

    public static void main(String[] args) {
        String myName = "Borislav";
        String myLastName = "Hristov";
        int myAge = 28;
        String boleanTest = "Borislav";

        String myFriendName = "Toni";
        String myFriendLastName ="Kamenova";
        int myFriendAge = 23;


        System.out.println(myName);
        System.out.println(myName.equals(myFriendName));
        System.out.println(myName.equalsIgnoreCase(myFriendName));
        System.out.println(myName.compareTo(myFriendName));
        System.out.println(myName.equals(boleanTest));
        System.out.println(myName + myLastName + "\n" + myAge);
        System.out.println(myName + " " + myLastName + " " + myAge);
        System.out.println(myFriendName + " " + myFriendLastName + " " + myFriendAge);
    }
}
