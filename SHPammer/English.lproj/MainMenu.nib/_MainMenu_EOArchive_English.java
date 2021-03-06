// _MainMenu_EOArchive_English.java
// Generated by EnterpriseObjects palette at Tuesday, 26 June 2007 22:07:42 Europe/London

import com.webobjects.eoapplication.*;
import com.webobjects.eocontrol.*;
import com.webobjects.eointerface.*;
import com.webobjects.eointerface.swing.*;
import com.webobjects.foundation.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import javax.swing.text.*;

public class _MainMenu_EOArchive_English extends com.webobjects.eoapplication.EOArchive {
    SHPammer _sHPammer0;
    com.webobjects.eointerface.swing.EOFrame _eoFrame0;
    com.webobjects.eointerface.swing.EOTextArea _nsTextView0;
    com.webobjects.eointerface.swing.EOTextField _nsTextField0, _nsTextField1, _nsTextField10, _nsTextField2, _nsTextField3, _nsTextField4, _nsTextField5, _nsTextField6, _nsTextField7, _nsTextField8, _nsTextField9;
    com.webobjects.foundation.NSNumberFormatter _nsNumberFormatter0, _nsNumberFormatter1;
    javax.swing.JButton _nsButton0, _nsButton1;
    javax.swing.JPanel _nsView0;

    public _MainMenu_EOArchive_English(Object owner, NSDisposableRegistry registry) {
        super(owner, registry);
    }

    protected void _construct() {
        Object owner = _owner();
        EOArchive._ObjectInstantiationDelegate delegate = (owner instanceof EOArchive._ObjectInstantiationDelegate) ? (EOArchive._ObjectInstantiationDelegate)owner : null;
        Object replacement;

        super._construct();

        _nsNumberFormatter1 = (com.webobjects.foundation.NSNumberFormatter)_registered(new com.webobjects.foundation.NSNumberFormatter("#,##0.00;-#,##0.00"), "");
        _nsNumberFormatter0 = (com.webobjects.foundation.NSNumberFormatter)_registered(new com.webobjects.foundation.NSNumberFormatter("0;-0"), "");
        _nsButton1 = (javax.swing.JButton)_registered(new javax.swing.JButton("Stop"), "");
        _sHPammer0 = (SHPammer)_registered(new SHPammer(), "SHPammer");
        _nsButton0 = (javax.swing.JButton)_registered(new javax.swing.JButton("Start"), "");
        _nsTextField10 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField21");
        _nsTextField9 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField11111121");
        _nsTextField8 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField2");
        _nsTextField7 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField1111112");
        _nsTextField6 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField11");
        _nsTextField5 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField111111111");
        _nsTextField4 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField11111111");
        _nsTextField3 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField1111111");
        _nsTextField2 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField111111");
        _nsTextField1 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField1");
        _nsTextField0 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField");
        _nsTextView0 = (com.webobjects.eointerface.swing.EOTextArea)_registered(new com.webobjects.eointerface.swing.EOTextArea(), "NSTextView");
        _eoFrame0 = (com.webobjects.eointerface.swing.EOFrame)_registered(new com.webobjects.eointerface.swing.EOFrame(), "Window");
        _nsView0 = (JPanel)_eoFrame0.getContentPane();
    }

