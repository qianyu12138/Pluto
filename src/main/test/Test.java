import cn.pluto.po.Index;
import cn.pluto.po.IndexCustom;
import cn.pluto.utils.CommonUtils;

import java.util.Date;

public class Test {
    @org.junit.Test
    public void fun1(){
        Father f = new Father();
        f.setName("qwh");
        f.setDate(new Date());
        Son son = new Son();

        CommonUtils.BeantoBean(f, son);
        System.out.println(son);
    }

    @org.junit.Test
    public void fun2(){
        Index index = new Index();
        index.setIid(1);
        index.setPanaltext("qawfqwe");
        index.setLastlogin(new Date());
        index.setContactqq("15635345");
        IndexCustom indexCustom = new IndexCustom();

        CommonUtils.BeantoBean(index, indexCustom);
        System.out.println(indexCustom);
    }
}
