package Model;

public class Student {
    private String _nim;
    private String _name;
    private String _class;
    private String _address;
    private String _phone;
    private int _period;

    public String get_nim() {
        return _nim;
    }

    public void set_nim(String _nim) {
        this._nim = _nim;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    public String get_address() {
        return _address;
    }

    public void set_address(String _address) {
        this._address = _address;
    }

    public String get_phone() {
        return _phone;
    }

    public void set_phone(String _phone) {
        this._phone = _phone;
    }

    public int get_period() {
        return _period;
    }

    public void set_period(int _period) {
        this._period = _period;
    }

    public Student() { }
}
