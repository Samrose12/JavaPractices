import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {
        String burc = "";
        boolean isError = false;

        int ay, gun;

        Scanner imp = new Scanner(System.in);

        System.out.println("Doğduğunuz ayı giriniz. : ");
        ay = imp.nextInt();

        System.out.println("Doğduğunuz günü giriniz. : ");
        gun = imp.nextInt();

        if (ay == 1) {
            if (gun >= 1 && gun <= 31) {
                if (gun > 21) {
                    burc = "Kova";
                } else {
                    burc = "Oğlak";
                }
            }else {
                isError = true;
            }
        } if (ay == 2) {
            if (gun >= 1 && gun <= 31) {
                if (gun > 19) {
                    burc = "Balık";
                } else {
                    burc = "Kova";
                }
            }else {
                isError = true;
            }
        } if (ay == 3) {
            if (gun >= 1 && gun <= 31) {
                if (gun > 20) {
                    burc = "Koç";
                } else {
                    burc = "Balık";
                }
            }else {
                isError = true;
            }
        } if (ay == 4) {
            if (gun >= 1 && gun <= 31) {
                if (gun > 20) {
                    burc = "Boğa";
                } else {
                    burc = "Koç";
                }
            }else {
                isError = true;
            }
        } if (ay == 5) {
            if (gun >= 1 && gun <= 31) {
                if (gun > 21) {
                    burc = "İkizler";
                } else {
                    burc = "Koç";
                }
            }else {
                isError = true;
            }
        } if (ay == 6) {
            if (gun >= 1 && gun <= 31) {
                if (gun > 22) {
                    burc = "Yengeç";
                } else {
                    burc = "İkizler";
                }
            }else {
                isError = true;
            }
        } if (ay == 7) {
            if (gun >= 1 && gun <= 31) {
                if (gun > 22) {
                    burc = "Aslan";
                } else {
                    burc = "Yengeç";
                }
            }else {
                isError = true;
            }
        } if (ay == 8) {
            if (gun >= 1 && gun <= 31) {
                if (gun > 22) {
                    burc = "Başak";
                } else {
                    burc = "Aslan";
                }
            }else {
                isError = true;
            }
        } if (ay == 9) {
            if (gun >= 1 && gun <= 31) {
                if (gun > 22) {
                    burc = "Terazi";
                } else {
                    burc = "Başak";
                }
            }else {
                isError = true;
            }
        } if (ay == 10) {
            if (gun >= 1 && gun <= 31) {
                if (gun > 22) {
                    burc = "Akrep";
                } else {
                    burc = "Terazi";
                }
            }else {
                isError = true;
            }
        } if (ay == 11) {
            if (gun >= 1 && gun <= 31) {
                if (gun > 21) {
                    burc = "Yay";
                } else {
                    burc = "Akrep";
                }
            }else {
                isError = true;
            }
        } if (ay == 12) {
            if (gun >= 1 && gun <= 31) {
                if (gun > 21) {
                    burc = "Oğlak";
                } else {
                    burc = "Yay";
                }
            }else {
                isError = true;
            }
        } if (ay == 1) {
            if (gun >= 1 && gun <= 31) {
                if (gun > 21) {
                    burc = "kova";
                } else {
                    burc = "oğlak";
                }
            }else {
                isError = true;
            }
        }if (ay > 12) {
            isError = true;
        }if (isError) {
            System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyinz. ");
        }else {
            System.out.println("Burcunuz : " + burc);
        }
    }
}
