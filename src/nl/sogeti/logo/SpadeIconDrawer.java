package nl.sogeti.logo;

/**
 * This is just some very simple (ugly) code to print our Logo.
 *
 * NOTE: Please ignore this code.
 */
public class SpadeIconDrawer {

    public static void drawLogo(int column) {

        switch (column) {
            case 0:
            case 12:
                System.out.print(SpadeIconRows.ROW_0.getRowData());
                break;
            case 1:
                System.out.print(SpadeIconRows.ROW_1.getRowData());
                break;
            case 2:
                System.out.print(SpadeIconRows.ROW_2.getRowData());
                break;
            case 3:
                System.out.print(SpadeIconRows.ROW_3.getRowData());
                break;
            case 4:
                System.out.print(SpadeIconRows.ROW_4.getRowData());
                break;
            case 5:
                System.out.print(SpadeIconRows.ROW_5.getRowData());
                break;
            case 6:
                System.out.print(SpadeIconRows.ROW_6.getRowData());
                break;
            case 7:
                System.out.print(SpadeIconRows.ROW_7.getRowData());
                break;
            case 8:
                System.out.print(SpadeIconRows.ROW_8.getRowData());
                break;
            case 9:
                System.out.print(SpadeIconRows.ROW_9.getRowData());
                break;
            case 10:
                System.out.print(SpadeIconRows.ROW_10.getRowData());
                break;
            case 11:
                System.out.print(SpadeIconRows.ROW_11.getRowData());
                break;
        }
    }
}
