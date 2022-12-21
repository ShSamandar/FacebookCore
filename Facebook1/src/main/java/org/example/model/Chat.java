package org.example.model;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Chat extends Base {
    private  int memberId1;
    private String memberName1;
    private String memberName2;
    private  int memberId2;
    protected List <Integer> massagesId=new ArrayList<>();

    public Chat(int memberId1, String memberName1, int memberId2,String memberName2) {
        this.memberId1 = memberId1;
        this.memberName1 = memberName1;
        this.memberName2 = memberName2;
        this.memberId2 = memberId2;
    }
}
