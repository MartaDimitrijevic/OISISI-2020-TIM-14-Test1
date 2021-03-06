package gui;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class MyTableModelPretraga implements TableModel {
	private Object[] columns = { "Sifra", "Lekar", "JMBG", "Lek" };
	private Object[][] data = { { "1021145", "Petar Arsic", "3004962724819", "Amoksicilin" },
			{ "1325153", "Tijana Matic", "2405986075118", "Hemomycin" },
			{ "1749372", "Sara Simovic", "2207200915274", "Propafen" },
			{ "2149375", "Marija Jovanovic", "0806196711318", "Bactrim" },
			{ "2619384", "Pavle Vojvodic", "1808998122043", "Eritromicin" },
			{ "2857193", "Marina Vukotic", "2804970002332", "Milenol" },
			{ "3026210", "Sara Nedovic", "2408959161274", "Ciprocinal" },
			{ "3321875", "Petar Arsic", "0408997725036", "Palitrex" },
			{ "3325483", "Vasilije Ilic", "1505948110855", "Madopar" },
			{ "5193728", "Aleksandar Maric", "1409959171930", "Spalmotil" },
			{ "5418673", "Igor Janjic", "3010005190025", "Cetirizin" },
			{ "5974216", "Aleksandar Petrovic", "3103984002340", "Daktanol" },
			{ "6538147", "Milan Adamovic", "2411991090716", "Methyldopa" },
			{ "6724933", "Pavle Savic", "0702972011052", "Iruzid" },
			{ "6967825", "Helena Velickovic", "0104959233015", "Revatio" },
			{ "8468571", "Marija Jovanovic", "2701997082355", "Panklav" } };

	public int getRowCount() {
		return data.length;
	}

	public int getColumnCount() {
		return data[0].length;
	}

	public String getColumnName(int columnIndex) {
		return (String) columns[columnIndex];
	}

	public Class<?> getColumnClass(int columnIndex) {
		return data[0][columnIndex].getClass();
	}

	public boolean isCellEditable(int rowIndex, int columnIndex) {
		if (columnIndex == 0) {
			return false;
		} else {
			return true;
		}
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		return data[rowIndex][columnIndex];
	}

	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		data[rowIndex][columnIndex] = aValue;
	}

	public void addTableModelListener(TableModelListener l) {

	}

	public void removeTableModelListener(TableModelListener l) {

	}
}
