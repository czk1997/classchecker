package sh.otk.classchecker.classes.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

@TableName(value = "classes")
public class Classes implements Serializable {
     @TableId(value = "CLASS_ID", type = IdType.AUTO)
    private Integer classId;

    @TableField(value = "SUBJECT")
    private String subject;

    @TableField(value = "CLASS_URL")
    private String classUrl;

    @TableField(value = "TERM")
    private Integer term;

    @TableField(value = "CLASS_NUM")
    private Integer classNum;

    @TableField(value = "CLASS_TITTLE")
    private String classTittle;

    private static final long serialVersionUID = 1L;

    public static final String COL_SUBJECT = "SUBJECT";

    public static final String COL_CLASS_URL = "CLASS_URL";

    public static final String COL_TERM = "TERM";

    public static final String COL_CLASS_NUM = "CLASS_NUM";

    public static final String COL_CLASS_TITTLE = "CLASS_TITTLE";

    /**
     * @return CLASS_ID
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * @param classId
     */
    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    /**
     * @return SUBJECT
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return CLASS_URL
     */
    public String getClassUrl() {
        return classUrl;
    }

    /**
     * @param classUrl
     */
    public void setClassUrl(String classUrl) {
        this.classUrl = classUrl;
    }

    /**
     * @return TERM
     */
    public Integer getTerm() {
        return term;
    }

    /**
     * @param term
     */
    public void setTerm(Integer term) {
        this.term = term;
    }

    /**
     * @return CLASS_NUM
     */
    public Integer getClassNum() {
        return classNum;
    }

    /**
     * @param classNum
     */
    public void setClassNum(Integer classNum) {
        this.classNum = classNum;
    }

    /**
     * @return CLASS_TITTLE
     */
    public String getClassTittle() {
        return classTittle;
    }

    /**
     * @param classTittle
     */
    public void setClassTittle(String classTittle) {
        this.classTittle = classTittle;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", classId=").append(classId);
        sb.append(", subject=").append(subject);
        sb.append(", classUrl=").append(classUrl);
        sb.append(", term=").append(term);
        sb.append(", classNum=").append(classNum);
        sb.append(", classTittle=").append(classTittle);
        sb.append("]");
        return sb.toString();
    }
}