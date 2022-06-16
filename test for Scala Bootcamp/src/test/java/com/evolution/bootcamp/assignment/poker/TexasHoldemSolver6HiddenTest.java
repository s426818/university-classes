
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver6HiddenTest {


  @Test
  public void test_texas_holdem_1500_2h5hAhTcTh_Qh4c_KsTd_8sAs_7s3d_AcJd_Ts3h_7dQs_3s6s_8c8d() {
    assertEquals(
      "3s6s 7s3d 7dQs 8c8d 8sAs AcJd KsTd Ts3h Qh4c",
      Solver.process("texas-holdem 2h5hAhTcTh Qh4c KsTd 8sAs 7s3d AcJd Ts3h 7dQs 3s6s 8c8d"));
  }

  @Test
  public void test_texas_holdem_1501_4d4h7sJcTh_Jd2h_9sTd_Qc4c_JsTc_6c9d_Kc6s_8hAs_2d5c_TsQd() {
    assertEquals(
      "2d5c 6c9d Kc6s 8hAs 9sTd TsQd Jd2h JsTc Qc4c",
      Solver.process("texas-holdem 4d4h7sJcTh Jd2h 9sTd Qc4c JsTc 6c9d Kc6s 8hAs 2d5c TsQd"));
  }

  @Test
  public void test_texas_holdem_1502_3c5c5s6d7s_6cTc_Jh7h_QdAs_7d4d_2cTs_3d9s_2h9h_Ks5h_3hQs() {
    assertEquals(
      "2h9h 2cTs QdAs 3d9s 3hQs 6cTc Jh7h Ks5h 7d4d",
      Solver.process("texas-holdem 3c5c5s6d7s 6cTc Jh7h QdAs 7d4d 2cTs 3d9s 2h9h Ks5h 3hQs"));
  }

  @Test
  public void test_texas_holdem_1503_2d4s5sKdTh_5dKs_3sQc_Qs8h_5c8s_TdJc_6hJd_8c7h_Ts9c() {
    assertEquals(
      "8c7h 6hJd 3sQc Qs8h 5c8s Ts9c TdJc 5dKs",
      Solver.process("texas-holdem 2d4s5sKdTh 5dKs 3sQc Qs8h 5c8s TdJc 6hJd 8c7h Ts9c"));
  }

  @Test
  public void test_texas_holdem_1504_6c6d7c9hKc_4c8d_7d6h() {
    assertEquals(
      "4c8d 7d6h",
      Solver.process("texas-holdem 6c6d7c9hKc 4c8d 7d6h"));
  }

  @Test
  public void test_texas_holdem_1505_3h6dKhKsQh_AhKd_4d2c_QsQd_6c8s_5h6s_3cAs_5d2h() {
    assertEquals(
      "4d2c 5d2h 3cAs 5h6s=6c8s AhKd QsQd",
      Solver.process("texas-holdem 3h6dKhKsQh AhKd 4d2c QsQd 6c8s 5h6s 3cAs 5d2h"));
  }

  @Test
  public void test_texas_holdem_1506_2h6h7hAsTc_5cQs_8d7s_AdQh_2d2c() {
    assertEquals(
      "5cQs 8d7s AdQh 2d2c",
      Solver.process("texas-holdem 2h6h7hAsTc 5cQs 8d7s AdQh 2d2c"));
  }

  @Test
  public void test_texas_holdem_1507_6c6d9sJcQs_7d2h_7cAh() {
    assertEquals(
      "7d2h 7cAh",
      Solver.process("texas-holdem 6c6d9sJcQs 7d2h 7cAh"));
  }

  @Test
  public void test_texas_holdem_1508_5c9sKdKhTs_2c4h_5d4d_3d6c_7cTh_JhAc() {
    assertEquals(
      "2c4h 3d6c JhAc 5d4d 7cTh",
      Solver.process("texas-holdem 5c9sKdKhTs 2c4h 5d4d 3d6c 7cTh JhAc"));
  }

  @Test
  public void test_texas_holdem_1509_3h4c8sJcTd_KcTs_Kh6c() {
    assertEquals(
      "Kh6c KcTs",
      Solver.process("texas-holdem 3h4c8sJcTd KcTs Kh6c"));
  }

  @Test
  public void test_texas_holdem_1510_2s5s7c8dQc_6s5h_2h3d_5dQs_8c4c_3cAs_6d9d_8hJs_Ac8s_7sJh() {
    assertEquals(
      "3cAs 2h3d 6s5h 7sJh 8c4c 8hJs Ac8s 5dQs 6d9d",
      Solver.process("texas-holdem 2s5s7c8dQc 6s5h 2h3d 5dQs 8c4c 3cAs 6d9d 8hJs Ac8s 7sJh"));
  }

  @Test
  public void test_texas_holdem_1511_5c5dJhQcQh_4c4h_Tc3d_7hAc_QsJs_9c9s_TdTh_5h6d_4sKh_8s9d() {
    assertEquals(
      "4c4h=8s9d=Tc3d 4sKh 7hAc 9c9s TdTh 5h6d QsJs",
      Solver.process("texas-holdem 5c5dJhQcQh 4c4h Tc3d 7hAc QsJs 9c9s TdTh 5h6d 4sKh 8s9d"));
  }

  @Test
  public void test_texas_holdem_1512_4d5d5hAcKd_6h7c_Qc5s_2dTh_9sAd_Kh4c_2h8s_TcTs_6c3h_QdJc() {
    assertEquals(
      "6c3h 6h7c 2h8s 2dTh QdJc TcTs Kh4c 9sAd Qc5s",
      Solver.process("texas-holdem 4d5d5hAcKd 6h7c Qc5s 2dTh 9sAd Kh4c 2h8s TcTs 6c3h QdJc"));
  }

  @Test
  public void test_texas_holdem_1513_2c4d5d5hQh_8cTc_Ks6s() {
    assertEquals(
      "8cTc Ks6s",
      Solver.process("texas-holdem 2c4d5d5hQh 8cTc Ks6s"));
  }

  @Test
  public void test_texas_holdem_1514_7hAcJhKcTh_9hQc_5s4c_2s3d_Js8h_9c5h_Tc9s_5dQd_7c5c_QhTd() {
    assertEquals(
      "2s3d=5s4c 9c5h 7c5c Tc9s Js8h 5dQd=9hQc=QhTd",
      Solver.process("texas-holdem 7hAcJhKcTh 9hQc 5s4c 2s3d Js8h 9c5h Tc9s 5dQd 7c5c QhTd"));
  }

  @Test
  public void test_texas_holdem_1515_4h6h6s9dQd_Jh2s_9h6d_3h5h_QhJd_8c2d_7d2h_Th9c() {
    assertEquals(
      "3h5h 7d2h 8c2d Jh2s Th9c QhJd 9h6d",
      Solver.process("texas-holdem 4h6h6s9dQd Jh2s 9h6d 3h5h QhJd 8c2d 7d2h Th9c"));
  }

  @Test
  public void test_texas_holdem_1516_5d9hAcKhTc_AsKd_5h9d_Ts4h_7cTd_KcQs_8s8d_Qh6h_Js9s() {
    assertEquals(
      "Qh6h 8s8d Js9s 7cTd=Ts4h KcQs 5h9d AsKd",
      Solver.process("texas-holdem 5d9hAcKhTc AsKd 5h9d Ts4h 7cTd KcQs 8s8d Qh6h Js9s"));
  }

  @Test
  public void test_texas_holdem_1517_7c7hAcJdQh_4d9s_7s7d_3dAh_5c6d_Td8d_4s2d_Kc6h_6sKd() {
    assertEquals(
      "4d9s=4s2d=5c6d=Td8d 6sKd=Kc6h 3dAh 7s7d",
      Solver.process("texas-holdem 7c7hAcJdQh 4d9s 7s7d 3dAh 5c6d Td8d 4s2d Kc6h 6sKd"));
  }

  @Test
  public void test_texas_holdem_1518_8hAdAhJsTh_5d8d_2cAs_3s5s_Ks3h_5cQh_4hQc_6h8c_2d4d_9s7d() {
    assertEquals(
      "2d4d=3s5s 4hQc=5cQh Ks3h 5d8d=6h8c 2cAs 9s7d",
      Solver.process("texas-holdem 8hAdAhJsTh 5d8d 2cAs 3s5s Ks3h 5cQh 4hQc 6h8c 2d4d 9s7d"));
  }

  @Test
  public void test_texas_holdem_1519_5h8sJhQdTs_Td4c_Js2s_9h8c_3d7d_Ac5c() {
    assertEquals(
      "3d7d Ac5c Td4c Js2s 9h8c",
      Solver.process("texas-holdem 5h8sJhQdTs Td4c Js2s 9h8c 3d7d Ac5c"));
  }

  @Test
  public void test_texas_holdem_1520_3c3d6c6sAs_9c6h_8hTd_2h5s_9h7c_5hTh_4h8c_2s5c() {
    assertEquals(
      "2h5s=2s5c=4h8c=5hTh=8hTd=9h7c 9c6h",
      Solver.process("texas-holdem 3c3d6c6sAs 9c6h 8hTd 2h5s 9h7c 5hTh 4h8c 2s5c"));
  }

  @Test
  public void test_texas_holdem_1521_2h3h4s6d9s_8h3d_ThTd_Kh8c_7d2d_7s4d_Kc5d_3sAc() {
    assertEquals(
      "Kh8c 7d2d 8h3d 3sAc 7s4d ThTd Kc5d",
      Solver.process("texas-holdem 2h3h4s6d9s 8h3d ThTd Kh8c 7d2d 7s4d Kc5d 3sAc"));
  }

  @Test
  public void test_texas_holdem_1522_5d6s7cAsJs_5sKd_3hAd_KcTh_8sKh_6h3c_3d6d_4sJc_JdTd_6c9d() {
    assertEquals(
      "8sKh KcTh 5sKd 3d6d=6h3c 6c9d 4sJc JdTd 3hAd",
      Solver.process("texas-holdem 5d6s7cAsJs 5sKd 3hAd KcTh 8sKh 6h3c 3d6d 4sJc JdTd 6c9d"));
  }

  @Test
  public void test_texas_holdem_1523_2c3d5s8dKd_Ac3s_KcAh() {
    assertEquals(
      "Ac3s KcAh",
      Solver.process("texas-holdem 2c3d5s8dKd Ac3s KcAh"));
  }

  @Test
  public void test_texas_holdem_1524_3h9hKhTcTs_5cQd_8c5h_6cQc_Kd2c_2d4d_Ad7c_7s6d() {
    assertEquals(
      "2d4d 7s6d 8c5h 5cQd=6cQc Ad7c Kd2c",
      Solver.process("texas-holdem 3h9hKhTcTs 5cQd 8c5h 6cQc Kd2c 2d4d Ad7c 7s6d"));
  }

  @Test
  public void test_texas_holdem_1525_3c5d7hAhQd_8d2c_Js8s_3d9c_6cTc_KhQc_Td7d_6sKd() {
    assertEquals(
      "8d2c 6cTc Js8s 6sKd 3d9c Td7d KhQc",
      Solver.process("texas-holdem 3c5d7hAhQd 8d2c Js8s 3d9c 6cTc KhQc Td7d 6sKd"));
  }

  @Test
  public void test_texas_holdem_1526_5c6h9dAhTc_5dAc_4sJh_8dQs_5h2s_3h4c_7s4d_KhJd_4hQc_3s6c() {
    assertEquals(
      "3h4c 7s4d 4sJh 4hQc 8dQs KhJd 5h2s 3s6c 5dAc",
      Solver.process("texas-holdem 5c6h9dAhTc 5dAc 4sJh 8dQs 5h2s 3h4c 7s4d KhJd 4hQc 3s6c"));
  }

  @Test
  public void test_texas_holdem_1527_4d5s6dJhKd_6sQs_Ts2h_AcAs_8cTc_Jc9c_4s8s_6h7c_Th9d() {
    assertEquals(
      "Ts2h 8cTc Th9d 4s8s 6h7c 6sQs Jc9c AcAs",
      Solver.process("texas-holdem 4d5s6dJhKd 6sQs Ts2h AcAs 8cTc Jc9c 4s8s 6h7c Th9d"));
  }

  @Test
  public void test_texas_holdem_1528_2h3s6sAdQs_7cQc_Tc7h_3h7d_KhQd_9s8d() {
    assertEquals(
      "9s8d Tc7h 3h7d 7cQc KhQd",
      Solver.process("texas-holdem 2h3s6sAdQs 7cQc Tc7h 3h7d KhQd 9s8d"));
  }

  @Test
  public void test_texas_holdem_1529_3h5d5sAhJh_6s5c_TsAd_5h8h_8dQd() {
    assertEquals(
      "8dQd TsAd 6s5c 5h8h",
      Solver.process("texas-holdem 3h5d5sAhJh 6s5c TsAd 5h8h 8dQd"));
  }

  @Test
  public void test_texas_holdem_1530_4c6h8hAsKd_2sJc_JdTs_4hKh() {
    assertEquals(
      "2sJc JdTs 4hKh",
      Solver.process("texas-holdem 4c6h8hAsKd 2sJc JdTs 4hKh"));
  }

  @Test
  public void test_texas_holdem_1531_2d4d7hAhTc_5d3s_JsJd_3h6s_Qs6h_QdJc() {
    assertEquals(
      "3h6s Qs6h QdJc JsJd 5d3s",
      Solver.process("texas-holdem 2d4d7hAhTc 5d3s JsJd 3h6s Qs6h QdJc"));
  }

  @Test
  public void test_texas_holdem_1532_2h4d4s5hJd_6d4c_7c3h_8h8d_7d3d_7h9s_TdTs() {
    assertEquals(
      "7c3h=7d3d 7h9s 8h8d TdTs 6d4c",
      Solver.process("texas-holdem 2h4d4s5hJd 6d4c 7c3h 8h8d 7d3d 7h9s TdTs"));
  }

  @Test
  public void test_texas_holdem_1533_2c2h8hAdJd_7dAc_5h9s_Ts6h_4hKs_5sQc_9dTh() {
    assertEquals(
      "5h9s 9dTh=Ts6h 5sQc 4hKs 7dAc",
      Solver.process("texas-holdem 2c2h8hAdJd 7dAc 5h9s Ts6h 4hKs 5sQc 9dTh"));
  }

  @Test
  public void test_texas_holdem_1534_3d4d4s6d7s_AcKs_As6s_3s9c_2hKc() {
    assertEquals(
      "2hKc AcKs 3s9c As6s",
      Solver.process("texas-holdem 3d4d4s6d7s AcKs As6s 3s9c 2hKc"));
  }

  @Test
  public void test_texas_holdem_1535_3d5d5s9dTd_7s4s_2d8d_7d6d() {
    assertEquals(
      "7s4s 7d6d 2d8d",
      Solver.process("texas-holdem 3d5d5s9dTd 7s4s 2d8d 7d6d"));
  }

  @Test
  public void test_texas_holdem_1536_4c8sKsTdTs_3h4s_3c7c_TcAh_7h9c() {
    assertEquals(
      "3c7c 7h9c 3h4s TcAh",
      Solver.process("texas-holdem 4c8sKsTdTs 3h4s 3c7c TcAh 7h9c"));
  }

  @Test
  public void test_texas_holdem_1537_2d5c7s8sKc_6d5s_6c7c() {
    assertEquals(
      "6d5s 6c7c",
      Solver.process("texas-holdem 2d5c7s8sKc 6d5s 6c7c"));
  }

  @Test
  public void test_texas_holdem_1538_6c7d7hJdTd_9cAd_QsQc_6sQh_6h4c_2s4h() {
    assertEquals(
      "2s4h 9cAd 6h4c 6sQh QsQc",
      Solver.process("texas-holdem 6c7d7hJdTd 9cAd QsQc 6sQh 6h4c 2s4h"));
  }

  @Test
  public void test_texas_holdem_1539_2d4c8h9cTh_7s4h_QhTs_6s2s_3d5c() {
    assertEquals(
      "3d5c 6s2s 7s4h QhTs",
      Solver.process("texas-holdem 2d4c8h9cTh 7s4h QhTs 6s2s 3d5c"));
  }

  @Test
  public void test_texas_holdem_1540_2h3s9dJhTd_5d3h_Kh7d_8hQc_7cTc_KdAs() {
    assertEquals(
      "Kh7d KdAs 5d3h 7cTc 8hQc",
      Solver.process("texas-holdem 2h3s9dJhTd 5d3h Kh7d 8hQc 7cTc KdAs"));
  }

  @Test
  public void test_texas_holdem_1541_6s7d7sAdKh_ThKd_TsJd_9h8d() {
    assertEquals(
      "9h8d TsJd ThKd",
      Solver.process("texas-holdem 6s7d7sAdKh ThKd TsJd 9h8d"));
  }

  @Test
  public void test_texas_holdem_1542_7s9cAsJsKh_3s3d_2c7d_ThTd_6sAd_5sJh_3hTc_8c8d_5c4s() {
    assertEquals(
      "5c4s 3hTc 3s3d 2c7d 8c8d ThTd 5sJh 6sAd",
      Solver.process("texas-holdem 7s9cAsJsKh 3s3d 2c7d ThTd 6sAd 5sJh 3hTc 8c8d 5c4s"));
  }

  @Test
  public void test_texas_holdem_1543_2h9sKdQhQs_Qd8s_9cAc_Kh2d() {
    assertEquals(
      "9cAc Kh2d Qd8s",
      Solver.process("texas-holdem 2h9sKdQhQs Qd8s 9cAc Kh2d"));
  }

  @Test
  public void test_texas_holdem_1544_2c4c4s8hAs_8sAh_KhJh_7cTd() {
    assertEquals(
      "7cTd KhJh 8sAh",
      Solver.process("texas-holdem 2c4c4s8hAs 8sAh KhJh 7cTd"));
  }

  @Test
  public void test_texas_holdem_1545_4h5c6c6d7d_7sQh_QsJd_Tc2s() {
    assertEquals(
      "Tc2s QsJd 7sQh",
      Solver.process("texas-holdem 4h5c6c6d7d 7sQh QsJd Tc2s"));
  }

  @Test
  public void test_texas_holdem_1546_3d4c4d9sQs_Qh8c_Ts7h_Ks2d_4s7s_8d9c_Td9h_Kd6d() {
    assertEquals(
      "Ts7h Kd6d=Ks2d 8d9c=Td9h Qh8c 4s7s",
      Solver.process("texas-holdem 3d4c4d9sQs Qh8c Ts7h Ks2d 4s7s 8d9c Td9h Kd6d"));
  }

  @Test
  public void test_texas_holdem_1547_6c9c9h9sQs_Qd2c_3h3s_4sJd_5d5s_Kc4h_TsJs() {
    assertEquals(
      "4sJd=TsJs Kc4h 3h3s 5d5s Qd2c",
      Solver.process("texas-holdem 6c9c9h9sQs Qd2c 3h3s 4sJd 5d5s Kc4h TsJs"));
  }

  @Test
  public void test_texas_holdem_1548_4c7cAdKcQd_3c2d_3sKd_Tc8c_Qc6s_Jc7h_Jd9s_5c2h_3d9h_Jh5h() {
    assertEquals(
      "3c2d 5c2h 3d9h Jh5h Jd9s Jc7h Qc6s 3sKd Tc8c",
      Solver.process("texas-holdem 4c7cAdKcQd 3c2d 3sKd Tc8c Qc6s Jc7h Jd9s 5c2h 3d9h Jh5h"));
  }

  @Test
  public void test_texas_holdem_1549_3d6s7sKsQh_9d7d_9h8d_8h5d_Ts4s() {
    assertEquals(
      "8h5d 9h8d 9d7d Ts4s",
      Solver.process("texas-holdem 3d6s7sKsQh 9d7d 9h8d 8h5d Ts4s"));
  }

  @Test
  public void test_texas_holdem_1550_9d9h9sKcKs_5dTh_2c2d() {
    assertEquals(
      "2c2d=5dTh",
      Solver.process("texas-holdem 9d9h9sKcKs 5dTh 2c2d"));
  }

  @Test
  public void test_texas_holdem_1551_7c8hQdQsTd_JcQh_8d3s_4c2d_Qc2s_9c3h_7dKh_Jd9d_Ks6d_4h5d() {
    assertEquals(
      "4c2d=4h5d 9c3h Ks6d 7dKh 8d3s Qc2s JcQh Jd9d",
      Solver.process("texas-holdem 7c8hQdQsTd JcQh 8d3s 4c2d Qc2s 9c3h 7dKh Jd9d Ks6d 4h5d"));
  }

  @Test
  public void test_texas_holdem_1552_2c7h9sAhJc_KhJd_KdQc_Td3d_8s3s_9cKs_7c6s_8c2d_4c3c_JhTc() {
    assertEquals(
      "4c3c 8s3s Td3d KdQc 8c2d 7c6s 9cKs JhTc KhJd",
      Solver.process("texas-holdem 2c7h9sAhJc KhJd KdQc Td3d 8s3s 9cKs 7c6s 8c2d 4c3c JhTc"));
  }

  @Test
  public void test_texas_holdem_1553_3c4s6dQcQh_Jc9h_Td6c_4c7d_3sAd_6s2c_2h8h_Jd6h_7s5s_4dJs() {
    assertEquals(
      "2h8h Jc9h 3sAd 4c7d 4dJs 6s2c Td6c Jd6h 7s5s",
      Solver.process("texas-holdem 3c4s6dQcQh Jc9h Td6c 4c7d 3sAd 6s2c 2h8h Jd6h 7s5s 4dJs"));
  }

  @Test
  public void test_texas_holdem_1554_2d3c6h8sQs_Ks8c_7hJs_5h9d_2hAc() {
    assertEquals(
      "5h9d 7hJs 2hAc Ks8c",
      Solver.process("texas-holdem 2d3c6h8sQs Ks8c 7hJs 5h9d 2hAc"));
  }

  @Test
  public void test_texas_holdem_1555_5c7c7hJsTd_3d7s_4d3c() {
    assertEquals(
      "4d3c 3d7s",
      Solver.process("texas-holdem 5c7c7hJsTd 3d7s 4d3c"));
  }

  @Test
  public void test_texas_holdem_1556_6hAcAdThTs_9s4s_JdQs() {
    assertEquals(
      "9s4s JdQs",
      Solver.process("texas-holdem 6hAcAdThTs 9s4s JdQs"));
  }

  @Test
  public void test_texas_holdem_1557_2c7c7hJsKh_Tc3s_Ah6h_Th4s_8hQh_9hKd_Qc7d_JhKc_JdQs_As8s() {
    assertEquals(
      "Tc3s=Th4s 8hQh Ah6h=As8s JdQs 9hKd JhKc Qc7d",
      Solver.process("texas-holdem 2c7c7hJsKh Tc3s Ah6h Th4s 8hQh 9hKd Qc7d JhKc JdQs As8s"));
  }

  @Test
  public void test_texas_holdem_1558_5d5hJsQsTh_Ts7h_QhKh_AsJh_8dAh_5cAd_Qd6h_2c3s() {
    assertEquals(
      "2c3s 8dAh Ts7h AsJh Qd6h QhKh 5cAd",
      Solver.process("texas-holdem 5d5hJsQsTh Ts7h QhKh AsJh 8dAh 5cAd Qd6h 2c3s"));
  }

  @Test
  public void test_texas_holdem_1559_2h3h5d7sAd_AsJc_Td4d_6sQd_2dKh_Qh3d_9s8s() {
    assertEquals(
      "9s8s 6sQd 2dKh Qh3d AsJc Td4d",
      Solver.process("texas-holdem 2h3h5d7sAd AsJc Td4d 6sQd 2dKh Qh3d 9s8s"));
  }

  @Test
  public void test_texas_holdem_1560_3s4cKhQcTs_9h3d_Ac2d_3c5d() {
    assertEquals(
      "Ac2d 3c5d=9h3d",
      Solver.process("texas-holdem 3s4cKhQcTs 9h3d Ac2d 3c5d"));
  }

  @Test
  public void test_texas_holdem_1561_4h5s9hJhTc_Jc7h_KhKc_Qd8c() {
    assertEquals(
      "Jc7h KhKc Qd8c",
      Solver.process("texas-holdem 4h5s9hJhTc Jc7h KhKc Qd8c"));
  }

  @Test
  public void test_texas_holdem_1562_2s3h4c7sJd_Qc4d_AdQh_9hTs_3c8c_KcKd_5c9c() {
    assertEquals(
      "5c9c 9hTs AdQh 3c8c Qc4d KcKd",
      Solver.process("texas-holdem 2s3h4c7sJd Qc4d AdQh 9hTs 3c8c KcKd 5c9c"));
  }

  @Test
  public void test_texas_holdem_1563_4c4hAsJcJs_8dQc_5s7s_Ac2h_3hKs_Qs3s_2c7c() {
    assertEquals(
      "2c7c=3hKs=5s7s=8dQc=Qs3s Ac2h",
      Solver.process("texas-holdem 4c4hAsJcJs 8dQc 5s7s Ac2h 3hKs Qs3s 2c7c"));
  }

  @Test
  public void test_texas_holdem_1564_4s6h7h7s8h_6cTh_JhKc_2hAd_Kh6s_3s9c_3h3d() {
    assertEquals(
      "3s9c JhKc 2hAd 3h3d 6cTh Kh6s",
      Solver.process("texas-holdem 4s6h7h7s8h 6cTh JhKc 2hAd Kh6s 3s9c 3h3d"));
  }

  @Test
  public void test_texas_holdem_1565_2c4s5s8sQh_Ts9h_5dAh_Kh3c_AcAs() {
    assertEquals(
      "Ts9h Kh3c 5dAh AcAs",
      Solver.process("texas-holdem 2c4s5s8sQh Ts9h 5dAh Kh3c AcAs"));
  }

  @Test
  public void test_texas_holdem_1566_5sAcKdKhTd_Ad4c_Tc3h_6s4h_4d5d_9s8d_9dJh_Qs2h_Ts5c() {
    assertEquals(
      "6s4h 9s8d 9dJh Qs2h 4d5d Tc3h=Ts5c Ad4c",
      Solver.process("texas-holdem 5sAcKdKhTd Ad4c Tc3h 6s4h 4d5d 9s8d 9dJh Qs2h Ts5c"));
  }

  @Test
  public void test_texas_holdem_1567_2h3h3s4s8s_Qd4c_2c9c_Jd8d_Js2d_7dKc_Ts5d() {
    assertEquals(
      "Ts5d 7dKc 2c9c Js2d Qd4c Jd8d",
      Solver.process("texas-holdem 2h3h3s4s8s Qd4c 2c9c Jd8d Js2d 7dKc Ts5d"));
  }

  @Test
  public void test_texas_holdem_1568_2s5sAdJcTc_Ks4c_Ts4h() {
    assertEquals(
      "Ks4c Ts4h",
      Solver.process("texas-holdem 2s5sAdJcTc Ks4c Ts4h"));
  }

  @Test
  public void test_texas_holdem_1569_4c8d9d9hAd_Qc7s_9s4s_5cTh_Qh6c_Ts8h_5d4h_7hAc_3sTd_As2d() {
    assertEquals(
      "3sTd=5cTh Qc7s=Qh6c 5d4h Ts8h 7hAc=As2d 9s4s",
      Solver.process("texas-holdem 4c8d9d9hAd Qc7s 9s4s 5cTh Qh6c Ts8h 5d4h 7hAc 3sTd As2d"));
  }

  @Test
  public void test_texas_holdem_1570_2h3s4dJdTs_Qh3d_9cKd() {
    assertEquals(
      "9cKd Qh3d",
      Solver.process("texas-holdem 2h3s4dJdTs Qh3d 9cKd"));
  }

  @Test
  public void test_texas_holdem_1571_4s5h8sJsQd_6h7s_5c3c_7dJh_2cAh_9dQc_9cJd_6cAd_8dJc_6dAc() {
    assertEquals(
      "2cAh 6cAd=6dAc 5c3c 7dJh 9cJd 9dQc 8dJc 6h7s",
      Solver.process("texas-holdem 4s5h8sJsQd 6h7s 5c3c 7dJh 2cAh 9dQc 9cJd 6cAd 8dJc 6dAc"));
  }

  @Test
  public void test_texas_holdem_1572_6h9sJhJsQs_7s9h_2h8c() {
    assertEquals(
      "2h8c 7s9h",
      Solver.process("texas-holdem 6h9sJhJsQs 7s9h 2h8c"));
  }

  @Test
  public void test_texas_holdem_1573_2h3c6cAhTd_5c7c_7d3h_5sQs() {
    assertEquals(
      "5c7c 5sQs 7d3h",
      Solver.process("texas-holdem 2h3c6cAhTd 5c7c 7d3h 5sQs"));
  }

  @Test
  public void test_texas_holdem_1574_4c4s5sAcQs_TcAs_8d2h_9s4h_5h7h_Jc7c_JhKs_3s2c_AdJs() {
    assertEquals(
      "8d2h Jc7c JhKs 5h7h AdJs=TcAs 9s4h 3s2c",
      Solver.process("texas-holdem 4c4s5sAcQs TcAs 8d2h 9s4h 5h7h Jc7c JhKs 3s2c AdJs"));
  }

  @Test
  public void test_texas_holdem_1575_2d6hKcTdTs_Kh4c_8h9s() {
    assertEquals(
      "8h9s Kh4c",
      Solver.process("texas-holdem 2d6hKcTdTs Kh4c 8h9s"));
  }

  @Test
  public void test_texas_holdem_1576_2d3hJcKsQd_Kc2h_3c8d_4h5c_3sAs_QhAc() {
    assertEquals(
      "4h5c 3c8d 3sAs QhAc Kc2h",
      Solver.process("texas-holdem 2d3hJcKsQd Kc2h 3c8d 4h5c 3sAs QhAc"));
  }

  @Test
  public void test_texas_holdem_1577_4c9c9hKcQs_2h6d_JcQc_8s2c_Td7d_3h8c_Ac6s_QhQd() {
    assertEquals(
      "2h6d 3h8c=8s2c Td7d Ac6s JcQc QhQd",
      Solver.process("texas-holdem 4c9c9hKcQs 2h6d JcQc 8s2c Td7d 3h8c Ac6s QhQd"));
  }

  @Test
  public void test_texas_holdem_1578_3c4hAsQdTh_3dJh_2s8c_Ks5h_Ac6h_8hTc() {
    assertEquals(
      "2s8c Ks5h 3dJh 8hTc Ac6h",
      Solver.process("texas-holdem 3c4hAsQdTh 3dJh 2s8c Ks5h Ac6h 8hTc"));
  }

  @Test
  public void test_texas_holdem_1579_2h5d8cJdJs_3s8d_5h4c_3dKs_JhQs_Td5s() {
    assertEquals(
      "3dKs 5h4c Td5s 3s8d JhQs",
      Solver.process("texas-holdem 2h5d8cJdJs 3s8d 5h4c 3dKs JhQs Td5s"));
  }

  @Test
  public void test_texas_holdem_1580_7s9c9dKcQc_Ad7h_2c3d_8dAs_Td4d_Jh8c_Tc5h_8hJs_Qs5d() {
    assertEquals(
      "2c3d Tc5h=Td4d 8hJs=Jh8c 8dAs Ad7h Qs5d",
      Solver.process("texas-holdem 7s9c9dKcQc Ad7h 2c3d 8dAs Td4d Jh8c Tc5h 8hJs Qs5d"));
  }

  @Test
  public void test_texas_holdem_1581_4h5h9cJsTd_QhJd_TsAh_Jh9h_Ac4d_3sKc_KdQd_2cKh_7d8h_3h7h() {
    assertEquals(
      "3h7h 2cKh=3sKc Ac4d TsAh QhJd Jh9h 7d8h KdQd",
      Solver.process("texas-holdem 4h5h9cJsTd QhJd TsAh Jh9h Ac4d 3sKc KdQd 2cKh 7d8h 3h7h"));
  }

  @Test
  public void test_texas_holdem_1582_3h5c8dJhJs_7dAc_4s9d() {
    assertEquals(
      "4s9d 7dAc",
      Solver.process("texas-holdem 3h5c8dJhJs 7dAc 4s9d"));
  }

  @Test
  public void test_texas_holdem_1583_4h5c8h9sAs_3c2c_9d7d_2s9c_Ac7h_Ts6c_2h6s_3h4d_9h5h_7s3d() {
    assertEquals(
      "2h6s 7s3d Ts6c 3h4d 2s9c 9d7d Ac7h 9h5h 3c2c",
      Solver.process("texas-holdem 4h5c8h9sAs 3c2c 9d7d 2s9c Ac7h Ts6c 2h6s 3h4d 9h5h 7s3d"));
  }

  @Test
  public void test_texas_holdem_1584_5d5h7hKdQs_9h8h_6cAh_3d4d() {
    assertEquals(
      "3d4d 9h8h 6cAh",
      Solver.process("texas-holdem 5d5h7hKdQs 9h8h 6cAh 3d4d"));
  }

  @Test
  public void test_texas_holdem_1585_2h3h7d8sTh_5hQd_Kd2s_5c2c_Td6h_9cTs_4hQc_Ac3d() {
    assertEquals(
      "4hQc 5hQd 5c2c Kd2s Ac3d Td6h 9cTs",
      Solver.process("texas-holdem 2h3h7d8sTh 5hQd Kd2s 5c2c Td6h 9cTs 4hQc Ac3d"));
  }

  @Test
  public void test_texas_holdem_1586_4s5c6d7dJc_9hAc_Qh9d_Qc6s_7h5s_TsQd_2c3d() {
    assertEquals(
      "Qh9d TsQd 9hAc Qc6s 7h5s 2c3d",
      Solver.process("texas-holdem 4s5c6d7dJc 9hAc Qh9d Qc6s 7h5s TsQd 2c3d"));
  }

  @Test
  public void test_texas_holdem_1587_4s7hAcQcTd_As3h_2cJh_5d8s_Ks8h() {
    assertEquals(
      "5d8s 2cJh Ks8h As3h",
      Solver.process("texas-holdem 4s7hAcQcTd As3h 2cJh 5d8s Ks8h"));
  }

  @Test
  public void test_texas_holdem_1588_6h6sAhKsQs_Ac8s_7s4d_Jc5s_9cKh_5cQd_6d9d_Kc5d_Tc9h() {
    assertEquals(
      "7s4d=Jc5s=Tc9h 5cQd 9cKh=Kc5d Ac8s 6d9d",
      Solver.process("texas-holdem 6h6sAhKsQs Ac8s 7s4d Jc5s 9cKh 5cQd 6d9d Kc5d Tc9h"));
  }

  @Test
  public void test_texas_holdem_1589_2c3s6s7sJh_3h2s_8dKd_Ac8s_9h5h_7cQd_AsQs_Tc2h_Qc6d_4d2d() {
    assertEquals(
      "9h5h 8dKd Ac8s 4d2d Tc2h Qc6d 7cQd 3h2s AsQs",
      Solver.process("texas-holdem 2c3s6s7sJh 3h2s 8dKd Ac8s 9h5h 7cQd AsQs Tc2h Qc6d 4d2d"));
  }

  @Test
  public void test_texas_holdem_1590_7c9dKsQcTd_Js8d_4cTs_3c6c_Ad6s() {
    assertEquals(
      "3c6c Ad6s 4cTs Js8d",
      Solver.process("texas-holdem 7c9dKsQcTd Js8d 4cTs 3c6c Ad6s"));
  }

  @Test
  public void test_texas_holdem_1591_3d4hJsKsQh_AdTh_8sKh_3hQs_6cTc() {
    assertEquals(
      "6cTc 8sKh 3hQs AdTh",
      Solver.process("texas-holdem 3d4hJsKsQh AdTh 8sKh 3hQs 6cTc"));
  }

  @Test
  public void test_texas_holdem_1592_2s3h7c9sKs_AdJs_6s9c_Jh6h_8c3d_2dKc_3sTd_TcQh() {
    assertEquals(
      "Jh6h TcQh AdJs 8c3d 3sTd 6s9c 2dKc",
      Solver.process("texas-holdem 2s3h7c9sKs AdJs 6s9c Jh6h 8c3d 2dKc 3sTd TcQh"));
  }

  @Test
  public void test_texas_holdem_1593_7c7dAsKdKs_9hQh_3d8h_6s2h_4s4h_Ah5h_JhAc_5s5c_JsTc_Kc2s() {
    assertEquals(
      "3d8h=4s4h=5s5c=6s2h=9hQh=JsTc Ah5h JhAc Kc2s",
      Solver.process("texas-holdem 7c7dAsKdKs 9hQh 3d8h 6s2h 4s4h Ah5h JhAc 5s5c JsTc Kc2s"));
  }

  @Test
  public void test_texas_holdem_1594_4c7hJhTdTh_9h8c_5dJs() {
    assertEquals(
      "5dJs 9h8c",
      Solver.process("texas-holdem 4c7hJhTdTh 9h8c 5dJs"));
  }

  @Test
  public void test_texas_holdem_1595_8hAhJhQhTs_Ac2s_AdJs_7h2d_9sKh_4c6s_5s3h_Tc4h_Jd6d() {
    assertEquals(
      "4c6s Jd6d Ac2s AdJs 5s3h Tc4h 7h2d 9sKh",
      Solver.process("texas-holdem 8hAhJhQhTs Ac2s AdJs 7h2d 9sKh 4c6s 5s3h Tc4h Jd6d"));
  }

  @Test
  public void test_texas_holdem_1596_6s8s9sAdJc_TdQs_Th8h_3hKc() {
    assertEquals(
      "3hKc Th8h TdQs",
      Solver.process("texas-holdem 6s8s9sAdJc TdQs Th8h 3hKc"));
  }

  @Test
  public void test_texas_holdem_1597_6sAhJdJsTh_2s6d_2cTc_Kd8h() {
    assertEquals(
      "Kd8h 2s6d 2cTc",
      Solver.process("texas-holdem 6sAhJdJsTh 2s6d 2cTc Kd8h"));
  }

  @Test
  public void test_texas_holdem_1598_8d8s9c9dAs_AhTs_Ad3s_KhTc_8cKc_4sQc_4cJc() {
    assertEquals(
      "4cJc=4sQc=KhTc Ad3s AhTs 8cKc",
      Solver.process("texas-holdem 8d8s9c9dAs AhTs Ad3s KhTc 8cKc 4sQc 4cJc"));
  }

  @Test
  public void test_texas_holdem_1599_2s3s7dAsTd_Jh4d_5dKd() {
    assertEquals(
      "Jh4d 5dKd",
      Solver.process("texas-holdem 2s3s7dAsTd Jh4d 5dKd"));
  }

  @Test
  public void test_texas_holdem_1600_4s6h7h7s8s_3dQd_Ah4h() {
    assertEquals(
      "3dQd Ah4h",
      Solver.process("texas-holdem 4s6h7h7s8s 3dQd Ah4h"));
  }

  @Test
  public void test_texas_holdem_1601_3s7cJsKcKh_7dQs_QdKs_JcTc_Ac6s_6dJd_8d3d() {
    assertEquals(
      "Ac6s 8d3d 7dQs 6dJd JcTc QdKs",
      Solver.process("texas-holdem 3s7cJsKcKh 7dQs QdKs JcTc Ac6s 6dJd 8d3d"));
  }

  @Test
  public void test_texas_holdem_1602_4s5s6s9dQc_Ah4d_Th2s() {
    assertEquals(
      "Th2s Ah4d",
      Solver.process("texas-holdem 4s5s6s9dQc Ah4d Th2s"));
  }

  @Test
  public void test_texas_holdem_1603_2c3s6h7s9s_Jh7c_QsTc_AdKc_8s4d() {
    assertEquals(
      "8s4d QsTc AdKc Jh7c",
      Solver.process("texas-holdem 2c3s6h7s9s Jh7c QsTc AdKc 8s4d"));
  }

  @Test
  public void test_texas_holdem_1604_4c4h4s9sQs_Ac8s_Jh2d_3s9d_Th9c_7s7h() {
    assertEquals(
      "Jh2d Ac8s 7s7h 3s9d=Th9c",
      Solver.process("texas-holdem 4c4h4s9sQs Ac8s Jh2d 3s9d Th9c 7s7h"));
  }

  @Test
  public void test_texas_holdem_1605_2d3c4c6d8s_Qc8c_Tc4d_6sKs_3s7c_Kh5c_6cJd_Jc6h_Kd7h() {
    assertEquals(
      "Kd7h 3s7c Tc4d 6cJd=Jc6h 6sKs Qc8c Kh5c",
      Solver.process("texas-holdem 2d3c4c6d8s Qc8c Tc4d 6sKs 3s7c Kh5c 6cJd Jc6h Kd7h"));
  }

  @Test
  public void test_texas_holdem_1606_4c7s8sKhKs_JsTh_8d5c_Ad4h_9cJd_7h3d_AcQd() {
    assertEquals(
      "9cJd JsTh AcQd Ad4h 7h3d 8d5c",
      Solver.process("texas-holdem 4c7s8sKhKs JsTh 8d5c Ad4h 9cJd 7h3d AcQd"));
  }

  @Test
  public void test_texas_holdem_1607_5h7dAsJhKh_Qs2h_3dTc_4s9h_Ad3c() {
    assertEquals(
      "4s9h 3dTc Qs2h Ad3c",
      Solver.process("texas-holdem 5h7dAsJhKh Qs2h 3dTc 4s9h Ad3c"));
  }

  @Test
  public void test_texas_holdem_1608_2c3h4c5h7c_5d8s_3dTs_4h6c_Qd8c_3cQc() {
    assertEquals(
      "Qd8c 3dTs 5d8s 4h6c 3cQc",
      Solver.process("texas-holdem 2c3h4c5h7c 5d8s 3dTs 4h6c Qd8c 3cQc"));
  }

  @Test
  public void test_texas_holdem_1609_2c6cKhTdTh_8hQh_7dQs_Qd4h() {
    assertEquals(
      "Qd4h 7dQs 8hQh",
      Solver.process("texas-holdem 2c6cKhTdTh 8hQh 7dQs Qd4h"));
  }

  @Test
  public void test_texas_holdem_1610_4c6c6d9hKs_ThAc_AdQh_Jc5d() {
    assertEquals(
      "Jc5d ThAc AdQh",
      Solver.process("texas-holdem 4c6c6d9hKs ThAc AdQh Jc5d"));
  }

  @Test
  public void test_texas_holdem_1611_2c5d7dAcJh_9s9h_6d4s_2d3d_Jd6c_7cTh_AhQh() {
    assertEquals(
      "6d4s 2d3d 7cTh 9s9h Jd6c AhQh",
      Solver.process("texas-holdem 2c5d7dAcJh 9s9h 6d4s 2d3d Jd6c 7cTh AhQh"));
  }

  @Test
  public void test_texas_holdem_1612_9dAdKsQcTc_KdTs_8h4d_5h2s_7d3c_Jh8s_5c3d_4sTd() {
    assertEquals(
      "5c3d=5h2s=7d3c=8h4d 4sTd KdTs Jh8s",
      Solver.process("texas-holdem 9dAdKsQcTc KdTs 8h4d 5h2s 7d3c Jh8s 5c3d 4sTd"));
  }

  @Test
  public void test_texas_holdem_1613_2d5d6h7sKh_4d3s_8c6c_Jd4h_TsQc_9d7c_Kc4s_2s8d() {
    assertEquals(
      "Jd4h TsQc 2s8d 8c6c 9d7c Kc4s 4d3s",
      Solver.process("texas-holdem 2d5d6h7sKh 4d3s 8c6c Jd4h TsQc 9d7c Kc4s 2s8d"));
  }

  @Test
  public void test_texas_holdem_1614_2h7c8h9hJh_6c4s_AhQd_6s2s_9cTs_5s7d() {
    assertEquals(
      "6c4s 6s2s 5s7d 9cTs AhQd",
      Solver.process("texas-holdem 2h7c8h9hJh 6c4s AhQd 6s2s 9cTs 5s7d"));
  }

  @Test
  public void test_texas_holdem_1615_7h9cAdKhQc_Th2s_8s7s() {
    assertEquals(
      "Th2s 8s7s",
      Solver.process("texas-holdem 7h9cAdKhQc Th2s 8s7s"));
  }

  @Test
  public void test_texas_holdem_1616_5d5h9dJcQc_2c8s_Ad3c_Qs9s() {
    assertEquals(
      "2c8s Ad3c Qs9s",
      Solver.process("texas-holdem 5d5h9dJcQc 2c8s Ad3c Qs9s"));
  }

  @Test
  public void test_texas_holdem_1617_3h3s6sAdKd_Th4h_8hQh_8sKc_Js5s() {
    assertEquals(
      "Th4h Js5s 8hQh 8sKc",
      Solver.process("texas-holdem 3h3s6sAdKd Th4h 8hQh 8sKc Js5s"));
  }

  @Test
  public void test_texas_holdem_1618_3h7c8d8sKc_9cTc_9hKh_7h2h_JsTs_3dQh_2s2d_5d4h_Jh5c_6c8h() {
    assertEquals(
      "5d4h 9cTc Jh5c JsTs 2s2d 3dQh 7h2h 9hKh 6c8h",
      Solver.process("texas-holdem 3h7c8d8sKc 9cTc 9hKh 7h2h JsTs 3dQh 2s2d 5d4h Jh5c 6c8h"));
  }

  @Test
  public void test_texas_holdem_1619_2h3h3s7cTd_Qs5c_7d7s_9hAh_Ac9c_Ks4s_7hQh() {
    assertEquals(
      "Qs5c Ks4s 9hAh=Ac9c 7hQh 7d7s",
      Solver.process("texas-holdem 2h3h3s7cTd Qs5c 7d7s 9hAh Ac9c Ks4s 7hQh"));
  }

  @Test
  public void test_texas_holdem_1620_7c8c8sAcKd_7d4s_TdQd_4c5s_2hJc() {
    assertEquals(
      "4c5s 2hJc TdQd 7d4s",
      Solver.process("texas-holdem 7c8c8sAcKd 7d4s TdQd 4c5s 2hJc"));
  }

  @Test
  public void test_texas_holdem_1621_6s7hAcJcTh_4d3c_8c9c_3h2c_5dAs() {
    assertEquals(
      "3h2c=4d3c 5dAs 8c9c",
      Solver.process("texas-holdem 6s7hAcJcTh 4d3c 8c9c 3h2c 5dAs"));
  }

  @Test
  public void test_texas_holdem_1622_3d5c5s9cJs_KdQs_Qh3s_6sAh_TdAs_7h4d_5dKs_8d7d_6c2h_6dAc() {
    assertEquals(
      "6c2h 7h4d 8d7d KdQs 6dAc=6sAh TdAs Qh3s 5dKs",
      Solver.process("texas-holdem 3d5c5s9cJs KdQs Qh3s 6sAh TdAs 7h4d 5dKs 8d7d 6c2h 6dAc"));
  }

  @Test
  public void test_texas_holdem_1623_2c5c8sJhTs_9s5s_Kh8h_6h9c_7sTc_ThQd_8c3h() {
    assertEquals(
      "6h9c 9s5s 8c3h Kh8h 7sTc ThQd",
      Solver.process("texas-holdem 2c5c8sJhTs 9s5s Kh8h 6h9c 7sTc ThQd 8c3h"));
  }

  @Test
  public void test_texas_holdem_1624_4c5d6sQcTh_8c2d_4d3s_8d5c_AhAs_6d7d_5s2h_KdQd_TcJc_9c7c() {
    assertEquals(
      "8c2d 9c7c 4d3s 5s2h 8d5c 6d7d TcJc KdQd AhAs",
      Solver.process("texas-holdem 4c5d6sQcTh 8c2d 4d3s 8d5c AhAs 6d7d 5s2h KdQd TcJc 9c7c"));
  }

  @Test
  public void test_texas_holdem_1625_3s6hAhKcKs_4sTd_4c8d_6sTc_ThQc_As9s_9c2d_2h6d_9hQd() {
    assertEquals(
      "4c8d 9c2d 4sTd 9hQd ThQc 2h6d=6sTc As9s",
      Solver.process("texas-holdem 3s6hAhKcKs 4sTd 4c8d 6sTc ThQc As9s 9c2d 2h6d 9hQd"));
  }

  @Test
  public void test_texas_holdem_1626_3s4c8h9cQd_8cTs_KsKc_2hTd_6h6s() {
    assertEquals(
      "2hTd 6h6s 8cTs KsKc",
      Solver.process("texas-holdem 3s4c8h9cQd 8cTs KsKc 2hTd 6h6s"));
  }

  @Test
  public void test_texas_holdem_1627_4c4h5s7c9c_Ah7d_KhKc() {
    assertEquals(
      "Ah7d KhKc",
      Solver.process("texas-holdem 4c4h5s7c9c Ah7d KhKc"));
  }

  @Test
  public void test_texas_holdem_1628_3c5s7c9hTc_3s7h_3h6d_Td6s_2h2s_JsTh_Jh9d_3dQh_KcAs() {
    assertEquals(
      "KcAs 2h2s 3h6d 3dQh Jh9d Td6s JsTh 3s7h",
      Solver.process("texas-holdem 3c5s7c9hTc 3s7h 3h6d Td6s 2h2s JsTh Jh9d 3dQh KcAs"));
  }

  @Test
  public void test_texas_holdem_1629_4c5hAsJdQs_Kh8s_4h4s_9sQh_7dQc() {
    assertEquals(
      "Kh8s 7dQc 9sQh 4h4s",
      Solver.process("texas-holdem 4c5hAsJdQs Kh8s 4h4s 9sQh 7dQc"));
  }

  @Test
  public void test_texas_holdem_1630_3c5d8cTdTs_Kd7c_As8h_6cQd() {
    assertEquals(
      "6cQd Kd7c As8h",
      Solver.process("texas-holdem 3c5d8cTdTs Kd7c As8h 6cQd"));
  }

  @Test
  public void test_texas_holdem_1631_4h6s9c9sQd_2s4c_2cQc_4s3c() {
    assertEquals(
      "2s4c=4s3c 2cQc",
      Solver.process("texas-holdem 4h6s9c9sQd 2s4c 2cQc 4s3c"));
  }

  @Test
  public void test_texas_holdem_1632_3s5s7dAhKs_6c3c_2s7c_Jc8c_Jd2d_4d3d_4cKd_AdKh_KcAs_6h8h() {
    assertEquals(
      "6h8h Jd2d Jc8c 4d3d=6c3c 2s7c 4cKd AdKh=KcAs",
      Solver.process("texas-holdem 3s5s7dAhKs 6c3c 2s7c Jc8c Jd2d 4d3d 4cKd AdKh KcAs 6h8h"));
  }

  @Test
  public void test_texas_holdem_1633_3d4s5s7d9h_7sJs_Jh4c_3sQd_3h5d_4hKc_8h6d_Kh2d_7h6h() {
    assertEquals(
      "Kh2d 3sQd Jh4c 4hKc 7sJs 3h5d 7h6h 8h6d",
      Solver.process("texas-holdem 3d4s5s7d9h 7sJs Jh4c 3sQd 3h5d 4hKc 8h6d Kh2d 7h6h"));
  }

  @Test
  public void test_texas_holdem_1634_2s4c4s5s8c_3cTh_9sTs_9d7c_2c2h_TdAh_Ks3s_QhKh() {
    assertEquals(
      "9d7c 3cTh QhKh TdAh 9sTs Ks3s 2c2h",
      Solver.process("texas-holdem 2s4c4s5s8c 3cTh 9sTs 9d7c 2c2h TdAh Ks3s QhKh"));
  }

  @Test
  public void test_texas_holdem_1635_2c4h4s6s9h_Ts3d_AhQc_Qs2h_2sQd_Tc8h_Ac7c_8cAs_Kd6c_4d7s() {
    assertEquals(
      "Ts3d Tc8h Ac7c 8cAs AhQc 2sQd=Qs2h Kd6c 4d7s",
      Solver.process("texas-holdem 2c4h4s6s9h Ts3d AhQc Qs2h 2sQd Tc8h Ac7c 8cAs Kd6c 4d7s"));
  }

  @Test
  public void test_texas_holdem_1636_6cAhJdJsQs_3c8h_Qc5s_Kd2h_Ac6h_8s3h_Ad5h_4h4s_9s8d() {
    assertEquals(
      "3c8h=8s3h 9s8d Kd2h 4h4s Qc5s Ac6h=Ad5h",
      Solver.process("texas-holdem 6cAhJdJsQs 3c8h Qc5s Kd2h Ac6h 8s3h Ad5h 4h4s 9s8d"));
  }

  @Test
  public void test_texas_holdem_1637_7sJcJhJsTd_2c9s_6hTc_5s8c() {
    assertEquals(
      "5s8c 2c9s 6hTc",
      Solver.process("texas-holdem 7sJcJhJsTd 2c9s 6hTc 5s8c"));
  }

  @Test
  public void test_texas_holdem_1638_AsJcJdKhQh_4d7h_6hTh_9h8h_6cJh_Qd8d_Qc3s_Td6s() {
    assertEquals(
      "4d7h=9h8h Qc3s=Qd8d 6cJh 6hTh=Td6s",
      Solver.process("texas-holdem AsJcJdKhQh 4d7h 6hTh 9h8h 6cJh Qd8d Qc3s Td6s"));
  }

  @Test
  public void test_texas_holdem_1639_5c5h7c8sKh_Js3d_TdQd_5s8d_AcQh_4sKd_Qs7d() {
    assertEquals(
      "Js3d TdQd AcQh Qs7d 4sKd 5s8d",
      Solver.process("texas-holdem 5c5h7c8sKh Js3d TdQd 5s8d AcQh 4sKd Qs7d"));
  }

  @Test
  public void test_texas_holdem_1640_AdKcKhQsTs_6s5s_9s4d_2hJc_Js2c_7s5h_5d9c_Ah9d() {
    assertEquals(
      "5d9c=6s5s=7s5h=9s4d Ah9d 2hJc=Js2c",
      Solver.process("texas-holdem AdKcKhQsTs 6s5s 9s4d 2hJc Js2c 7s5h 5d9c Ah9d"));
  }

  @Test
  public void test_texas_holdem_1641_3c5c9cQsTh_9dTc_KhQd_Kd7s_Jh2h_2dJc_9h6s() {
    assertEquals(
      "2dJc=Jh2h Kd7s 9h6s KhQd 9dTc",
      Solver.process("texas-holdem 3c5c9cQsTh 9dTc KhQd Kd7s Jh2h 2dJc 9h6s"));
  }

  @Test
  public void test_texas_holdem_1642_3d6c6hJcKs_9hKc_9cQd_Ad4d_3h4s_2cAs_5d7h_2h7c() {
    assertEquals(
      "2h7c=5d7h 9cQd 2cAs=Ad4d 3h4s 9hKc",
      Solver.process("texas-holdem 3d6c6hJcKs 9hKc 9cQd Ad4d 3h4s 2cAs 5d7h 2h7c"));
  }

  @Test
  public void test_texas_holdem_1643_7d8dAhAsTh_QhJc_Tc2c() {
    assertEquals(
      "QhJc Tc2c",
      Solver.process("texas-holdem 7d8dAhAsTh QhJc Tc2c"));
  }

  @Test
  public void test_texas_holdem_1644_2c4c6d6hJs_9h5s_5d6s_Th2h_7h7s_2sKc_5hQc_9d8c_3s8h_9s3c() {
    assertEquals(
      "3s8h 9s3c 9h5s 9d8c 5hQc Th2h 2sKc 7h7s 5d6s",
      Solver.process("texas-holdem 2c4c6d6hJs 9h5s 5d6s Th2h 7h7s 2sKc 5hQc 9d8c 3s8h 9s3c"));
  }

  @Test
  public void test_texas_holdem_1645_2d4dJhQhTd_9hAs_QdJc_Qc9d_Kc7c() {
    assertEquals(
      "Kc7c 9hAs Qc9d QdJc",
      Solver.process("texas-holdem 2d4dJhQhTd 9hAs QdJc Qc9d Kc7c"));
  }

  @Test
  public void test_texas_holdem_1646_2h7hKhKsQs_6cJd_4dTs() {
    assertEquals(
      "4dTs 6cJd",
      Solver.process("texas-holdem 2h7hKhKsQs 6cJd 4dTs"));
  }

  @Test
  public void test_texas_holdem_1647_6hAsJhJsQs_2c8d_2s7h_9hTs() {
    assertEquals(
      "2s7h 2c8d 9hTs",
      Solver.process("texas-holdem 6hAsJhJsQs 2c8d 2s7h 9hTs"));
  }

  @Test
  public void test_texas_holdem_1648_4h8c8hJsTs_Jh2s_9hAd_3c2h() {
    assertEquals(
      "3c2h 9hAd Jh2s",
      Solver.process("texas-holdem 4h8c8hJsTs Jh2s 9hAd 3c2h"));
  }

  @Test
  public void test_texas_holdem_1649_5h6d8d8sTs_9h7h_4hKs_7d3s_As6c_Qs9c() {
    assertEquals(
      "7d3s Qs9c 4hKs As6c 9h7h",
      Solver.process("texas-holdem 5h6d8d8sTs 9h7h 4hKs 7d3s As6c Qs9c"));
  }

  @Test
  public void test_texas_holdem_1650_2d8hKsQsTh_3c5c_Td6s_QdTc_Kc3d_8s2h() {
    assertEquals(
      "3c5c Td6s Kc3d 8s2h QdTc",
      Solver.process("texas-holdem 2d8hKsQsTh 3c5c Td6s QdTc Kc3d 8s2h"));
  }

  @Test
  public void test_texas_holdem_1651_5c7c8sKcQc_9s6h_7hAh_Jd2s_8c3s_2h4h_9d6s_JcJs_Td2c() {
    assertEquals(
      "2h4h Jd2s 7hAh 9d6s=9s6h Td2c 8c3s JcJs",
      Solver.process("texas-holdem 5c7c8sKcQc 9s6h 7hAh Jd2s 8c3s 2h4h 9d6s JcJs Td2c"));
  }

  @Test
  public void test_texas_holdem_1652_4c4h9sAhKc_5d7s_5hAd_9dTs_3sJc_Kh7c_9c8c_ThAc_Qs5c() {
    assertEquals(
      "5d7s 3sJc Qs5c 9c8c=9dTs Kh7c 5hAd=ThAc",
      Solver.process("texas-holdem 4c4h9sAhKc 5d7s 5hAd 9dTs 3sJc Kh7c 9c8c ThAc Qs5c"));
  }

  @Test
  public void test_texas_holdem_1653_3h4c4s8sKc_Td3c_Ks4d() {
    assertEquals(
      "Td3c Ks4d",
      Solver.process("texas-holdem 3h4c4s8sKc Td3c Ks4d"));
  }

  @Test
  public void test_texas_holdem_1654_2h3c4h7hTd_QcQd_AcAs() {
    assertEquals(
      "QcQd AcAs",
      Solver.process("texas-holdem 2h3c4h7hTd QcQd AcAs"));
  }

  @Test
  public void test_texas_holdem_1655_2d3cJcTcTs_Ac2s_QcJh_QsAd_9hQh_8c6h() {
    assertEquals(
      "8c6h 9hQh QsAd Ac2s QcJh",
      Solver.process("texas-holdem 2d3cJcTcTs Ac2s QcJh QsAd 9hQh 8c6h"));
  }

  @Test
  public void test_texas_holdem_1656_2c2s7c7hQc_3hAd_Ah9c_JcKc() {
    assertEquals(
      "3hAd=Ah9c JcKc",
      Solver.process("texas-holdem 2c2s7c7hQc 3hAd Ah9c JcKc"));
  }

  @Test
  public void test_texas_holdem_1657_4d4h5h6h7d_KcJd_Qd9c_Ac6c_Ts2h_Ad5d_4sJs_As6d_5c6s_2c3d() {
    assertEquals(
      "Ts2h Qd9c KcJd Ad5d Ac6c=As6d 5c6s 4sJs 2c3d",
      Solver.process("texas-holdem 4d4h5h6h7d KcJd Qd9c Ac6c Ts2h Ad5d 4sJs As6d 5c6s 2c3d"));
  }

  @Test
  public void test_texas_holdem_1658_7h8cKhQdTs_Tc6c_9s5d_7s6d_QhAc_3d8d() {
    assertEquals(
      "9s5d 7s6d 3d8d Tc6c QhAc",
      Solver.process("texas-holdem 7h8cKhQdTs Tc6c 9s5d 7s6d QhAc 3d8d"));
  }

  @Test
  public void test_texas_holdem_1659_3d5cAcAdKs_4hQs_QdTc() {
    assertEquals(
      "4hQs QdTc",
      Solver.process("texas-holdem 3d5cAcAdKs 4hQs QdTc"));
  }

  @Test
  public void test_texas_holdem_1660_7h8d9h9sKs_QsQh_5s9d() {
    assertEquals(
      "QsQh 5s9d",
      Solver.process("texas-holdem 7h8d9h9sKs QsQh 5s9d"));
  }

  @Test
  public void test_texas_holdem_1661_9sJsQdQsTs_3d9c_Td2d_2h4s_3sAd_9h3h_AhAs_3c6s() {
    assertEquals(
      "3d9c=9h3h Td2d 3sAd 2h4s 3c6s AhAs",
      Solver.process("texas-holdem 9sJsQdQsTs 3d9c Td2d 2h4s 3sAd 9h3h AhAs 3c6s"));
  }

  @Test
  public void test_texas_holdem_1662_2d6d7dAdKc_6c7c_AcKd_8sTc_5c2s_Qd5d_9c4s_6hJs_6sTs() {
    assertEquals(
      "9c4s 8sTc 5c2s 6sTs 6hJs 6c7c Qd5d AcKd",
      Solver.process("texas-holdem 2d6d7dAdKc 6c7c AcKd 8sTc 5c2s Qd5d 9c4s 6hJs 6sTs"));
  }

  @Test
  public void test_texas_holdem_1663_2h3d6s7h9d_4h2d_Js9s_6dTh_7s3c_4cJc_QhTs() {
    assertEquals(
      "4cJc QhTs 4h2d 6dTh Js9s 7s3c",
      Solver.process("texas-holdem 2h3d6s7h9d 4h2d Js9s 6dTh 7s3c 4cJc QhTs"));
  }

  @Test
  public void test_texas_holdem_1664_6h9d9hJhKd_3s6d_6s7d_JsTh() {
    assertEquals(
      "3s6d=6s7d JsTh",
      Solver.process("texas-holdem 6h9d9hJhKd 3s6d 6s7d JsTh"));
  }

  @Test
  public void test_texas_holdem_1665_3c3h6cAsTh_6d9c_7c9s_8dAh() {
    assertEquals(
      "7c9s 6d9c 8dAh",
      Solver.process("texas-holdem 3c3h6cAsTh 6d9c 7c9s 8dAh"));
  }

  @Test
  public void test_texas_holdem_1666_3s6sAsJsKs_Qh9c_Tc7h() {
    assertEquals(
      "Qh9c=Tc7h",
      Solver.process("texas-holdem 3s6sAsJsKs Qh9c Tc7h"));
  }

  @Test
  public void test_texas_holdem_1667_5c6c7dAdJc_6d4d_8d3h_KsKh_2h7s_3s3c_Ts7h_AcTc_Qs5d() {
    assertEquals(
      "8d3h 3s3c Qs5d 6d4d 2h7s Ts7h KsKh AcTc",
      Solver.process("texas-holdem 5c6c7dAdJc 6d4d 8d3h KsKh 2h7s 3s3c Ts7h AcTc Qs5d"));
  }

  @Test
  public void test_texas_holdem_1668_2h8hKdKhQd_8cTs_4dJd_4s6h() {
    assertEquals(
      "4s6h 4dJd 8cTs",
      Solver.process("texas-holdem 2h8hKdKhQd 8cTs 4dJd 4s6h"));
  }

  @Test
  public void test_texas_holdem_1669_3h3sQdQhQs_4h7c_Js4c_7hAd_Kd8h() {
    assertEquals(
      "4h7c=7hAd=Js4c=Kd8h",
      Solver.process("texas-holdem 3h3sQdQhQs 4h7c Js4c 7hAd Kd8h"));
  }

  @Test
  public void test_texas_holdem_1670_2d2s6c7cQc_4h8d_AcAd() {
    assertEquals(
      "4h8d AcAd",
      Solver.process("texas-holdem 2d2s6c7cQc 4h8d AcAd"));
  }

  @Test
  public void test_texas_holdem_1671_2s4hAcJsTc_QhAh_8h2h_Qs6h_7c5d() {
    assertEquals(
      "7c5d Qs6h 8h2h QhAh",
      Solver.process("texas-holdem 2s4hAcJsTc QhAh 8h2h Qs6h 7c5d"));
  }

  @Test
  public void test_texas_holdem_1672_2c2s4d6c8d_Jh4h_Ac9h_7h2d() {
    assertEquals(
      "Ac9h Jh4h 7h2d",
      Solver.process("texas-holdem 2c2s4d6c8d Jh4h Ac9h 7h2d"));
  }

  @Test
  public void test_texas_holdem_1673_4c4sJhKcKd_Ts7d_7h5c() {
    assertEquals(
      "7h5c=Ts7d",
      Solver.process("texas-holdem 4c4sJhKcKd Ts7d 7h5c"));
  }

  @Test
  public void test_texas_holdem_1674_5s8dQdQsTc_4sJs_3cKc_Ac3d() {
    assertEquals(
      "4sJs 3cKc Ac3d",
      Solver.process("texas-holdem 5s8dQdQsTc 4sJs 3cKc Ac3d"));
  }

  @Test
  public void test_texas_holdem_1675_2c6h7h8hJs_AdTc_9s8d_9dKh_5c2s() {
    assertEquals(
      "9dKh AdTc 5c2s 9s8d",
      Solver.process("texas-holdem 2c6h7h8hJs AdTc 9s8d 9dKh 5c2s"));
  }

  @Test
  public void test_texas_holdem_1676_2s4d5c6cAc_9c8d_5s4h_6hQh() {
    assertEquals(
      "9c8d 6hQh 5s4h",
      Solver.process("texas-holdem 2s4d5c6cAc 9c8d 5s4h 6hQh"));
  }

  @Test
  public void test_texas_holdem_1677_6c7s8dKdTh_6h3c_2d9c_Ks3h_4c9h_3s4h() {
    assertEquals(
      "3s4h 6h3c Ks3h 2d9c=4c9h",
      Solver.process("texas-holdem 6c7s8dKdTh 6h3c 2d9c Ks3h 4c9h 3s4h"));
  }

  @Test
  public void test_texas_holdem_1678_3s8hAhKdTs_6sKc_QdTh() {
    assertEquals(
      "QdTh 6sKc",
      Solver.process("texas-holdem 3s8hAhKdTs 6sKc QdTh"));
  }

  @Test
  public void test_texas_holdem_1679_4h5d5s7dJs_9c8d_Jh3h_KcJc_TdTc_5hQd_As4c_Ah6d_6h7s() {
    assertEquals(
      "9c8d Ah6d As4c 6h7s TdTc Jh3h KcJc 5hQd",
      Solver.process("texas-holdem 4h5d5s7dJs 9c8d Jh3h KcJc TdTc 5hQd As4c Ah6d 6h7s"));
  }

  @Test
  public void test_texas_holdem_1680_2h7sAcJdKs_Tc5h_8c9s_Ah9c_3s7c() {
    assertEquals(
      "8c9s Tc5h 3s7c Ah9c",
      Solver.process("texas-holdem 2h7sAcJdKs Tc5h 8c9s Ah9c 3s7c"));
  }

  @Test
  public void test_texas_holdem_1681_3c8dAcAhJd_2c3h_QdAd_8c9s_8hQh_5dKs_Ts5c_4sKh() {
    assertEquals(
      "Ts5c 4sKh=5dKs 2c3h 8c9s 8hQh QdAd",
      Solver.process("texas-holdem 3c8dAcAhJd 2c3h QdAd 8c9s 8hQh 5dKs Ts5c 4sKh"));
  }

  @Test
  public void test_texas_holdem_1682_5c6hJsQdTh_2c8h_2s6d_4d3d_5h8d_6sJc_8c5d_4hKc() {
    assertEquals(
      "4d3d 2c8h 4hKc 5h8d=8c5d 2s6d 6sJc",
      Solver.process("texas-holdem 5c6hJsQdTh 2c8h 2s6d 4d3d 5h8d 6sJc 8c5d 4hKc"));
  }

  @Test
  public void test_texas_holdem_1683_2d2s3h6hJc_5hQd_Ts7s_Js5d_8cQs_4c5c_6s3d_Th9c_8h4d() {
    assertEquals(
      "8h4d Ts7s Th9c 5hQd 8cQs 6s3d Js5d 4c5c",
      Solver.process("texas-holdem 2d2s3h6hJc 5hQd Ts7s Js5d 8cQs 4c5c 6s3d Th9c 8h4d"));
  }

  @Test
  public void test_texas_holdem_1684_2s5d9dQcQh_Tc2c_7hJd_Th4h() {
    assertEquals(
      "Th4h 7hJd Tc2c",
      Solver.process("texas-holdem 2s5d9dQcQh Tc2c 7hJd Th4h"));
  }

  @Test
  public void test_texas_holdem_1685_4h6cJdKdQs_JcQh_Qd5d_2d3c() {
    assertEquals(
      "2d3c Qd5d JcQh",
      Solver.process("texas-holdem 4h6cJdKdQs JcQh Qd5d 2d3c"));
  }

  @Test
  public void test_texas_holdem_1686_4h8sAcJcTh_2s7d_2dJd_Kd5h_4s7c_5sQc_7h7s() {
    assertEquals(
      "2s7d 5sQc Kd5h 4s7c 7h7s 2dJd",
      Solver.process("texas-holdem 4h8sAcJcTh 2s7d 2dJd Kd5h 4s7c 5sQc 7h7s"));
  }

  @Test
  public void test_texas_holdem_1687_8c8h9sAcAs_7h3c_3d2s_6s4c_4dKc_Qh9d() {
    assertEquals(
      "3d2s=6s4c=7h3c 4dKc Qh9d",
      Solver.process("texas-holdem 8c8h9sAcAs 7h3c 3d2s 6s4c 4dKc Qh9d"));
  }

  @Test
  public void test_texas_holdem_1688_3s5s9d9sQd_Ac3h_KsKc_Jd8h_5c4d_AdJh_4h2d_2hKh_6c8s_7cAs() {
    assertEquals(
      "4h2d 6c8s Jd8h 2hKh 7cAs AdJh Ac3h 5c4d KsKc",
      Solver.process("texas-holdem 3s5s9d9sQd Ac3h KsKc Jd8h 5c4d AdJh 4h2d 2hKh 6c8s 7cAs"));
  }

  @Test
  public void test_texas_holdem_1689_2s4d5d7h7s_3sQd_8d2c_Jd6s_8cKh() {
    assertEquals(
      "Jd6s 3sQd 8cKh 8d2c",
      Solver.process("texas-holdem 2s4d5d7h7s 3sQd 8d2c Jd6s 8cKh"));
  }

  @Test
  public void test_texas_holdem_1690_5c6h7dKcQc_AhKd_Tc4d() {
    assertEquals(
      "Tc4d AhKd",
      Solver.process("texas-holdem 5c6h7dKcQc AhKd Tc4d"));
  }

  @Test
  public void test_texas_holdem_1691_3h5d7c8sKd_9c4h_Td4s_JhKh_4d2h_QcQs_8cTc() {
    assertEquals(
      "4d2h 9c4h Td4s 8cTc QcQs JhKh",
      Solver.process("texas-holdem 3h5d7c8sKd 9c4h Td4s JhKh 4d2h QcQs 8cTc"));
  }

  @Test
  public void test_texas_holdem_1692_2s7d8dKcQc_KdTs_Qh7h_Kh4c_JsAs_5h6s_9h4d() {
    assertEquals(
      "5h6s 9h4d JsAs Kh4c KdTs Qh7h",
      Solver.process("texas-holdem 2s7d8dKcQc KdTs Qh7h Kh4c JsAs 5h6s 9h4d"));
  }

  @Test
  public void test_texas_holdem_1693_3h6c9h9sJh_7s4s_Tc2c_Qs5s_KhQc_6h8h() {
    assertEquals(
      "7s4s Tc2c Qs5s KhQc 6h8h",
      Solver.process("texas-holdem 3h6c9h9sJh 7s4s Tc2c Qs5s KhQc 6h8h"));
  }

  @Test
  public void test_texas_holdem_1694_2d6s7dAcKs_4dAd_3sQd() {
    assertEquals(
      "3sQd 4dAd",
      Solver.process("texas-holdem 2d6s7dAcKs 4dAd 3sQd"));
  }

  @Test
  public void test_texas_holdem_1695_2d4c6cKcTs_8h9c_5h4s_JcJh_Ad9h_8cTh_5s7d_4d5d_JdKh_Js5c() {
    assertEquals(
      "5s7d 8h9c Js5c Ad9h 4d5d=5h4s 8cTh JcJh JdKh",
      Solver.process("texas-holdem 2d4c6cKcTs 8h9c 5h4s JcJh Ad9h 8cTh 5s7d 4d5d JdKh Js5c"));
  }

  @Test
  public void test_texas_holdem_1696_4c4s7s9cKs_TsAc_TcQc() {
    assertEquals(
      "TcQc TsAc",
      Solver.process("texas-holdem 4c4s7s9cKs TsAc TcQc"));
  }

  @Test
  public void test_texas_holdem_1697_2h3c8sJsKc_7s9c_2s3h_6sQs_8d9s_4cQd_Qc5s_4d4h_Jc6h_6cJh() {
    assertEquals(
      "7s9c 4cQd Qc5s 6sQs 4d4h 8d9s 6cJh=Jc6h 2s3h",
      Solver.process("texas-holdem 2h3c8sJsKc 7s9c 2s3h 6sQs 8d9s 4cQd Qc5s 4d4h Jc6h 6cJh"));
  }

  @Test
  public void test_texas_holdem_1698_7d7h9sAdTh_5c5d_Qd6s_9hJd_AhQs_4c2d_Td2s() {
    assertEquals(
      "4c2d Qd6s 5c5d 9hJd Td2s AhQs",
      Solver.process("texas-holdem 7d7h9sAdTh 5c5d Qd6s 9hJd AhQs 4c2d Td2s"));
  }

  @Test
  public void test_texas_holdem_1699_2c2h4h7h8h_7s8c_6h9d() {
    assertEquals(
      "7s8c 6h9d",
      Solver.process("texas-holdem 2c2h4h7h8h 7s8c 6h9d"));
  }

  @Test
  public void test_texas_holdem_1700_3d6c8sJcTd_TcJh_2d4d() {
    assertEquals(
      "2d4d TcJh",
      Solver.process("texas-holdem 3d6c8sJcTd TcJh 2d4d"));
  }

  @Test
  public void test_texas_holdem_1701_4s8s9dJhQs_Jd3h_6h7d_Jc2s_As7c_3c5h() {
    assertEquals(
      "3c5h 6h7d As7c Jc2s=Jd3h",
      Solver.process("texas-holdem 4s8s9dJhQs Jd3h 6h7d Jc2s As7c 3c5h"));
  }

  @Test
  public void test_texas_holdem_1702_3c3s6dAsQd_Qs5h_9s9c_Ac8d_8cTd_5d2s_8hTs_9dAh_2c8s() {
    assertEquals(
      "5d2s 2c8s 8cTd=8hTs 9s9c Qs5h 9dAh=Ac8d",
      Solver.process("texas-holdem 3c3s6dAsQd Qs5h 9s9c Ac8d 8cTd 5d2s 8hTs 9dAh 2c8s"));
  }

  @Test
  public void test_texas_holdem_1703_2c6d8c9hAs_4cAh_Ts2d_2s7s_4sQh_6hJs_7h7c_2h6c_9c4h_9d3c() {
    assertEquals(
      "4sQh 2s7s Ts2d 6hJs 7h7c 9c4h=9d3c 4cAh 2h6c",
      Solver.process("texas-holdem 2c6d8c9hAs 4cAh Ts2d 2s7s 4sQh 6hJs 7h7c 2h6c 9c4h 9d3c"));
  }

  @Test
  public void test_texas_holdem_1704_4d7d9dKhKs_3dTc_5s3s_Jd9c_3hQs() {
    assertEquals(
      "5s3s 3dTc 3hQs Jd9c",
      Solver.process("texas-holdem 4d7d9dKhKs 3dTc 5s3s Jd9c 3hQs"));
  }

  @Test
  public void test_texas_holdem_1705_3h6s7sJcKh_4h2d_Td7d_6h6c_9cJs_Qd2s_5s3s_6d4c_Ks2h_7cQs() {
    assertEquals(
      "4h2d Qd2s 5s3s 6d4c Td7d 7cQs 9cJs Ks2h 6h6c",
      Solver.process("texas-holdem 3h6s7sJcKh 4h2d Td7d 6h6c 9cJs Qd2s 5s3s 6d4c Ks2h 7cQs"));
  }

  @Test
  public void test_texas_holdem_1706_5c8d8hKsQs_JhTd_5d4h_Jc5s_5hKc_9d7d_6d2c_2dAd_Jd4d_JsKh() {
    assertEquals(
      "6d2c 9d7d Jd4d=JhTd 2dAd 5d4h=Jc5s 5hKc=JsKh",
      Solver.process("texas-holdem 5c8d8hKsQs JhTd 5d4h Jc5s 5hKc 9d7d 6d2c 2dAd Jd4d JsKh"));
  }

  @Test
  public void test_texas_holdem_1707_5dAcAhKdTd_Ad8s_4h2d_6cQc_7d9c_7s4c_4s9d() {
    assertEquals(
      "4h2d 7s4c 4s9d=7d9c 6cQc Ad8s",
      Solver.process("texas-holdem 5dAcAhKdTd Ad8s 4h2d 6cQc 7d9c 7s4c 4s9d"));
  }

  @Test
  public void test_texas_holdem_1708_7c7h8d8sKs_JcAc_5sTd_3h7s_5cQc() {
    assertEquals(
      "5cQc=5sTd JcAc 3h7s",
      Solver.process("texas-holdem 7c7h8d8sKs JcAc 5sTd 3h7s 5cQc"));
  }

  @Test
  public void test_texas_holdem_1709_3s7cAcAsTh_Ah5h_9cQd_4c8c_Qs8d_7dJc_2sTd_Tc8s_6d3d_6c5c() {
    assertEquals(
      "6c5c 4c8c Qs8d 9cQd 6d3d 7dJc 2sTd Tc8s Ah5h",
      Solver.process("texas-holdem 3s7cAcAsTh Ah5h 9cQd 4c8c Qs8d 7dJc 2sTd Tc8s 6d3d 6c5c"));
  }

  @Test
  public void test_texas_holdem_1710_9h9sAhKsQc_5s4h_KcJh_6cKh_Ad3d_Jc5h_8d8c_8s5d_Th8h() {
    assertEquals(
      "5s4h=8s5d=Jc5h=Th8h 8d8c 6cKh=KcJh Ad3d",
      Solver.process("texas-holdem 9h9sAhKsQc 5s4h KcJh 6cKh Ad3d Jc5h 8d8c 8s5d Th8h"));
  }

  @Test
  public void test_texas_holdem_1711_3h4h4sAdTc_JhQd_Ac3s_7d9c() {
    assertEquals(
      "7d9c JhQd Ac3s",
      Solver.process("texas-holdem 3h4h4sAdTc JhQd Ac3s 7d9c"));
  }

  @Test
  public void test_texas_holdem_1712_2c2hAdJsKd_8h9c_6dQc_4h2s_Jc4s_5d7d_9s7s_Ks3s_5c6c_TdAh() {
    assertEquals(
      "5c6c=5d7d=8h9c=9s7s 6dQc Jc4s Ks3s TdAh 4h2s",
      Solver.process("texas-holdem 2c2hAdJsKd 8h9c 6dQc 4h2s Jc4s 5d7d 9s7s Ks3s 5c6c TdAh"));
  }

  @Test
  public void test_texas_holdem_1713_3h7cAdAsQh_8dAc_2hQc_Td5s_4hKs_6sQd_JdKd_6dJs_7d9c_Th8c() {
    assertEquals(
      "Td5s Th8c 6dJs 4hKs JdKd 7d9c 2hQc=6sQd 8dAc",
      Solver.process("texas-holdem 3h7cAdAsQh 8dAc 2hQc Td5s 4hKs 6sQd JdKd 6dJs 7d9c Th8c"));
  }

  @Test
  public void test_texas_holdem_1714_2d2h3c7d8d_Tc6s_Qc4h_3sAc_6dTd() {
    assertEquals(
      "Tc6s Qc4h 3sAc 6dTd",
      Solver.process("texas-holdem 2d2h3c7d8d Tc6s Qc4h 3sAc 6dTd"));
  }

  @Test
  public void test_texas_holdem_1715_5s7h8dKcQd_Tc2h_6h2c() {
    assertEquals(
      "6h2c Tc2h",
      Solver.process("texas-holdem 5s7h8dKcQd Tc2h 6h2c"));
  }

  @Test
  public void test_texas_holdem_1716_3h4s5c9sTc_3sKs_6hKh_Qh4c_JdTh() {
    assertEquals(
      "6hKh 3sKs Qh4c JdTh",
      Solver.process("texas-holdem 3h4s5c9sTc 3sKs 6hKh Qh4c JdTh"));
  }

  @Test
  public void test_texas_holdem_1717_2h5c6d7c8s_7sAd_Qs3s_9sTh_9cKs_Js8c_Ah2c_3h6c_5dJd() {
    assertEquals(
      "Qs3s Ah2c 5dJd 3h6c 7sAd Js8c 9cKs 9sTh",
      Solver.process("texas-holdem 2h5c6d7c8s 7sAd Qs3s 9sTh 9cKs Js8c Ah2c 3h6c 5dJd"));
  }

  @Test
  public void test_texas_holdem_1718_2d6d7s8h8s_Ts5d_Jd2s_As8d() {
    assertEquals(
      "Ts5d Jd2s As8d",
      Solver.process("texas-holdem 2d6d7s8h8s Ts5d Jd2s As8d"));
  }

  @Test
  public void test_texas_holdem_1719_4c4s6sAcJh_3h6h_4hJs_3cQd_Jc7s_Jd5h_2h9d_Th2c() {
    assertEquals(
      "2h9d Th2c 3cQd 3h6h Jc7s=Jd5h 4hJs",
      Solver.process("texas-holdem 4c4s6sAcJh 3h6h 4hJs 3cQd Jc7s Jd5h 2h9d Th2c"));
  }

  @Test
  public void test_texas_holdem_1720_4d9cAcJhJs_Qs3d_7h8c_3c5h_8h9d_2h6c_9s4c_7dKh() {
    assertEquals(
      "3c5h 2h6c 7h8c Qs3d 7dKh 8h9d=9s4c",
      Solver.process("texas-holdem 4d9cAcJhJs Qs3d 7h8c 3c5h 8h9d 2h6c 9s4c 7dKh"));
  }

  @Test
  public void test_texas_holdem_1721_2c4c9hKcTs_4dQs_As5c_6cTh_3h2s_7d6h_8s8c_2d3s_JcJs() {
    assertEquals(
      "7d6h As5c 2d3s=3h2s 4dQs 8s8c 6cTh JcJs",
      Solver.process("texas-holdem 2c4c9hKcTs 4dQs As5c 6cTh 3h2s 7d6h 8s8c 2d3s JcJs"));
  }

  @Test
  public void test_texas_holdem_1722_2h4h9dJcKc_Jh3d_8c2s() {
    assertEquals(
      "8c2s Jh3d",
      Solver.process("texas-holdem 2h4h9dJcKc Jh3d 8c2s"));
  }

  @Test
  public void test_texas_holdem_1723_2h3s9cJcTs_4h8c_9hKd_5cKs_5d9d() {
    assertEquals(
      "4h8c 5cKs 5d9d 9hKd",
      Solver.process("texas-holdem 2h3s9cJcTs 4h8c 9hKd 5cKs 5d9d"));
  }

  @Test
  public void test_texas_holdem_1724_3d4d5s6hQd_7h3h_2hKs() {
    assertEquals(
      "2hKs 7h3h",
      Solver.process("texas-holdem 3d4d5s6hQd 7h3h 2hKs"));
  }

  @Test
  public void test_texas_holdem_1725_3h3sKhQsTd_Ks5s_Ah7h_7dQc_7c2c() {
    assertEquals(
      "7c2c Ah7h 7dQc Ks5s",
      Solver.process("texas-holdem 3h3sKhQsTd Ks5s Ah7h 7dQc 7c2c"));
  }

  @Test
  public void test_texas_holdem_1726_3s4cAhJhTd_6hTh_4hJd_7d7s_4dKd_6cKh_9dKs_2d4s_9s2s() {
    assertEquals(
      "9s2s 6cKh 9dKs 2d4s 4dKd 7d7s 6hTh 4hJd",
      Solver.process("texas-holdem 3s4cAhJhTd 6hTh 4hJd 7d7s 4dKd 6cKh 9dKs 2d4s 9s2s"));
  }

  @Test
  public void test_texas_holdem_1727_4s7hJsKcQc_9h9d_6d7d_TsAc_Qs2h_3cJh() {
    assertEquals(
      "6d7d 9h9d 3cJh Qs2h TsAc",
      Solver.process("texas-holdem 4s7hJsKcQc 9h9d 6d7d TsAc Qs2h 3cJh"));
  }

  @Test
  public void test_texas_holdem_1728_3h7d8d8sQs_Jc4d_Jh3c_2h3s_8hQh_4sAd_6d6s_Js5h_8cTs() {
    assertEquals(
      "Jc4d=Js5h 4sAd 2h3s=Jh3c 6d6s 8cTs 8hQh",
      Solver.process("texas-holdem 3h7d8d8sQs Jc4d Jh3c 2h3s 8hQh 4sAd 6d6s Js5h 8cTs"));
  }

  @Test
  public void test_texas_holdem_1729_5c6cAsJdTd_8h7s_Kh6h_Tc5d_TsKc_2s6d_2hKs_9c7d_7cQs() {
    assertEquals(
      "8h7s 9c7d 7cQs 2hKs 2s6d Kh6h TsKc Tc5d",
      Solver.process("texas-holdem 5c6cAsJdTd 8h7s Kh6h Tc5d TsKc 2s6d 2hKs 9c7d 7cQs"));
  }

  @Test
  public void test_texas_holdem_1730_2h4d4s7c9h_8sAh_7dAs_Qs2d_3s6h_6c3h_Jc3c_9cJh_9d9s_TcJs() {
    assertEquals(
      "3s6h=6c3h Jc3c TcJs 8sAh Qs2d 7dAs 9cJh 9d9s",
      Solver.process("texas-holdem 2h4d4s7c9h 8sAh 7dAs Qs2d 3s6h 6c3h Jc3c 9cJh 9d9s TcJs"));
  }

  @Test
  public void test_texas_holdem_1731_2c2dJdJsTc_5h6h_2sQd_9s8c_8d9c_3c5c_Ad5s_4d2h_AcAs_TsKc() {
    assertEquals(
      "3c5c=5h6h=8d9c=9s8c Ad5s TsKc AcAs 2sQd=4d2h",
      Solver.process("texas-holdem 2c2dJdJsTc 5h6h 2sQd 9s8c 8d9c 3c5c Ad5s 4d2h AcAs TsKc"));
  }

  @Test
  public void test_texas_holdem_1732_2d4c6c8d8h_JhJc_Jd4h_3h9d_AhTs_3s3d_Qc9s() {
    assertEquals(
      "3h9d Qc9s AhTs 3s3d Jd4h JhJc",
      Solver.process("texas-holdem 2d4c6c8d8h JhJc Jd4h 3h9d AhTs 3s3d Qc9s"));
  }

  @Test
  public void test_texas_holdem_1733_2h3hAcKdKh_3s6s_8hTc_Qh5h_QsKc_4d8d_9s5d_4h6c_9h5c() {
    assertEquals(
      "4h6c 4d8d 9h5c=9s5d 8hTc 3s6s QsKc Qh5h",
      Solver.process("texas-holdem 2h3hAcKdKh 3s6s 8hTc Qh5h QsKc 4d8d 9s5d 4h6c 9h5c"));
  }

  @Test
  public void test_texas_holdem_1734_2h4d5h6c7s_3c8c_8sQh() {
    assertEquals(
      "3c8c=8sQh",
      Solver.process("texas-holdem 2h4d5h6c7s 3c8c 8sQh"));
  }

  @Test
  public void test_texas_holdem_1735_2c9cAcQcQh_6s2d_7s5h_QsTs_Jd7d_Kh3d_3s9h_7hTc() {
    assertEquals(
      "7s5h Jd7d Kh3d 6s2d 3s9h QsTs 7hTc",
      Solver.process("texas-holdem 2c9cAcQcQh 6s2d 7s5h QsTs Jd7d Kh3d 3s9h 7hTc"));
  }

  @Test
  public void test_texas_holdem_1736_4c4d5h7c7d_6sQd_Jd8d_QhAd_Td6h_8s5c() {
    assertEquals(
      "Td6h Jd8d 6sQd QhAd 8s5c",
      Solver.process("texas-holdem 4c4d5h7c7d 6sQd Jd8d QhAd Td6h 8s5c"));
  }

  @Test
  public void test_texas_holdem_1737_3s5d6h8hTc_9s7h_5s9h_KhAs_Jc9c_Td3c() {
    assertEquals(
      "Jc9c KhAs 5s9h Td3c 9s7h",
      Solver.process("texas-holdem 3s5d6h8hTc 9s7h 5s9h KhAs Jc9c Td3c"));
  }

  @Test
  public void test_texas_holdem_1738_7d9hJcKsQs_6hTd_QcAh_QdKd_3d9c() {
    assertEquals(
      "3d9c QcAh QdKd 6hTd",
      Solver.process("texas-holdem 7d9hJcKsQs 6hTd QcAh QdKd 3d9c"));
  }

  @Test
  public void test_texas_holdem_1739_2s8s9hJdKd_3c7d_QhQs() {
    assertEquals(
      "3c7d QhQs",
      Solver.process("texas-holdem 2s8s9hJdKd 3c7d QhQs"));
  }

  @Test
  public void test_texas_holdem_1740_3h4s7dAhKh_JcTd_Jh7h_4d6c_Ks9h_Js5h_Qd6d_7sTs_8d6s_AcJd() {
    assertEquals(
      "8d6s Js5h JcTd Qd6d 4d6c 7sTs Ks9h AcJd Jh7h",
      Solver.process("texas-holdem 3h4s7dAhKh JcTd Jh7h 4d6c Ks9h Js5h Qd6d 7sTs 8d6s AcJd"));
  }

  @Test
  public void test_texas_holdem_1741_7d8dKcQsTh_3d6s_Qd4h_4cJc_7sKs() {
    assertEquals(
      "3d6s 4cJc Qd4h 7sKs",
      Solver.process("texas-holdem 7d8dKcQsTh 3d6s Qd4h 4cJc 7sKs"));
  }

  @Test
  public void test_texas_holdem_1742_3dJsQcQdTd_Ks9h_8s7s_AcTs_6hTc_JcJh_Jd3c_3h5h_2h9s() {
    assertEquals(
      "8s7s 2h9s 3h5h 6hTc AcTs Jd3c Ks9h JcJh",
      Solver.process("texas-holdem 3dJsQcQdTd Ks9h 8s7s AcTs 6hTc JcJh Jd3c 3h5h 2h9s"));
  }

  @Test
  public void test_texas_holdem_1743_4c4h7d8s9h_6cAs_JcQc_Qh7h() {
    assertEquals(
      "JcQc 6cAs Qh7h",
      Solver.process("texas-holdem 4c4h7d8s9h 6cAs JcQc Qh7h"));
  }

  @Test
  public void test_texas_holdem_1744_4d5c7c9hJd_QdAh_Jh6s_3dJc() {
    assertEquals(
      "QdAh 3dJc Jh6s",
      Solver.process("texas-holdem 4d5c7c9hJd QdAh Jh6s 3dJc"));
  }

  @Test
  public void test_texas_holdem_1745_3c4d5h9dKd_As4s_TdKh_6h9s() {
    assertEquals(
      "As4s 6h9s TdKh",
      Solver.process("texas-holdem 3c4d5h9dKd As4s TdKh 6h9s"));
  }

  @Test
  public void test_texas_holdem_1746_3c4d7cJhKc_TsQc_Ah9h_5hTd_2dTc_Jd4h_6sKd_Js4s_AsAd() {
    assertEquals(
      "2dTc 5hTd TsQc Ah9h 6sKd AsAd Jd4h=Js4s",
      Solver.process("texas-holdem 3c4d7cJhKc TsQc Ah9h 5hTd 2dTc Jd4h 6sKd Js4s AsAd"));
  }

  @Test
  public void test_texas_holdem_1747_7cJdJsQdTs_5hKc_8h5d_Td6s_Qh5c_3c2s_KsAc() {
    assertEquals(
      "3c2s 8h5d 5hKc Td6s Qh5c KsAc",
      Solver.process("texas-holdem 7cJdJsQdTs 5hKc 8h5d Td6s Qh5c 3c2s KsAc"));
  }

  @Test
  public void test_texas_holdem_1748_3h4h4sAcKs_8c3c_9d7c_Qs7h_Js6c_5s6h_3d8d() {
    assertEquals(
      "5s6h 9d7c Js6c Qs7h 3d8d=8c3c",
      Solver.process("texas-holdem 3h4h4sAcKs 8c3c 9d7c Qs7h Js6c 5s6h 3d8d"));
  }

  @Test
  public void test_texas_holdem_1749_4d5c9cJdTh_6c2d_5s8c_KsKc_5hQc_9sQh_Td3c_7cQd_2cJs() {
    assertEquals(
      "6c2d 7cQd 5s8c 5hQc 9sQh Td3c 2cJs KsKc",
      Solver.process("texas-holdem 4d5c9cJdTh 6c2d 5s8c KsKc 5hQc 9sQh Td3c 7cQd 2cJs"));
  }

}
