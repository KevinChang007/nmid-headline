package cn.edu.cqupt.nmid.headline.support.db.tables;

public class BaseTable {
  public static final String TABLE_NAME="basetable";
  public static final String COLUMN_NAME_ID = "_id";
  public static final String COLUMN_NAME_CATEGORY = "category";
  public static final String COLUMN_NAME_TITLE = "title";
  public static final String COLUMN_NAME_SIMPLE_CONTENT = "simple_content";
  public static final String COLUMN_NAME_IMAGE1 = "image1";
  public static final String COLUMN_NAME_IMAGE2 = "image2";
  public static final String COLUMN_NAME_IMAGE3 = "image3";
  public static final String COLUMN_NAME_TIME_RELEASE = "time_release";
  public static final String COLUMN_NAME_ISCOLLECT = "iscollect";

  public static final String[] COLUMN={
      COLUMN_NAME_ID,
      COLUMN_NAME_CATEGORY,
      COLUMN_NAME_TITLE,
      COLUMN_NAME_SIMPLE_CONTENT,
      COLUMN_NAME_IMAGE1,
      COLUMN_NAME_IMAGE2,
      COLUMN_NAME_IMAGE3,
      COLUMN_NAME_TIME_RELEASE,
      COLUMN_NAME_ISCOLLECT
  };
}