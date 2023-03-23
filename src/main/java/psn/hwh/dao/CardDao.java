package psn.hwh.dao;

import psn.hwh.model.Card;

public class CardDao {

    public int save(Card card) {
        card.setCardNo("123");
        return 1;
    }
}