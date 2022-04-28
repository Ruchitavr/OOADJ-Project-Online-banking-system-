/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rajeshwari
 */
interface TransactionLimit {
    public int getLimit();
}

class currentAccount implements TransactionLimit {

		public int getLimit() {
		int amt = 100000;

		return amt;
	}
}
