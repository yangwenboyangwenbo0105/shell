// ORM class for table 'ads_sale_tm_category1_stat_mn'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed May 29 21:33:04 CST 2019
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ads_sale_tm_category1_stat_mn extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String tm_id;
  public String get_tm_id() {
    return tm_id;
  }
  public void set_tm_id(String tm_id) {
    this.tm_id = tm_id;
  }
  public ads_sale_tm_category1_stat_mn with_tm_id(String tm_id) {
    this.tm_id = tm_id;
    return this;
  }
  private String category1_id;
  public String get_category1_id() {
    return category1_id;
  }
  public void set_category1_id(String category1_id) {
    this.category1_id = category1_id;
  }
  public ads_sale_tm_category1_stat_mn with_category1_id(String category1_id) {
    this.category1_id = category1_id;
    return this;
  }
  private String category1_name;
  public String get_category1_name() {
    return category1_name;
  }
  public void set_category1_name(String category1_name) {
    this.category1_name = category1_name;
  }
  public ads_sale_tm_category1_stat_mn with_category1_name(String category1_name) {
    this.category1_name = category1_name;
    return this;
  }
  private String buycount;
  public String get_buycount() {
    return buycount;
  }
  public void set_buycount(String buycount) {
    this.buycount = buycount;
  }
  public ads_sale_tm_category1_stat_mn with_buycount(String buycount) {
    this.buycount = buycount;
    return this;
  }
  private String buy_twice_last;
  public String get_buy_twice_last() {
    return buy_twice_last;
  }
  public void set_buy_twice_last(String buy_twice_last) {
    this.buy_twice_last = buy_twice_last;
  }
  public ads_sale_tm_category1_stat_mn with_buy_twice_last(String buy_twice_last) {
    this.buy_twice_last = buy_twice_last;
    return this;
  }
  private String buy_twice_last_ratio;
  public String get_buy_twice_last_ratio() {
    return buy_twice_last_ratio;
  }
  public void set_buy_twice_last_ratio(String buy_twice_last_ratio) {
    this.buy_twice_last_ratio = buy_twice_last_ratio;
  }
  public ads_sale_tm_category1_stat_mn with_buy_twice_last_ratio(String buy_twice_last_ratio) {
    this.buy_twice_last_ratio = buy_twice_last_ratio;
    return this;
  }
  private String buy_3times_last;
  public String get_buy_3times_last() {
    return buy_3times_last;
  }
  public void set_buy_3times_last(String buy_3times_last) {
    this.buy_3times_last = buy_3times_last;
  }
  public ads_sale_tm_category1_stat_mn with_buy_3times_last(String buy_3times_last) {
    this.buy_3times_last = buy_3times_last;
    return this;
  }
  private String buy_3times_last_ratio;
  public String get_buy_3times_last_ratio() {
    return buy_3times_last_ratio;
  }
  public void set_buy_3times_last_ratio(String buy_3times_last_ratio) {
    this.buy_3times_last_ratio = buy_3times_last_ratio;
  }
  public ads_sale_tm_category1_stat_mn with_buy_3times_last_ratio(String buy_3times_last_ratio) {
    this.buy_3times_last_ratio = buy_3times_last_ratio;
    return this;
  }
  private String stat_mn;
  public String get_stat_mn() {
    return stat_mn;
  }
  public void set_stat_mn(String stat_mn) {
    this.stat_mn = stat_mn;
  }
  public ads_sale_tm_category1_stat_mn with_stat_mn(String stat_mn) {
    this.stat_mn = stat_mn;
    return this;
  }
  private String stat_date;
  public String get_stat_date() {
    return stat_date;
  }
  public void set_stat_date(String stat_date) {
    this.stat_date = stat_date;
  }
  public ads_sale_tm_category1_stat_mn with_stat_date(String stat_date) {
    this.stat_date = stat_date;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ads_sale_tm_category1_stat_mn)) {
      return false;
    }
    ads_sale_tm_category1_stat_mn that = (ads_sale_tm_category1_stat_mn) o;
    boolean equal = true;
    equal = equal && (this.tm_id == null ? that.tm_id == null : this.tm_id.equals(that.tm_id));
    equal = equal && (this.category1_id == null ? that.category1_id == null : this.category1_id.equals(that.category1_id));
    equal = equal && (this.category1_name == null ? that.category1_name == null : this.category1_name.equals(that.category1_name));
    equal = equal && (this.buycount == null ? that.buycount == null : this.buycount.equals(that.buycount));
    equal = equal && (this.buy_twice_last == null ? that.buy_twice_last == null : this.buy_twice_last.equals(that.buy_twice_last));
    equal = equal && (this.buy_twice_last_ratio == null ? that.buy_twice_last_ratio == null : this.buy_twice_last_ratio.equals(that.buy_twice_last_ratio));
    equal = equal && (this.buy_3times_last == null ? that.buy_3times_last == null : this.buy_3times_last.equals(that.buy_3times_last));
    equal = equal && (this.buy_3times_last_ratio == null ? that.buy_3times_last_ratio == null : this.buy_3times_last_ratio.equals(that.buy_3times_last_ratio));
    equal = equal && (this.stat_mn == null ? that.stat_mn == null : this.stat_mn.equals(that.stat_mn));
    equal = equal && (this.stat_date == null ? that.stat_date == null : this.stat_date.equals(that.stat_date));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ads_sale_tm_category1_stat_mn)) {
      return false;
    }
    ads_sale_tm_category1_stat_mn that = (ads_sale_tm_category1_stat_mn) o;
    boolean equal = true;
    equal = equal && (this.tm_id == null ? that.tm_id == null : this.tm_id.equals(that.tm_id));
    equal = equal && (this.category1_id == null ? that.category1_id == null : this.category1_id.equals(that.category1_id));
    equal = equal && (this.category1_name == null ? that.category1_name == null : this.category1_name.equals(that.category1_name));
    equal = equal && (this.buycount == null ? that.buycount == null : this.buycount.equals(that.buycount));
    equal = equal && (this.buy_twice_last == null ? that.buy_twice_last == null : this.buy_twice_last.equals(that.buy_twice_last));
    equal = equal && (this.buy_twice_last_ratio == null ? that.buy_twice_last_ratio == null : this.buy_twice_last_ratio.equals(that.buy_twice_last_ratio));
    equal = equal && (this.buy_3times_last == null ? that.buy_3times_last == null : this.buy_3times_last.equals(that.buy_3times_last));
    equal = equal && (this.buy_3times_last_ratio == null ? that.buy_3times_last_ratio == null : this.buy_3times_last_ratio.equals(that.buy_3times_last_ratio));
    equal = equal && (this.stat_mn == null ? that.stat_mn == null : this.stat_mn.equals(that.stat_mn));
    equal = equal && (this.stat_date == null ? that.stat_date == null : this.stat_date.equals(that.stat_date));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.tm_id = JdbcWritableBridge.readString(1, __dbResults);
    this.category1_id = JdbcWritableBridge.readString(2, __dbResults);
    this.category1_name = JdbcWritableBridge.readString(3, __dbResults);
    this.buycount = JdbcWritableBridge.readString(4, __dbResults);
    this.buy_twice_last = JdbcWritableBridge.readString(5, __dbResults);
    this.buy_twice_last_ratio = JdbcWritableBridge.readString(6, __dbResults);
    this.buy_3times_last = JdbcWritableBridge.readString(7, __dbResults);
    this.buy_3times_last_ratio = JdbcWritableBridge.readString(8, __dbResults);
    this.stat_mn = JdbcWritableBridge.readString(9, __dbResults);
    this.stat_date = JdbcWritableBridge.readString(10, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.tm_id = JdbcWritableBridge.readString(1, __dbResults);
    this.category1_id = JdbcWritableBridge.readString(2, __dbResults);
    this.category1_name = JdbcWritableBridge.readString(3, __dbResults);
    this.buycount = JdbcWritableBridge.readString(4, __dbResults);
    this.buy_twice_last = JdbcWritableBridge.readString(5, __dbResults);
    this.buy_twice_last_ratio = JdbcWritableBridge.readString(6, __dbResults);
    this.buy_3times_last = JdbcWritableBridge.readString(7, __dbResults);
    this.buy_3times_last_ratio = JdbcWritableBridge.readString(8, __dbResults);
    this.stat_mn = JdbcWritableBridge.readString(9, __dbResults);
    this.stat_date = JdbcWritableBridge.readString(10, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(tm_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(category1_id, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(category1_name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(buycount, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(buy_twice_last, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(buy_twice_last_ratio, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(buy_3times_last, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(buy_3times_last_ratio, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(stat_mn, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(stat_date, 10 + __off, 12, __dbStmt);
    return 10;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(tm_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(category1_id, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(category1_name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(buycount, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(buy_twice_last, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(buy_twice_last_ratio, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(buy_3times_last, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(buy_3times_last_ratio, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(stat_mn, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(stat_date, 10 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.tm_id = null;
    } else {
    this.tm_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.category1_id = null;
    } else {
    this.category1_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.category1_name = null;
    } else {
    this.category1_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.buycount = null;
    } else {
    this.buycount = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.buy_twice_last = null;
    } else {
    this.buy_twice_last = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.buy_twice_last_ratio = null;
    } else {
    this.buy_twice_last_ratio = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.buy_3times_last = null;
    } else {
    this.buy_3times_last = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.buy_3times_last_ratio = null;
    } else {
    this.buy_3times_last_ratio = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.stat_mn = null;
    } else {
    this.stat_mn = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.stat_date = null;
    } else {
    this.stat_date = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.tm_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tm_id);
    }
    if (null == this.category1_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category1_id);
    }
    if (null == this.category1_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category1_name);
    }
    if (null == this.buycount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, buycount);
    }
    if (null == this.buy_twice_last) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, buy_twice_last);
    }
    if (null == this.buy_twice_last_ratio) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, buy_twice_last_ratio);
    }
    if (null == this.buy_3times_last) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, buy_3times_last);
    }
    if (null == this.buy_3times_last_ratio) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, buy_3times_last_ratio);
    }
    if (null == this.stat_mn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, stat_mn);
    }
    if (null == this.stat_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, stat_date);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.tm_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tm_id);
    }
    if (null == this.category1_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category1_id);
    }
    if (null == this.category1_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category1_name);
    }
    if (null == this.buycount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, buycount);
    }
    if (null == this.buy_twice_last) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, buy_twice_last);
    }
    if (null == this.buy_twice_last_ratio) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, buy_twice_last_ratio);
    }
    if (null == this.buy_3times_last) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, buy_3times_last);
    }
    if (null == this.buy_3times_last_ratio) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, buy_3times_last_ratio);
    }
    if (null == this.stat_mn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, stat_mn);
    }
    if (null == this.stat_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, stat_date);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(tm_id==null?"null":tm_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category1_id==null?"null":category1_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category1_name==null?"null":category1_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buycount==null?"null":buycount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buy_twice_last==null?"null":buy_twice_last, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buy_twice_last_ratio==null?"null":buy_twice_last_ratio, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buy_3times_last==null?"null":buy_3times_last, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buy_3times_last_ratio==null?"null":buy_3times_last_ratio, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stat_mn==null?"null":stat_mn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stat_date==null?"null":stat_date, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(tm_id==null?"null":tm_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category1_id==null?"null":category1_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category1_name==null?"null":category1_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buycount==null?"null":buycount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buy_twice_last==null?"null":buy_twice_last, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buy_twice_last_ratio==null?"null":buy_twice_last_ratio, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buy_3times_last==null?"null":buy_3times_last, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buy_3times_last_ratio==null?"null":buy_3times_last_ratio, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stat_mn==null?"null":stat_mn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stat_date==null?"null":stat_date, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 9, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.tm_id = null; } else {
      this.tm_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.category1_id = null; } else {
      this.category1_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.category1_name = null; } else {
      this.category1_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.buycount = null; } else {
      this.buycount = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.buy_twice_last = null; } else {
      this.buy_twice_last = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.buy_twice_last_ratio = null; } else {
      this.buy_twice_last_ratio = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.buy_3times_last = null; } else {
      this.buy_3times_last = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.buy_3times_last_ratio = null; } else {
      this.buy_3times_last_ratio = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.stat_mn = null; } else {
      this.stat_mn = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.stat_date = null; } else {
      this.stat_date = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.tm_id = null; } else {
      this.tm_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.category1_id = null; } else {
      this.category1_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.category1_name = null; } else {
      this.category1_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.buycount = null; } else {
      this.buycount = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.buy_twice_last = null; } else {
      this.buy_twice_last = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.buy_twice_last_ratio = null; } else {
      this.buy_twice_last_ratio = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.buy_3times_last = null; } else {
      this.buy_3times_last = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.buy_3times_last_ratio = null; } else {
      this.buy_3times_last_ratio = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.stat_mn = null; } else {
      this.stat_mn = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.stat_date = null; } else {
      this.stat_date = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    ads_sale_tm_category1_stat_mn o = (ads_sale_tm_category1_stat_mn) super.clone();
    return o;
  }

  public void clone0(ads_sale_tm_category1_stat_mn o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("tm_id", this.tm_id);
    __sqoop$field_map.put("category1_id", this.category1_id);
    __sqoop$field_map.put("category1_name", this.category1_name);
    __sqoop$field_map.put("buycount", this.buycount);
    __sqoop$field_map.put("buy_twice_last", this.buy_twice_last);
    __sqoop$field_map.put("buy_twice_last_ratio", this.buy_twice_last_ratio);
    __sqoop$field_map.put("buy_3times_last", this.buy_3times_last);
    __sqoop$field_map.put("buy_3times_last_ratio", this.buy_3times_last_ratio);
    __sqoop$field_map.put("stat_mn", this.stat_mn);
    __sqoop$field_map.put("stat_date", this.stat_date);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("tm_id", this.tm_id);
    __sqoop$field_map.put("category1_id", this.category1_id);
    __sqoop$field_map.put("category1_name", this.category1_name);
    __sqoop$field_map.put("buycount", this.buycount);
    __sqoop$field_map.put("buy_twice_last", this.buy_twice_last);
    __sqoop$field_map.put("buy_twice_last_ratio", this.buy_twice_last_ratio);
    __sqoop$field_map.put("buy_3times_last", this.buy_3times_last);
    __sqoop$field_map.put("buy_3times_last_ratio", this.buy_3times_last_ratio);
    __sqoop$field_map.put("stat_mn", this.stat_mn);
    __sqoop$field_map.put("stat_date", this.stat_date);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("tm_id".equals(__fieldName)) {
      this.tm_id = (String) __fieldVal;
    }
    else    if ("category1_id".equals(__fieldName)) {
      this.category1_id = (String) __fieldVal;
    }
    else    if ("category1_name".equals(__fieldName)) {
      this.category1_name = (String) __fieldVal;
    }
    else    if ("buycount".equals(__fieldName)) {
      this.buycount = (String) __fieldVal;
    }
    else    if ("buy_twice_last".equals(__fieldName)) {
      this.buy_twice_last = (String) __fieldVal;
    }
    else    if ("buy_twice_last_ratio".equals(__fieldName)) {
      this.buy_twice_last_ratio = (String) __fieldVal;
    }
    else    if ("buy_3times_last".equals(__fieldName)) {
      this.buy_3times_last = (String) __fieldVal;
    }
    else    if ("buy_3times_last_ratio".equals(__fieldName)) {
      this.buy_3times_last_ratio = (String) __fieldVal;
    }
    else    if ("stat_mn".equals(__fieldName)) {
      this.stat_mn = (String) __fieldVal;
    }
    else    if ("stat_date".equals(__fieldName)) {
      this.stat_date = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("tm_id".equals(__fieldName)) {
      this.tm_id = (String) __fieldVal;
      return true;
    }
    else    if ("category1_id".equals(__fieldName)) {
      this.category1_id = (String) __fieldVal;
      return true;
    }
    else    if ("category1_name".equals(__fieldName)) {
      this.category1_name = (String) __fieldVal;
      return true;
    }
    else    if ("buycount".equals(__fieldName)) {
      this.buycount = (String) __fieldVal;
      return true;
    }
    else    if ("buy_twice_last".equals(__fieldName)) {
      this.buy_twice_last = (String) __fieldVal;
      return true;
    }
    else    if ("buy_twice_last_ratio".equals(__fieldName)) {
      this.buy_twice_last_ratio = (String) __fieldVal;
      return true;
    }
    else    if ("buy_3times_last".equals(__fieldName)) {
      this.buy_3times_last = (String) __fieldVal;
      return true;
    }
    else    if ("buy_3times_last_ratio".equals(__fieldName)) {
      this.buy_3times_last_ratio = (String) __fieldVal;
      return true;
    }
    else    if ("stat_mn".equals(__fieldName)) {
      this.stat_mn = (String) __fieldVal;
      return true;
    }
    else    if ("stat_date".equals(__fieldName)) {
      this.stat_date = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
