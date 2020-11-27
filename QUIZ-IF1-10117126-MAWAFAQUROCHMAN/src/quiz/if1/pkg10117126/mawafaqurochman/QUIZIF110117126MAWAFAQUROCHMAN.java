/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if1.pkg10117126.mawafaqurochman;

import java.util.Scanner;

/**
 *
 * NAMA: MAWA FAQU ROCHMAN 
 * KELAS: IF-1
 */
public class QUIZIF110117126MAWAFAQUROCHMAN {

    public static void main(String[] args) {

        System.out.println("====Program Kasir Rock n Roll Haircut====");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        Customer c = new Customer();
        System.out.print("Customer Name : ");
        c.setName(sc1.nextLine());
        System.out.print("Customer Email : ");
        c.setEmail(sc2.next());
        c.displayService();
        c.setPriceService(c.getPrice(sc4.nextInt()));
        System.out.print("Are you Member (yes/no) : ");
        c.setMember(c.checkMemberStatus(sc3.next()));
        System.out.println("\n");
        System.out.println("#*******************************#");
        System.out.println("#********CUSTOMER INVOICE*******#");
        System.out.println("Date Transaction : " + c.currentTime());
        System.out.println("Service Price : Rp." + c.getPriceService());
        System.out.println("Discount : Rp." + c.getSale(c.isMember(), c.getPriceService()));
        System.out.println("Total Pay : Rp." + c.getTotalPay(c.getPriceService(),
                c.getSale(c.isMember(), c.getPriceService())));

    }

}
