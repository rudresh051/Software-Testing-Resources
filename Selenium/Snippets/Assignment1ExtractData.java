package justPractise;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Assignment1ExtractData {
    
    public Object[][] getdatafromexcel() throws EncryptedDocumentException, IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\rudre\\Documents\\workspace-spring-tool-suite-4-4.22.1.RELEASE\\seleniumproject9May\\src\\main\\resources\\simpleform.xlsx");
        Workbook book = WorkbookFactory.create(fis);
        Sheet sh = book.getSheet("Sheet1");
        
        int rowcount = sh.getLastRowNum();
        int cellsize = sh.getRow(0).getLastCellNum();
        
        Object[][] obj = new Object[rowcount][cellsize];
        
        for (int i = 0; i < rowcount; i++) {
            for (int j = 0; j < cellsize; j++) {
                Cell cell = sh.getRow(i + 1).getCell(j);
                if (cell.getCellType() == CellType.STRING) {
                    obj[i][j] = cell.getStringCellValue();
                } else if (cell.getCellType() == CellType.NUMERIC) {
                    obj[i][j] = String.valueOf((int) cell.getNumericCellValue());
                }
            }
        }
        
        return obj;
    }
}
