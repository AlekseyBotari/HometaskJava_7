public class Artifact {

        int serialNumber;
        String culture;
        int age;
        public Artifact (int serialNumber){
                this.serialNumber = serialNumber;
        }

        public Artifact (int serialNumber, String culture){
                this.serialNumber = serialNumber;
                this.culture = culture;
        }

        public Artifact (int serialNumber, String culture, int age){
                this.serialNumber = serialNumber;
                this.culture = culture;
                this.age = age;
        }

}
