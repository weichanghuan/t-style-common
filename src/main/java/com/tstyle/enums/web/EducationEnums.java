package com.tstyle.enums.web;

import java.util.*;

/**
 * @Description:学历枚举 
 * @author: zhouyucheng
 * @date:   2016年1月22日 下午5:25:25
 * @version    
 * 51offer免费留学服务平台
 */
public enum EducationEnums {

    MIDDLE("高中","MIDDLE",1),
    
    PRECOLLEGES("本科预科","PRECOLLEGES",2),
    
    COLLEGES("本科","COLLEGES",3),
    
    PREMASTER("硕士预科","PREMASTER",4),
    
    MASTER("硕士","MASTER",5),
    
    LANGUAGECOURSE("语言学校","LANGUAGECOURSE",6);
    
    
    private EducationEnums(String value, String code, int id) {
        this.value = value;
        this.code = code;
        this.id = id;
    }

    private String value;

    private String code;
    
    private int id ;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    private static final Map<Integer, EducationEnums> LOOKUP = new HashMap<Integer, EducationEnums>();
    private static final Map<String, EducationEnums> LOOKVALE = new HashMap<String, EducationEnums>();
    static {
        for (EducationEnums s : EnumSet.allOf(EducationEnums.class)) {
            LOOKUP.put(s.id, s);
        }
    }

    static {
        for (EducationEnums s : EnumSet.allOf(EducationEnums.class)) {
            LOOKVALE.put(s.value, s);
        }
    }

    /**
     * @Description: 根据id获取枚举
     * @param id
     * @return: CountryEnums
     */
    public static EducationEnums fromId(Integer id) {
        return LOOKUP.get(id);
    }
    
    /**
     * @Description: 获取学历枚举集合 
     * @param type 1 包含语言成绩, 其它值不包含 
     * @return: List<EducationEnums>      
     */
    public static List<EducationEnums> getEnums(int type){
        List<EducationEnums> result = new ArrayList<EducationEnums>();
        for (Integer key : LOOKUP.keySet()) {
            if(key != 6 || type == 1){
                result.add(LOOKUP.get(key));
            }
        }  
        return result;
    }
    
    /**
     * @Description: 获取枚举(对象)集合
     * 和上方法区别在于, http返回时, getEnums() 中的每一个 CurrencyEnums无法获取属性
     * @return: List<EnumsObj>      
     */
    public static List<EnumsObj> getEnumsObj(){
        List<EnumsObj> result = new ArrayList<EnumsObj>();
        for (Integer key : LOOKUP.keySet()) {
            EnumsObj obj = new EnumsObj();
            
            EducationEnums ce = LOOKUP.get(key);
            obj.setCode(ce.getCode());
            obj.setId(ce.getId());
            obj.setValue(ce.getValue());
            result.add(obj);
        }  
        return result;
    }
    
    /**
     * @Description: 获取枚举Map 
     * @return: Map<Integer,EducationEnums>      
     */
    public static Map<Integer,EducationEnums> getEnumMap(){
    	return LOOKUP;
    }

    /**
     * @Description: 根据value获取枚举
     * @param value
     * @return: EducationEnums
     */
    public static EducationEnums fromValue(String value) {
        return LOOKVALE.get(value);
    }


}