    protected void _awaken() {
        super._awaken();
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "unhideAllApplications", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "hide", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "orderFrontStandardAboutPanel", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "terminate", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "hideOtherApplications", ), ""));
    }

    protected void _init() {
        super._init();
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "delete", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "undo", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "toggleContinuousSpellChecking", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "performFindPanelAction", ), ""));
        _nsNumberFormatter1.setMinimum(new java.math.BigDecimal("10"));
        _nsNumberFormatter1.setMaximum(new java.math.BigDecimal("1000000"));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "pasteAsPlainText", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "centerSelectionInVisibleArea", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "arrangeInFront", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "clearRecentDocuments", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "checkSpelling", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "paste", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "cut", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "performFindPanelAction", ), ""));
        _nsNumberFormatter0.setMinimum(new java.math.BigDecimal("0"));
        _nsNumberFormatter0.setMaximum(new java.math.BigDecimal("1000000"));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "showGuessPanel", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "copy", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "showHelp", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "performZoom", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "performFindPanelAction", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "print", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "performMiniaturize", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "selectAll", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "performFindPanelAction", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "performClose", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "runPageLayout", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "redo", ), ""));
        _setFontForComponent(_nsButton1, "Lucida Grande", 13, Font.PLAIN);
        _nsButton1.setMargin(new Insets(0, 2, 0, 2));
        _nsButton1.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_sHPammer0, "stop", _nsButton1), ""));
        _nsButton0.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_sHPammer0, "start", _nsButton0), ""));
        _setFontForComponent(_nsButton0, "Lucida Grande", 13, Font.PLAIN);
        _nsButton0.setMargin(new Insets(0, 2, 0, 2));
        _setFontForComponent(_nsTextField10, "Lucida Grande", 13, Font.PLAIN);
        _nsTextField10.setEditable(true);
        _nsTextField10.setOpaque(true);
        _nsTextField10.setText("");
        _nsTextField10.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        _nsTextField10.setSelectable(true);
        _nsTextField10.setEnabled(true);
        _nsTextField10.setBorder(null);
        _setFontForComponent(_nsTextField9, "Lucida Grande", 10, Font.PLAIN);
        _nsTextField9.setEditable(false);
        _nsTextField9.setOpaque(false);
        _nsTextField9.setText("rate (secs)");
        _nsTextField9.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        _nsTextField9.setSelectable(false);
        _nsTextField9.setEnabled(true);
        _nsTextField9.setBorder(null);
        _setFontForComponent(_nsTextField8, "Lucida Grande", 13, Font.PLAIN);
        _nsTextField8.setEditable(false);
        _nsTextField8.setOpaque(true);
        _nsTextField8.setText("");
        _nsTextField8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        _nsTextField8.setSelectable(true);
        _nsTextField8.setEnabled(true);
        _nsTextField8.setBorder(null);
        _setFontForComponent(_nsTextField7, "Lucida Grande", 10, Font.PLAIN);
        _nsTextField7.setEditable(false);
        _nsTextField7.setOpaque(false);
        _nsTextField7.setText("sent count");
        _nsTextField7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        _nsTextField7.setSelectable(false);
        _nsTextField7.setEnabled(true);
        _nsTextField7.setBorder(null);
        _setFontForComponent(_nsTextField6, "Lucida Grande", 13, Font.PLAIN);
        _nsTextField6.setEditable(true);
        _nsTextField6.setOpaque(true);
        _nsTextField6.setText("");
        _nsTextField6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        _nsTextField6.setSelectable(true);
        _nsTextField6.setEnabled(true);
        _nsTextField6.setBorder(new LineBorder(Color.black));
        _setFontForComponent(_nsTextField5, "Lucida Grande", 10, Font.PLAIN);
        _nsTextField5.setEditable(false);
        _nsTextField5.setOpaque(false);
        _nsTextField5.setText("message");
        _nsTextField5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        _nsTextField5.setSelectable(false);
        _nsTextField5.setEnabled(true);
        _nsTextField5.setBorder(null);
        _setFontForComponent(_nsTextField4, "Lucida Grande", 10, Font.PLAIN);
        _nsTextField4.setEditable(false);
        _nsTextField4.setOpaque(false);
        _nsTextField4.setText("subject");
        _nsTextField4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        _nsTextField4.setSelectable(false);
        _nsTextField4.setEnabled(true);
        _nsTextField4.setBorder(null);
        _setFontForComponent(_nsTextField3, "Lucida Grande", 10, Font.PLAIN);
        _nsTextField3.setEditable(false);
        _nsTextField3.setOpaque(false);
        _nsTextField3.setText("sender");
        _nsTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        _nsTextField3.setSelectable(false);
        _nsTextField3.setEnabled(true);
        _nsTextField3.setBorder(null);
        _setFontForComponent(_nsTextField2, "Lucida Grande", 10, Font.PLAIN);
        _nsTextField2.setEditable(false);
        _nsTextField2.setOpaque(false);
        _nsTextField2.setText("recipient");
        _nsTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        _nsTextField2.setSelectable(false);
        _nsTextField2.setEnabled(true);
        _nsTextField2.setBorder(null);
        _setFontForComponent(_nsTextField1, "Lucida Grande", 13, Font.PLAIN);
        _nsTextField1.setEditable(true);
        _nsTextField1.setOpaque(true);
        _nsTextField1.setText("");
        _nsTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        _nsTextField1.setSelectable(true);
        _nsTextField1.setEnabled(true);
        _nsTextField1.setBorder(new LineBorder(Color.black));
        _setFontForComponent(_nsTextField0, "Lucida Grande", 13, Font.PLAIN);
        _nsTextField0.setEditable(true);
        _nsTextField0.setOpaque(true);
        _nsTextField0.setText("");
        _nsTextField0.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        _nsTextField0.setSelectable(true);
        _nsTextField0.setEnabled(true);
        _nsTextField0.setBorder(new LineBorder(Color.black));
        _nsTextView0.setEditable(true);
        _nsTextView0.setOpaque(true);
        _nsTextView0.setText("");
        if (!(_nsView0.getLayout() instanceof EOViewLayout)) { _nsView0.setLayout(new EOViewLayout()); }
        _nsTextView0.setSize(428, 156);
        _nsTextView0.setLocation(13, 148);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTextView0, EOViewLayout.MinYMargin);
        _nsView0.add(_nsTextView0);
        _nsTextField0.setSize(428, 22);
        _nsTextField0.setLocation(14, 104);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTextField0, EOViewLayout.MinYMargin);
        _nsView0.add(_nsTextField0);
        _nsTextField1.setSize(373, 22);
        _nsTextField1.setLocation(69, 49);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTextField1, EOViewLayout.MinYMargin);
        _nsView0.add(_nsTextField1);
        _nsTextField2.setSize(80, 13);
        _nsTextField2.setLocation(14, 21);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTextField2, EOViewLayout.MinYMargin);
        _nsView0.add(_nsTextField2);
        _nsTextField3.setSize(80, 13);
        _nsTextField3.setLocation(14, 53);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTextField3, EOViewLayout.MinYMargin);
        _nsView0.add(_nsTextField3);
        _nsTextField4.setSize(80, 13);
        _nsTextField4.setLocation(14, 89);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTextField4, EOViewLayout.MinYMargin);
        _nsView0.add(_nsTextField4);
        _nsTextField5.setSize(80, 13);
        _nsTextField5.setLocation(14, 134);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTextField5, EOViewLayout.MinYMargin);
        _nsView0.add(_nsTextField5);
        _nsTextField6.setSize(373, 22);
        _nsTextField6.setLocation(69, 17);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTextField6, EOViewLayout.MinYMargin);
        _nsView0.add(_nsTextField6);
        _nsTextField7.setSize(80, 13);
        _nsTextField7.setLocation(14, 346);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTextField7, EOViewLayout.MinYMargin);
        _nsView0.add(_nsTextField7);
        _nsTextField8.setSize(126, 22);
        _nsTextField8.setLocation(77, 339);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTextField8, EOViewLayout.MinYMargin);
        _nsView0.add(_nsTextField8);
        _nsTextField9.setSize(80, 13);
        _nsTextField9.setLocation(254, 343);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTextField9, EOViewLayout.MinYMargin);
        _nsView0.add(_nsTextField9);
        _nsTextField10.setSize(126, 22);
        _nsTextField10.setLocation(316, 339);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTextField10, EOViewLayout.MinYMargin);
        _nsView0.add(_nsTextField10);
        _nsButton0.setSize(50, 23);
        _nsButton0.setLocation(391, 447);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsButton0, EOViewLayout.MinYMargin);
        _nsView0.add(_nsButton0);
        _nsButton1.setSize(50, 23);
        _nsButton1.setLocation(333, 447);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsButton1, EOViewLayout.MinYMargin);
        _nsView0.add(_nsButton1);
        _nsView0.setSize(454, 483);
        _eoFrame0.setTitle("SHPammer 0.01");
        _eoFrame0.setLocation(338, 209);
        _eoFrame0.setSize(454, 483);
    }
}
