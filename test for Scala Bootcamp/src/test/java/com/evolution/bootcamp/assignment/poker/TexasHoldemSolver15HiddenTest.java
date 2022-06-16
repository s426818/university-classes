
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver15HiddenTest {


  @Test
  public void test_texas_holdem_3750_9hAcKcKhTc_8d4d_9s2d_AhJs_3dQh_5d9c_Kd3s_Ts6c_AdTh() {
    assertEquals(
      "8d4d 3dQh 5d9c=9s2d Ts6c AdTh AhJs Kd3s",
      Solver.process("texas-holdem 9hAcKcKhTc 8d4d 9s2d AhJs 3dQh 5d9c Kd3s Ts6c AdTh"));
  }

  @Test
  public void test_texas_holdem_3751_3c4s9sAhJc_6s3h_7dQc_AdTd_TcJd_3s5h_9hJs_7h5d() {
    assertEquals(
      "7h5d 7dQc 3s5h=6s3h TcJd AdTd 9hJs",
      Solver.process("texas-holdem 3c4s9sAhJc 6s3h 7dQc AdTd TcJd 3s5h 9hJs 7h5d"));
  }

  @Test
  public void test_texas_holdem_3752_5c6h8c9cKs_AhKh_7cKc_5hTc() {
    assertEquals(
      "5hTc AhKh 7cKc",
      Solver.process("texas-holdem 5c6h8c9cKs AhKh 7cKc 5hTc"));
  }

  @Test
  public void test_texas_holdem_3753_2h3c8cAcTh_9dAh_AsJh_Js5h_4c4d_9h7h_5c8d_6s2s_2dJc() {
    assertEquals(
      "9h7h Js5h 6s2s 2dJc 4c4d 5c8d 9dAh AsJh",
      Solver.process("texas-holdem 2h3c8cAcTh 9dAh AsJh Js5h 4c4d 9h7h 5c8d 6s2s 2dJc"));
  }

  @Test
  public void test_texas_holdem_3754_7d8dJcKhTc_Jd8h_6h6c_4h4c_2c3c_Ts9h() {
    assertEquals(
      "2c3c 4h4c 6h6c Jd8h Ts9h",
      Solver.process("texas-holdem 7d8dJcKhTc Jd8h 6h6c 4h4c 2c3c Ts9h"));
  }

  @Test
  public void test_texas_holdem_3755_2s3d4dAdAs_TsAc_9dQd_Jd9c_Kh4c_7hTc_4hKs() {
    assertEquals(
      "7hTc Jd9c 4hKs=Kh4c TsAc 9dQd",
      Solver.process("texas-holdem 2s3d4dAdAs TsAc 9dQd Jd9c Kh4c 7hTc 4hKs"));
  }

  @Test
  public void test_texas_holdem_3756_3c6dKdQsTh_KhJh_Qd8s_Ah2h_3dAc_8dTs_7hTd_5d5c_2cJc() {
    assertEquals(
      "2cJc Ah2h 3dAc 5d5c 7hTd 8dTs Qd8s KhJh",
      Solver.process("texas-holdem 3c6dKdQsTh KhJh Qd8s Ah2h 3dAc 8dTs 7hTd 5d5c 2cJc"));
  }

  @Test
  public void test_texas_holdem_3757_5h6s8c9cTd_2s6h_7hTs_2c3c_KhQc() {
    assertEquals(
      "2c3c KhQc 2s6h 7hTs",
      Solver.process("texas-holdem 5h6s8c9cTd 2s6h 7hTs 2c3c KhQc"));
  }

  @Test
  public void test_texas_holdem_3758_6s7sAsQdTs_3s2s_4d8c_QsJd() {
    assertEquals(
      "4d8c 3s2s QsJd",
      Solver.process("texas-holdem 6s7sAsQdTs 3s2s 4d8c QsJd"));
  }

  @Test
  public void test_texas_holdem_3759_6s7d8c9hJc_Ad3c_Qs4s_Js5h_4h4d() {
    assertEquals(
      "Qs4s Ad3c 4h4d Js5h",
      Solver.process("texas-holdem 6s7d8c9hJc Ad3c Qs4s Js5h 4h4d"));
  }

  @Test
  public void test_texas_holdem_3760_4s7dAhAsJd_Qd3h_5d9d() {
    assertEquals(
      "5d9d Qd3h",
      Solver.process("texas-holdem 4s7dAhAsJd Qd3h 5d9d"));
  }

  @Test
  public void test_texas_holdem_3761_4c4d5c5sKh_8dJd_9sQh_9dQc_KcTs_2sQs_8cAc_2c7c() {
    assertEquals(
      "2c7c=2sQs=8dJd=9dQc=9sQh 8cAc KcTs",
      Solver.process("texas-holdem 4c4d5c5sKh 8dJd 9sQh 9dQc KcTs 2sQs 8cAc 2c7c"));
  }

  @Test
  public void test_texas_holdem_3762_5d7c7s8cJc_Kd2d_AcJs() {
    assertEquals(
      "Kd2d AcJs",
      Solver.process("texas-holdem 5d7c7s8cJc Kd2d AcJs"));
  }

  @Test
  public void test_texas_holdem_3763_3d6h9hAdTc_3c2s_8sKh_7s6d_Qd8d() {
    assertEquals(
      "Qd8d 8sKh 3c2s 7s6d",
      Solver.process("texas-holdem 3d6h9hAdTc 3c2s 8sKh 7s6d Qd8d"));
  }

  @Test
  public void test_texas_holdem_3764_2h3c7h8h9s_5h7s_Qc6d_AcQh_TsTh_KhAs_TdJc_7dJd_KcJs_Ah4c() {
    assertEquals(
      "Qc6d KcJs Ah4c AcQh KhAs 5h7s 7dJd TsTh TdJc",
      Solver.process("texas-holdem 2h3c7h8h9s 5h7s Qc6d AcQh TsTh KhAs TdJc 7dJd KcJs Ah4c"));
  }

  @Test
  public void test_texas_holdem_3765_2h3c6dAhJc_QhKd_AcTs_ThTc_Jd5s_3h4h_JsKh_8sQs() {
    assertEquals(
      "8sQs QhKd 3h4h ThTc Jd5s JsKh AcTs",
      Solver.process("texas-holdem 2h3c6dAhJc QhKd AcTs ThTc Jd5s 3h4h JsKh 8sQs"));
  }

  @Test
  public void test_texas_holdem_3766_4c4s5d7sTh_8dJc_3dQs() {
    assertEquals(
      "8dJc 3dQs",
      Solver.process("texas-holdem 4c4s5d7sTh 8dJc 3dQs"));
  }

  @Test
  public void test_texas_holdem_3767_4h8sKhQdQs_8c3d_Th2c_AsKc() {
    assertEquals(
      "Th2c 8c3d AsKc",
      Solver.process("texas-holdem 4h8sKhQdQs 8c3d Th2c AsKc"));
  }

  @Test
  public void test_texas_holdem_3768_3h4s5s7hTd_5c5d_KsQs_AcKd_2sKh_AhTc_Kc2d_6cJh_9cQc() {
    assertEquals(
      "9cQc 2sKh=Kc2d KsQs AcKd AhTc 5c5d 6cJh",
      Solver.process("texas-holdem 3h4s5s7hTd 5c5d KsQs AcKd 2sKh AhTc Kc2d 6cJh 9cQc"));
  }

  @Test
  public void test_texas_holdem_3769_3d4c4s6dTc_KsTs_Kh6h_KcJs_Ac7c_5s5c_6s8d_AhJh_8h9h_7d2s() {
    assertEquals(
      "7d2s 8h9h KcJs Ac7c AhJh 5s5c 6s8d Kh6h KsTs",
      Solver.process("texas-holdem 3d4c4s6dTc KsTs Kh6h KcJs Ac7c 5s5c 6s8d AhJh 8h9h 7d2s"));
  }

  @Test
  public void test_texas_holdem_3770_7dJcQcTdTh_6d6s_7c3c_3sAd_QdQh_7s3d_Kc5h_4s7h_Ac2d() {
    assertEquals(
      "Kc5h 3sAd=Ac2d 6d6s 4s7h=7c3c=7s3d QdQh",
      Solver.process("texas-holdem 7dJcQcTdTh 6d6s 7c3c 3sAd QdQh 7s3d Kc5h 4s7h Ac2d"));
  }

  @Test
  public void test_texas_holdem_3771_5d9cQcTcTs_4c9d_2d3h_Js7d_5s7s() {
    assertEquals(
      "2d3h Js7d 5s7s 4c9d",
      Solver.process("texas-holdem 5d9cQcTcTs 4c9d 2d3h Js7d 5s7s"));
  }

  @Test
  public void test_texas_holdem_3772_3c7c9dJdQs_Kc5s_Th4c_2sJh() {
    assertEquals(
      "Th4c Kc5s 2sJh",
      Solver.process("texas-holdem 3c7c9dJdQs Kc5s Th4c 2sJh"));
  }

  @Test
  public void test_texas_holdem_3773_8d8h9cAdJs_2d9s_8cTc_Th6s_9d7s_Kc3d_8s3h_2c7d_Jc5d_6c4h() {
    assertEquals(
      "2c7d=6c4h Th6s Kc3d 2d9s=9d7s Jc5d 8cTc=8s3h",
      Solver.process("texas-holdem 8d8h9cAdJs 2d9s 8cTc Th6s 9d7s Kc3d 8s3h 2c7d Jc5d 6c4h"));
  }

  @Test
  public void test_texas_holdem_3774_2c4h5sKcKd_5h7s_Ad9s_8sQc_As3s_Ah6d_JdTh_Qs2d_TdTs() {
    assertEquals(
      "JdTh 8sQc Ah6d Ad9s Qs2d 5h7s TdTs As3s",
      Solver.process("texas-holdem 2c4h5sKcKd 5h7s Ad9s 8sQc As3s Ah6d JdTh Qs2d TdTs"));
  }

  @Test
  public void test_texas_holdem_3775_4s6c6dAhQs_TsQd_9sAc_9h8h_Jh8s() {
    assertEquals(
      "9h8h Jh8s TsQd 9sAc",
      Solver.process("texas-holdem 4s6c6dAhQs TsQd 9sAc 9h8h Jh8s"));
  }

  @Test
  public void test_texas_holdem_3776_4d4s5cAcTc_Ad3h_Jd5d() {
    assertEquals(
      "Jd5d Ad3h",
      Solver.process("texas-holdem 4d4s5cAcTc Ad3h Jd5d"));
  }

  @Test
  public void test_texas_holdem_3777_8d9sAcQhTh_8c7h_4sJc_6s3s_8h3h_QdAs_6cTd() {
    assertEquals(
      "6s3s 8c7h=8h3h 6cTd QdAs 4sJc",
      Solver.process("texas-holdem 8d9sAcQhTh 8c7h 4sJc 6s3s 8h3h QdAs 6cTd"));
  }

  @Test
  public void test_texas_holdem_3778_2c3d7hQdQh_5sJc_KsAc_Kh9s_7c6s_Js4s_Ts8s_6c2d_5hAd_8dTd() {
    assertEquals(
      "8dTd=Ts8s Js4s 5sJc Kh9s 5hAd KsAc 6c2d 7c6s",
      Solver.process("texas-holdem 2c3d7hQdQh 5sJc KsAc Kh9s 7c6s Js4s Ts8s 6c2d 5hAd 8dTd"));
  }

  @Test
  public void test_texas_holdem_3779_2d7h8cAhJc_KsQd_ThTs_5h3d_Qs6h_6s7d_9s5s_Ad8d_6dKd() {
    assertEquals(
      "5h3d 9s5s Qs6h 6dKd KsQd 6s7d ThTs Ad8d",
      Solver.process("texas-holdem 2d7h8cAhJc KsQd ThTs 5h3d Qs6h 6s7d 9s5s Ad8d 6dKd"));
  }

  @Test
  public void test_texas_holdem_3780_6h7dJcQsTh_8s5d_3c4h_Jd4c_7cTd_9cKc_3s6c() {
    assertEquals(
      "3c4h 8s5d 3s6c Jd4c 7cTd 9cKc",
      Solver.process("texas-holdem 6h7dJcQsTh 8s5d 3c4h Jd4c 7cTd 9cKc 3s6c"));
  }

  @Test
  public void test_texas_holdem_3781_3d7d7sAsTd_3sKc_Qs7h_8dAd_TcAc_6cJc_6hTh_QhKs_5hQd() {
    assertEquals(
      "6cJc 5hQd QhKs 3sKc 6hTh TcAc Qs7h 8dAd",
      Solver.process("texas-holdem 3d7d7sAsTd 3sKc Qs7h 8dAd TcAc 6cJc 6hTh QhKs 5hQd"));
  }

  @Test
  public void test_texas_holdem_3782_2c6c9d9sAc_6h2d_8c4s_Js8d_Qc9h_3dTh_JcKc() {
    assertEquals(
      "8c4s 3dTh Js8d 6h2d Qc9h JcKc",
      Solver.process("texas-holdem 2c6c9d9sAc 6h2d 8c4s Js8d Qc9h 3dTh JcKc"));
  }

  @Test
  public void test_texas_holdem_3783_3s6c6d8dAh_6hAd_Jd5c_7sJh_Ts9h_5d4h_8h8c() {
    assertEquals(
      "5d4h Ts9h 7sJh=Jd5c 6hAd 8h8c",
      Solver.process("texas-holdem 3s6c6d8dAh 6hAd Jd5c 7sJh Ts9h 5d4h 8h8c"));
  }

  @Test
  public void test_texas_holdem_3784_2h4c9dJcTh_4s7c_3c7h_2c2s_3dTc() {
    assertEquals(
      "3c7h 4s7c 3dTc 2c2s",
      Solver.process("texas-holdem 2h4c9dJcTh 4s7c 3c7h 2c2s 3dTc"));
  }

  @Test
  public void test_texas_holdem_3785_2s4s9sJsKs_2d4c_8h2c_Tc8s() {
    assertEquals(
      "2d4c=8h2c Tc8s",
      Solver.process("texas-holdem 2s4s9sJsKs 2d4c 8h2c Tc8s"));
  }

  @Test
  public void test_texas_holdem_3786_7hAdJhKdQc_Ah8s_As5h_9h8d_Td2h_7s6c_JcTs() {
    assertEquals(
      "9h8d 7s6c Ah8s=As5h JcTs=Td2h",
      Solver.process("texas-holdem 7hAdJhKdQc Ah8s As5h 9h8d Td2h 7s6c JcTs"));
  }

  @Test
  public void test_texas_holdem_3787_2h5h6dKdTc_9d9s_3dKh_KcKs_AhTh_Js7s_7h2d_3h4c() {
    assertEquals(
      "Js7s 7h2d 9d9s AhTh 3dKh KcKs 3h4c",
      Solver.process("texas-holdem 2h5h6dKdTc 9d9s 3dKh KcKs AhTh Js7s 7h2d 3h4c"));
  }

  @Test
  public void test_texas_holdem_3788_5h8hAdKhKs_QhJd_7cQd_8cTd() {
    assertEquals(
      "7cQd QhJd 8cTd",
      Solver.process("texas-holdem 5h8hAdKhKs QhJd 7cQd 8cTd"));
  }

  @Test
  public void test_texas_holdem_3789_2s6dAdQdTs_2h2d_AsQc() {
    assertEquals(
      "AsQc 2h2d",
      Solver.process("texas-holdem 2s6dAdQdTs 2h2d AsQc"));
  }

  @Test
  public void test_texas_holdem_3790_2c3d6d6h7c_4s7s_Jh2h_3sQc_Tc8d_5h7h_AdQd_Qs5c_Jc2s_Qh3c() {
    assertEquals(
      "Tc8d Qs5c AdQd Jc2s=Jh2h 3sQc=Qh3c 4s7s 5h7h",
      Solver.process("texas-holdem 2c3d6d6h7c 4s7s Jh2h 3sQc Tc8d 5h7h AdQd Qs5c Jc2s Qh3c"));
  }

  @Test
  public void test_texas_holdem_3791_2h5h8dKsTs_9sKh_5d3c_6cAs_9h2c_9cAd_9d4h_8sTc_6sJd_2s4c() {
    assertEquals(
      "9d4h 6sJd 6cAs 9cAd 2s4c 9h2c 5d3c 9sKh 8sTc",
      Solver.process("texas-holdem 2h5h8dKsTs 9sKh 5d3c 6cAs 9h2c 9cAd 9d4h 8sTc 6sJd 2s4c"));
  }

  @Test
  public void test_texas_holdem_3792_6d7cAdJdJs_2cJh_Kd3h_8s6h_4h5d_7s7h_Jc6c_9sQd_4s8c_2h2d() {
    assertEquals(
      "4h5d 4s8c 9sQd Kd3h 2h2d 8s6h 2cJh 7s7h Jc6c",
      Solver.process("texas-holdem 6d7cAdJdJs 2cJh Kd3h 8s6h 4h5d 7s7h Jc6c 9sQd 4s8c 2h2d"));
  }

  @Test
  public void test_texas_holdem_3793_5c8d9cAsQd_Jc5s_2cTd_7sQs_9d4d_6dQc_5h2s_8h7d() {
    assertEquals(
      "2cTd 5h2s Jc5s 8h7d 9d4d 6dQc=7sQs",
      Solver.process("texas-holdem 5c8d9cAsQd Jc5s 2cTd 7sQs 9d4d 6dQc 5h2s 8h7d"));
  }

  @Test
  public void test_texas_holdem_3794_2d4d4h9dTc_Jh3h_5s8c_KdAc_8s7c_7h5d_Jd5c() {
    assertEquals(
      "7h5d 5s8c=8s7c Jd5c=Jh3h KdAc",
      Solver.process("texas-holdem 2d4d4h9dTc Jh3h 5s8c KdAc 8s7c 7h5d Jd5c"));
  }

  @Test
  public void test_texas_holdem_3795_3h7s8hKdTh_8cJs_QsKh_4d3d_5c6s_3c2h() {
    assertEquals(
      "5c6s 3c2h=4d3d 8cJs QsKh",
      Solver.process("texas-holdem 3h7s8hKdTh 8cJs QsKh 4d3d 5c6s 3c2h"));
  }

  @Test
  public void test_texas_holdem_3796_4s7h8dJhQc_9d9s_6sKh_TdJs_8c6c() {
    assertEquals(
      "6sKh 8c6c 9d9s TdJs",
      Solver.process("texas-holdem 4s7h8dJhQc 9d9s 6sKh TdJs 8c6c"));
  }

  @Test
  public void test_texas_holdem_3797_3d8dAdJhTs_5d6c_9hAc_8s5h_Kd6d_5sKc_9cTc() {
    assertEquals(
      "5d6c 5sKc 8s5h 9cTc 9hAc Kd6d",
      Solver.process("texas-holdem 3d8dAdJhTs 5d6c 9hAc 8s5h Kd6d 5sKc 9cTc"));
  }

  @Test
  public void test_texas_holdem_3798_2d8cAcAdKh_4c7d_8s5d() {
    assertEquals(
      "4c7d 8s5d",
      Solver.process("texas-holdem 2d8cAcAdKh 4c7d 8s5d"));
  }

  @Test
  public void test_texas_holdem_3799_5s8c8dTdTs_5d2c_Ks7s_KcJd_AdQd_KdKh_6h9h_5h4d_8sJc_2dTh() {
    assertEquals(
      "5d2c=5h4d 6h9h KcJd=Ks7s AdQd KdKh 8sJc 2dTh",
      Solver.process("texas-holdem 5s8c8dTdTs 5d2c Ks7s KcJd AdQd KdKh 6h9h 5h4d 8sJc 2dTh"));
  }

  @Test
  public void test_texas_holdem_3800_3c3d5c7dKs_6cJc_7hKd_Th2s_6s4s_4d5s_AdQd() {
    assertEquals(
      "Th2s 6cJc AdQd 4d5s 7hKd 6s4s",
      Solver.process("texas-holdem 3c3d5c7dKs 6cJc 7hKd Th2s 6s4s 4d5s AdQd"));
  }

  @Test
  public void test_texas_holdem_3801_3h4c6d9sTc_9h3s_Ah8c_3dQc_KdQs_Jc3c_9d7s() {
    assertEquals(
      "KdQs Ah8c Jc3c 3dQc 9d7s 9h3s",
      Solver.process("texas-holdem 3h4c6d9sTc 9h3s Ah8c 3dQc KdQs Jc3c 9d7s"));
  }

  @Test
  public void test_texas_holdem_3802_6s8cAcKsQs_Ts6c_QdKh_Ad7c_3d3h_4c9s() {
    assertEquals(
      "4c9s 3d3h Ts6c Ad7c QdKh",
      Solver.process("texas-holdem 6s8cAcKsQs Ts6c QdKh Ad7c 3d3h 4c9s"));
  }

  @Test
  public void test_texas_holdem_3803_2c2dJcKhTd_3d8d_6s3c_7c8h_ThJh_7d6c() {
    assertEquals(
      "3d8d=6s3c=7c8h=7d6c ThJh",
      Solver.process("texas-holdem 2c2dJcKhTd 3d8d 6s3c 7c8h ThJh 7d6c"));
  }

  @Test
  public void test_texas_holdem_3804_3c3h8d9hAd_2cJc_8c5s_KcKh_3s4c_8hTs_5h2s() {
    assertEquals(
      "5h2s 2cJc 8c5s=8hTs KcKh 3s4c",
      Solver.process("texas-holdem 3c3h8d9hAd 2cJc 8c5s KcKh 3s4c 8hTs 5h2s"));
  }

  @Test
  public void test_texas_holdem_3805_2s4sAcAsJh_6sAh_7c3s_Ts6c_7sTc_7dKh() {
    assertEquals(
      "7c3s Ts6c 7sTc 7dKh 6sAh",
      Solver.process("texas-holdem 2s4sAcAsJh 6sAh 7c3s Ts6c 7sTc 7dKh"));
  }

  @Test
  public void test_texas_holdem_3806_5c8sQdTcTh_7hTs_9h6d_2sAs_8h3c_KhKs() {
    assertEquals(
      "9h6d 2sAs 8h3c KhKs 7hTs",
      Solver.process("texas-holdem 5c8sQdTcTh 7hTs 9h6d 2sAs 8h3c KhKs"));
  }

  @Test
  public void test_texas_holdem_3807_2h4d5h6hKs_9d7d_Qh7h_QcQd_AdAs_2sJd_Ac5d_Tc9c_Jc3s() {
    assertEquals(
      "9d7d Tc9c 2sJd Ac5d QcQd AdAs Jc3s Qh7h",
      Solver.process("texas-holdem 2h4d5h6hKs 9d7d Qh7h QcQd AdAs 2sJd Ac5d Tc9c Jc3s"));
  }

  @Test
  public void test_texas_holdem_3808_2s4dAcThTs_5s7s_Qd8c_6dJs_5c3c_Qc2d() {
    assertEquals(
      "5s7s 6dJs Qd8c Qc2d 5c3c",
      Solver.process("texas-holdem 2s4dAcThTs 5s7s Qd8c 6dJs 5c3c Qc2d"));
  }

  @Test
  public void test_texas_holdem_3809_7d9sAsJcQc_Ah9c_4s7h_Qd6d_Kd4h() {
    assertEquals(
      "Kd4h 4s7h Qd6d Ah9c",
      Solver.process("texas-holdem 7d9sAsJcQc Ah9c 4s7h Qd6d Kd4h"));
  }

  @Test
  public void test_texas_holdem_3810_2h2s5cKcTh_6cAh_4c8d_JhQc_Js7c_Jd5s_Ks9h() {
    assertEquals(
      "4c8d Js7c JhQc 6cAh Jd5s Ks9h",
      Solver.process("texas-holdem 2h2s5cKcTh 6cAh 4c8d JhQc Js7c Jd5s Ks9h"));
  }

  @Test
  public void test_texas_holdem_3811_5s6s9cTdTs_6h7c_5h6c_Ad4d_3d9s_Jc4h_JdQh_5cTc_Ac4s() {
    assertEquals(
      "Jc4h JdQh Ac4s=Ad4d 5h6c=6h7c 3d9s 5cTc",
      Solver.process("texas-holdem 5s6s9cTdTs 6h7c 5h6c Ad4d 3d9s Jc4h JdQh 5cTc Ac4s"));
  }

  @Test
  public void test_texas_holdem_3812_2h7hKsQsTc_3hTd_7s5d() {
    assertEquals(
      "7s5d 3hTd",
      Solver.process("texas-holdem 2h7hKsQsTc 3hTd 7s5d"));
  }

  @Test
  public void test_texas_holdem_3813_3d7h7sAsQh_2hKc_Kh9c_6cKd_Qd4s_8h8d_7d2c_6s3c_Jh6h_6d3s() {
    assertEquals(
      "Jh6h 2hKc=6cKd=Kh9c 6d3s=6s3c 8h8d Qd4s 7d2c",
      Solver.process("texas-holdem 3d7h7sAsQh 2hKc Kh9c 6cKd Qd4s 8h8d 7d2c 6s3c Jh6h 6d3s"));
  }

  @Test
  public void test_texas_holdem_3814_2c3s5sKdKh_7s2d_4d8c_JsTs() {
    assertEquals(
      "4d8c JsTs 7s2d",
      Solver.process("texas-holdem 2c3s5sKdKh 7s2d 4d8c JsTs"));
  }

  @Test
  public void test_texas_holdem_3815_5d6s8cAhKd_QdAs_7s8h_Ac7d_Ts8s_4d3h_3sKc_JsJd() {
    assertEquals(
      "4d3h 7s8h Ts8s JsJd 3sKc Ac7d QdAs",
      Solver.process("texas-holdem 5d6s8cAhKd QdAs 7s8h Ac7d Ts8s 4d3h 3sKc JsJd"));
  }

  @Test
  public void test_texas_holdem_3816_4c6c6d6sJs_8h6h_Jh2c_8c2s_KdKs() {
    assertEquals(
      "8c2s Jh2c KdKs 8h6h",
      Solver.process("texas-holdem 4c6c6d6sJs 8h6h Jh2c 8c2s KdKs"));
  }

  @Test
  public void test_texas_holdem_3817_2h3d4d8dTs_8h8s_Kh5d_5h3s_9sJd_2c3h_QsQd() {
    assertEquals(
      "9sJd Kh5d 5h3s QsQd 2c3h 8h8s",
      Solver.process("texas-holdem 2h3d4d8dTs 8h8s Kh5d 5h3s 9sJd 2c3h QsQd"));
  }

  @Test
  public void test_texas_holdem_3818_3s6s7hKdTc_4c6d_As6c_4sAc() {
    assertEquals(
      "4sAc 4c6d As6c",
      Solver.process("texas-holdem 3s6s7hKdTc 4c6d As6c 4sAc"));
  }

  @Test
  public void test_texas_holdem_3819_3d3s6cAcQd_Jh2d_5hQh_5d2s() {
    assertEquals(
      "5d2s Jh2d 5hQh",
      Solver.process("texas-holdem 3d3s6cAcQd Jh2d 5hQh 5d2s"));
  }

  @Test
  public void test_texas_holdem_3820_2h5c5h7sTc_Kc4c_Qs2c_Jd6s_Jh6d() {
    assertEquals(
      "Jd6s=Jh6d Kc4c Qs2c",
      Solver.process("texas-holdem 2h5c5h7sTc Kc4c Qs2c Jd6s Jh6d"));
  }

  @Test
  public void test_texas_holdem_3821_3sAdAhJcTs_3hJs_6c4h_8d7h() {
    assertEquals(
      "6c4h 8d7h 3hJs",
      Solver.process("texas-holdem 3sAdAhJcTs 3hJs 6c4h 8d7h"));
  }

  @Test
  public void test_texas_holdem_3822_4s6c7h8sAh_KsQc_JdTc_2sJc_2c8h_4c3h_Kh6d_9d7d() {
    assertEquals(
      "2sJc JdTc KsQc 4c3h Kh6d 9d7d 2c8h",
      Solver.process("texas-holdem 4s6c7h8sAh KsQc JdTc 2sJc 2c8h 4c3h Kh6d 9d7d"));
  }

  @Test
  public void test_texas_holdem_3823_4d4s6s7cAs_4c9d_QhJd_9hKd_ThJc() {
    assertEquals(
      "ThJc QhJd 9hKd 4c9d",
      Solver.process("texas-holdem 4d4s6s7cAs 4c9d QhJd 9hKd ThJc"));
  }

  @Test
  public void test_texas_holdem_3824_2h3s6s7dAh_TdTs_Ad2c_8s8d() {
    assertEquals(
      "8s8d TdTs Ad2c",
      Solver.process("texas-holdem 2h3s6s7dAh TdTs Ad2c 8s8d"));
  }

  @Test
  public void test_texas_holdem_3825_2d5s7sJdTd_Js7d_9d9s() {
    assertEquals(
      "9d9s Js7d",
      Solver.process("texas-holdem 2d5s7sJdTd Js7d 9d9s"));
  }

  @Test
  public void test_texas_holdem_3826_3d6h8sJdTh_4h3s_QdAh_AdJc() {
    assertEquals(
      "QdAh 4h3s AdJc",
      Solver.process("texas-holdem 3d6h8sJdTh 4h3s QdAh AdJc"));
  }

  @Test
  public void test_texas_holdem_3827_3c8cJhQcTd_3dQd_Qh2h_KhJc_7h6s_6d5s_Ks2c_9dTh() {
    assertEquals(
      "6d5s 7h6s Ks2c KhJc Qh2h 3dQd 9dTh",
      Solver.process("texas-holdem 3c8cJhQcTd 3dQd Qh2h KhJc 7h6s 6d5s Ks2c 9dTh"));
  }

  @Test
  public void test_texas_holdem_3828_7d9cAsJhQh_4c2s_Jd6h_4h5c_QdTc_Kd6d_QcQs_4dAc() {
    assertEquals(
      "4c2s=4h5c Kd6d Jd6h QdTc 4dAc QcQs",
      Solver.process("texas-holdem 7d9cAsJhQh 4c2s Jd6h 4h5c QdTc Kd6d QcQs 4dAc"));
  }

  @Test
  public void test_texas_holdem_3829_8c8hAsQhTh_3c2h_Kd4h_7s5s() {
    assertEquals(
      "3c2h=7s5s Kd4h",
      Solver.process("texas-holdem 8c8hAsQhTh 3c2h Kd4h 7s5s"));
  }

  @Test
  public void test_texas_holdem_3830_3c6dAhJsQd_3d3h_Ts8s_JdTh_Jh9c_As5h_6cQh() {
    assertEquals(
      "Ts8s Jh9c JdTh As5h 6cQh 3d3h",
      Solver.process("texas-holdem 3c6dAhJsQd 3d3h Ts8s JdTh Jh9c As5h 6cQh"));
  }

  @Test
  public void test_texas_holdem_3831_2c4h4s7sAd_6d9h_9s3s_2dTh_6sKh() {
    assertEquals(
      "6d9h=9s3s 6sKh 2dTh",
      Solver.process("texas-holdem 2c4h4s7sAd 6d9h 9s3s 2dTh 6sKh"));
  }

  @Test
  public void test_texas_holdem_3832_3d6s7dKsTh_9s5s_QcAc_7sAd_6c9d() {
    assertEquals(
      "9s5s QcAc 6c9d 7sAd",
      Solver.process("texas-holdem 3d6s7dKsTh 9s5s QcAc 7sAd 6c9d"));
  }

  @Test
  public void test_texas_holdem_3833_AcAhJhJsQc_TdQh_4d8s_9h2d_3sQd_AsKc_6hTh() {
    assertEquals(
      "4d8s=6hTh=9h2d 3sQd=TdQh AsKc",
      Solver.process("texas-holdem AcAhJhJsQc TdQh 4d8s 9h2d 3sQd AsKc 6hTh"));
  }

  @Test
  public void test_texas_holdem_3834_5h6c7dKdQs_Jd2d_AcKh() {
    assertEquals(
      "Jd2d AcKh",
      Solver.process("texas-holdem 5h6c7dKdQs Jd2d AcKh"));
  }

  @Test
  public void test_texas_holdem_3835_4h4s5c5h7d_Jh3h_9s6h_Qc2s_JsKd_8h9d_8dQh_Jc8s_3sKs_Kc7s() {
    assertEquals(
      "8h9d=9s6h Jc8s=Jh3h 8dQh=Qc2s 3sKs=JsKd Kc7s",
      Solver.process("texas-holdem 4h4s5c5h7d Jh3h 9s6h Qc2s JsKd 8h9d 8dQh Jc8s 3sKs Kc7s"));
  }

  @Test
  public void test_texas_holdem_3836_2s6c6h8hQc_9d7h_ThKd_As2h_7dQh_4hJh() {
    assertEquals(
      "9d7h 4hJh ThKd As2h 7dQh",
      Solver.process("texas-holdem 2s6c6h8hQc 9d7h ThKd As2h 7dQh 4hJh"));
  }

  @Test
  public void test_texas_holdem_3837_2h6d9c9d9h_8hAd_3dJd_2sJh_6s8c_8d3c_5c7d_2d5h() {
    assertEquals(
      "5c7d 8d3c 3dJd 8hAd 2d5h=2sJh 6s8c",
      Solver.process("texas-holdem 2h6d9c9d9h 8hAd 3dJd 2sJh 6s8c 8d3c 5c7d 2d5h"));
  }

  @Test
  public void test_texas_holdem_3838_4s7c9cAcKc_8sKd_Jd3d_2c6c_Ks5h_AhAs_9h3c_8h4d_TsKh() {
    assertEquals(
      "Jd3d 8h4d Ks5h 8sKd TsKh AhAs 9h3c 2c6c",
      Solver.process("texas-holdem 4s7c9cAcKc 8sKd Jd3d 2c6c Ks5h AhAs 9h3c 8h4d TsKh"));
  }

  @Test
  public void test_texas_holdem_3839_2h3d5d6s7s_Qd3s_8d9d() {
    assertEquals(
      "Qd3s 8d9d",
      Solver.process("texas-holdem 2h3d5d6s7s Qd3s 8d9d"));
  }

  @Test
  public void test_texas_holdem_3840_2h3d7h8s9c_3c6d_Qs6h_Ts2s_7sTc() {
    assertEquals(
      "Qs6h Ts2s 3c6d 7sTc",
      Solver.process("texas-holdem 2h3d7h8s9c 3c6d Qs6h Ts2s 7sTc"));
  }

  @Test
  public void test_texas_holdem_3841_7h8c9cAsQs_2c5d_Ad7s_3h7c_8s6s_6c6h_8d9h() {
    assertEquals(
      "2c5d 6c6h 3h7c 8s6s 8d9h Ad7s",
      Solver.process("texas-holdem 7h8c9cAsQs 2c5d Ad7s 3h7c 8s6s 6c6h 8d9h"));
  }

  @Test
  public void test_texas_holdem_3842_3c7dJdKdKs_TsQh_9c7h_Ad3h_6cQs_KcQd_4dAc_Kh8h_2h5c_4s8s() {
    assertEquals(
      "2h5c 4s8s 6cQs TsQh 4dAc Ad3h 9c7h Kh8h KcQd",
      Solver.process("texas-holdem 3c7dJdKdKs TsQh 9c7h Ad3h 6cQs KcQd 4dAc Kh8h 2h5c 4s8s"));
  }

  @Test
  public void test_texas_holdem_3843_4c5d6h8cJc_Qh8h_JsQd() {
    assertEquals(
      "Qh8h JsQd",
      Solver.process("texas-holdem 4c5d6h8cJc Qh8h JsQd"));
  }

  @Test
  public void test_texas_holdem_3844_3h4h6c6h8s_9c4s_8c8d_QcJc_Td9h_Th2h() {
    assertEquals(
      "Td9h QcJc 9c4s Th2h 8c8d",
      Solver.process("texas-holdem 3h4h6c6h8s 9c4s 8c8d QcJc Td9h Th2h"));
  }

  @Test
  public void test_texas_holdem_3845_2d5c7hKhTc_6d4s_QsQc() {
    assertEquals(
      "6d4s QsQc",
      Solver.process("texas-holdem 2d5c7hKhTc 6d4s QsQc"));
  }

  @Test
  public void test_texas_holdem_3846_3h6s9cAhTh_5h8s_5s4s_4d7d_9h2h_KdKc() {
    assertEquals(
      "5s4s 4d7d 5h8s KdKc 9h2h",
      Solver.process("texas-holdem 3h6s9cAhTh 5h8s 5s4s 4d7d 9h2h KdKc"));
  }

  @Test
  public void test_texas_holdem_3847_9cJcJhKsTc_3s4h_Ah4s_QsAs_9sQc_6c8c_2d6d_Td9h() {
    assertEquals(
      "2d6d=3s4h Ah4s Td9h 9sQc QsAs 6c8c",
      Solver.process("texas-holdem 9cJcJhKsTc 3s4h Ah4s QsAs 9sQc 6c8c 2d6d Td9h"));
  }

  @Test
  public void test_texas_holdem_3848_7c9sKcQcTd_5s2d_7dAh_Jd7h_6d5c_Ac3c_4sAs_6hTs() {
    assertEquals(
      "5s2d=6d5c 4sAs 7dAh 6hTs Jd7h Ac3c",
      Solver.process("texas-holdem 7c9sKcQcTd 5s2d 7dAh Jd7h 6d5c Ac3c 4sAs 6hTs"));
  }

  @Test
  public void test_texas_holdem_3849_6d7dJdKdKh_9c2c_5c5s_8h6s() {
    assertEquals(
      "9c2c 5c5s 8h6s",
      Solver.process("texas-holdem 6d7dJdKdKh 9c2c 5c5s 8h6s"));
  }

  @Test
  public void test_texas_holdem_3850_5h7c7h8hKc_9hQs_4hAd_7sQd_6hKd() {
    assertEquals(
      "9hQs 4hAd 6hKd 7sQd",
      Solver.process("texas-holdem 5h7c7h8hKc 9hQs 4hAd 7sQd 6hKd"));
  }

  @Test
  public void test_texas_holdem_3851_2c5c7sKsTc_7c6c_8c4h() {
    assertEquals(
      "8c4h 7c6c",
      Solver.process("texas-holdem 2c5c7sKsTc 7c6c 8c4h"));
  }

  @Test
  public void test_texas_holdem_3852_4c4d7hQsTd_ThKd_4h6c_5dAs_Ah7d() {
    assertEquals(
      "5dAs Ah7d ThKd 4h6c",
      Solver.process("texas-holdem 4c4d7hQsTd ThKd 4h6c 5dAs Ah7d"));
  }

  @Test
  public void test_texas_holdem_3853_4d6c6s9hAh_8sQd_4h5d_6d2s_As2d_Qh8c_Js9d_8hQs() {
    assertEquals(
      "8hQs=8sQd=Qh8c 4h5d Js9d As2d 6d2s",
      Solver.process("texas-holdem 4d6c6s9hAh 8sQd 4h5d 6d2s As2d Qh8c Js9d 8hQs"));
  }

  @Test
  public void test_texas_holdem_3854_2c5d8c8d9s_Ac9d_7c6c_Ts2h_9cQc_5hQs() {
    assertEquals(
      "Ts2h 5hQs 9cQc Ac9d 7c6c",
      Solver.process("texas-holdem 2c5d8c8d9s Ac9d 7c6c Ts2h 9cQc 5hQs"));
  }

  @Test
  public void test_texas_holdem_3855_2c3c4dAcTc_4s7c_9s4c_Kd3s_Jc6h_Ah5c_JsJd_Ad2s_9h8d_TsQc() {
    assertEquals(
      "9h8d Kd3s JsJd Ad2s 9s4c Ah5c 4s7c Jc6h TsQc",
      Solver.process("texas-holdem 2c3c4dAcTc 4s7c 9s4c Kd3s Jc6h Ah5c JsJd Ad2s 9h8d TsQc"));
  }

  @Test
  public void test_texas_holdem_3856_5h9cJcKhTc_Th6h_Kd2h() {
    assertEquals(
      "Th6h Kd2h",
      Solver.process("texas-holdem 5h9cJcKhTc Th6h Kd2h"));
  }

  @Test
  public void test_texas_holdem_3857_6c6dAsQhTd_4d8s_6h4h_3dAd_7hJd_2sKh() {
    assertEquals(
      "4d8s 7hJd 2sKh 3dAd 6h4h",
      Solver.process("texas-holdem 6c6dAsQhTd 4d8s 6h4h 3dAd 7hJd 2sKh"));
  }

  @Test
  public void test_texas_holdem_3858_2h3c4cQsTh_Qc7h_2d9s_8c6c_Ah4d_8h6s_TcTs() {
    assertEquals(
      "8c6c=8h6s 2d9s Ah4d Qc7h TcTs",
      Solver.process("texas-holdem 2h3c4cQsTh Qc7h 2d9s 8c6c Ah4d 8h6s TcTs"));
  }

  @Test
  public void test_texas_holdem_3859_3d3s9dAsTd_4cQh_Js9c_5h5d_8sAh_8cTs_Kh6s_Ad7c_8dJc_6cTc() {
    assertEquals(
      "8dJc 4cQh Kh6s 5h5d Js9c 6cTc=8cTs 8sAh=Ad7c",
      Solver.process("texas-holdem 3d3s9dAsTd 4cQh Js9c 5h5d 8sAh 8cTs Kh6s Ad7c 8dJc 6cTc"));
  }

  @Test
  public void test_texas_holdem_3860_4s6s7h8sQs_Tc3h_2dJh_8hAc_5hAh_5s2h_9c6h_9sKh_Qc6c() {
    assertEquals(
      "Tc3h 2dJh 9c6h 8hAc Qc6c 5hAh 5s2h 9sKh",
      Solver.process("texas-holdem 4s6s7h8sQs Tc3h 2dJh 8hAc 5hAh 5s2h 9c6h 9sKh Qc6c"));
  }

  @Test
  public void test_texas_holdem_3861_3d8d9dAcQs_5cTs_QdTc_7s6c_6d8h() {
    assertEquals(
      "7s6c 5cTs 6d8h QdTc",
      Solver.process("texas-holdem 3d8d9dAcQs 5cTs QdTc 7s6c 6d8h"));
  }

  @Test
  public void test_texas_holdem_3862_2d3s5h9c9h_3hJs_QdKc_8hAd_Qc2h_2sTc() {
    assertEquals(
      "QdKc 8hAd 2sTc Qc2h 3hJs",
      Solver.process("texas-holdem 2d3s5h9c9h 3hJs QdKc 8hAd Qc2h 2sTc"));
  }

  @Test
  public void test_texas_holdem_3863_4h7d7h8d9s_5d4d_5h9d_As3h_3d9h_2s8h_TdTh() {
    assertEquals(
      "As3h 5d4d 2s8h 3d9h=5h9d TdTh",
      Solver.process("texas-holdem 4h7d7h8d9s 5d4d 5h9d As3h 3d9h 2s8h TdTh"));
  }

  @Test
  public void test_texas_holdem_3864_6s7dQcQdQh_JhAh_Kc3d_5dJd_6cJc_2dQs_3c7h() {
    assertEquals(
      "5dJd Kc3d JhAh 6cJc 3c7h 2dQs",
      Solver.process("texas-holdem 6s7dQcQdQh JhAh Kc3d 5dJd 6cJc 2dQs 3c7h"));
  }

  @Test
  public void test_texas_holdem_3865_3h4c5dAcKh_Qs9c_Kd7h_Qd6h_Tc2s_TdQc_7d2d_8cAh() {
    assertEquals(
      "Qd6h Qs9c TdQc Kd7h 8cAh 7d2d=Tc2s",
      Solver.process("texas-holdem 3h4c5dAcKh Qs9c Kd7h Qd6h Tc2s TdQc 7d2d 8cAh"));
  }

  @Test
  public void test_texas_holdem_3866_3c4s5c5d8d_2c3h_7hKc_4d6s_KsJh_3s3d_7d7s_Tc7c_5sJd_2h2d() {
    assertEquals(
      "Tc7c 7hKc KsJh 2h2d 2c3h 4d6s 7d7s 5sJd 3s3d",
      Solver.process("texas-holdem 3c4s5c5d8d 2c3h 7hKc 4d6s KsJh 3s3d 7d7s Tc7c 5sJd 2h2d"));
  }

  @Test
  public void test_texas_holdem_3867_4s5s6d7sQd_6sTs_3c3h_4cKd_5d8c_As9d_JcJd_2h9s_QsKs_2sQc() {
    assertEquals(
      "2h9s As9d 4cKd JcJd 2sQc 3c3h 5d8c 6sTs QsKs",
      Solver.process("texas-holdem 4s5s6d7sQd 6sTs 3c3h 4cKd 5d8c As9d JcJd 2h9s QsKs 2sQc"));
  }

  @Test
  public void test_texas_holdem_3868_3c6h9cAsQc_8hAc_2d3s_3dKs_AhQh_4d7d_9s9h_5d7h_9dKc_6dTd() {
    assertEquals(
      "4d7d=5d7h 2d3s 3dKs 6dTd 9dKc 8hAc AhQh 9s9h",
      Solver.process("texas-holdem 3c6h9cAsQc 8hAc 2d3s 3dKs AhQh 4d7d 9s9h 5d7h 9dKc 6dTd"));
  }

  @Test
  public void test_texas_holdem_3869_3sJcJdJsTs_8h9d_8d4s() {
    assertEquals(
      "8d4s 8h9d",
      Solver.process("texas-holdem 3sJcJdJsTs 8h9d 8d4s"));
  }

  @Test
  public void test_texas_holdem_3870_4c6h7d9sQd_Js2s_8h2h_4d2c_JcKc_TsQs() {
    assertEquals(
      "8h2h Js2s JcKc 4d2c TsQs",
      Solver.process("texas-holdem 4c6h7d9sQd Js2s 8h2h 4d2c JcKc TsQs"));
  }

  @Test
  public void test_texas_holdem_3871_7c7h7s8sQh_3h8h_8cJc_Td5s_6hAc() {
    assertEquals(
      "Td5s 6hAc 3h8h=8cJc",
      Solver.process("texas-holdem 7c7h7s8sQh 3h8h 8cJc Td5s 6hAc"));
  }

  @Test
  public void test_texas_holdem_3872_3h4c6d8cKh_6s4d_JhQc_3s8h_Th2h_7hJd_3cQd_2s6c_QhKc() {
    assertEquals(
      "Th2h 7hJd JhQc 3cQd 2s6c QhKc 6s4d 3s8h",
      Solver.process("texas-holdem 3h4c6d8cKh 6s4d JhQc 3s8h Th2h 7hJd 3cQd 2s6c QhKc"));
  }

  @Test
  public void test_texas_holdem_3873_2s5dAhJdQs_Kc6h_7dKd_Jh8d() {
    assertEquals(
      "Kc6h 7dKd Jh8d",
      Solver.process("texas-holdem 2s5dAhJdQs Kc6h 7dKd Jh8d"));
  }

  @Test
  public void test_texas_holdem_3874_6c9sAdJcJh_Kc4d_7h6s_Qd2c_6hQs_QcTh_Ah9h_5c8d_8s3s() {
    assertEquals(
      "5c8d=8s3s Qd2c QcTh Kc4d 6hQs=7h6s Ah9h",
      Solver.process("texas-holdem 6c9sAdJcJh Kc4d 7h6s Qd2c 6hQs QcTh Ah9h 5c8d 8s3s"));
  }

  @Test
  public void test_texas_holdem_3875_4h5c6h9sQd_Jc5s_3s3c_JsJh_ThTs_JdAh_8h9h_Kh8s() {
    assertEquals(
      "Kh8s JdAh 3s3c Jc5s 8h9h ThTs JsJh",
      Solver.process("texas-holdem 4h5c6h9sQd Jc5s 3s3c JsJh ThTs JdAh 8h9h Kh8s"));
  }

  @Test
  public void test_texas_holdem_3876_2s3d4d7hQs_2c6h_TdKd_Qc9h_2hTs_AhJc_Th3s() {
    assertEquals(
      "TdKd AhJc 2c6h 2hTs Th3s Qc9h",
      Solver.process("texas-holdem 2s3d4d7hQs 2c6h TdKd Qc9h 2hTs AhJc Th3s"));
  }

  @Test
  public void test_texas_holdem_3877_2s5c5d9hAs_3h8d_9cKd_Qd2c_3d9d_6s6c_6hAd_9sQh_2dJh() {
    assertEquals(
      "3h8d 2dJh=Qd2c 6s6c 3d9d=9cKd=9sQh 6hAd",
      Solver.process("texas-holdem 2s5c5d9hAs 3h8d 9cKd Qd2c 3d9d 6s6c 6hAd 9sQh 2dJh"));
  }

  @Test
  public void test_texas_holdem_3878_4d7c9cAsQd_8sQc_8c3d_2c4c_5h8h_2d8d_JhKs_TsKc_7sAh_6h6c() {
    assertEquals(
      "2d8d=5h8h=8c3d TsKc JhKs 2c4c 6h6c 8sQc 7sAh",
      Solver.process("texas-holdem 4d7c9cAsQd 8sQc 8c3d 2c4c 5h8h 2d8d JhKs TsKc 7sAh 6h6c"));
  }

  @Test
  public void test_texas_holdem_3879_4hAcAhAsJs_9c3s_TdTh_7d4s_Jh9s_2d6s_6cKc_Jc2h_Ks2c_Qh2s() {
    assertEquals(
      "2d6s 9c3s Qh2s 6cKc=Ks2c 7d4s TdTh Jc2h=Jh9s",
      Solver.process("texas-holdem 4hAcAhAsJs 9c3s TdTh 7d4s Jh9s 2d6s 6cKc Jc2h Ks2c Qh2s"));
  }

  @Test
  public void test_texas_holdem_3880_2h4d5c7d9d_Th2c_6sTs_Ah6c_4s3d_5hKd_9hAc_6h3s_4cJh_3c7s() {
    assertEquals(
      "6sTs Ah6c Th2c 4s3d 4cJh 5hKd 3c7s 9hAc 6h3s",
      Solver.process("texas-holdem 2h4d5c7d9d Th2c 6sTs Ah6c 4s3d 5hKd 9hAc 6h3s 4cJh 3c7s"));
  }

  @Test
  public void test_texas_holdem_3881_4h5h8cJsQd_2sTd_4c3s() {
    assertEquals(
      "2sTd 4c3s",
      Solver.process("texas-holdem 4h5h8cJsQd 2sTd 4c3s"));
  }

  @Test
  public void test_texas_holdem_3882_2c4c5c6sQc_Kh4d_9hJd_6c8s() {
    assertEquals(
      "9hJd Kh4d 6c8s",
      Solver.process("texas-holdem 2c4c5c6sQc Kh4d 9hJd 6c8s"));
  }

  @Test
  public void test_texas_holdem_3883_8cJhKcKsTc_Ad5h_Ts7d_2hAs_KhJd_3s7s_AcTd_6s7h() {
    assertEquals(
      "3s7s=6s7h 2hAs=Ad5h Ts7d AcTd KhJd",
      Solver.process("texas-holdem 8cJhKcKsTc Ad5h Ts7d 2hAs KhJd 3s7s AcTd 6s7h"));
  }

  @Test
  public void test_texas_holdem_3884_2s3d3sJcKs_4s8s_9c3h_Tc7d_ThAh_2hKh_4c6s() {
    assertEquals(
      "4c6s Tc7d ThAh 2hKh 9c3h 4s8s",
      Solver.process("texas-holdem 2s3d3sJcKs 4s8s 9c3h Tc7d ThAh 2hKh 4c6s"));
  }

  @Test
  public void test_texas_holdem_3885_4c6c9c9hJh_8cKs_Kh7s_Qh4h_6sAc_5d3h_Jd2h_TcQd() {
    assertEquals(
      "5d3h TcQd Kh7s 8cKs Qh4h 6sAc Jd2h",
      Solver.process("texas-holdem 4c6c9c9hJh 8cKs Kh7s Qh4h 6sAc 5d3h Jd2h TcQd"));
  }

  @Test
  public void test_texas_holdem_3886_5d6h6s7h8d_2hTd_7d3h_7sAs() {
    assertEquals(
      "2hTd 7d3h 7sAs",
      Solver.process("texas-holdem 5d6h6s7h8d 2hTd 7d3h 7sAs"));
  }

  @Test
  public void test_texas_holdem_3887_7h9d9sJsQs_2s9c_Th4c_Qd5h() {
    assertEquals(
      "Th4c Qd5h 2s9c",
      Solver.process("texas-holdem 7h9d9sJsQs 2s9c Th4c Qd5h"));
  }

  @Test
  public void test_texas_holdem_3888_2d6dAdJsTd_KsJh_3s9s_5cQs_3d3c_6hQd_QcKh_Ah6s() {
    assertEquals(
      "3s9s 5cQs KsJh Ah6s QcKh 3d3c 6hQd",
      Solver.process("texas-holdem 2d6dAdJsTd KsJh 3s9s 5cQs 3d3c 6hQd QcKh Ah6s"));
  }

  @Test
  public void test_texas_holdem_3889_2h3d4d6d7c_2s6c_8d6s_9s9d_5sAc_2c4h_KdJh() {
    assertEquals(
      "KdJh 8d6s 9s9d 2c4h 2s6c 5sAc",
      Solver.process("texas-holdem 2h3d4d6d7c 2s6c 8d6s 9s9d 5sAc 2c4h KdJh"));
  }

  @Test
  public void test_texas_holdem_3890_2c5c5s7h9d_6h4d_9s2d_ThTc_4s8s_Js4h_5dQc_Ts7c_8hKd_6cJd() {
    assertEquals(
      "6h4d 4s8s 6cJd=Js4h 8hKd Ts7c 9s2d ThTc 5dQc",
      Solver.process("texas-holdem 2c5c5s7h9d 6h4d 9s2d ThTc 4s8s Js4h 5dQc Ts7c 8hKd 6cJd"));
  }

  @Test
  public void test_texas_holdem_3891_2d5c7sAcTs_4dQh_2cTc_Jd7d_Jc5h_Th9d_8d9h_9s2s_3h4h_As7c() {
    assertEquals(
      "8d9h 4dQh 9s2s Jc5h Jd7d Th9d 2cTc As7c 3h4h",
      Solver.process("texas-holdem 2d5c7sAcTs 4dQh 2cTc Jd7d Jc5h Th9d 8d9h 9s2s 3h4h As7c"));
  }

  @Test
  public void test_texas_holdem_3892_5s7dAhQsTd_Ad2s_3c2c() {
    assertEquals(
      "3c2c Ad2s",
      Solver.process("texas-holdem 5s7dAhQsTd Ad2s 3c2c"));
  }

  @Test
  public void test_texas_holdem_3893_4c6hJhJsQc_Td8s_8hKd_2cAs_Jd3s_3hQh_3dAh_8c9c() {
    assertEquals(
      "8c9c Td8s 8hKd 2cAs=3dAh 3hQh Jd3s",
      Solver.process("texas-holdem 4c6hJhJsQc Td8s 8hKd 2cAs Jd3s 3hQh 3dAh 8c9c"));
  }

  @Test
  public void test_texas_holdem_3894_6s7d8hKsTh_Kh8s_Tc9c_5dKc_JsQh_5c2d_4h3d_7hTs() {
    assertEquals(
      "4h3d=5c2d JsQh 5dKc 7hTs Kh8s Tc9c",
      Solver.process("texas-holdem 6s7d8hKsTh Kh8s Tc9c 5dKc JsQh 5c2d 4h3d 7hTs"));
  }

  @Test
  public void test_texas_holdem_3895_2s3d5cKcQc_2c8c_7h4c_8dTd_6sKs_4sJh_2hTs_3sQh_Ac4d_QsQd() {
    assertEquals(
      "7h4c 8dTd 4sJh 2hTs 6sKs 3sQh QsQd Ac4d 2c8c",
      Solver.process("texas-holdem 2s3d5cKcQc 2c8c 7h4c 8dTd 6sKs 4sJh 2hTs 3sQh Ac4d QsQd"));
  }

  @Test
  public void test_texas_holdem_3896_6hAcJhKhQs_4c7c_4hAh_KdJc_7d2d_2c9h_Th2h() {
    assertEquals(
      "4c7c=7d2d 2c9h KdJc Th2h 4hAh",
      Solver.process("texas-holdem 6hAcJhKhQs 4c7c 4hAh KdJc 7d2d 2c9h Th2h"));
  }

  @Test
  public void test_texas_holdem_3897_3s4s9dJcJs_2cAc_6s6h_ThJd_8sAs() {
    assertEquals(
      "2cAc 6s6h ThJd 8sAs",
      Solver.process("texas-holdem 3s4s9dJcJs 2cAc 6s6h ThJd 8sAs"));
  }

  @Test
  public void test_texas_holdem_3898_2d7d8cKhTd_6c7s_5s8h() {
    assertEquals(
      "6c7s 5s8h",
      Solver.process("texas-holdem 2d7d8cKhTd 6c7s 5s8h"));
  }

  @Test
  public void test_texas_holdem_3899_2h9d9sQcQd_Jh3h_7sJc_QsTc_3c7c_Ad8s_7hKd_5d6c() {
    assertEquals(
      "5d6c 3c7c 7sJc=Jh3h 7hKd Ad8s QsTc",
      Solver.process("texas-holdem 2h9d9sQcQd Jh3h 7sJc QsTc 3c7c Ad8s 7hKd 5d6c"));
  }

  @Test
  public void test_texas_holdem_3900_9cJhQcThTs_Kh7d_6cAd_4sQs_9h4c_3hJc_9sTd() {
    assertEquals(
      "6cAd 9h4c 3hJc 4sQs Kh7d 9sTd",
      Solver.process("texas-holdem 9cJhQcThTs Kh7d 6cAd 4sQs 9h4c 3hJc 9sTd"));
  }

  @Test
  public void test_texas_holdem_3901_3c3s4c6sJc_Ks5d_9h5h_TsQh_2hJh_Kd5c_Jd8h_JsAs() {
    assertEquals(
      "9h5h TsQh Kd5c=Ks5d 2hJh Jd8h JsAs",
      Solver.process("texas-holdem 3c3s4c6sJc Ks5d 9h5h TsQh 2hJh Kd5c Jd8h JsAs"));
  }

  @Test
  public void test_texas_holdem_3902_3h5c6cAcQc_Tc2h_7c7s_QdKh_8h7h_9c4s() {
    assertEquals(
      "8h7h QdKh 7c7s 9c4s Tc2h",
      Solver.process("texas-holdem 3h5c6cAcQc Tc2h 7c7s QdKh 8h7h 9c4s"));
  }

  @Test
  public void test_texas_holdem_3903_3d6h7d7hAs_5dQc_TdKc_6s9d_8s6d_Qh9s_3s3h() {
    assertEquals(
      "5dQc Qh9s TdKc 6s9d=8s6d 3s3h",
      Solver.process("texas-holdem 3d6h7d7hAs 5dQc TdKc 6s9d 8s6d Qh9s 3s3h"));
  }

  @Test
  public void test_texas_holdem_3904_2h5c7cAsQd_Qh7s_JhJc_3s9s_6hTs_9h5s_Ks3d() {
    assertEquals(
      "3s9s 6hTs Ks3d 9h5s JhJc Qh7s",
      Solver.process("texas-holdem 2h5c7cAsQd Qh7s JhJc 3s9s 6hTs 9h5s Ks3d"));
  }

  @Test
  public void test_texas_holdem_3905_2s4s9dAsTh_8c6d_Qc7c_Qd3h_2d5s_Ah3c_2hAc_KsQh_8sTc() {
    assertEquals(
      "8c6d Qd3h Qc7c KsQh 2d5s 8sTc Ah3c 2hAc",
      Solver.process("texas-holdem 2s4s9dAsTh 8c6d Qc7c Qd3h 2d5s Ah3c 2hAc KsQh 8sTc"));
  }

  @Test
  public void test_texas_holdem_3906_2d8c8h8sAs_Td6s_5h5d() {
    assertEquals(
      "Td6s 5h5d",
      Solver.process("texas-holdem 2d8c8h8sAs Td6s 5h5d"));
  }

  @Test
  public void test_texas_holdem_3907_2c5c5hJsTc_5sQc_8cJc() {
    assertEquals(
      "5sQc 8cJc",
      Solver.process("texas-holdem 2c5c5hJsTc 5sQc 8cJc"));
  }

  @Test
  public void test_texas_holdem_3908_4d4s8c9dJc_2sKs_2h7c_4cTh_5h3c() {
    assertEquals(
      "2h7c=5h3c 2sKs 4cTh",
      Solver.process("texas-holdem 4d4s8c9dJc 2sKs 2h7c 4cTh 5h3c"));
  }

  @Test
  public void test_texas_holdem_3909_3s5s6sJsKc_Kh4d_4hTh_QdJd_8cKd_2cQh_7c3c_9h2s() {
    assertEquals(
      "4hTh 2cQh 7c3c QdJd Kh4d 8cKd 9h2s",
      Solver.process("texas-holdem 3s5s6sJsKc Kh4d 4hTh QdJd 8cKd 2cQh 7c3c 9h2s"));
  }

  @Test
  public void test_texas_holdem_3910_6h7h7sJcTc_7dKh_Ks8d_Td2c_9c3h_3d9s() {
    assertEquals(
      "3d9s=9c3h Ks8d Td2c 7dKh",
      Solver.process("texas-holdem 6h7h7sJcTc 7dKh Ks8d Td2c 9c3h 3d9s"));
  }

  @Test
  public void test_texas_holdem_3911_3d6h7c9dQh_4d2s_TcTh_8s5s_8h7d_8dQd_9hQc_2h7h() {
    assertEquals(
      "4d2s 2h7h 8h7d TcTh 8dQd 9hQc 8s5s",
      Solver.process("texas-holdem 3d6h7c9dQh 4d2s TcTh 8s5s 8h7d 8dQd 9hQc 2h7h"));
  }

  @Test
  public void test_texas_holdem_3912_5s6dJdKsTc_7s3h_4h9s() {
    assertEquals(
      "7s3h 4h9s",
      Solver.process("texas-holdem 5s6dJdKsTc 7s3h 4h9s"));
  }

  @Test
  public void test_texas_holdem_3913_5d6d7cJdQh_Ts3d_4cAc_9h9d_8d4d_QcKc_7d6c_3cAd() {
    assertEquals(
      "Ts3d 3cAd=4cAc 9h9d QcKc 7d6c 8d4d",
      Solver.process("texas-holdem 5d6d7cJdQh Ts3d 4cAc 9h9d 8d4d QcKc 7d6c 3cAd"));
  }

  @Test
  public void test_texas_holdem_3914_3c7d8dQcTd_2c2s_2dKh_7hJc_7s6d() {
    assertEquals(
      "2dKh 2c2s 7s6d 7hJc",
      Solver.process("texas-holdem 3c7d8dQcTd 2c2s 2dKh 7hJc 7s6d"));
  }

  @Test
  public void test_texas_holdem_3915_7cAdKcQsTd_6h2d_8cQh_8sJd_5hQd_4sJh() {
    assertEquals(
      "6h2d 5hQd=8cQh 4sJh=8sJd",
      Solver.process("texas-holdem 7cAdKcQsTd 6h2d 8cQh 8sJd 5hQd 4sJh"));
  }

  @Test
  public void test_texas_holdem_3916_2h4sAcQcQd_JsTc_6dTd_3dKc_3s2s_2c2d_Ks7d() {
    assertEquals(
      "6dTd JsTc 3dKc Ks7d 3s2s 2c2d",
      Solver.process("texas-holdem 2h4sAcQcQd JsTc 6dTd 3dKc 3s2s 2c2d Ks7d"));
  }

  @Test
  public void test_texas_holdem_3917_3c3hKdKsQd_8dQs_4cAd() {
    assertEquals(
      "4cAd 8dQs",
      Solver.process("texas-holdem 3c3hKdKsQd 8dQs 4cAd"));
  }

  @Test
  public void test_texas_holdem_3918_2d6d8h9cJc_Kd4c_5s3d_4dJd_TcTs_Qd3h_4hKs_3s9d() {
    assertEquals(
      "5s3d Qd3h 4hKs=Kd4c 3s9d TcTs 4dJd",
      Solver.process("texas-holdem 2d6d8h9cJc Kd4c 5s3d 4dJd TcTs Qd3h 4hKs 3s9d"));
  }

  @Test
  public void test_texas_holdem_3919_3d4hAhQsTd_3h3s_5c6c_As8d() {
    assertEquals(
      "5c6c As8d 3h3s",
      Solver.process("texas-holdem 3d4hAhQsTd 3h3s 5c6c As8d"));
  }

  @Test
  public void test_texas_holdem_3920_5c5d8hAhTh_9sKh_7dJd_8dJc() {
    assertEquals(
      "7dJd 9sKh 8dJc",
      Solver.process("texas-holdem 5c5d8hAhTh 9sKh 7dJd 8dJc"));
  }

  @Test
  public void test_texas_holdem_3921_3h6c6s9dQd_Qs8c_4d6d_8d7s_KhKc_7h7d_5c4c_Js9h_Ad7c_6h8h() {
    assertEquals(
      "5c4c 8d7s Ad7c 7h7d Js9h Qs8c KhKc 4d6d=6h8h",
      Solver.process("texas-holdem 3h6c6s9dQd Qs8c 4d6d 8d7s KhKc 7h7d 5c4c Js9h Ad7c 6h8h"));
  }

  @Test
  public void test_texas_holdem_3922_3h4d5sAhQd_KsJs_7c8c_9d5h_2c7h_6dKc_3cAs() {
    assertEquals(
      "7c8c 6dKc KsJs 9d5h 3cAs 2c7h",
      Solver.process("texas-holdem 3h4d5sAhQd KsJs 7c8c 9d5h 2c7h 6dKc 3cAs"));
  }

  @Test
  public void test_texas_holdem_3923_2c5s6cAsKs_Ac6d_8d4d_Tc3c() {
    assertEquals(
      "8d4d Tc3c Ac6d",
      Solver.process("texas-holdem 2c5s6cAsKs Ac6d 8d4d Tc3c"));
  }

  @Test
  public void test_texas_holdem_3924_2s3c4c5dJd_2dQc_ThTd_8h7d_4d9s() {
    assertEquals(
      "8h7d 2dQc 4d9s ThTd",
      Solver.process("texas-holdem 2s3c4c5dJd 2dQc ThTd 8h7d 4d9s"));
  }

  @Test
  public void test_texas_holdem_3925_2s3d6s8sTd_Qc6d_Tc2h() {
    assertEquals(
      "Qc6d Tc2h",
      Solver.process("texas-holdem 2s3d6s8sTd Qc6d Tc2h"));
  }

  @Test
  public void test_texas_holdem_3926_2hAhJhKdTd_3sJs_AcTh_6dKh_6sTs_4cQs() {
    assertEquals(
      "6sTs 3sJs 6dKh AcTh 4cQs",
      Solver.process("texas-holdem 2hAhJhKdTd 3sJs AcTh 6dKh 6sTs 4cQs"));
  }

  @Test
  public void test_texas_holdem_3927_3s4d8sJsQh_3dKd_7s4s() {
    assertEquals(
      "3dKd 7s4s",
      Solver.process("texas-holdem 3s4d8sJsQh 3dKd 7s4s"));
  }

  @Test
  public void test_texas_holdem_3928_2hAcAhAsQs_KsQc_4h5c_Jh6d_9cAd_9d6h_TcQh() {
    assertEquals(
      "4h5c 9d6h Jh6d KsQc=TcQh 9cAd",
      Solver.process("texas-holdem 2hAcAhAsQs KsQc 4h5c Jh6d 9cAd 9d6h TcQh"));
  }

  @Test
  public void test_texas_holdem_3929_5c8c8d9cQc_AdJc_Td3s_KhKc_9sQh_5s2c_9h8s_6h3d_6dJd() {
    assertEquals(
      "6h3d Td3s 6dJd 9sQh 5s2c AdJc KhKc 9h8s",
      Solver.process("texas-holdem 5c8c8d9cQc AdJc Td3s KhKc 9sQh 5s2c 9h8s 6h3d 6dJd"));
  }

  @Test
  public void test_texas_holdem_3930_4c5s6c7hAc_5dAs_Jc4s_7sKh_QdAh_5c8s_AdQc() {
    assertEquals(
      "Jc4s 7sKh AdQc=QdAh 5dAs 5c8s",
      Solver.process("texas-holdem 4c5s6c7hAc 5dAs Jc4s 7sKh QdAh 5c8s AdQc"));
  }

  @Test
  public void test_texas_holdem_3931_2c5d8cKsQc_9hTc_7hTs_2d5c_4cTh_6hKh_5s8d_Ac4h_QhJh() {
    assertEquals(
      "4cTh 7hTs 9hTc Ac4h QhJh 6hKh 2d5c 5s8d",
      Solver.process("texas-holdem 2c5d8cKsQc 9hTc 7hTs 2d5c 4cTh 6hKh 5s8d Ac4h QhJh"));
  }

  @Test
  public void test_texas_holdem_3932_6h8d8hAhKc_8c3h_5hQd_KhJc_9d4h() {
    assertEquals(
      "9d4h 5hQd KhJc 8c3h",
      Solver.process("texas-holdem 6h8d8hAhKc 8c3h 5hQd KhJc 9d4h"));
  }

  @Test
  public void test_texas_holdem_3933_3d4c4d5s9s_3hQs_Ac2h_JdQd_Tc7s_9c3s_8s9h() {
    assertEquals(
      "Tc7s JdQd 3hQs 9c3s 8s9h Ac2h",
      Solver.process("texas-holdem 3d4c4d5s9s 3hQs Ac2h JdQd Tc7s 9c3s 8s9h"));
  }

  @Test
  public void test_texas_holdem_3934_2d4dJcKcTc_5cTd_AdJs() {
    assertEquals(
      "5cTd AdJs",
      Solver.process("texas-holdem 2d4dJcKcTc 5cTd AdJs"));
  }

  @Test
  public void test_texas_holdem_3935_3c7h8hAcKc_2hJh_7d3d_9s2s_6c5s_KhTh_Qd5c_9d9h_JsQs_As6h() {
    assertEquals(
      "6c5s 9s2s 2hJh Qd5c JsQs 9d9h KhTh As6h 7d3d",
      Solver.process("texas-holdem 3c7h8hAcKc 2hJh 7d3d 9s2s 6c5s KhTh Qd5c 9d9h JsQs As6h"));
  }

  @Test
  public void test_texas_holdem_3936_3c3s6c6hKh_8dTc_2dTh_9d8s_Td4d_Jc9s_4s5h_6s7h() {
    assertEquals(
      "2dTh=4s5h=8dTc=9d8s=Jc9s=Td4d 6s7h",
      Solver.process("texas-holdem 3c3s6c6hKh 8dTc 2dTh 9d8s Td4d Jc9s 4s5h 6s7h"));
  }

  @Test
  public void test_texas_holdem_3937_3c4s5s9cQs_6sQc_KhQh_Jc7h_AdQd_8dTc_2s6c_2h7s() {
    assertEquals(
      "2h7s 8dTc Jc7h 6sQc KhQh AdQd 2s6c",
      Solver.process("texas-holdem 3c4s5s9cQs 6sQc KhQh Jc7h AdQd 8dTc 2s6c 2h7s"));
  }

  @Test
  public void test_texas_holdem_3938_3d5sKcKhQh_Jc3s_9h9c_6d5h_4c4d() {
    assertEquals(
      "Jc3s 4c4d 6d5h 9h9c",
      Solver.process("texas-holdem 3d5sKcKhQh Jc3s 9h9c 6d5h 4c4d"));
  }

  @Test
  public void test_texas_holdem_3939_3c3h3s6sTh_2s6h_Jd4c_Jh8h_4hKd_7hJs_5cTs() {
    assertEquals(
      "7hJs=Jd4c=Jh8h 4hKd 2s6h 5cTs",
      Solver.process("texas-holdem 3c3h3s6sTh 2s6h Jd4c Jh8h 4hKd 7hJs 5cTs"));
  }

  @Test
  public void test_texas_holdem_3940_2h7c9c9sJc_5c4s_Th4h_2d7d_8d9d_Td5s() {
    assertEquals(
      "5c4s Td5s=Th4h 2d7d 8d9d",
      Solver.process("texas-holdem 2h7c9c9sJc 5c4s Th4h 2d7d 8d9d Td5s"));
  }

  @Test
  public void test_texas_holdem_3941_2s5cAcKhQh_7hQc_8c3d_QdAh_2c8d_6d4s_QsKs_JdTc() {
    assertEquals(
      "6d4s 8c3d 2c8d 7hQc QsKs QdAh JdTc",
      Solver.process("texas-holdem 2s5cAcKhQh 7hQc 8c3d QdAh 2c8d 6d4s QsKs JdTc"));
  }

  @Test
  public void test_texas_holdem_3942_8h9cAhJcJh_7c6h_9h6c_7d5d_Ks9s() {
    assertEquals(
      "7c6h=7d5d 9h6c=Ks9s",
      Solver.process("texas-holdem 8h9cAhJcJh 7c6h 9h6c 7d5d Ks9s"));
  }

  @Test
  public void test_texas_holdem_3943_3s5c6c8dTs_Kc7c_8cQh_5hKd_AhQc_TdTc_9d9h_KhJs() {
    assertEquals(
      "Kc7c KhJs AhQc 5hKd 8cQh 9d9h TdTc",
      Solver.process("texas-holdem 3s5c6c8dTs Kc7c 8cQh 5hKd AhQc TdTc 9d9h KhJs"));
  }

  @Test
  public void test_texas_holdem_3944_4h6dJsQcQd_8d7h_7sKd_5sKh_4s5d_8hJd_9s7c() {
    assertEquals(
      "8d7h 9s7c 5sKh 7sKd 4s5d 8hJd",
      Solver.process("texas-holdem 4h6dJsQcQd 8d7h 7sKd 5sKh 4s5d 8hJd 9s7c"));
  }

  @Test
  public void test_texas_holdem_3945_2d3d8sAcTd_3s4d_5h3c_Kh4s_TsQs_5c4h_6h9h() {
    assertEquals(
      "6h9h Kh4s 3s4d=5h3c TsQs 5c4h",
      Solver.process("texas-holdem 2d3d8sAcTd 3s4d 5h3c Kh4s TsQs 5c4h 6h9h"));
  }

  @Test
  public void test_texas_holdem_3946_3h4c4hQcTs_6s9d_2hKc_AhTh_Jc2c() {
    assertEquals(
      "6s9d Jc2c 2hKc AhTh",
      Solver.process("texas-holdem 3h4c4hQcTs 6s9d 2hKc AhTh Jc2c"));
  }

  @Test
  public void test_texas_holdem_3947_3c4s7hAdAs_Kc9d_3dJh_4d5c_9h4c_Tc5h_4h7d_Ks9s_Qh6c_JsTs() {
    assertEquals(
      "Tc5h JsTs Qh6c Kc9d=Ks9s 3dJh 4d5c 9h4c 4h7d",
      Solver.process("texas-holdem 3c4s7hAdAs Kc9d 3dJh 4d5c 9h4c Tc5h 4h7d Ks9s Qh6c JsTs"));
  }

  @Test
  public void test_texas_holdem_3948_2h4h5d7cJc_7s8h_5s9h_QcKh_AsTh_3s2c() {
    assertEquals(
      "QcKh AsTh 3s2c 5s9h 7s8h",
      Solver.process("texas-holdem 2h4h5d7cJc 7s8h 5s9h QcKh AsTh 3s2c"));
  }

  @Test
  public void test_texas_holdem_3949_9d9sAsJcKc_4d7h_2hTd_TcJd_7cKd() {
    assertEquals(
      "2hTd=4d7h TcJd 7cKd",
      Solver.process("texas-holdem 9d9sAsJcKc 4d7h 2hTd TcJd 7cKd"));
  }

  @Test
  public void test_texas_holdem_3950_5d5h6c9sJd_2s8h_8sTs_KcQh_9d6s_7d6d_8dTd_6h9h_2c3s_Js5s() {
    assertEquals(
      "2c3s 2s8h 8dTd=8sTs KcQh 7d6d 6h9h=9d6s Js5s",
      Solver.process("texas-holdem 5d5h6c9sJd 2s8h 8sTs KcQh 9d6s 7d6d 8dTd 6h9h 2c3s Js5s"));
  }

  @Test
  public void test_texas_holdem_3951_2s9hJcJhQd_7sKc_Ts6d_Kd3s_3d5d_7dAd_4cJd_JsKh() {
    assertEquals(
      "3d5d Ts6d 7sKc=Kd3s 7dAd 4cJd JsKh",
      Solver.process("texas-holdem 2s9hJcJhQd 7sKc Ts6d Kd3s 3d5d 7dAd 4cJd JsKh"));
  }

  @Test
  public void test_texas_holdem_3952_3d6hAhQdTc_5c9c_9h2d_Jc2c() {
    assertEquals(
      "5c9c=9h2d Jc2c",
      Solver.process("texas-holdem 3d6hAhQdTc 5c9c 9h2d Jc2c"));
  }

  @Test
  public void test_texas_holdem_3953_2d3d3s4d5h_3hTs_Kc9h() {
    assertEquals(
      "Kc9h 3hTs",
      Solver.process("texas-holdem 2d3d3s4d5h 3hTs Kc9h"));
  }

  @Test
  public void test_texas_holdem_3954_3d8s9hQsTs_Qh4c_2sJh_8d5h_Jc7h_Kd3h_5s6h_Ks3c_2d4d_Ah9c() {
    assertEquals(
      "2d4d 5s6h Kd3h=Ks3c 8d5h Ah9c Qh4c 2sJh=Jc7h",
      Solver.process("texas-holdem 3d8s9hQsTs Qh4c 2sJh 8d5h Jc7h Kd3h 5s6h Ks3c 2d4d Ah9c"));
  }

  @Test
  public void test_texas_holdem_3955_3d3s7h8s9d_6d4c_Kh7s_Jh7c_8cQh_Tc2c_9h3c_5h4d_9c6c() {
    assertEquals(
      "5h4d=6d4c Tc2c Jh7c Kh7s 8cQh 9c6c 9h3c",
      Solver.process("texas-holdem 3d3s7h8s9d 6d4c Kh7s Jh7c 8cQh Tc2c 9h3c 5h4d 9c6c"));
  }

  @Test
  public void test_texas_holdem_3956_2s6cJdQdTd_3hQs_JhJs_Ad5d() {
    assertEquals(
      "3hQs JhJs Ad5d",
      Solver.process("texas-holdem 2s6cJdQdTd 3hQs JhJs Ad5d"));
  }

  @Test
  public void test_texas_holdem_3957_2c2d4d5s8h_3c9s_5h6d_KdJs_Qd6c_3h6s_Kh9c_Jc9h_Ks9d_QcTh() {
    assertEquals(
      "3c9s Jc9h Qd6c QcTh Kh9c=Ks9d KdJs 5h6d 3h6s",
      Solver.process("texas-holdem 2c2d4d5s8h 3c9s 5h6d KdJs Qd6c 3h6s Kh9c Jc9h Ks9d QcTh"));
  }

  @Test
  public void test_texas_holdem_3958_4h5c7s9c9d_ThKh_JdAc_Ah7h_6hAs_3cKd() {
    assertEquals(
      "3cKd ThKh 6hAs JdAc Ah7h",
      Solver.process("texas-holdem 4h5c7s9c9d ThKh JdAc Ah7h 6hAs 3cKd"));
  }

  @Test
  public void test_texas_holdem_3959_7c7d8sKdKh_3dKc_Ad9c_3cTc_Ts4c_Jh9d_6sAs() {
    assertEquals(
      "3cTc=Ts4c Jh9d 6sAs=Ad9c 3dKc",
      Solver.process("texas-holdem 7c7d8sKdKh 3dKc Ad9c 3cTc Ts4c Jh9d 6sAs"));
  }

  @Test
  public void test_texas_holdem_3960_3h4d5sJhKh_5h7c_TcAs_6c6s_3cQh_Ks7d_TsAd_2s5d_9h9d_6hQc() {
    assertEquals(
      "6hQc TcAs=TsAd 3cQh 2s5d 5h7c 6c6s 9h9d Ks7d",
      Solver.process("texas-holdem 3h4d5sJhKh 5h7c TcAs 6c6s 3cQh Ks7d TsAd 2s5d 9h9d 6hQc"));
  }

  @Test
  public void test_texas_holdem_3961_7h7sAdJhQd_6c4c_KdAc() {
    assertEquals(
      "6c4c KdAc",
      Solver.process("texas-holdem 7h7sAdJhQd 6c4c KdAc"));
  }

  @Test
  public void test_texas_holdem_3962_6h7cAdJdQd_As7h_5s4d_JsQc_9d9c_8c9s_8h2s() {
    assertEquals(
      "5s4d 8h2s 8c9s 9d9c JsQc As7h",
      Solver.process("texas-holdem 6h7cAdJdQd As7h 5s4d JsQc 9d9c 8c9s 8h2s"));
  }

  @Test
  public void test_texas_holdem_3963_2d8sAcKhTh_6dJc_8c2c_9cTd_4s9s() {
    assertEquals(
      "4s9s 6dJc 9cTd 8c2c",
      Solver.process("texas-holdem 2d8sAcKhTh 6dJc 8c2c 9cTd 4s9s"));
  }

  @Test
  public void test_texas_holdem_3964_4h6c7cAdJh_9s2d_7d3c_3hAs() {
    assertEquals(
      "9s2d 7d3c 3hAs",
      Solver.process("texas-holdem 4h6c7cAdJh 9s2d 7d3c 3hAs"));
  }

  @Test
  public void test_texas_holdem_3965_8c8hJdKhQh_Ks7d_AcAs_2sTh_2d4d_6s7s_Qd5h_8s2h() {
    assertEquals(
      "2d4d=2sTh=6s7s Qd5h Ks7d AcAs 8s2h",
      Solver.process("texas-holdem 8c8hJdKhQh Ks7d AcAs 2sTh 2d4d 6s7s Qd5h 8s2h"));
  }

  @Test
  public void test_texas_holdem_3966_3h3s9sJsTs_5cKc_Kh6d_Qc4c_6h8s() {
    assertEquals(
      "Qc4c 5cKc=Kh6d 6h8s",
      Solver.process("texas-holdem 3h3s9sJsTs 5cKc Kh6d Qc4c 6h8s"));
  }

  @Test
  public void test_texas_holdem_3967_3s5dAcKhTh_3c4c_2hJh_Tc2d_9d4h_7h7c_8dTs_Jc2c_3hAs() {
    assertEquals(
      "9d4h 2hJh=Jc2c 3c4c 7h7c Tc2d 8dTs 3hAs",
      Solver.process("texas-holdem 3s5dAcKhTh 3c4c 2hJh Tc2d 9d4h 7h7c 8dTs Jc2c 3hAs"));
  }

  @Test
  public void test_texas_holdem_3968_3c3s5s9cTs_3h3d_Qh6s_Kd8s_Jc8d() {
    assertEquals(
      "Jc8d Qh6s Kd8s 3h3d",
      Solver.process("texas-holdem 3c3s5s9cTs 3h3d Qh6s Kd8s Jc8d"));
  }

  @Test
  public void test_texas_holdem_3969_2c5d6d6sQh_6h8d_Th3d_8c9s_3cQs_TsKc() {
    assertEquals(
      "8c9s Th3d TsKc 3cQs 6h8d",
      Solver.process("texas-holdem 2c5d6d6sQh 6h8d Th3d 8c9s 3cQs TsKc"));
  }

  @Test
  public void test_texas_holdem_3970_5s7cAhAsQc_Th4c_6c9h_2dJs_9s4h_JdQs_Td2c_6s6h_2h6d() {
    assertEquals(
      "2h6d 6c9h=9s4h Td2c=Th4c 2dJs 6s6h JdQs",
      Solver.process("texas-holdem 5s7cAhAsQc Th4c 6c9h 2dJs 9s4h JdQs Td2c 6s6h 2h6d"));
  }

  @Test
  public void test_texas_holdem_3971_2d2h6cJsTd_3h7d_2c7h_KsQs() {
    assertEquals(
      "3h7d KsQs 2c7h",
      Solver.process("texas-holdem 2d2h6cJsTd 3h7d 2c7h KsQs"));
  }

  @Test
  public void test_texas_holdem_3972_3c5h6c6dTs_8d4d_Js4s_5c2d() {
    assertEquals(
      "8d4d Js4s 5c2d",
      Solver.process("texas-holdem 3c5h6c6dTs 8d4d Js4s 5c2d"));
  }

  @Test
  public void test_texas_holdem_3973_2c4c4sAsTc_7d5h_Qd7s_Qc5c_7hQs() {
    assertEquals(
      "7d5h 7hQs=Qd7s Qc5c",
      Solver.process("texas-holdem 2c4c4sAsTc 7d5h Qd7s Qc5c 7hQs"));
  }

  @Test
  public void test_texas_holdem_3974_2d3s8dJdQd_9cAc_Ks2s_4d5s_Ah5d_Qc8c_Ad7c() {
    assertEquals(
      "9cAc Ks2s Qc8c 4d5s Ah5d Ad7c",
      Solver.process("texas-holdem 2d3s8dJdQd 9cAc Ks2s 4d5s Ah5d Qc8c Ad7c"));
  }

  @Test
  public void test_texas_holdem_3975_3c4h5s8hQh_2h6d_Jh4c_As6h() {
    assertEquals(
      "As6h Jh4c 2h6d",
      Solver.process("texas-holdem 3c4h5s8hQh 2h6d Jh4c As6h"));
  }

  @Test
  public void test_texas_holdem_3976_2h4c9cAhAs_Th5h_9d8s_2c5d_7d4h_6cTc_3d4d() {
    assertEquals(
      "Th5h 6cTc 2c5d 3d4d=7d4h 9d8s",
      Solver.process("texas-holdem 2h4c9cAhAs Th5h 9d8s 2c5d 7d4h 6cTc 3d4d"));
  }

  @Test
  public void test_texas_holdem_3977_3s7c8dJcKd_5d5s_7sQc_2dQs_2cKc() {
    assertEquals(
      "2dQs 5d5s 7sQc 2cKc",
      Solver.process("texas-holdem 3s7c8dJcKd 5d5s 7sQc 2dQs 2cKc"));
  }

  @Test
  public void test_texas_holdem_3978_3s6h8h9hKc_4h4c_2h7h_Qc5d() {
    assertEquals(
      "Qc5d 4h4c 2h7h",
      Solver.process("texas-holdem 3s6h8h9hKc 4h4c 2h7h Qc5d"));
  }

  @Test
  public void test_texas_holdem_3979_3h5s9hKdTs_7c3d_Kh4h_Qd8h_6hJh_2dKs_9cQs_JcQc_ThJs_4s8s() {
    assertEquals(
      "4s8s 6hJh Qd8h 7c3d 9cQs ThJs 2dKs=Kh4h JcQc",
      Solver.process("texas-holdem 3h5s9hKdTs 7c3d Kh4h Qd8h 6hJh 2dKs 9cQs JcQc ThJs 4s8s"));
  }

  @Test
  public void test_texas_holdem_3980_5c8cAcAhJc_6hTs_4s3c_Tc4c_Qc9d_QsTh_AsAd_6cJd_8sTd_KdKh() {
    assertEquals(
      "6hTs QsTh 8sTd KdKh 4s3c 6cJd Tc4c Qc9d AsAd",
      Solver.process("texas-holdem 5c8cAcAhJc 6hTs 4s3c Tc4c Qc9d QsTh AsAd 6cJd 8sTd KdKh"));
  }

  @Test
  public void test_texas_holdem_3981_3h6c6h7hQh_5cJs_4dAs_JdQd_5d6s_9c3d_8hKh_TdJh_4sJc() {
    assertEquals(
      "4sJc=5cJs 4dAs 9c3d JdQd 5d6s TdJh 8hKh",
      Solver.process("texas-holdem 3h6c6h7hQh 5cJs 4dAs JdQd 5d6s 9c3d 8hKh TdJh 4sJc"));
  }

  @Test
  public void test_texas_holdem_3982_4c4d6c9dTh_2dJd_5c5s_3d3s_KhTc_8hQs() {
    assertEquals(
      "2dJd 8hQs 3d3s 5c5s KhTc",
      Solver.process("texas-holdem 4c4d6c9dTh 2dJd 5c5s 3d3s KhTc 8hQs"));
  }

  @Test
  public void test_texas_holdem_3983_3d5h6c8h9h_TdQc_6h7c_KcTs_7h7s_4hAc() {
    assertEquals(
      "TdQc KcTs 4hAc 6h7c=7h7s",
      Solver.process("texas-holdem 3d5h6c8h9h TdQc 6h7c KcTs 7h7s 4hAc"));
  }

  @Test
  public void test_texas_holdem_3984_2s5d6dJhQs_Ah8h_8d8s_KdJs_Kc9d_JdKh_7d2c_5sAs_Jc4h() {
    assertEquals(
      "Kc9d Ah8h 7d2c 5sAs 8d8s Jc4h JdKh=KdJs",
      Solver.process("texas-holdem 2s5d6dJhQs Ah8h 8d8s KdJs Kc9d JdKh 7d2c 5sAs Jc4h"));
  }

  @Test
  public void test_texas_holdem_3985_8dJdKdKhTs_AhQd_7d3h_8sQs_2hTc_2d3c_6dKs() {
    assertEquals(
      "2d3c=7d3h 8sQs 2hTc 6dKs AhQd",
      Solver.process("texas-holdem 8dJdKdKhTs AhQd 7d3h 8sQs 2hTc 2d3c 6dKs"));
  }

  @Test
  public void test_texas_holdem_3986_6d9cAcAsQd_ThQh_5sTs_6s3s_6h2d_Tc9h() {
    assertEquals(
      "5sTs 6h2d=6s3s Tc9h ThQh",
      Solver.process("texas-holdem 6d9cAcAsQd ThQh 5sTs 6s3s 6h2d Tc9h"));
  }

  @Test
  public void test_texas_holdem_3987_3c5d6dJsKh_Jh2h_7c9s() {
    assertEquals(
      "7c9s Jh2h",
      Solver.process("texas-holdem 3c5d6dJsKh Jh2h 7c9s"));
  }

  @Test
  public void test_texas_holdem_3988_4c5h6d7dAd_9s4s_2dJc_Jh9h() {
    assertEquals(
      "2dJc Jh9h 9s4s",
      Solver.process("texas-holdem 4c5h6d7dAd 9s4s 2dJc Jh9h"));
  }

  @Test
  public void test_texas_holdem_3989_2c3c6d8cKh_4d7s_3h4c() {
    assertEquals(
      "4d7s 3h4c",
      Solver.process("texas-holdem 2c3c6d8cKh 4d7s 3h4c"));
  }

  @Test
  public void test_texas_holdem_3990_3s6s8hQhTh_2h8s_9s6h_AsTc_4d4h_9c2c_7cAh_8c4s_Ad5s_Td3h() {
    assertEquals(
      "9c2c Ad5s 7cAh 4d4h 9s6h 2h8s=8c4s AsTc Td3h",
      Solver.process("texas-holdem 3s6s8hQhTh 2h8s 9s6h AsTc 4d4h 9c2c 7cAh 8c4s Ad5s Td3h"));
  }

  @Test
  public void test_texas_holdem_3991_6sAdAsJcQs_2d9h_Ac9d_4hJs() {
    assertEquals(
      "2d9h 4hJs Ac9d",
      Solver.process("texas-holdem 6sAdAsJcQs 2d9h Ac9d 4hJs"));
  }

  @Test
  public void test_texas_holdem_3992_2s6hJcKdQs_Ah4d_6cTd() {
    assertEquals(
      "Ah4d 6cTd",
      Solver.process("texas-holdem 2s6hJcKdQs Ah4d 6cTd"));
  }

  @Test
  public void test_texas_holdem_3993_2s4d6cAcKh_5s4s_TcTh_4h3h_3dJs_6hQd() {
    assertEquals(
      "3dJs 4h3h=5s4s 6hQd TcTh",
      Solver.process("texas-holdem 2s4d6cAcKh 5s4s TcTh 4h3h 3dJs 6hQd"));
  }

  @Test
  public void test_texas_holdem_3994_4h5d6d9dAd_TsJs_As7s_2cTd_4c9h_Ks5h_7h2d_Kc6s_5s4d() {
    assertEquals(
      "TsJs Ks5h Kc6s As7s 4c9h 7h2d 5s4d 2cTd",
      Solver.process("texas-holdem 4h5d6d9dAd TsJs As7s 2cTd 4c9h Ks5h 7h2d Kc6s 5s4d"));
  }

  @Test
  public void test_texas_holdem_3995_4s7d9sQdQs_6h8d_7cAs() {
    assertEquals(
      "6h8d 7cAs",
      Solver.process("texas-holdem 4s7d9sQdQs 6h8d 7cAs"));
  }

  @Test
  public void test_texas_holdem_3996_2s7cJdKcTs_Jh2h_9c8s() {
    assertEquals(
      "Jh2h 9c8s",
      Solver.process("texas-holdem 2s7cJdKcTs Jh2h 9c8s"));
  }

  @Test
  public void test_texas_holdem_3997_3s7h8d9dTc_2d2c_Qd4s_8h9c_7c7d() {
    assertEquals(
      "Qd4s 2d2c 8h9c 7c7d",
      Solver.process("texas-holdem 3s7h8d9dTc 2d2c Qd4s 8h9c 7c7d"));
  }

  @Test
  public void test_texas_holdem_3998_2c3s7dJhTc_5s3h_5dAc_Js2h_4sTd_5cKd_Qs3c() {
    assertEquals(
      "5cKd 5dAc 5s3h Qs3c 4sTd Js2h",
      Solver.process("texas-holdem 2c3s7dJhTc 5s3h 5dAc Js2h 4sTd 5cKd Qs3c"));
  }

  @Test
  public void test_texas_holdem_3999_8d9sJcJsQd_9hKd_7s7c_Jh6c_AhKc_Kh3d_2d5h_2s8s() {
    assertEquals(
      "2d5h Kh3d AhKc 7s7c 2s8s 9hKd Jh6c",
      Solver.process("texas-holdem 8d9sJcJsQd 9hKd 7s7c Jh6c AhKc Kh3d 2d5h 2s8s"));
  }

}
