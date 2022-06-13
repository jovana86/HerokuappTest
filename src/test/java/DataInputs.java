public class DataInputs {
    @org.testng.annotations.DataProvider(name = "validCredentials")
    public static Object[][] validCredentials() {
        return new Object[][]{
                {"Jovana", "Basaric", "ana@yahoo.com", "33", "9000", "HR"}
//                {"Ivana", "Saric", "ivana@yahoo.com","23","6500","Legal"},
//                {"Ivan", "Petkovic", "ivan92@yahoo.com","46","11500","Insurance"}

        };
    }

    @org.testng.annotations.DataProvider(name = "dateInputs")
    public static Object[][] dateInputs() {
        return new Object[][]{
                {"April ", "09, ", "1986 ", "07:45 AM"}

        };
    }
}
