public class App {
    public static void main(String[] args) throws NoFullNameException, IncorrectGenderException {


//        NameReader reader = new NameReader();
//        System.out.println(reader.getName());

//        BirthdayReader bdReader = new BirthdayReader();
//        System.out.println(bdReader.readBirthday());

//        PhoneReader phoneNumber = new PhoneReader();
//        System.out.println(phoneNumber.getPhoneNumber());

        Gender gender = new Gender();
        System.out.println(gender.getGender());
    }
}
