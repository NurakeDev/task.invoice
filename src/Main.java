import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        /**
         * INVOICE DAN OBEKTLAR OLISH.
         */
        Invoice invoice1 = new Invoice("124-786", 150, false);
        Invoice invoice2 = new Invoice("235-324", 80, false);
        Invoice invoice3 = new Invoice("452-247", 400, false);
        Invoice invoice4 = new Invoice("642-267", 200, false);
        Invoice invoice5 = new Invoice("754-452", 500, false);

        boolean sikl = true;

        while (sikl) {
            in = new Scanner(System.in);
            System.out.println("To`lov amalga oshiruvchi ma`lumotlarini(Ismini) kiriting (0 - Exit): ");
            String userName = in.nextLine();

            if (userName.equals("0")) return;
            else {
                System.out.println("To`lov qilmoqchi bo`lgan Invoice raqamini kiriting: ");
                String invoiceNum = in.nextLine();

                switch (invoiceNum) {
                    case "124-786":
                        showInvoiceInfo(invoice1);
                        System.out.print("Siz qancha to`lov qilmoqchisiz? ");
                        double invoiceCost1 = in.nextDouble();
                        invoice(invoice1, invoiceCost1, userName);
                        break;
                    case "235-324":
                        showInvoiceInfo(invoice2);
                        System.out.print("Siz qancha to`lov qilmoqchisiz? ");
                        double invoiceCost2 = in.nextDouble();
                        invoice(invoice2, invoiceCost2, userName);
                        break;
                    case "452-247":
                        showInvoiceInfo(invoice3);
                        System.out.print("Siz qancha to`lov qilmoqchisiz? ");
                        double invoiceCost3 = in.nextDouble();
                        invoice(invoice3, invoiceCost3, userName);
                        break;
                    case "642-267":
                        showInvoiceInfo(invoice4);
                        System.out.print("Siz qancha to`lov qilmoqchisiz? ");
                        double invoiceCost4 = in.nextDouble();
                        invoice(invoice4, invoiceCost4, userName);
                        break;
                    case "754-452":
                        showInvoiceInfo(invoice5);
                        System.out.print("Siz qancha to`lov qilmoqchisiz? ");
                        double invoiceCost5 = in.nextDouble();
                        invoice(invoice5, invoiceCost5, userName);
                        break;
                    default:
                        System.out.println("Siz mavjud bo`lmagan Invoice raqamini kiritingiz." + '\'');
                }

            }
        }

    }

    private static void showInvoiceInfo(Invoice invoice) {
        System.out.println(invoice.toString());
    }

    private static void invoice(Invoice invoice, double invoiceCost, String user) {

        invoice.setPaidBy(invoice.getPaidBy());
        invoice.setPaidBy(user);
        if (!invoice.isStatus()) {
            if (invoice.getCost() - invoiceCost < 0 && invoiceCost < 0) {
                System.out.println("Siz noto`g`ri summa kiritingiz qaytadan kiriting iltimos." + '\'');
                return;
            } else if (invoice.getCost() == invoiceCost) {
                System.out.println("To`lov to`liq to`landi." + '\'');
                invoice.setCost(0);
                invoice.setStatus(true);
            } else {
                System.out.println("To`lov qisman to`landi." + '\'');
                invoice.setCost(invoice.getCost() - invoiceCost);
                invoice.setStatus(false);
            }
        }
        else{
            System.out.printf("To`lov %s tomonidan to`liq to`langan. \'", invoice.getPaidBy());
        }

    }
}
