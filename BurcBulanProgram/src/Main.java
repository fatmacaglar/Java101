import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int month, day;
       String burc ="";
       boolean isEror = false;

       Scanner input = new Scanner(System.in);
       System.out.print("Dogdugunuz ayi giriniz : ");
       month = input.nextInt();

       System.out.print("Dogdunuz gunu giriniz : ");
       day = input.nextInt();

        if (month == 1) {
            if (1 <= day && day <=31){
                if (day< 22 ) {
                    burc="Oğlak";
                } else {
                    burc="Kova";
                }
            }else {
                isEror=true;
            }
        } else if (month == 2) {
            if (1 <= day && day <= 28) {
                if (day < 20) {
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
            } else {
                isEror = true;
            }
        } else if (month == 3) {
            if (1 <= day && day <= 31) {
                if (day < 21) {
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }
            } else {
                isEror = true;
            }
        } else if (month == 4) {
            if (1 <= day && day <= 31) {
                if (day < 21) {
                    burc = "Koç";
                } else {
                    burc = "Boğa";
                }
            } else {
                isEror = true;
            }
        } else if (month == 5) {
            if (1 <= day && day <= 31) {
                if (day < 22) {
                    burc = "Boğa";
                } else {
                    burc = "İkizler";
                }
            } else {
                isEror = true;
            }
        } else if (month == 6) {
            if (1 <= day && day <= 31) {
                if (day < 23) {
                    burc = "İkizler";
                } else {
                    burc = "Yengeç";
                }
            } else {
                isEror = true;
            }
        } else if (month == 7) {
            if (1 <= day && day <= 31) {
                if (day < 23) {
                    burc = "Yengeç";
                } else {
                    burc = "Aslan";
                }
            } else {
                isEror = true;
            }
        } else if (month == 8) {
            if (1 <= day && day <= 31) {
                if (day < 23) {
                    burc = "Aslan";
                } else {
                    burc = "Başak";
                }
            } else {
                isEror = true;
            }
        } else if (month == 9) {
            if (1 <= day && day <= 31) {
                if (day < 23) {
                    burc = "Başak";
                } else {
                    burc = "Terazi";
                }
            } else {
                isEror = true;
            }
        } else if (month == 10) {
            if (1 <= day && day<= 31) {
                if (day < 23) {
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
            } else {
                isEror = true;
            }
        } else if (month == 11) {
            if (1 <= day && day <= 31) {
                if (day < 22) {
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
            } else {
                isEror = true;
            }
        } else if (month == 12) {
            if (1 <= day && day <= 31) {
                if (day < 22) {
                    burc = "Yay";
                } else {
                    burc = "Oğlak";
                }
            } else {
                isEror = true;
            }
        }else {
            isEror=true;
        }
        if (isEror){
            System.out.println("Hatalı Değer Girdiniz.Lütfen Tekrar Giriniz.");
        }else {
            System.out.println("Burcunuz: " + burc);
        }
    }
}