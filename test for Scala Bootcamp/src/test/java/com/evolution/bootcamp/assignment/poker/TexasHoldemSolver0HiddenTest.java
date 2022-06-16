
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver0HiddenTest {


  @Test
  public void test_texas_holdem_0_5c6dAcAsQs_Ks4c_KdJs_2hAh_Kh4h_Kc7h_6h7d_2cJc() {
    assertEquals(
      "2cJc Kh4h=Ks4c Kc7h KdJs 6h7d 2hAh",
      Solver.process("texas-holdem 5c6dAcAsQs Ks4c KdJs 2hAh Kh4h Kc7h 6h7d 2cJc"));
  }

  @Test
  public void test_texas_holdem_1_2h5c8sAsKc_Qs9h_KdQh_3cKh_Jc6s() {
    assertEquals(
      "Jc6s Qs9h 3cKh KdQh",
      Solver.process("texas-holdem 2h5c8sAsKc Qs9h KdQh 3cKh Jc6s"));
  }

  @Test
  public void test_texas_holdem_2_3d4s5dJsQd_5c4h_7sJd_KcAs_9h7h_2dTc_Qh8c_TsJc() {
    assertEquals(
      "9h7h 2dTc KcAs 7sJd TsJc Qh8c 5c4h",
      Solver.process("texas-holdem 3d4s5dJsQd 5c4h 7sJd KcAs 9h7h 2dTc Qh8c TsJc"));
  }

  @Test
  public void test_texas_holdem_3_3s7sAhQhTd_8h4s_9c4h_Kd9s_3hTs_9h6c_TcKh_6sKs_8cAs_2c6h() {
    assertEquals(
      "2c6h 8h4s 9c4h=9h6c 6sKs Kd9s TcKh 8cAs 3hTs",
      Solver.process("texas-holdem 3s7sAhQhTd 8h4s 9c4h Kd9s 3hTs 9h6c TcKh 6sKs 8cAs 2c6h"));
  }

  @Test
  public void test_texas_holdem_4_5d5h6hQdTd_7s3c_Ts3s_9c7d_8h3d_9h9s_AsKd_4dQs_TcJd() {
    assertEquals(
      "7s3c 8h3d 9c7d AsKd 9h9s TcJd=Ts3s 4dQs",
      Solver.process("texas-holdem 5d5h6hQdTd 7s3c Ts3s 9c7d 8h3d 9h9s AsKd 4dQs TcJd"));
  }

  @Test
  public void test_texas_holdem_5_2h4sAdAsJd_Qd3d_Ks8h_Ah3h() {
    assertEquals(
      "Qd3d Ks8h Ah3h",
      Solver.process("texas-holdem 2h4sAdAsJd Qd3d Ks8h Ah3h"));
  }

  @Test
  public void test_texas_holdem_6_4c5c6c9cJs_6hTh_8d2s_5h9s_KcTc_3d4d_3s8c_7hKs_9h5s() {
    assertEquals(
      "8d2s 7hKs 3d4d 6hTh 5h9s=9h5s 3s8c KcTc",
      Solver.process("texas-holdem 4c5c6c9cJs 6hTh 8d2s 5h9s KcTc 3d4d 3s8c 7hKs 9h5s"));
  }

  @Test
  public void test_texas_holdem_7_3c5dAdKsQh_6c3s_5c7d_8cKd_8h4h_As6d_4cKc() {
    assertEquals(
      "8h4h 6c3s 5c7d 4cKc 8cKd As6d",
      Solver.process("texas-holdem 3c5dAdKsQh 6c3s 5c7d 8cKd 8h4h As6d 4cKc"));
  }

  @Test
  public void test_texas_holdem_8_2c5h6h9cAs_Jc8c_Td7c_3s2s_TcKc_9sTs_8s4h_Th6d_7s8h_QsAh() {
    assertEquals(
      "8s4h Td7c Jc8c TcKc 3s2s Th6d 9sTs QsAh 7s8h",
      Solver.process("texas-holdem 2c5h6h9cAs Jc8c Td7c 3s2s TcKc 9sTs 8s4h Th6d 7s8h QsAh"));
  }

  @Test
  public void test_texas_holdem_9_2h5d6s9sKs_QcAc_6d8c_4h8h_6cJs() {
    assertEquals(
      "4h8h QcAc 6d8c 6cJs",
      Solver.process("texas-holdem 2h5d6s9sKs QcAc 6d8c 4h8h 6cJs"));
  }

  @Test
  public void test_texas_holdem_10_3c6h9h9sQh_TcKh_4h4s() {
    assertEquals(
      "TcKh 4h4s",
      Solver.process("texas-holdem 3c6h9h9sQh TcKh 4h4s"));
  }

  @Test
  public void test_texas_holdem_11_4s8hAhTcTh_4d5h_7h4h_3hKc_9h6d() {
    assertEquals(
      "9h6d 3hKc 4d5h 7h4h",
      Solver.process("texas-holdem 4s8hAhTcTh 4d5h 7h4h 3hKc 9h6d"));
  }

  @Test
  public void test_texas_holdem_12_4s7dJhKsTc_2hJd_Ad4c_3dTs_2sQd_Js4h_2d7s() {
    assertEquals(
      "2sQd Ad4c 2d7s 3dTs 2hJd Js4h",
      Solver.process("texas-holdem 4s7dJhKsTc 2hJd Ad4c 3dTs 2sQd Js4h 2d7s"));
  }

  @Test
  public void test_texas_holdem_13_5h7cJcKsTs_4s2c_KcJs_KhJd_8s5s_7h9c() {
    assertEquals(
      "4s2c 8s5s 7h9c KcJs=KhJd",
      Solver.process("texas-holdem 5h7cJcKsTs 4s2c KcJs KhJd 8s5s 7h9c"));
  }

  @Test
  public void test_texas_holdem_14_4s6h8sKsQc_QsTd_8c8h_2cAd_2s3s_4cQd_4hKd() {
    assertEquals(
      "2cAd QsTd 4cQd 4hKd 8c8h 2s3s",
      Solver.process("texas-holdem 4s6h8sKsQc QsTd 8c8h 2cAd 2s3s 4cQd 4hKd"));
  }

  @Test
  public void test_texas_holdem_15_5d5h6d7dAh_3sKc_KhTd_Kd7c_Ac8s_4d3c_AdQc_7sTs() {
    assertEquals(
      "3sKc KhTd 7sTs=Kd7c Ac8s AdQc 4d3c",
      Solver.process("texas-holdem 5d5h6d7dAh 3sKc KhTd Kd7c Ac8s 4d3c AdQc 7sTs"));
  }

  @Test
  public void test_texas_holdem_16_2s6d7c9hQd_Tc6c_9s4d_JhJc() {
    assertEquals(
      "Tc6c 9s4d JhJc",
      Solver.process("texas-holdem 2s6d7c9hQd Tc6c 9s4d JhJc"));
  }

  @Test
  public void test_texas_holdem_17_2s3h4d7sAd_6cKd_AsTs_TdJh_9hQd_Js6s_Kh4s() {
    assertEquals(
      "Js6s TdJh 9hQd 6cKd Kh4s AsTs",
      Solver.process("texas-holdem 2s3h4d7sAd 6cKd AsTs TdJh 9hQd Js6s Kh4s"));
  }

  @Test
  public void test_texas_holdem_18_3c5c7d7sKh_AcJs_Tc6d_Jc5d_Td9c_Ts8c_4c8d_KcTh_7cQh() {
    assertEquals(
      "4c8d Tc6d Ts8c Td9c AcJs Jc5d KcTh 7cQh",
      Solver.process("texas-holdem 3c5c7d7sKh AcJs Tc6d Jc5d Td9c Ts8c 4c8d KcTh 7cQh"));
  }

  @Test
  public void test_texas_holdem_19_4h5d8h9sQd_Jc3c_5c8d_Kd2s_6h3s_8sAc_6d6s_Kc9c_5h2h_Ah3d() {
    assertEquals(
      "6h3s Jc3c Kd2s Ah3d 5h2h 6d6s 8sAc Kc9c 5c8d",
      Solver.process("texas-holdem 4h5d8h9sQd Jc3c 5c8d Kd2s 6h3s 8sAc 6d6s Kc9c 5h2h Ah3d"));
  }

  @Test
  public void test_texas_holdem_20_2d5s7s8dJc_Ts7c_2c2s() {
    assertEquals(
      "Ts7c 2c2s",
      Solver.process("texas-holdem 2d5s7s8dJc Ts7c 2c2s"));
  }

  @Test
  public void test_texas_holdem_21_4h6d7h8d9h_Ac6s_Ah3d_TcJh_Td7s() {
    assertEquals(
      "Ah3d Ac6s Td7s TcJh",
      Solver.process("texas-holdem 4h6d7h8d9h Ac6s Ah3d TcJh Td7s"));
  }

  @Test
  public void test_texas_holdem_22_3d4c5c8hTc_Ad8d_7cQc_Kd8c_Jd6d_Kc4s_9d3h_9c7s_Th7h() {
    assertEquals(
      "9c7s Jd6d 9d3h Kc4s Kd8c Ad8d Th7h 7cQc",
      Solver.process("texas-holdem 3d4c5c8hTc Ad8d 7cQc Kd8c Jd6d Kc4s 9d3h 9c7s Th7h"));
  }

  @Test
  public void test_texas_holdem_23_7s8d8h9sJh_AcKc_Th2d_7d5c_5h4d_5dJd_Js9d_TcAs_7cKs_3dQc() {
    assertEquals(
      "5h4d 3dQc AcKc 7d5c 7cKs 5dJd Js9d TcAs=Th2d",
      Solver.process("texas-holdem 7s8d8h9sJh AcKc Th2d 7d5c 5h4d 5dJd Js9d TcAs 7cKs 3dQc"));
  }

  @Test
  public void test_texas_holdem_24_3c9hAsQcQs_8sAc_9s2d_9c5s_8d4s_2h4h_KdKh_2c7d_8c5d() {
    assertEquals(
      "2h4h 2c7d 8c5d=8d4s 9c5s=9s2d KdKh 8sAc",
      Solver.process("texas-holdem 3c9hAsQcQs 8sAc 9s2d 9c5s 8d4s 2h4h KdKh 2c7d 8c5d"));
  }

  @Test
  public void test_texas_holdem_25_3s5d6c6s8h_JcTc_Kh8s_7s5c_6hAd_6dAc_8d2s_3dAh_TdJs() {
    assertEquals(
      "JcTc=TdJs 3dAh 7s5c 8d2s Kh8s 6dAc=6hAd",
      Solver.process("texas-holdem 3s5d6c6s8h JcTc Kh8s 7s5c 6hAd 6dAc 8d2s 3dAh TdJs"));
  }

  @Test
  public void test_texas_holdem_26_2s7c7d9cTs_4d3s_9h8s_4sQh() {
    assertEquals(
      "4d3s 4sQh 9h8s",
      Solver.process("texas-holdem 2s7c7d9cTs 4d3s 9h8s 4sQh"));
  }

  @Test
  public void test_texas_holdem_27_6c8c9sKhTd_Js4s_TcKs_3cTh_Ts4h_8d2h() {
    assertEquals(
      "Js4s 8d2h 3cTh=Ts4h TcKs",
      Solver.process("texas-holdem 6c8c9sKhTd Js4s TcKs 3cTh Ts4h 8d2h"));
  }

  @Test
  public void test_texas_holdem_28_3h5dJcJsTc_3sQh_2s5c_6cAc_7cKs() {
    assertEquals(
      "7cKs 6cAc 3sQh 2s5c",
      Solver.process("texas-holdem 3h5dJcJsTc 3sQh 2s5c 6cAc 7cKs"));
  }

  @Test
  public void test_texas_holdem_29_5c7c7dKdQs_3dQh_Kh8s_3c6s_Ad9s_4sTs_Ac8d_Th3h_9h6d() {
    assertEquals(
      "3c6s 9h6d 4sTs=Th3h Ac8d=Ad9s 3dQh Kh8s",
      Solver.process("texas-holdem 5c7c7dKdQs 3dQh Kh8s 3c6s Ad9s 4sTs Ac8d Th3h 9h6d"));
  }

  @Test
  public void test_texas_holdem_30_2s3h4h7cAh_QhKh_6dJs_7h7d() {
    assertEquals(
      "6dJs 7h7d QhKh",
      Solver.process("texas-holdem 2s3h4h7cAh QhKh 6dJs 7h7d"));
  }

  @Test
  public void test_texas_holdem_31_2h8h8sAcKh_Kc2s_7s5s_5h8d_4hQh() {
    assertEquals(
      "7s5s Kc2s 5h8d 4hQh",
      Solver.process("texas-holdem 2h8h8sAcKh Kc2s 7s5s 5h8d 4hQh"));
  }

  @Test
  public void test_texas_holdem_32_3d9hJcTdTs_9d5h_AcAh_9c3s_Ad6c() {
    assertEquals(
      "Ad6c 9c3s=9d5h AcAh",
      Solver.process("texas-holdem 3d9hJcTdTs 9d5h AcAh 9c3s Ad6c"));
  }

  @Test
  public void test_texas_holdem_33_2s4d4h5sAh_9dAc_6dJd_7dJc_8sQd_AdTh_8h2h_3s5h_Qc8d() {
    assertEquals(
      "6dJd 7dJc 8sQd=Qc8d 8h2h 9dAc AdTh 3s5h",
      Solver.process("texas-holdem 2s4d4h5sAh 9dAc 6dJd 7dJc 8sQd AdTh 8h2h 3s5h Qc8d"));
  }

  @Test
  public void test_texas_holdem_34_2h3d6h7hAd_7c9s_3c4d_6d4h_ThJh_Qh2d_Kd2s_Qs4c_As6s_8dKc() {
    assertEquals(
      "Qs4c 8dKc Qh2d Kd2s 3c4d 6d4h 7c9s As6s ThJh",
      Solver.process("texas-holdem 2h3d6h7hAd 7c9s 3c4d 6d4h ThJh Qh2d Kd2s Qs4c As6s 8dKc"));
  }

  @Test
  public void test_texas_holdem_35_2s3c5s7hQs_AsKs_5dAh_2c3h() {
    assertEquals(
      "5dAh 2c3h AsKs",
      Solver.process("texas-holdem 2s3c5s7hQs AsKs 5dAh 2c3h"));
  }

  @Test
  public void test_texas_holdem_36_2h2s5h8hAd_3hJs_5c4d_Kh4c_6d3d() {
    assertEquals(
      "6d3d 3hJs Kh4c 5c4d",
      Solver.process("texas-holdem 2h2s5h8hAd 3hJs 5c4d Kh4c 6d3d"));
  }

  @Test
  public void test_texas_holdem_37_3s9cAdJhTc_9s6d_3h4d_6c7c_9dJc_4cQh_5s9h_5cTd() {
    assertEquals(
      "6c7c 4cQh 3h4d 5s9h=9s6d 5cTd 9dJc",
      Solver.process("texas-holdem 3s9cAdJhTc 9s6d 3h4d 6c7c 9dJc 4cQh 5s9h 5cTd"));
  }

  @Test
  public void test_texas_holdem_38_3c5s6h7hJd_Ks5h_AdTc() {
    assertEquals(
      "AdTc Ks5h",
      Solver.process("texas-holdem 3c5s6h7hJd Ks5h AdTc"));
  }

  @Test
  public void test_texas_holdem_39_2d5c9hQdQs_8c4s_JdJc_9s6c_Kh6h() {
    assertEquals(
      "8c4s Kh6h 9s6c JdJc",
      Solver.process("texas-holdem 2d5c9hQdQs 8c4s JdJc 9s6c Kh6h"));
  }

  @Test
  public void test_texas_holdem_40_3c8h8sAdJh_3hQd_6sTc_Qc9s_3s5s_4h2c() {
    assertEquals(
      "4h2c 6sTc Qc9s 3hQd=3s5s",
      Solver.process("texas-holdem 3c8h8sAdJh 3hQd 6sTc Qc9s 3s5s 4h2c"));
  }

  @Test
  public void test_texas_holdem_41_2h5d6h8cKs_Ad7h_2cJc_Jd2s_Ah4s_Qc6s() {
    assertEquals(
      "Ah4s Ad7h 2cJc=Jd2s Qc6s",
      Solver.process("texas-holdem 2h5d6h8cKs Ad7h 2cJc Jd2s Ah4s Qc6s"));
  }

  @Test
  public void test_texas_holdem_42_3d6d7h8dTs_AcJh_5dJs_5s4h_8s6c_Qh9s_JdJc_7s4d_9d3h_3c6s() {
    assertEquals(
      "5dJs AcJh 7s4d JdJc 3c6s 8s6c 5s4h 9d3h=Qh9s",
      Solver.process("texas-holdem 3d6d7h8dTs AcJh 5dJs 5s4h 8s6c Qh9s JdJc 7s4d 9d3h 3c6s"));
  }

  @Test
  public void test_texas_holdem_43_3c8c8sKsQc_AsQh_Jc7h_3sKc() {
    assertEquals(
      "Jc7h AsQh 3sKc",
      Solver.process("texas-holdem 3c8c8sKsQc AsQh Jc7h 3sKc"));
  }

  @Test
  public void test_texas_holdem_44_5d6d9cJdQh_TsAc_9s7s() {
    assertEquals(
      "TsAc 9s7s",
      Solver.process("texas-holdem 5d6d9cJdQh TsAc 9s7s"));
  }

  @Test
  public void test_texas_holdem_45_2c2h8h9dAd_6s4c_AhKs_3dTh() {
    assertEquals(
      "6s4c 3dTh AhKs",
      Solver.process("texas-holdem 2c2h8h9dAd 6s4c AhKs 3dTh"));
  }

  @Test
  public void test_texas_holdem_46_5h6s8dJdTc_6hQs_As4d_JhAc_KhKc_2dQd_Kd8c() {
    assertEquals(
      "2dQd As4d 6hQs Kd8c JhAc KhKc",
      Solver.process("texas-holdem 5h6s8dJdTc 6hQs As4d JhAc KhKc 2dQd Kd8c"));
  }

  @Test
  public void test_texas_holdem_47_4c5d6s7hJh_7dKh_3d5h_4s6d_3s6h_4d7c_2hKd() {
    assertEquals(
      "2hKd 7dKh 4s6d 4d7c 3d5h=3s6h",
      Solver.process("texas-holdem 4c5d6s7hJh 7dKh 3d5h 4s6d 3s6h 4d7c 2hKd"));
  }

  @Test
  public void test_texas_holdem_48_2d3h8c8s9s_6cAh_AcQc_5dKh_7d5s_7c3d_6hQs_7hTs_5h9d_Qd8d() {
    assertEquals(
      "7d5s 7hTs 6hQs 5dKh 6cAh AcQc 7c3d 5h9d Qd8d",
      Solver.process("texas-holdem 2d3h8c8s9s 6cAh AcQc 5dKh 7d5s 7c3d 6hQs 7hTs 5h9d Qd8d"));
  }

  @Test
  public void test_texas_holdem_49_6d6hKdKhKs_3cAh_5h5s_Js2h_7s4h() {
    assertEquals(
      "3cAh=5h5s=7s4h=Js2h",
      Solver.process("texas-holdem 6d6hKdKhKs 3cAh 5h5s Js2h 7s4h"));
  }

  @Test
  public void test_texas_holdem_50_3d3h4hAcJd_ThQh_9d9h_3cTc_8h2h_Js7d_8cKc_AhKs_Ts8s() {
    assertEquals(
      "8h2h Ts8s ThQh 8cKc 9d9h Js7d AhKs 3cTc",
      Solver.process("texas-holdem 3d3h4hAcJd ThQh 9d9h 3cTc 8h2h Js7d 8cKc AhKs Ts8s"));
  }

  @Test
  public void test_texas_holdem_51_3h4d6cAhJh_2cAc_8sQd_Js8d_Ad5h_Jd3s() {
    assertEquals(
      "8sQd Js8d 2cAc Ad5h Jd3s",
      Solver.process("texas-holdem 3h4d6cAhJh 2cAc 8sQd Js8d Ad5h Jd3s"));
  }

  @Test
  public void test_texas_holdem_52_3c5h9sJcTd_2dTh_9c2c_5c3d_Qh6c_7sJh_9d4c() {
    assertEquals(
      "Qh6c 9c2c=9d4c 2dTh 7sJh 5c3d",
      Solver.process("texas-holdem 3c5h9sJcTd 2dTh 9c2c 5c3d Qh6c 7sJh 9d4c"));
  }

  @Test
  public void test_texas_holdem_53_4c5h7dKsTs_9s5c_Kh2h_4dKc_AdTh_7h3h_3dJc_5sJs_QhQs_2c4s() {
    assertEquals(
      "3dJc 2c4s 9s5c 5sJs 7h3h AdTh QhQs Kh2h 4dKc",
      Solver.process("texas-holdem 4c5h7dKsTs 9s5c Kh2h 4dKc AdTh 7h3h 3dJc 5sJs QhQs 2c4s"));
  }

  @Test
  public void test_texas_holdem_54_3s8hAcAsQh_Ks7c_Jd6c_2s9c() {
    assertEquals(
      "2s9c Jd6c Ks7c",
      Solver.process("texas-holdem 3s8hAcAsQh Ks7c Jd6c 2s9c"));
  }

  @Test
  public void test_texas_holdem_55_6s9sJdKdQs_Kh6d_5s3s_8h4h_Jc9d_4c3d_7dJh() {
    assertEquals(
      "4c3d 8h4h 7dJh Jc9d Kh6d 5s3s",
      Solver.process("texas-holdem 6s9sJdKdQs Kh6d 5s3s 8h4h Jc9d 4c3d 7dJh"));
  }

  @Test
  public void test_texas_holdem_56_4h8cAdAsQh_KdAh_9d3d_5h9s_Kh7d_2s8s_QcKc_7h5c_9h2d() {
    assertEquals(
      "7h5c 5h9s=9d3d=9h2d Kh7d 2s8s QcKc KdAh",
      Solver.process("texas-holdem 4h8cAdAsQh KdAh 9d3d 5h9s Kh7d 2s8s QcKc 7h5c 9h2d"));
  }

  @Test
  public void test_texas_holdem_57_6s7s9cJsQh_7c2h_AdKd_6dQs_4sKc_Th9d() {
    assertEquals(
      "4sKc AdKd 7c2h Th9d 6dQs",
      Solver.process("texas-holdem 6s7s9cJsQh 7c2h AdKd 6dQs 4sKc Th9d"));
  }

  @Test
  public void test_texas_holdem_58_4s5c5s6sQs_Js9d_Kd2s_Tc6d_6cJc_8dKh_4h3d_3cKs() {
    assertEquals(
      "8dKh 4h3d 6cJc=Tc6d Kd2s Js9d 3cKs",
      Solver.process("texas-holdem 4s5c5s6sQs Js9d Kd2s Tc6d 6cJc 8dKh 4h3d 3cKs"));
  }

  @Test
  public void test_texas_holdem_59_3c4h7sJdQd_7d8c_7h9c_8s4s_TsAs_3h2s() {
    assertEquals(
      "TsAs 3h2s 8s4s 7d8c 7h9c",
      Solver.process("texas-holdem 3c4h7sJdQd 7d8c 7h9c 8s4s TsAs 3h2s"));
  }

  @Test
  public void test_texas_holdem_60_3d5h6c6sJd_8d4s_6dTd() {
    assertEquals(
      "8d4s 6dTd",
      Solver.process("texas-holdem 3d5h6c6sJd 8d4s 6dTd"));
  }

  @Test
  public void test_texas_holdem_61_2c4s6h7dKh_KcAd_8cJd_9h6c_5d4d_4h3s() {
    assertEquals(
      "8cJd 4h3s=5d4d 9h6c KcAd",
      Solver.process("texas-holdem 2c4s6h7dKh KcAd 8cJd 9h6c 5d4d 4h3s"));
  }

  @Test
  public void test_texas_holdem_62_4d5s8cAdKh_JcKs_8s2h_9dTd_8dTh_Ts9c_8h3d_Js5h_JdTc() {
    assertEquals(
      "9dTd=Ts9c JdTc Js5h 8h3d=8s2h 8dTh JcKs",
      Solver.process("texas-holdem 4d5s8cAdKh JcKs 8s2h 9dTd 8dTh Ts9c 8h3d Js5h JdTc"));
  }

  @Test
  public void test_texas_holdem_63_2c8d9cKhTd_KcJd_9d3c_8hKs_4c7d_2hQs_5c9h_7h5h_2s6d() {
    assertEquals(
      "4c7d=7h5h 2s6d 2hQs 5c9h=9d3c KcJd 8hKs",
      Solver.process("texas-holdem 2c8d9cKhTd KcJd 9d3c 8hKs 4c7d 2hQs 5c9h 7h5h 2s6d"));
  }

  @Test
  public void test_texas_holdem_64_3dAcJcJhQc_7s5s_7hKs_ThKd_2c8s_6dKc_7c8d() {
    assertEquals(
      "7s5s 2c8s=7c8d 6dKc=7hKs ThKd",
      Solver.process("texas-holdem 3dAcJcJhQc 7s5s 7hKs ThKd 2c8s 6dKc 7c8d"));
  }

  @Test
  public void test_texas_holdem_65_2h6d8sJcJs_4h2c_4d4c_Ac9c_Qc9h_Qs2s() {
    assertEquals(
      "Qc9h Ac9c 4h2c Qs2s 4d4c",
      Solver.process("texas-holdem 2h6d8sJcJs 4h2c 4d4c Ac9c Qc9h Qs2s"));
  }

  @Test
  public void test_texas_holdem_66_4d4s8dKdKs_8sJd_Kh8c_2s2d_7h2c_3c6s_Qc5h() {
    assertEquals(
      "2s2d=3c6s=7h2c Qc5h 8sJd Kh8c",
      Solver.process("texas-holdem 4d4s8dKdKs 8sJd Kh8c 2s2d 7h2c 3c6s Qc5h"));
  }

  @Test
  public void test_texas_holdem_67_2h2s4sQhTs_Td3s_6hTc_7c9d_6cAc_9hJs_QsJd() {
    assertEquals(
      "7c9d 9hJs 6cAc 6hTc=Td3s QsJd",
      Solver.process("texas-holdem 2h2s4sQhTs Td3s 6hTc 7c9d 6cAc 9hJs QsJd"));
  }

  @Test
  public void test_texas_holdem_68_3h3s5h6hTd_4d2h_2cJd_Qs3c_3d7s() {
    assertEquals(
      "2cJd 3d7s Qs3c 4d2h",
      Solver.process("texas-holdem 3h3s5h6hTd 4d2h 2cJd Qs3c 3d7s"));
  }

  @Test
  public void test_texas_holdem_69_6c7h9hAdQc_9s6d_Js4d() {
    assertEquals(
      "Js4d 9s6d",
      Solver.process("texas-holdem 6c7h9hAdQc 9s6d Js4d"));
  }

  @Test
  public void test_texas_holdem_70_6h8dAcAhJc_5hTd_3hQs_Th5s_9h7d_6c7s_Qh5c_Jd9c_Ad2c_3d6s() {
    assertEquals(
      "9h7d 5hTd=Th5s 3hQs=Qh5c 3d6s=6c7s Jd9c Ad2c",
      Solver.process("texas-holdem 6h8dAcAhJc 5hTd 3hQs Th5s 9h7d 6c7s Qh5c Jd9c Ad2c 3d6s"));
  }

  @Test
  public void test_texas_holdem_71_6c7sJdJhKs_Ad5c_AcTh_7d9c_Ah2c_2dQc() {
    assertEquals(
      "2dQc Ad5c=Ah2c AcTh 7d9c",
      Solver.process("texas-holdem 6c7sJdJhKs Ad5c AcTh 7d9c Ah2c 2dQc"));
  }

  @Test
  public void test_texas_holdem_72_4c7c8cKcQd_7d9s_Jc2h_9d8d_Ah8h_QcJd() {
    assertEquals(
      "7d9s 9d8d Ah8h Jc2h QcJd",
      Solver.process("texas-holdem 4c7c8cKcQd 7d9s Jc2h 9d8d Ah8h QcJd"));
  }

  @Test
  public void test_texas_holdem_73_6h9sAsQdQs_4cKc_2s3h_6s2c_7s3s_Kd8s_6c5h() {
    assertEquals(
      "2s3h 4cKc=Kd8s 6c5h=6s2c 7s3s",
      Solver.process("texas-holdem 6h9sAsQdQs 4cKc 2s3h 6s2c 7s3s Kd8s 6c5h"));
  }

  @Test
  public void test_texas_holdem_74_3h4c8h9cAs_Jd6c_Tc7s_Qc2s_QhJs_9d2c_3sAd_7c6h() {
    assertEquals(
      "7c6h Tc7s Jd6c Qc2s QhJs 9d2c 3sAd",
      Solver.process("texas-holdem 3h4c8h9cAs Jd6c Tc7s Qc2s QhJs 9d2c 3sAd 7c6h"));
  }

  @Test
  public void test_texas_holdem_75_2h4c8h9sAc_KsTc_3s4s_AhQd_3dTs() {
    assertEquals(
      "3dTs KsTc 3s4s AhQd",
      Solver.process("texas-holdem 2h4c8h9sAc KsTc 3s4s AhQd 3dTs"));
  }

  @Test
  public void test_texas_holdem_76_2s4s5d6dTc_JdQc_8s6s_Ts2d_4cKd() {
    assertEquals(
      "JdQc 4cKd 8s6s Ts2d",
      Solver.process("texas-holdem 2s4s5d6dTc JdQc 8s6s Ts2d 4cKd"));
  }

  @Test
  public void test_texas_holdem_77_5h7c7d7sQd_Js5s_Qc9h_6hTc_2c3c_2dJh_Kh2h_9sAh() {
    assertEquals(
      "2c3c 6hTc 2dJh Kh2h 9sAh Js5s Qc9h",
      Solver.process("texas-holdem 5h7c7d7sQd Js5s Qc9h 6hTc 2c3c 2dJh Kh2h 9sAh"));
  }

  @Test
  public void test_texas_holdem_78_3s5s6s7d8s_7cJs_QdQs_Ts2c() {
    assertEquals(
      "Ts2c 7cJs QdQs",
      Solver.process("texas-holdem 3s5s6s7d8s 7cJs QdQs Ts2c"));
  }

  @Test
  public void test_texas_holdem_79_9h9sAdAsTd_7c7h_Qd5s_KsKc_ThAh_5h3c_3s3d_QhTc_Qc8s_6c4d() {
    assertEquals(
      "3s3d=5h3c=6c4d=7c7h Qc8s=Qd5s QhTc KsKc ThAh",
      Solver.process("texas-holdem 9h9sAdAsTd 7c7h Qd5s KsKc ThAh 5h3c 3s3d QhTc Qc8s 6c4d"));
  }

  @Test
  public void test_texas_holdem_80_4h5s8d8s9h_8c3h_9cAd() {
    assertEquals(
      "9cAd 8c3h",
      Solver.process("texas-holdem 4h5s8d8s9h 8c3h 9cAd"));
  }

  @Test
  public void test_texas_holdem_81_4s6s9sJdKh_Ac8d_Qs2c_9hAd_Js9c_5dAh_3c7h_5sTc_4d2d() {
    assertEquals(
      "3c7h 5sTc Qs2c 5dAh Ac8d 4d2d 9hAd Js9c",
      Solver.process("texas-holdem 4s6s9sJdKh Ac8d Qs2c 9hAd Js9c 5dAh 3c7h 5sTc 4d2d"));
  }

  @Test
  public void test_texas_holdem_82_4sAhKcTcTd_2c5c_8c5s_JcKs_2d3c_9d3s_8d6c_7sJh_2sAd_7d4c() {
    assertEquals(
      "2d3c 2c5c 8c5s=8d6c 9d3s 7sJh 7d4c JcKs 2sAd",
      Solver.process("texas-holdem 4sAhKcTcTd 2c5c 8c5s JcKs 2d3c 9d3s 8d6c 7sJh 2sAd 7d4c"));
  }

  @Test
  public void test_texas_holdem_83_5d7c9cQhTh_2sAc_Td7s_3dAs_7h4c_8sJc() {
    assertEquals(
      "2sAc=3dAs 7h4c Td7s 8sJc",
      Solver.process("texas-holdem 5d7c9cQhTh 2sAc Td7s 3dAs 7h4c 8sJc"));
  }

  @Test
  public void test_texas_holdem_84_4c7d8hQcQd_4d6h_Qs3c_4h8d_Ah3h_6c2c_Ts2s() {
    assertEquals(
      "6c2c Ts2s Ah3h 4d6h 4h8d Qs3c",
      Solver.process("texas-holdem 4c7d8hQcQd 4d6h Qs3c 4h8d Ah3h 6c2c Ts2s"));
  }

  @Test
  public void test_texas_holdem_85_7d7h9cJdJs_Ad6h_2hTd_2d2c_3h8d_Ks8c_Jc4h() {
    assertEquals(
      "2d2c=3h8d 2hTd Ks8c Ad6h Jc4h",
      Solver.process("texas-holdem 7d7h9cJdJs Ad6h 2hTd 2d2c 3h8d Ks8c Jc4h"));
  }

  @Test
  public void test_texas_holdem_86_4d5h6h7h9s_2h7c_5sJs() {
    assertEquals(
      "5sJs 2h7c",
      Solver.process("texas-holdem 4d5h6h7h9s 2h7c 5sJs"));
  }

  @Test
  public void test_texas_holdem_87_3d4s8hAhTc_4c6c_6h2h_5s2d_Qd2s_QhTh_3sQc_7dKh_Kc4h_AsJc() {
    assertEquals(
      "6h2h Qd2s 7dKh 3sQc 4c6c Kc4h QhTh AsJc 5s2d",
      Solver.process("texas-holdem 3d4s8hAhTc 4c6c 6h2h 5s2d Qd2s QhTh 3sQc 7dKh Kc4h AsJc"));
  }

  @Test
  public void test_texas_holdem_88_3h7d9cKhTs_5d5h_Td2s_3s3d_9s7s_Ah4s_9d2c_Th6s() {
    assertEquals(
      "Ah4s 5d5h 9d2c Td2s=Th6s 9s7s 3s3d",
      Solver.process("texas-holdem 3h7d9cKhTs 5d5h Td2s 3s3d 9s7s Ah4s 9d2c Th6s"));
  }

  @Test
  public void test_texas_holdem_89_6d7d8h9cJs_7cQs_Ks2d() {
    assertEquals(
      "Ks2d 7cQs",
      Solver.process("texas-holdem 6d7d8h9cJs 7cQs Ks2d"));
  }

  @Test
  public void test_texas_holdem_90_2c3h6cAdKs_Ac9s_2d8c_TsJd_7s7c() {
    assertEquals(
      "TsJd 2d8c 7s7c Ac9s",
      Solver.process("texas-holdem 2c3h6cAdKs Ac9s 2d8c TsJd 7s7c"));
  }

  @Test
  public void test_texas_holdem_91_3c7cAdKcQc_Jc6h_7hAs_5h2c_4s8s_QhTd_Qs6d_4dQd_3d6c() {
    assertEquals(
      "4s8s 4dQd=Qs6d QhTd 7hAs 5h2c 3d6c Jc6h",
      Solver.process("texas-holdem 3c7cAdKcQc Jc6h 7hAs 5h2c 4s8s QhTd Qs6d 4dQd 3d6c"));
  }

  @Test
  public void test_texas_holdem_92_7s8s9cJcTs_Ad7d_8c2c_4cJs_5cTc_9s9d_3cAs_2sKs() {
    assertEquals(
      "3cAs=4cJs=5cTc=8c2c=9s9d=Ad7d 2sKs",
      Solver.process("texas-holdem 7s8s9cJcTs Ad7d 8c2c 4cJs 5cTc 9s9d 3cAs 2sKs"));
  }

  @Test
  public void test_texas_holdem_93_5d9sKhQdTh_2cTc_3c5s_8hTs_7d2d_2sAd_4s4h_6hKs_9c5c() {
    assertEquals(
      "7d2d 2sAd 4s4h 3c5s 2cTc=8hTs 6hKs 9c5c",
      Solver.process("texas-holdem 5d9sKhQdTh 2cTc 3c5s 8hTs 7d2d 2sAd 4s4h 6hKs 9c5c"));
  }

  @Test
  public void test_texas_holdem_94_2c2h3c8sJc_7c6d_6c5h_8h9s_Kc5s_8d2s_Jh4c_7s7h_KdKh() {
    assertEquals(
      "6c5h 7c6d Kc5s 7s7h 8h9s Jh4c KdKh 8d2s",
      Solver.process("texas-holdem 2c2h3c8sJc 7c6d 6c5h 8h9s Kc5s 8d2s Jh4c 7s7h KdKh"));
  }

  @Test
  public void test_texas_holdem_95_4c5h7s8dAc_AhJd_8s6h_6c4d() {
    assertEquals(
      "AhJd 6c4d=8s6h",
      Solver.process("texas-holdem 4c5h7s8dAc AhJd 8s6h 6c4d"));
  }

  @Test
  public void test_texas_holdem_96_7h8s9dQdQs_3dAc_QcTh_5c4h_AsTd_8dTs() {
    assertEquals(
      "5c4h 3dAc AsTd 8dTs QcTh",
      Solver.process("texas-holdem 7h8s9dQdQs 3dAc QcTh 5c4h AsTd 8dTs"));
  }

  @Test
  public void test_texas_holdem_97_2d7c7d9sKc_Jd4c_AsAd_8c6d_Qs3h_2h3d_8hAc_Td5c() {
    assertEquals(
      "8c6d Td5c Jd4c Qs3h 8hAc 2h3d AsAd",
      Solver.process("texas-holdem 2d7c7d9sKc Jd4c AsAd 8c6d Qs3h 2h3d 8hAc Td5c"));
  }

  @Test
  public void test_texas_holdem_98_2c4s8cKcKh_Qd4c_3h9h_As9d_3s6d_KdAc_TsTc_2hTd_2d8h() {
    assertEquals(
      "3s6d 3h9h As9d 2hTd Qd4c 2d8h TsTc KdAc",
      Solver.process("texas-holdem 2c4s8cKcKh Qd4c 3h9h As9d 3s6d KdAc TsTc 2hTd 2d8h"));
  }

  @Test
  public void test_texas_holdem_99_4c4s5d8hTh_KcAs_3d7h_8d5s_JsTc_QdJh_4h2d_Ts2c_9c8s() {
    assertEquals(
      "3d7h QdJh KcAs 9c8s 8d5s Ts2c JsTc 4h2d",
      Solver.process("texas-holdem 4c4s5d8hTh KcAs 3d7h 8d5s JsTc QdJh 4h2d Ts2c 9c8s"));
  }

  @Test
  public void test_texas_holdem_100_4d6s7sKsTh_AcQd_QsTd_6c4c_As9h_8s3s_Kc4s_9c5c_JdJc() {
    assertEquals(
      "9c5c As9h AcQd QsTd JdJc 6c4c Kc4s 8s3s",
      Solver.process("texas-holdem 4d6s7sKsTh AcQd QsTd 6c4c As9h 8s3s Kc4s 9c5c JdJc"));
  }

  @Test
  public void test_texas_holdem_101_3h4c7s8dQc_2c6c_2sTc_Jd3d_QdTs_9dKc() {
    assertEquals(
      "2c6c 2sTc 9dKc Jd3d QdTs",
      Solver.process("texas-holdem 3h4c7s8dQc 2c6c 2sTc Jd3d QdTs 9dKc"));
  }

  @Test
  public void test_texas_holdem_102_5h6h9dJcTs_7c2c_Ah7s() {
    assertEquals(
      "7c2c Ah7s",
      Solver.process("texas-holdem 5h6h9dJcTs 7c2c Ah7s"));
  }

  @Test
  public void test_texas_holdem_103_2s7hJhJsKd_Ah3c_9s7d_JdKs_4d6h_8h2d_9c8s_QhQd_5c6d_ThAs() {
    assertEquals(
      "4d6h=5c6d 9c8s Ah3c ThAs 8h2d 9s7d QhQd JdKs",
      Solver.process("texas-holdem 2s7hJhJsKd Ah3c 9s7d JdKs 4d6h 8h2d 9c8s QhQd 5c6d ThAs"));
  }

  @Test
  public void test_texas_holdem_104_3c6s8sAcJs_5h6c_JcQd_Ah4s_3s9d_Ad6d_2d6h_5d2c() {
    assertEquals(
      "5d2c 3s9d 2d6h=5h6c JcQd Ah4s Ad6d",
      Solver.process("texas-holdem 3c6s8sAcJs 5h6c JcQd Ah4s 3s9d Ad6d 2d6h 5d2c"));
  }

  @Test
  public void test_texas_holdem_105_3s4c4h5cTc_JsQh_9s8d_4dTh_8hQs_3hTd() {
    assertEquals(
      "9s8d 8hQs JsQh 3hTd 4dTh",
      Solver.process("texas-holdem 3s4c4h5cTc JsQh 9s8d 4dTh 8hQs 3hTd"));
  }

  @Test
  public void test_texas_holdem_106_2h4s5s6hQc_8s3s_3c2d_QsKs_Jh3h() {
    assertEquals(
      "QsKs 3c2d=8s3s=Jh3h",
      Solver.process("texas-holdem 2h4s5s6hQc 8s3s 3c2d QsKs Jh3h"));
  }

  @Test
  public void test_texas_holdem_107_2c8h8s9hKs_2h3h_3cKc() {
    assertEquals(
      "2h3h 3cKc",
      Solver.process("texas-holdem 2c8h8s9hKs 2h3h 3cKc"));
  }

  @Test
  public void test_texas_holdem_108_6c8dAcKsQh_7d4h_9hTd_Jc6d_Js2c_3cKd_7hQd_KcQc() {
    assertEquals(
      "7d4h 9hTd Js2c Jc6d 7hQd 3cKd KcQc",
      Solver.process("texas-holdem 6c8dAcKsQh 7d4h 9hTd Jc6d Js2c 3cKd 7hQd KcQc"));
  }

  @Test
  public void test_texas_holdem_109_3c9hJhTcTh_2s6d_5h7h_JcAd() {
    assertEquals(
      "2s6d JcAd 5h7h",
      Solver.process("texas-holdem 3c9hJhTcTh 2s6d 5h7h JcAd"));
  }

  @Test
  public void test_texas_holdem_110_4dAdJdJsTs_7s6h_6c9s() {
    assertEquals(
      "7s6h 6c9s",
      Solver.process("texas-holdem 4dAdJdJsTs 7s6h 6c9s"));
  }

  @Test
  public void test_texas_holdem_111_2c8c9sKdTh_Qc7h_TsKh_Qd5s_3s3h_Ks5h_QsAs() {
    assertEquals(
      "Qc7h=Qd5s QsAs 3s3h Ks5h TsKh",
      Solver.process("texas-holdem 2c8c9sKdTh Qc7h TsKh Qd5s 3s3h Ks5h QsAs"));
  }

  @Test
  public void test_texas_holdem_112_2h5h6c7d8h_3h4c_8s3s_Ac9s_Td2s_JcQh_Kc3c() {
    assertEquals(
      "JcQh Kc3c Td2s 8s3s 3h4c Ac9s",
      Solver.process("texas-holdem 2h5h6c7d8h 3h4c 8s3s Ac9s Td2s JcQh Kc3c"));
  }

  @Test
  public void test_texas_holdem_113_6h9cAhAsTh_3d8s_2c8c_2s7h_6d5s_4h5d() {
    assertEquals(
      "4h5d 2s7h 2c8c=3d8s 6d5s",
      Solver.process("texas-holdem 6h9cAhAsTh 3d8s 2c8c 2s7h 6d5s 4h5d"));
  }

  @Test
  public void test_texas_holdem_114_2s4s5d9hAh_KdQc_6cJd_2dTs_Ac3s_9s6d() {
    assertEquals(
      "6cJd KdQc 2dTs 9s6d Ac3s",
      Solver.process("texas-holdem 2s4s5d9hAh KdQc 6cJd 2dTs Ac3s 9s6d"));
  }

  @Test
  public void test_texas_holdem_115_3s5h7s8hTh_2hAs_Ah3d_2d8c_2cAc_4hQs_QcJs_5sQh() {
    assertEquals(
      "4hQs QcJs 2cAc=2hAs Ah3d 5sQh 2d8c",
      Solver.process("texas-holdem 3s5h7s8hTh 2hAs Ah3d 2d8c 2cAc 4hQs QcJs 5sQh"));
  }

  @Test
  public void test_texas_holdem_116_2c7s8hAsKc_3hKh_5c4h_KdQs() {
    assertEquals(
      "5c4h 3hKh KdQs",
      Solver.process("texas-holdem 2c7s8hAsKc 3hKh 5c4h KdQs"));
  }

  @Test
  public void test_texas_holdem_117_3h5c7c7hJc_6c4h_9sQh_2h4s() {
    assertEquals(
      "2h4s 9sQh 6c4h",
      Solver.process("texas-holdem 3h5c7c7hJc 6c4h 9sQh 2h4s"));
  }

  @Test
  public void test_texas_holdem_118_5c6c6h7hQc_5sTd_4d9s_4c3d_3cTh_8hKs() {
    assertEquals(
      "4d9s 3cTh 8hKs 5sTd 4c3d",
      Solver.process("texas-holdem 5c6c6h7hQc 5sTd 4d9s 4c3d 3cTh 8hKs"));
  }

  @Test
  public void test_texas_holdem_119_3s7h8sAdKs_4sQh_6c3c_9dQc_Jd2d_QdTs_Qs5d() {
    assertEquals(
      "Jd2d 4sQh=Qs5d 9dQc QdTs 6c3c",
      Solver.process("texas-holdem 3s7h8sAdKs 4sQh 6c3c 9dQc Jd2d QdTs Qs5d"));
  }

  @Test
  public void test_texas_holdem_120_3d5h8d9cKh_4cJc_3h3s_2sJd_6hJh_8sAc() {
    assertEquals(
      "2sJd=4cJc 6hJh 8sAc 3h3s",
      Solver.process("texas-holdem 3d5h8d9cKh 4cJc 3h3s 2sJd 6hJh 8sAc"));
  }

  @Test
  public void test_texas_holdem_121_5c6d9cAhTc_Th4d_AsQs_4s8h_5d3c_6sAd_Qh4h() {
    assertEquals(
      "4s8h Qh4h 5d3c Th4d AsQs 6sAd",
      Solver.process("texas-holdem 5c6d9cAhTc Th4d AsQs 4s8h 5d3c 6sAd Qh4h"));
  }

  @Test
  public void test_texas_holdem_122_3c6sJcTdTh_6c6d_5cQs_4hTc_3h8d_3dJh_9s7s() {
    assertEquals(
      "9s7s 5cQs 3h8d 3dJh 4hTc 6c6d",
      Solver.process("texas-holdem 3c6sJcTdTh 6c6d 5cQs 4hTc 3h8d 3dJh 9s7s"));
  }

  @Test
  public void test_texas_holdem_123_2h3h8s9cAh_TcQh_7h6h_4c3s_QdJd_2c8d_4dKd_5d5c_4s2s() {
    assertEquals(
      "TcQh QdJd 4dKd 4s2s 4c3s 5d5c 2c8d 7h6h",
      Solver.process("texas-holdem 2h3h8s9cAh TcQh 7h6h 4c3s QdJd 2c8d 4dKd 5d5c 4s2s"));
  }

  @Test
  public void test_texas_holdem_124_2h4sAhJhKc_As4d_9sAd_Th6c_7c8s_7h7d_Qh3h_5h3c_AcTs() {
    assertEquals(
      "7c8s Th6c 7h7d 9sAd AcTs As4d 5h3c Qh3h",
      Solver.process("texas-holdem 2h4sAhJhKc As4d 9sAd Th6c 7c8s 7h7d Qh3h 5h3c AcTs"));
  }

  @Test
  public void test_texas_holdem_125_4s5sAcKcKh_6h7c_2c2d() {
    assertEquals(
      "6h7c 2c2d",
      Solver.process("texas-holdem 4s5sAcKcKh 6h7c 2c2d"));
  }

  @Test
  public void test_texas_holdem_126_2s3d3s9dAh_8c2c_9c6h_Kc8s_QdQh_JsJh() {
    assertEquals(
      "Kc8s 8c2c 9c6h JsJh QdQh",
      Solver.process("texas-holdem 2s3d3s9dAh 8c2c 9c6h Kc8s QdQh JsJh"));
  }

  @Test
  public void test_texas_holdem_127_2c7s8dAcKs_4c3d_Ad8c_3sAs_5c9d_Kd6h_8s9h_6s6d() {
    assertEquals(
      "4c3d 5c9d 6s6d 8s9h Kd6h 3sAs Ad8c",
      Solver.process("texas-holdem 2c7s8dAcKs 4c3d Ad8c 3sAs 5c9d Kd6h 8s9h 6s6d"));
  }

  @Test
  public void test_texas_holdem_128_2d2hAsJsKc_KsAh_8c4s_Qh8s_Ts8h_Qd3d_Qs3s() {
    assertEquals(
      "8c4s=Ts8h Qd3d=Qh8s=Qs3s KsAh",
      Solver.process("texas-holdem 2d2hAsJsKc KsAh 8c4s Qh8s Ts8h Qd3d Qs3s"));
  }

  @Test
  public void test_texas_holdem_129_2s4d4sJcQc_8s7h_6hKs() {
    assertEquals(
      "8s7h 6hKs",
      Solver.process("texas-holdem 2s4d4sJcQc 8s7h 6hKs"));
  }

  @Test
  public void test_texas_holdem_130_6c8hJsTdTs_8cQh_2h5h_6dKc_9c7c_Tc9s_6sJh_3d9d_Qs2s_Ac8d() {
    assertEquals(
      "2h5h 3d9d Qs2s 6dKc 8cQh Ac8d 6sJh Tc9s 9c7c",
      Solver.process("texas-holdem 6c8hJsTdTs 8cQh 2h5h 6dKc 9c7c Tc9s 6sJh 3d9d Qs2s Ac8d"));
  }

  @Test
  public void test_texas_holdem_131_2d6c6s7dKc_6dKh_AsTc_Td5d() {
    assertEquals(
      "Td5d AsTc 6dKh",
      Solver.process("texas-holdem 2d6c6s7dKc 6dKh AsTc Td5d"));
  }

  @Test
  public void test_texas_holdem_132_2s6c7d7hQs_6d6s_Tc5c_Ks2c_Qh4s_6hTh_Qc3h() {
    assertEquals(
      "Tc5c Ks2c 6hTh Qc3h=Qh4s 6d6s",
      Solver.process("texas-holdem 2s6c7d7hQs 6d6s Tc5c Ks2c Qh4s 6hTh Qc3h"));
  }

  @Test
  public void test_texas_holdem_133_5h8cKsQhQs_9c6c_3hAs_Js6s_4c9d_Kd2h_Qc3d_4sJc_ThTs() {
    assertEquals(
      "4c9d=9c6c 4sJc=Js6s 3hAs ThTs Kd2h Qc3d",
      Solver.process("texas-holdem 5h8cKsQhQs 9c6c 3hAs Js6s 4c9d Kd2h Qc3d 4sJc ThTs"));
  }

  @Test
  public void test_texas_holdem_134_5h6s7d9cKs_7s2s_Qh5s_3s5c_Ts3h_QcJs_3d2c_ThTc_4s4c_4h4d() {
    assertEquals(
      "3d2c Ts3h QcJs 4h4d=4s4c 3s5c Qh5s 7s2s ThTc",
      Solver.process("texas-holdem 5h6s7d9cKs 7s2s Qh5s 3s5c Ts3h QcJs 3d2c ThTc 4s4c 4h4d"));
  }

  @Test
  public void test_texas_holdem_135_6c9sAdTcTs_Th3s_Kd7s_3c2s_5c4h() {
    assertEquals(
      "3c2s=5c4h Kd7s Th3s",
      Solver.process("texas-holdem 6c9sAdTcTs Th3s Kd7s 3c2s 5c4h"));
  }

  @Test
  public void test_texas_holdem_136_6d6hJdKdTh_4sAc_Ts8s() {
    assertEquals(
      "4sAc Ts8s",
      Solver.process("texas-holdem 6d6hJdKdTh 4sAc Ts8s"));
  }

  @Test
  public void test_texas_holdem_137_5h5s6hAcKs_AsAh_2dTd_9h3h_3c6c_Ts3s_Kh7h() {
    assertEquals(
      "9h3h 2dTd=Ts3s 3c6c Kh7h AsAh",
      Solver.process("texas-holdem 5h5s6hAcKs AsAh 2dTd 9h3h 3c6c Ts3s Kh7h"));
  }

  @Test
  public void test_texas_holdem_138_2d3h4c8hAc_4d3d_7s8d_6hTc_Qd2s_As4h_AdAh_2h9h_KhJc_5d5h() {
    assertEquals(
      "6hTc KhJc 2h9h Qd2s 7s8d 4d3d As4h AdAh 5d5h",
      Solver.process("texas-holdem 2d3h4c8hAc 4d3d 7s8d 6hTc Qd2s As4h AdAh 2h9h KhJc 5d5h"));
  }

  @Test
  public void test_texas_holdem_139_2d4c7c7h8c_7s3s_4h8s() {
    assertEquals(
      "4h8s 7s3s",
      Solver.process("texas-holdem 2d4c7c7h8c 7s3s 4h8s"));
  }

  @Test
  public void test_texas_holdem_140_2s6s8dJdQs_6c3h_5sAs_2hTh_4s4c() {
    assertEquals(
      "2hTh 4s4c 6c3h 5sAs",
      Solver.process("texas-holdem 2s6s8dJdQs 6c3h 5sAs 2hTh 4s4c"));
  }

  @Test
  public void test_texas_holdem_141_3h6d6hQcTh_7h3s_TcTs_2d5c_8sQd_Jc3d_6s6c() {
    assertEquals(
      "2d5c 7h3s=Jc3d 8sQd TcTs 6s6c",
      Solver.process("texas-holdem 3h6d6hQcTh 7h3s TcTs 2d5c 8sQd Jc3d 6s6c"));
  }

  @Test
  public void test_texas_holdem_142_2s3d3h3sQd_8cQs_5h6d() {
    assertEquals(
      "5h6d 8cQs",
      Solver.process("texas-holdem 2s3d3h3sQd 8cQs 5h6d"));
  }

  @Test
  public void test_texas_holdem_143_5s6c8c9hTd_Qc8d_9sQh_5h2c_3cAd_7c8h_6h5c() {
    assertEquals(
      "3cAd 5h2c Qc8d 9sQh 6h5c 7c8h",
      Solver.process("texas-holdem 5s6c8c9hTd Qc8d 9sQh 5h2c 3cAd 7c8h 6h5c"));
  }

  @Test
  public void test_texas_holdem_144_2d3d6h7h9d_Jc4c_JsTh_8c4s_5sTd() {
    assertEquals(
      "8c4s 5sTd Jc4c JsTh",
      Solver.process("texas-holdem 2d3d6h7h9d Jc4c JsTh 8c4s 5sTd"));
  }

  @Test
  public void test_texas_holdem_145_2h3h4d5cJd_JsTc_5s4c_KcJc() {
    assertEquals(
      "JsTc KcJc 5s4c",
      Solver.process("texas-holdem 2h3h4d5cJd JsTc 5s4c KcJc"));
  }

  @Test
  public void test_texas_holdem_146_8c9h9sKdTs_2h9d_5h3c_4c3s_4hQh() {
    assertEquals(
      "4c3s=5h3c 4hQh 2h9d",
      Solver.process("texas-holdem 8c9h9sKdTs 2h9d 5h3c 4c3s 4hQh"));
  }

  @Test
  public void test_texas_holdem_147_5s8c9dKhQh_7cAs_8dAh_3h9s_6c5h_Jc4c() {
    assertEquals(
      "Jc4c 7cAs 6c5h 8dAh 3h9s",
      Solver.process("texas-holdem 5s8c9dKhQh 7cAs 8dAh 3h9s 6c5h Jc4c"));
  }

  @Test
  public void test_texas_holdem_148_2h3c4d4h7c_9cJc_8sKc_2d3d_6c9h() {
    assertEquals(
      "6c9h 9cJc 8sKc 2d3d",
      Solver.process("texas-holdem 2h3c4d4h7c 9cJc 8sKc 2d3d 6c9h"));
  }

  @Test
  public void test_texas_holdem_149_3d5h8dAsJh_2h8s_KhKc_Ad2d_9sQc_9cQh_Jd2s() {
    assertEquals(
      "9cQh=9sQc 2h8s Jd2s KhKc Ad2d",
      Solver.process("texas-holdem 3d5h8dAsJh 2h8s KhKc Ad2d 9sQc 9cQh Jd2s"));
  }

  @Test
  public void test_texas_holdem_150_2c3s7s8c9h_4s7c_2hJh_QdJc_9c2d_6dKs_Tc6s_4c5c() {
    assertEquals(
      "4c5c QdJc 6dKs 2hJh 4s7c 9c2d Tc6s",
      Solver.process("texas-holdem 2c3s7s8c9h 4s7c 2hJh QdJc 9c2d 6dKs Tc6s 4c5c"));
  }

  @Test
  public void test_texas_holdem_151_2h5s6h8hKd_4hTc_Jc9s_2s5c_4dQh_Td3d_8sJh_4s6d_ThQc_AdKh() {
    assertEquals(
      "4hTc=Td3d Jc9s 4dQh ThQc 4s6d 8sJh AdKh 2s5c",
      Solver.process("texas-holdem 2h5s6h8hKd 4hTc Jc9s 2s5c 4dQh Td3d 8sJh 4s6d ThQc AdKh"));
  }

  @Test
  public void test_texas_holdem_152_3c3d3sAdAh_7c9c_4c7d_6c8d_5h4d_3hKc_Kh9h() {
    assertEquals(
      "4c7d=5h4d=6c8d=7c9c=Kh9h 3hKc",
      Solver.process("texas-holdem 3c3d3sAdAh 7c9c 4c7d 6c8d 5h4d 3hKc Kh9h"));
  }

  @Test
  public void test_texas_holdem_153_3h3s8cJcKh_8s6s_2hTh_9hAc_JdKc_TdJs_2dJh_As5s_5c9d_7c8h() {
    assertEquals(
      "5c9d 2hTh 9hAc=As5s 7c8h=8s6s 2dJh=TdJs JdKc",
      Solver.process("texas-holdem 3h3s8cJcKh 8s6s 2hTh 9hAc JdKc TdJs 2dJh As5s 5c9d 7c8h"));
  }

  @Test
  public void test_texas_holdem_154_4d7c7s8dQs_4c9c_AdJh_3dJd_2s3s_8s5d_Kh8h() {
    assertEquals(
      "2s3s 3dJd AdJh 4c9c 8s5d Kh8h",
      Solver.process("texas-holdem 4d7c7s8dQs 4c9c AdJh 3dJd 2s3s 8s5d Kh8h"));
  }

  @Test
  public void test_texas_holdem_155_6s8d9hJhTs_7cAc_TdQs_KhJc_Qd7d_Kc2d_AsQh_8sAd() {
    assertEquals(
      "Kc2d 8sAd KhJc 7cAc AsQh=Qd7d=TdQs",
      Solver.process("texas-holdem 6s8d9hJhTs 7cAc TdQs KhJc Qd7d Kc2d AsQh 8sAd"));
  }

  @Test
  public void test_texas_holdem_156_3h5h6cJhKc_9dQc_ThAh_Td6s() {
    assertEquals(
      "9dQc Td6s ThAh",
      Solver.process("texas-holdem 3h5h6cJhKc 9dQc ThAh Td6s"));
  }

  @Test
  public void test_texas_holdem_157_6s7d9cKcKh_8cTs_5c8d() {
    assertEquals(
      "5c8d 8cTs",
      Solver.process("texas-holdem 6s7d9cKcKh 8cTs 5c8d"));
  }

  @Test
  public void test_texas_holdem_158_2s9sKdTdTh_AhQd_3h5s_7s5d_KsAs_Ad2c_5h9c_6cKc_7c8s() {
    assertEquals(
      "3h5s 7s5d 7c8s AhQd Ad2c 5h9c 6cKc KsAs",
      Solver.process("texas-holdem 2s9sKdTdTh AhQd 3h5s 7s5d KsAs Ad2c 5h9c 6cKc 7c8s"));
  }

  @Test
  public void test_texas_holdem_159_4s9hJcJhTh_AdQc_KcJs() {
    assertEquals(
      "AdQc KcJs",
      Solver.process("texas-holdem 4s9hJcJhTh AdQc KcJs"));
  }

  @Test
  public void test_texas_holdem_160_7cAcAsJhTd_8sQs_Ah3s_4cQd_6dJs() {
    assertEquals(
      "4cQd=8sQs 6dJs Ah3s",
      Solver.process("texas-holdem 7cAcAsJhTd 8sQs Ah3s 4cQd 6dJs"));
  }

  @Test
  public void test_texas_holdem_161_2s5d7c7dAc_QdJh_KcQc_9dAd_6dKs_9h8s_KhJd_6sTh_Qh9s() {
    assertEquals(
      "9h8s 6sTh Qh9s QdJh 6dKs KhJd KcQc 9dAd",
      Solver.process("texas-holdem 2s5d7c7dAc QdJh KcQc 9dAd 6dKs 9h8s KhJd 6sTh Qh9s"));
  }

  @Test
  public void test_texas_holdem_162_6c6hKhQcQd_JsTh_8c5c_4cTd_Kc5s_Jh3c_2c7s_8sQs_Ad3d() {
    assertEquals(
      "2c7s=4cTd=8c5c=Jh3c=JsTh Ad3d Kc5s 8sQs",
      Solver.process("texas-holdem 6c6hKhQcQd JsTh 8c5c 4cTd Kc5s Jh3c 2c7s 8sQs Ad3d"));
  }

  @Test
  public void test_texas_holdem_163_5c7h8s9cQd_Js2s_6sKh_3c7s_4d3h_2dJh_Ac9s_9d3d() {
    assertEquals(
      "4d3h 2dJh=Js2s 3c7s 9d3d Ac9s 6sKh",
      Solver.process("texas-holdem 5c7h8s9cQd Js2s 6sKh 3c7s 4d3h 2dJh Ac9s 9d3d"));
  }

  @Test
  public void test_texas_holdem_164_5s8s9hAcJc_Jh8d_Qd6c_2h6h_4hTc_7hKh_Jd4s_2c4d_KdQs_QhAs() {
    assertEquals(
      "2c4d 2h6h 4hTc Qd6c 7hKh KdQs Jd4s QhAs Jh8d",
      Solver.process("texas-holdem 5s8s9hAcJc Jh8d Qd6c 2h6h 4hTc 7hKh Jd4s 2c4d KdQs QhAs"));
  }

  @Test
  public void test_texas_holdem_165_4c5h7d9sJh_JdQh_3s3h_7sJc_TsAs_KhTc_Td6s_5d6h_2sKd() {
    assertEquals(
      "Td6s 2sKd KhTc TsAs 3s3h 5d6h JdQh 7sJc",
      Solver.process("texas-holdem 4c5h7d9sJh JdQh 3s3h 7sJc TsAs KhTc Td6s 5d6h 2sKd"));
  }

  @Test
  public void test_texas_holdem_166_6d6s7s8sAc_9s3h_3s4c_JdKd_9dJh_3cTd_7cJs_KhAd() {
    assertEquals(
      "3s4c 9s3h 3cTd 9dJh JdKd 7cJs KhAd",
      Solver.process("texas-holdem 6d6s7s8sAc 9s3h 3s4c JdKd 9dJh 3cTd 7cJs KhAd"));
  }

  @Test
  public void test_texas_holdem_167_3c5h8h8s9s_Qd6c_Ks4s_9d9h_Th4d() {
    assertEquals(
      "Th4d Qd6c Ks4s 9d9h",
      Solver.process("texas-holdem 3c5h8h8s9s Qd6c Ks4s 9d9h Th4d"));
  }

  @Test
  public void test_texas_holdem_168_3s4c9dJcTh_4sQd_8s8d() {
    assertEquals(
      "4sQd 8s8d",
      Solver.process("texas-holdem 3s4c9dJcTh 4sQd 8s8d"));
  }

  @Test
  public void test_texas_holdem_169_2c5c6hQcTh_7d7s_6sJc_TdAs_2sQs_7hKs_8hAd() {
    assertEquals(
      "7hKs 8hAd 6sJc 7d7s TdAs 2sQs",
      Solver.process("texas-holdem 2c5c6hQcTh 7d7s 6sJc TdAs 2sQs 7hKs 8hAd"));
  }

  @Test
  public void test_texas_holdem_170_4s6h9dJcTs_AdAc_Jd7s_5hKh_7hAs_6dKd() {
    assertEquals(
      "5hKh 7hAs 6dKd Jd7s AdAc",
      Solver.process("texas-holdem 4s6h9dJcTs AdAc Jd7s 5hKh 7hAs 6dKd"));
  }

  @Test
  public void test_texas_holdem_171_9dAsQcQdTc_Ts8c_7sJd_Td3s_Kd4s_7d4h_Ah8h() {
    assertEquals(
      "7d4h 7sJd Kd4s Td3s=Ts8c Ah8h",
      Solver.process("texas-holdem 9dAsQcQdTc Ts8c 7sJd Td3s Kd4s 7d4h Ah8h"));
  }

  @Test
  public void test_texas_holdem_172_2d9sAcKcKh_KdQc_5d5c_TsJc_9d8s_2h6h_9cQh() {
    assertEquals(
      "TsJc 2h6h 5d5c 9cQh=9d8s KdQc",
      Solver.process("texas-holdem 2d9sAcKcKh KdQc 5d5c TsJc 9d8s 2h6h 9cQh"));
  }

  @Test
  public void test_texas_holdem_173_3h4d8dQsTd_7c8c_4s5h_2h5c() {
    assertEquals(
      "2h5c 4s5h 7c8c",
      Solver.process("texas-holdem 3h4d8dQsTd 7c8c 4s5h 2h5c"));
  }

  @Test
  public void test_texas_holdem_174_6c8dJdJsTs_4dTd_2c7c_3c5c_5d9h_4s2d_JhQc_3hAs() {
    assertEquals(
      "3c5c=4s2d 2c7c 5d9h 3hAs 4dTd JhQc",
      Solver.process("texas-holdem 6c8dJdJsTs 4dTd 2c7c 3c5c 5d9h 4s2d JhQc 3hAs"));
  }

  @Test
  public void test_texas_holdem_175_2h7c8h9d9h_9sKs_8s2c_QdTd_Tc5d_7h3h_7sJs_Jd5s_9c2s() {
    assertEquals(
      "Tc5d Jd5s QdTd 7sJs 8s2c 9sKs 7h3h 9c2s",
      Solver.process("texas-holdem 2h7c8h9d9h 9sKs 8s2c QdTd Tc5d 7h3h 7sJs Jd5s 9c2s"));
  }

  @Test
  public void test_texas_holdem_176_2c6d8sKhQd_Js7h_3hQs_2hTh_7cJd_3d8h() {
    assertEquals(
      "7cJd=Js7h 2hTh 3d8h 3hQs",
      Solver.process("texas-holdem 2c6d8sKhQd Js7h 3hQs 2hTh 7cJd 3d8h"));
  }

  @Test
  public void test_texas_holdem_177_2s6d8cKsQd_AhTc_9dKd_3c8s() {
    assertEquals(
      "AhTc 3c8s 9dKd",
      Solver.process("texas-holdem 2s6d8cKsQd AhTc 9dKd 3c8s"));
  }

  @Test
  public void test_texas_holdem_178_5c6d7d9cTc_7h8s_3d4c_JcAs_Js9d_7sJd_6sQh() {
    assertEquals(
      "JcAs 6sQh 7sJd Js9d 3d4c 7h8s",
      Solver.process("texas-holdem 5c6d7d9cTc 7h8s 3d4c JcAs Js9d 7sJd 6sQh"));
  }

  @Test
  public void test_texas_holdem_179_2c4s6d7dAh_5h5d_Qc3h_6c4c() {
    assertEquals(
      "Qc3h 5h5d 6c4c",
      Solver.process("texas-holdem 2c4s6d7dAh 5h5d Qc3h 6c4c"));
  }

  @Test
  public void test_texas_holdem_180_3c3h5h8sKh_9sQc_JhTc_QsAh_7d9c_2c7s_2d3d_8c4c_6hTh_9hQd() {
    assertEquals(
      "2c7s 7d9c JhTc 9hQd=9sQc QsAh 8c4c 2d3d 6hTh",
      Solver.process("texas-holdem 3c3h5h8sKh 9sQc JhTc QsAh 7d9c 2c7s 2d3d 8c4c 6hTh 9hQd"));
  }

  @Test
  public void test_texas_holdem_181_4h6s8d8sTs_3s7h_Js8c_5dJh_QsQc_9d2d() {
    assertEquals(
      "3s7h 9d2d 5dJh QsQc Js8c",
      Solver.process("texas-holdem 4h6s8d8sTs 3s7h Js8c 5dJh QsQc 9d2d"));
  }

  @Test
  public void test_texas_holdem_182_5s6d7cJhKc_Tc9c_8sKs_6c2d_Js7d_2h8d_Qd2s_6s7h() {
    assertEquals(
      "2h8d Tc9c Qd2s 6c2d 8sKs 6s7h Js7d",
      Solver.process("texas-holdem 5s6d7cJhKc Tc9c 8sKs 6c2d Js7d 2h8d Qd2s 6s7h"));
  }

  @Test
  public void test_texas_holdem_183_4h5sJcJdKh_9s2s_As4d_7dQs_7h3s_5d9h_8hQc_7sQh_AcKs_4s3d() {
    assertEquals(
      "7h3s 9s2s 7dQs=7sQh 8hQc 4s3d As4d 5d9h AcKs",
      Solver.process("texas-holdem 4h5sJcJdKh 9s2s As4d 7dQs 7h3s 5d9h 8hQc 7sQh AcKs 4s3d"));
  }

  @Test
  public void test_texas_holdem_184_5c7sAdJdTh_6c8d_Qc9d_Kd4s_9cKh_Ah7c_7d5h() {
    assertEquals(
      "6c8d Qc9d Kd4s 9cKh 7d5h Ah7c",
      Solver.process("texas-holdem 5c7sAdJdTh 6c8d Qc9d Kd4s 9cKh Ah7c 7d5h"));
  }

  @Test
  public void test_texas_holdem_185_3c5dAsJdTc_2hKc_3s8s_8d2c_9sKs_4dJh_KdAc_9dAd_2d3d_Qd6d() {
    assertEquals(
      "8d2c Qd6d 2hKc 9sKs 2d3d=3s8s 4dJh 9dAd KdAc",
      Solver.process("texas-holdem 3c5dAsJdTc 2hKc 3s8s 8d2c 9sKs 4dJh KdAc 9dAd 2d3d Qd6d"));
  }

  @Test
  public void test_texas_holdem_186_5s7sAhKdQs_5hTc_9h8c_4c2d_Kc5c_3dKs_7dQd() {
    assertEquals(
      "4c2d 9h8c 5hTc 3dKs 7dQd Kc5c",
      Solver.process("texas-holdem 5s7sAhKdQs 5hTc 9h8c 4c2d Kc5c 3dKs 7dQd"));
  }

  @Test
  public void test_texas_holdem_187_2d4s5c5dQc_3cTd_9s3d_6d7c_7dJd_4hAc() {
    assertEquals(
      "6d7c 9s3d 3cTd 7dJd 4hAc",
      Solver.process("texas-holdem 2d4s5c5dQc 3cTd 9s3d 6d7c 7dJd 4hAc"));
  }

  @Test
  public void test_texas_holdem_188_6d6s7s9c9h_2d5s_3cAs_Qh3h_5c7d_8c4h_3d4c() {
    assertEquals(
      "2d5s=3d4c 8c4h Qh3h 3cAs 5c7d",
      Solver.process("texas-holdem 6d6s7s9c9h 2d5s 3cAs Qh3h 5c7d 8c4h 3d4c"));
  }

  @Test
  public void test_texas_holdem_189_6s7c9cAhKh_Ac9h_Jd8s_Jc4c() {
    assertEquals(
      "Jc4c Jd8s Ac9h",
      Solver.process("texas-holdem 6s7c9cAhKh Ac9h Jd8s Jc4c"));
  }

  @Test
  public void test_texas_holdem_190_2h3c7cKcTd_7d6c_9d6h_8h2d_5hAs_4s6s_7hKs() {
    assertEquals(
      "4s6s 9d6h 5hAs 8h2d 7d6c 7hKs",
      Solver.process("texas-holdem 2h3c7cKcTd 7d6c 9d6h 8h2d 5hAs 4s6s 7hKs"));
  }

  @Test
  public void test_texas_holdem_191_4d4hJcJhQh_8s9h_4cTd_9s2s_2d9c_6c2h_8d5d_TcKh_Js6s_7hAs() {
    assertEquals(
      "2d9c=6c2h=8d5d=8s9h=9s2s TcKh 7hAs 4cTd Js6s",
      Solver.process("texas-holdem 4d4hJcJhQh 8s9h 4cTd 9s2s 2d9c 6c2h 8d5d TcKh Js6s 7hAs"));
  }

  @Test
  public void test_texas_holdem_192_2d2s3c4dQc_7d9s_Js5s_7hKh_7c7s() {
    assertEquals(
      "7d9s Js5s 7hKh 7c7s",
      Solver.process("texas-holdem 2d2s3c4dQc 7d9s Js5s 7hKh 7c7s"));
  }

  @Test
  public void test_texas_holdem_193_2d2s8cKsTs_6h5h_JcQd_TdTc_8s5c_4d6c_Qc6s_9h6d_AsJd_AhJs() {
    assertEquals(
      "4d6c=6h5h 9h6d Qc6s JcQd AhJs=AsJd 8s5c TdTc",
      Solver.process("texas-holdem 2d2s8cKsTs 6h5h JcQd TdTc 8s5c 4d6c Qc6s 9h6d AsJd AhJs"));
  }

  @Test
  public void test_texas_holdem_194_5h8cAcAsKc_3c2d_5dJd_5c8s_Td7d_7h9d_Jh2s() {
    assertEquals(
      "3c2d 7h9d Td7d Jh2s 5dJd 5c8s",
      Solver.process("texas-holdem 5h8cAcAsKc 3c2d 5dJd 5c8s Td7d 7h9d Jh2s"));
  }

  @Test
  public void test_texas_holdem_195_2d3s9cKcQd_4c6s_4s6h_AcTh_8c6c_Qc6d() {
    assertEquals(
      "4c6s=4s6h 8c6c AcTh Qc6d",
      Solver.process("texas-holdem 2d3s9cKcQd 4c6s 4s6h AcTh 8c6c Qc6d"));
  }

  @Test
  public void test_texas_holdem_196_5c6s8c9c9d_7d9s_2c2d_2h5s_JcTd_JsQc_3dQd_7sKd() {
    assertEquals(
      "JcTd 3dQd JsQc 2c2d 2h5s 7d9s=7sKd",
      Solver.process("texas-holdem 5c6s8c9c9d 7d9s 2c2d 2h5s JcTd JsQc 3dQd 7sKd"));
  }

  @Test
  public void test_texas_holdem_197_6d9hKdKhQs_KsAh_Td7d() {
    assertEquals(
      "Td7d KsAh",
      Solver.process("texas-holdem 6d9hKdKhQs KsAh Td7d"));
  }

  @Test
  public void test_texas_holdem_198_3s4c7c7dAs_TdQs_Ts8h_Jh8d_Js2d_2h5d() {
    assertEquals(
      "Ts8h Js2d Jh8d TdQs 2h5d",
      Solver.process("texas-holdem 3s4c7c7dAs TdQs Ts8h Jh8d Js2d 2h5d"));
  }

  @Test
  public void test_texas_holdem_199_3c8s9cQdTc_KhAs_QcKc() {
    assertEquals(
      "KhAs QcKc",
      Solver.process("texas-holdem 3c8s9cQdTc KhAs QcKc"));
  }

  @Test
  public void test_texas_holdem_200_3s4c6dAcJs_9hAh_6sQc_Jh7d_7cTh_Ts6h_Jc5h_Qs5s_JdKc() {
    assertEquals(
      "7cTh Qs5s Ts6h 6sQc Jc5h Jh7d JdKc 9hAh",
      Solver.process("texas-holdem 3s4c6dAcJs 9hAh 6sQc Jh7d 7cTh Ts6h Jc5h Qs5s JdKc"));
  }

  @Test
  public void test_texas_holdem_201_2h4c6h9hJh_Tc9s_2s3s_Ad8h_Kc9d_Ts5h_As5c_7h3h_7c3c() {
    assertEquals(
      "7c3c As5c 2s3s Tc9s Kc9d Ts5h 7h3h Ad8h",
      Solver.process("texas-holdem 2h4c6h9hJh Tc9s 2s3s Ad8h Kc9d Ts5h As5c 7h3h 7c3c"));
  }

  @Test
  public void test_texas_holdem_202_8cJcJsKhTh_5sKd_Ad3h_5dKc() {
    assertEquals(
      "Ad3h 5dKc=5sKd",
      Solver.process("texas-holdem 8cJcJsKhTh 5sKd Ad3h 5dKc"));
  }

  @Test
  public void test_texas_holdem_203_4c4d6cKdQc_AhJc_3c2c_Ad9d_Jh3s_5h9h_7h8c() {
    assertEquals(
      "7h8c 5h9h Jh3s Ad9d=AhJc 3c2c",
      Solver.process("texas-holdem 4c4d6cKdQc AhJc 3c2c Ad9d Jh3s 5h9h 7h8c"));
  }

  @Test
  public void test_texas_holdem_204_6c6d6h9cAd_9s5h_8dQd_Qh5d_Kd4s_8cKc_ThAc_Qs6s() {
    assertEquals(
      "8dQd=Qh5d 8cKc=Kd4s 9s5h ThAc Qs6s",
      Solver.process("texas-holdem 6c6d6h9cAd 9s5h 8dQd Qh5d Kd4s 8cKc ThAc Qs6s"));
  }

  @Test
  public void test_texas_holdem_205_3c5h7hTcTd_Ad4h_Kh9h_3hQd_6d6c_KcQh_Jd9c() {
    assertEquals(
      "Jd9c Kh9h KcQh Ad4h 3hQd 6d6c",
      Solver.process("texas-holdem 3c5h7hTcTd Ad4h Kh9h 3hQd 6d6c KcQh Jd9c"));
  }

  @Test
  public void test_texas_holdem_206_2s3s6cKsQd_AcAs_8sAh_4c9c_Tc5s_9s2d_Ts3h_9d7d_5d3d() {
    assertEquals(
      "4c9c 9d7d Tc5s 8sAh 9s2d 5d3d Ts3h AcAs",
      Solver.process("texas-holdem 2s3s6cKsQd AcAs 8sAh 4c9c Tc5s 9s2d Ts3h 9d7d 5d3d"));
  }

  @Test
  public void test_texas_holdem_207_6d8cAcQcTh_8h3s_Jh8s_2c4h_2dAh() {
    assertEquals(
      "2c4h 8h3s Jh8s 2dAh",
      Solver.process("texas-holdem 6d8cAcQcTh 8h3s Jh8s 2c4h 2dAh"));
  }

  @Test
  public void test_texas_holdem_208_3h6s8dJdTd_6cQd_6dTs_8c3c_Th5c_9d5s_Qc5d_Ah7d() {
    assertEquals(
      "9d5s Qc5d Ah7d 6cQd Th5c 8c3c 6dTs",
      Solver.process("texas-holdem 3h6s8dJdTd 6cQd 6dTs 8c3c Th5c 9d5s Qc5d Ah7d"));
  }

  @Test
  public void test_texas_holdem_209_6c7sJcKdTh_3dQs_9d3s_Tc3c_2s8d_7h6h_Qd4d_5h6s_8h8c_9cKs() {
    assertEquals(
      "2s8d 9d3s 3dQs=Qd4d 5h6s 8h8c Tc3c 9cKs 7h6h",
      Solver.process("texas-holdem 6c7sJcKdTh 3dQs 9d3s Tc3c 2s8d 7h6h Qd4d 5h6s 8h8c 9cKs"));
  }

  @Test
  public void test_texas_holdem_210_3h8d8sJhQd_7h3d_9s3c_9dTs_ThJs_5d4c_QcTc_4h6h() {
    assertEquals(
      "5d4c 4h6h 7h3d=9s3c ThJs QcTc 9dTs",
      Solver.process("texas-holdem 3h8d8sJhQd 7h3d 9s3c 9dTs ThJs 5d4c QcTc 4h6h"));
  }

  @Test
  public void test_texas_holdem_211_5c8hAcAhKs_4hJs_6c3h_4d5s_6sAd_Jc2c_6hKc_Kd3d_JdTd_2sJh() {
    assertEquals(
      "6c3h 2sJh=4hJs=Jc2c JdTd 4d5s 6hKc=Kd3d 6sAd",
      Solver.process("texas-holdem 5c8hAcAhKs 4hJs 6c3h 4d5s 6sAd Jc2c 6hKc Kd3d JdTd 2sJh"));
  }

  @Test
  public void test_texas_holdem_212_2h3s6hAcTc_7sJh_7cTd_Js2c_Kd9d_7hQh_5cAs_5s3c() {
    assertEquals(
      "7sJh 7hQh Kd9d Js2c 5s3c 7cTd 5cAs",
      Solver.process("texas-holdem 2h3s6hAcTc 7sJh 7cTd Js2c Kd9d 7hQh 5cAs 5s3c"));
  }

  @Test
  public void test_texas_holdem_213_6h9cJsQdTc_4s9s_9d8c_5d3h_2c7h_QhAc_3s3d_2h4d_8d5s() {
    assertEquals(
      "2h4d=5d3h 2c7h 3s3d 4s9s QhAc 8d5s=9d8c",
      Solver.process("texas-holdem 6h9cJsQdTc 4s9s 9d8c 5d3h 2c7h QhAc 3s3d 2h4d 8d5s"));
  }

  @Test
  public void test_texas_holdem_214_8dAcKdQdQs_5sQh_6dJc_6cTc_3cTs_Ks4d_8s8c() {
    assertEquals(
      "3cTs=6cTc 6dJc Ks4d 5sQh 8s8c",
      Solver.process("texas-holdem 8dAcKdQdQs 5sQh 6dJc 6cTc 3cTs Ks4d 8s8c"));
  }

  @Test
  public void test_texas_holdem_215_2s7h7s8d8s_9c4s_Ah3h_Jc2d_Js5h_7dKs_3d2h() {
    assertEquals(
      "3d2h 9c4s Jc2d=Js5h Ah3h 7dKs",
      Solver.process("texas-holdem 2s7h7s8d8s 9c4s Ah3h Jc2d Js5h 7dKs 3d2h"));
  }

  @Test
  public void test_texas_holdem_216_4c6dQcQdTh_9d7d_2d3c_4s5c_8h6c_2cKd() {
    assertEquals(
      "2d3c 9d7d 2cKd 4s5c 8h6c",
      Solver.process("texas-holdem 4c6dQcQdTh 9d7d 2d3c 4s5c 8h6c 2cKd"));
  }

  @Test
  public void test_texas_holdem_217_5d8c8hAdKd_Tc4d_9cAh_QsKh() {
    assertEquals(
      "Tc4d QsKh 9cAh",
      Solver.process("texas-holdem 5d8c8hAdKd Tc4d 9cAh QsKh"));
  }

  @Test
  public void test_texas_holdem_218_6c7sAsTdTs_6h4d_QhKc() {
    assertEquals(
      "QhKc 6h4d",
      Solver.process("texas-holdem 6c7sAsTdTs 6h4d QhKc"));
  }

  @Test
  public void test_texas_holdem_219_2s4c5s7c8c_Jc7h_5cJd_Qc2c() {
    assertEquals(
      "5cJd Jc7h Qc2c",
      Solver.process("texas-holdem 2s4c5s7c8c Jc7h 5cJd Qc2c"));
  }

  @Test
  public void test_texas_holdem_220_2h9hAsJdQs_Kc8s_3s4c_Tc3h_Ts5d_6sAd() {
    assertEquals(
      "3s4c Tc3h=Ts5d Kc8s 6sAd",
      Solver.process("texas-holdem 2h9hAsJdQs Kc8s 3s4c Tc3h Ts5d 6sAd"));
  }

  @Test
  public void test_texas_holdem_221_5d6c9dJcQh_Js6d_4c4d_AdTh_3d3h_2dQs_Jh3c_5c7d_Kc4s() {
    assertEquals(
      "Kc4s AdTh 3d3h 4c4d 5c7d Jh3c 2dQs Js6d",
      Solver.process("texas-holdem 5d6c9dJcQh Js6d 4c4d AdTh 3d3h 2dQs Jh3c 5c7d Kc4s"));
  }

  @Test
  public void test_texas_holdem_222_5c5d8c9hKs_Jd5h_JhAc_8hTh_KcQs_Kh2c_As4d() {
    assertEquals(
      "As4d JhAc 8hTh Kh2c KcQs Jd5h",
      Solver.process("texas-holdem 5c5d8c9hKs Jd5h JhAc 8hTh KcQs Kh2c As4d"));
  }

  @Test
  public void test_texas_holdem_223_6s9dKdKsTc_2c7c_4sQh_5dQd_9h5s_5hAs_QcAc_Jc4c() {
    assertEquals(
      "2c7c Jc4c 4sQh=5dQd 5hAs QcAc 9h5s",
      Solver.process("texas-holdem 6s9dKdKsTc 2c7c 4sQh 5dQd 9h5s 5hAs QcAc Jc4c"));
  }

  @Test
  public void test_texas_holdem_224_3d6c9dTdTs_Kc6h_Js5h_2sKd_QcQd_As4c_Tc8h_8s8c() {
    assertEquals(
      "Js5h 2sKd As4c Kc6h 8s8c QcQd Tc8h",
      Solver.process("texas-holdem 3d6c9dTdTs Kc6h Js5h 2sKd QcQd As4c Tc8h 8s8c"));
  }

  @Test
  public void test_texas_holdem_225_4h5s8c9hQh_9sAh_7sKs_2hJd_2c3c_3h8d_Ad7c_Qc9d_7d6c() {
    assertEquals(
      "2c3c 2hJd 7sKs Ad7c 3h8d 9sAh Qc9d 7d6c",
      Solver.process("texas-holdem 4h5s8c9hQh 9sAh 7sKs 2hJd 2c3c 3h8d Ad7c Qc9d 7d6c"));
  }

  @Test
  public void test_texas_holdem_226_2c4c5d5s6d_Ah7s_8h5c_4d7d_6sJd_Ac7h_3s9s_8s3h() {
    assertEquals(
      "Ac7h=Ah7s 4d7d 6sJd 8h5c 3s9s=8s3h",
      Solver.process("texas-holdem 2c4c5d5s6d Ah7s 8h5c 4d7d 6sJd Ac7h 3s9s 8s3h"));
  }

  @Test
  public void test_texas_holdem_227_5s7s9dKcQd_4s6h_9h4h_8hTd_AdJh_8c3d_2h3c() {
    assertEquals(
      "2h3c 4s6h 8c3d 8hTd AdJh 9h4h",
      Solver.process("texas-holdem 5s7s9dKcQd 4s6h 9h4h 8hTd AdJh 8c3d 2h3c"));
  }

  @Test
  public void test_texas_holdem_228_7d9dAsJhTc_8c5c_Ac2d_Jd6c_3d4s_8d3s_3c2s_KcAd_4cKh_Qd9s() {
    assertEquals(
      "3c2s=3d4s 4cKh Qd9s Jd6c Ac2d KcAd 8c5c=8d3s",
      Solver.process("texas-holdem 7d9dAsJhTc 8c5c Ac2d Jd6c 3d4s 8d3s 3c2s KcAd 4cKh Qd9s"));
  }

  @Test
  public void test_texas_holdem_229_3c5d7dAsTh_8s7c_5c8h_9cJc_3d9s_4h4d() {
    assertEquals(
      "9cJc 3d9s 4h4d 5c8h 8s7c",
      Solver.process("texas-holdem 3c5d7dAsTh 8s7c 5c8h 9cJc 3d9s 4h4d"));
  }

  @Test
  public void test_texas_holdem_230_3h6c6s7hJh_2d3c_5d5s_Jc4c() {
    assertEquals(
      "2d3c 5d5s Jc4c",
      Solver.process("texas-holdem 3h6c6s7hJh 2d3c 5d5s Jc4c"));
  }

  @Test
  public void test_texas_holdem_231_2h9hAhJdTs_4c5c_6h2d_8hQs_7dTd_6d3c() {
    assertEquals(
      "4c5c 6d3c 6h2d 7dTd 8hQs",
      Solver.process("texas-holdem 2h9hAhJdTs 4c5c 6h2d 8hQs 7dTd 6d3c"));
  }

  @Test
  public void test_texas_holdem_232_3h5c8hQcTs_9s6d_Tc9h_AdJs_KcJh_5sQd_4d7s_9c4h_Kh7h() {
    assertEquals(
      "4d7s 9c4h 9s6d Kh7h KcJh AdJs Tc9h 5sQd",
      Solver.process("texas-holdem 3h5c8hQcTs 9s6d Tc9h AdJs KcJh 5sQd 4d7s 9c4h Kh7h"));
  }

  @Test
  public void test_texas_holdem_233_2c3hAdKhQh_ThKs_6s3c_7d4d_Jh8d_2dTd() {
    assertEquals(
      "7d4d Jh8d 2dTd 6s3c ThKs",
      Solver.process("texas-holdem 2c3hAdKhQh ThKs 6s3c 7d4d Jh8d 2dTd"));
  }

  @Test
  public void test_texas_holdem_234_2d3h9d9hQc_8sAc_Kc4h_7s6c_QhAh_7h2s_JcKs_5c5h_8d5s_3d6h() {
    assertEquals(
      "7s6c 8d5s Kc4h JcKs 8sAc 7h2s 3d6h 5c5h QhAh",
      Solver.process("texas-holdem 2d3h9d9hQc 8sAc Kc4h 7s6c QhAh 7h2s JcKs 5c5h 8d5s 3d6h"));
  }

  @Test
  public void test_texas_holdem_235_2c3d3hJcKd_JdAh_KcJs_4d6c_Td7c_Qc9s_AcAs_8c6h_4h5s() {
    assertEquals(
      "4h5s 4d6c 8c6h Td7c Qc9s JdAh KcJs AcAs",
      Solver.process("texas-holdem 2c3d3hJcKd JdAh KcJs 4d6c Td7c Qc9s AcAs 8c6h 4h5s"));
  }

  @Test
  public void test_texas_holdem_236_2c4d7dJhTc_Kh9c_Td2s_8c7s() {
    assertEquals(
      "Kh9c 8c7s Td2s",
      Solver.process("texas-holdem 2c4d7dJhTc Kh9c Td2s 8c7s"));
  }

  @Test
  public void test_texas_holdem_237_2c2h7sJcQc_4s3h_Ad4d_Td9c_7c3c_7hKd_Kh8d_8s7d() {
    assertEquals(
      "4s3h Td9c Kh8d Ad4d 8s7d 7hKd 7c3c",
      Solver.process("texas-holdem 2c2h7sJcQc 4s3h Ad4d Td9c 7c3c 7hKd Kh8d 8s7d"));
  }

  @Test
  public void test_texas_holdem_238_6c6d7c9hTs_Jh3d_5d9d_8d5h() {
    assertEquals(
      "Jh3d 5d9d 8d5h",
      Solver.process("texas-holdem 6c6d7c9hTs Jh3d 5d9d 8d5h"));
  }

  @Test
  public void test_texas_holdem_239_7c7d8s9hQh_Ad6h_5s2d_Td4d_Ah7h() {
    assertEquals(
      "5s2d Td4d Ad6h Ah7h",
      Solver.process("texas-holdem 7c7d8s9hQh Ad6h 5s2d Td4d Ah7h"));
  }

  @Test
  public void test_texas_holdem_240_2s3d6s8hQs_5cKs_8cQc_8s4c() {
    assertEquals(
      "5cKs 8s4c 8cQc",
      Solver.process("texas-holdem 2s3d6s8hQs 5cKs 8cQc 8s4c"));
  }

  @Test
  public void test_texas_holdem_241_2s5h8cAhJd_QcTc_9s5c_7sQd_Ts7h() {
    assertEquals(
      "Ts7h 7sQd QcTc 9s5c",
      Solver.process("texas-holdem 2s5h8cAhJd QcTc 9s5c 7sQd Ts7h"));
  }

  @Test
  public void test_texas_holdem_242_2c6hJhQsTs_2sAs_4hQd_Jd9c_4s6d() {
    assertEquals(
      "2sAs 4s6d Jd9c 4hQd",
      Solver.process("texas-holdem 2c6hJhQsTs 2sAs 4hQd Jd9c 4s6d"));
  }

  @Test
  public void test_texas_holdem_243_2hQhQsThTs_9d6h_8h2s_AdQc_AcQd() {
    assertEquals(
      "8h2s 9d6h AcQd=AdQc",
      Solver.process("texas-holdem 2hQhQsThTs 9d6h 8h2s AdQc AcQd"));
  }

  @Test
  public void test_texas_holdem_244_4h6dAcQsTd_KcKh_Tc8d_2s7c_Qd4s_3c5c_Ks9d_AhQh() {
    assertEquals(
      "3c5c 2s7c Ks9d Tc8d KcKh Qd4s AhQh",
      Solver.process("texas-holdem 4h6dAcQsTd KcKh Tc8d 2s7c Qd4s 3c5c Ks9d AhQh"));
  }

  @Test
  public void test_texas_holdem_245_9sAcAsQcTh_Qd8c_2sJs_3dTs_2d8s_Ah8h() {
    assertEquals(
      "2d8s 2sJs 3dTs Qd8c Ah8h",
      Solver.process("texas-holdem 9sAcAsQcTh Qd8c 2sJs 3dTs 2d8s Ah8h"));
  }

  @Test
  public void test_texas_holdem_246_2s4c8sAcKc_4hJh_7cTc_8c2d_3s7d_5dQh_6dJd_Ts8h_7s2c() {
    assertEquals(
      "3s7d 6dJd 5dQh 7s2c 4hJh Ts8h 8c2d 7cTc",
      Solver.process("texas-holdem 2s4c8sAcKc 4hJh 7cTc 8c2d 3s7d 5dQh 6dJd Ts8h 7s2c"));
  }

  @Test
  public void test_texas_holdem_247_2d3d6d7sAd_Tc3s_6s6h_QcKd_5s5c_8s8d() {
    assertEquals(
      "Tc3s 5s5c 6s6h 8s8d QcKd",
      Solver.process("texas-holdem 2d3d6d7sAd Tc3s 6s6h QcKd 5s5c 8s8d"));
  }

  @Test
  public void test_texas_holdem_248_9cJdJsQdQs_2cJc_Th7s_4h4s_6cTc() {
    assertEquals(
      "4h4s 6cTc=Th7s 2cJc",
      Solver.process("texas-holdem 9cJdJsQdQs 2cJc Th7s 4h4s 6cTc"));
  }

  @Test
  public void test_texas_holdem_249_2c2d2s7dQs_8s8d_4c9d_Qc6c_TdAc_Ah7s_5sQh_Qd9s_7cKc_4h5d() {
    assertEquals(
      "4h5d 4c9d TdAc 7cKc=Ah7s 8s8d 5sQh=Qc6c=Qd9s",
      Solver.process("texas-holdem 2c2d2s7dQs 8s8d 4c9d Qc6c TdAc Ah7s 5sQh Qd9s 7cKc 4h5d"));
  }

}
