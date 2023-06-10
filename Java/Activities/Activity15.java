package Activities;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Activity15 {
        private static String FILE_NAME = "resources/TestSheet.xlsx";

        public static void main(String[] args) {
            try {

                Workbook workbook = new XSSFWorkbook();
                Sheet sheet = workbook.createSheet("DataSheet");
                Object[][] datatypes = {
                        {"Datatype", "Type", "Size(in bytes)"},
                        {"int", "Primitive", 2},
                        {"float", "Primitive", 4},
                        {"double", "Primitive", 8},
                        {"char", "Primitive", 1},
                        {"String", "Non-Primitive", "No fixed size"}
                };

                int rowNum = 0;
                for (Object[] datatype : datatypes) {
                    Row row = sheet.createRow(rowNum++);
                    int colNum = 0;
                    for (Object field : datatype) {
                        Cell cell = row.createCell(colNum++);
                        if (field instanceof String) {
                            cell.setCellValue((String) field);
                        } else if (field instanceof Integer) {
                            cell.setCellValue((Integer) field);
                        }
                    }
                }
                FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
                workbook.write(outputStream);
                outputStream.close();
                System.out.println("Data has been written to the Excel sheet.");
                FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
                Workbook readWorkbook = new XSSFWorkbook(fileInputStream);
                Sheet readSheet = readWorkbook.getSheetAt(0);
                for (Row row : readSheet) {
                    for (Cell cell : row) {
                        CellType cellType = cell.getCellType();
                        if (cellType == CellType.STRING) {
                            System.out.print(cell.getStringCellValue() + "\t");
                        } else if (cellType == CellType.NUMERIC) {
                            System.out.print(cell.getNumericCellValue() + "\t");
                        }
                    }
                    System.out.println();
                }

                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

