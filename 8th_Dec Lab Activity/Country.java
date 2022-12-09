import java.util.HashSet;

class Country {

    HashSet<String> Country = new HashSet<>();

    // Question #1
    public void storeCountryNames(String CountryName) {
        Country.add(CountryName);//logic to add value into HashSet
    }

    // Question #2
    public String retrieveCountry(String CountryName) {
        for (String s : Country) {
            if(Country.contains(CountryName)) {  //if present then it will return the parameter
                return CountryName;}
            else {return null;}    //otherwise it will retrun null
        }
        return null;
    }

    public static void main(String[] args) { //main method
        Country cn = new Country();  //object
         cn.storeCountryNames("India");  //adding by invoking storeCountryNames method
        cn.storeCountryNames("Japan");
        cn.storeCountryNames("Germany");

        System.out.println(cn.retrieveCountry("Hapan")); //logic for checking element present or no
    }}

