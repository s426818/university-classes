
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver39HiddenTest {


  @Test
  public void test_texas_holdem_9750_3h4c4dAsTd_2hKd_3sQs_Jc8h() {
    assertEquals(
      "Jc8h 2hKd 3sQs",
      Solver.process("texas-holdem 3h4c4dAsTd 2hKd 3sQs Jc8h"));
  }

  @Test
  public void test_texas_holdem_9751_2d2s3s6sAs_9cTd_5h6h_2c7d_8h8d_9h3h() {
    assertEquals(
      "9cTd 9h3h 5h6h 8h8d 2c7d",
      Solver.process("texas-holdem 2d2s3s6sAs 9cTd 5h6h 2c7d 8h8d 9h3h"));
  }

  @Test
  public void test_texas_holdem_9752_4d8s9hAsTd_Qs8c_ThQc_Ks4s_7c8d_Ah5s_6cKh_8h3d_4h2d() {
    assertEquals(
      "6cKh 4h2d Ks4s 7c8d=8h3d Qs8c ThQc Ah5s",
      Solver.process("texas-holdem 4d8s9hAsTd Qs8c ThQc Ks4s 7c8d Ah5s 6cKh 8h3d 4h2d"));
  }

  @Test
  public void test_texas_holdem_9753_8c9c9dKcTd_Jc8h_7s2s_5c7c_5h7d_As2c_4s6s_7hJd_QhQc_KsTh() {
    assertEquals(
      "4s6s=5h7d=7s2s As2c Jc8h QhQc KsTh 7hJd 5c7c",
      Solver.process("texas-holdem 8c9c9dKcTd Jc8h 7s2s 5c7c 5h7d As2c 4s6s 7hJd QhQc KsTh"));
  }

  @Test
  public void test_texas_holdem_9754_4c7d8h9cTc_9s8d_AcAh_JsJd_3dJh_Qh6h_Ks2d_TdQd_7hAs() {
    assertEquals(
      "Ks2d 7hAs TdQd AcAh 9s8d Qh6h 3dJh=JsJd",
      Solver.process("texas-holdem 4c7d8h9cTc 9s8d AcAh JsJd 3dJh Qh6h Ks2d TdQd 7hAs"));
  }

  @Test
  public void test_texas_holdem_9755_3s5s9cJhQc_7cQh_7sQd_Js5h_Td2s_6dJc_8s8d_Qs3d_2h8h() {
    assertEquals(
      "2h8h Td2s 8s8d 6dJc 7cQh=7sQd Js5h Qs3d",
      Solver.process("texas-holdem 3s5s9cJhQc 7cQh 7sQd Js5h Td2s 6dJc 8s8d Qs3d 2h8h"));
  }

  @Test
  public void test_texas_holdem_9756_3s9c9hAsKh_2hAh_7hQc_3d5h() {
    assertEquals(
      "7hQc 3d5h 2hAh",
      Solver.process("texas-holdem 3s9c9hAsKh 2hAh 7hQc 3d5h"));
  }

  @Test
  public void test_texas_holdem_9757_5d8h9sKsTh_4cAc_7s9d() {
    assertEquals(
      "4cAc 7s9d",
      Solver.process("texas-holdem 5d8h9sKsTh 4cAc 7s9d"));
  }

  @Test
  public void test_texas_holdem_9758_3s9d9hAsTc_6sKc_Jh4d() {
    assertEquals(
      "Jh4d 6sKc",
      Solver.process("texas-holdem 3s9d9hAsTc 6sKc Jh4d"));
  }

  @Test
  public void test_texas_holdem_9759_5h6s8sAcKs_Jc3h_9d4s_As3c() {
    assertEquals(
      "9d4s Jc3h As3c",
      Solver.process("texas-holdem 5h6s8sAcKs Jc3h 9d4s As3c"));
  }

  @Test
  public void test_texas_holdem_9760_3s4c5h6c8c_2hJd_9h4h_6dTh() {
    assertEquals(
      "9h4h 6dTh 2hJd",
      Solver.process("texas-holdem 3s4c5h6c8c 2hJd 9h4h 6dTh"));
  }

  @Test
  public void test_texas_holdem_9761_5h5s8hJhJs_6c7c_Ah3c_2d4c_9dQc_9h9c() {
    assertEquals(
      "2d4c=6c7c 9dQc Ah3c 9h9c",
      Solver.process("texas-holdem 5h5s8hJhJs 6c7c Ah3c 2d4c 9dQc 9h9c"));
  }

  @Test
  public void test_texas_holdem_9762_4s5d7sJhTh_Td6s_TcKc_Ad4d_7d8c_3d2h_KsJs() {
    assertEquals(
      "3d2h Ad4d 7d8c Td6s TcKc KsJs",
      Solver.process("texas-holdem 4s5d7sJhTh Td6s TcKc Ad4d 7d8c 3d2h KsJs"));
  }

  @Test
  public void test_texas_holdem_9763_2c3s4cJdQc_2h2s_Js5d_TdKc_7c9s() {
    assertEquals(
      "7c9s TdKc Js5d 2h2s",
      Solver.process("texas-holdem 2c3s4cJdQc 2h2s Js5d TdKc 7c9s"));
  }

  @Test
  public void test_texas_holdem_9764_2c3cAcAdTh_2h4s_Ts3h() {
    assertEquals(
      "2h4s Ts3h",
      Solver.process("texas-holdem 2c3cAcAdTh 2h4s Ts3h"));
  }

  @Test
  public void test_texas_holdem_9765_3c8h9hThTs_4cAh_2h4s_6cKh_7hJd_4h6h_Js3s_5dKs_7c6d_QhAc() {
    assertEquals(
      "2h4s 5dKs=6cKh 4cAh QhAc Js3s 7c6d 7hJd 4h6h",
      Solver.process("texas-holdem 3c8h9hThTs 4cAh 2h4s 6cKh 7hJd 4h6h Js3s 5dKs 7c6d QhAc"));
  }

  @Test
  public void test_texas_holdem_9766_3d6d9d9hTd_As2c_3sJd_4h9s() {
    assertEquals(
      "As2c 4h9s 3sJd",
      Solver.process("texas-holdem 3d6d9d9hTd As2c 3sJd 4h9s"));
  }

  @Test
  public void test_texas_holdem_9767_3h6s7hAsTd_8hTc_2d2s_JhAc_Kc9c_3d5c_3s6h_Jc6d_8dQc() {
    assertEquals(
      "8dQc Kc9c 2d2s 3d5c Jc6d 8hTc JhAc 3s6h",
      Solver.process("texas-holdem 3h6s7hAsTd 8hTc 2d2s JhAc Kc9c 3d5c 3s6h Jc6d 8dQc"));
  }

  @Test
  public void test_texas_holdem_9768_2d5s6d8cQd_Qh4s_Ts6h_3sAd_2hTd_Tc4h_AcKh_4c5c_9h5d() {
    assertEquals(
      "Tc4h 3sAd AcKh 2hTd 4c5c 9h5d Ts6h Qh4s",
      Solver.process("texas-holdem 2d5s6d8cQd Qh4s Ts6h 3sAd 2hTd Tc4h AcKh 4c5c 9h5d"));
  }

  @Test
  public void test_texas_holdem_9769_7sJdJsTdTs_Ac2h_6s4c() {
    assertEquals(
      "6s4c Ac2h",
      Solver.process("texas-holdem 7sJdJsTdTs Ac2h 6s4c"));
  }

  @Test
  public void test_texas_holdem_9770_4c5d5h9dQc_AhAs_2sAc_6cTh_AdTs_5s8c_KcJh_7c7h_3d8h() {
    assertEquals(
      "3d8h 6cTh KcJh 2sAc AdTs 7c7h AhAs 5s8c",
      Solver.process("texas-holdem 4c5d5h9dQc AhAs 2sAc 6cTh AdTs 5s8c KcJh 7c7h 3d8h"));
  }

  @Test
  public void test_texas_holdem_9771_2c4c6sKdTd_Jc7c_2hQd_2dQs_8c2s_3dTh_AsAh_4hQh() {
    assertEquals(
      "Jc7c 8c2s 2dQs=2hQd 4hQh 3dTh AsAh",
      Solver.process("texas-holdem 2c4c6sKdTd Jc7c 2hQd 2dQs 8c2s 3dTh AsAh 4hQh"));
  }

  @Test
  public void test_texas_holdem_9772_5d8sJhKdTs_7dAd_Qs8c_9hJc_2d3c_Qh4h() {
    assertEquals(
      "2d3c Qh4h 7dAd Qs8c 9hJc",
      Solver.process("texas-holdem 5d8sJhKdTs 7dAd Qs8c 9hJc 2d3c Qh4h"));
  }

  @Test
  public void test_texas_holdem_9773_4h8c8d8hJh_4c7h_5hAs_QcAc_4d3s_7c3c_6s2h() {
    assertEquals(
      "6s2h 7c3c 5hAs QcAc 4c7h=4d3s",
      Solver.process("texas-holdem 4h8c8d8hJh 4c7h 5hAs QcAc 4d3s 7c3c 6s2h"));
  }

  @Test
  public void test_texas_holdem_9774_2s3c3h4d7s_QhKh_3s7c_5h8h_JdQd_2dTs_TcAh_4hKd_7h8c() {
    assertEquals(
      "5h8h JdQd QhKh TcAh 2dTs 4hKd 7h8c 3s7c",
      Solver.process("texas-holdem 2s3c3h4d7s QhKh 3s7c 5h8h JdQd 2dTs TcAh 4hKd 7h8c"));
  }

  @Test
  public void test_texas_holdem_9775_2d4hKcKhTs_9d2s_AdAc() {
    assertEquals(
      "9d2s AdAc",
      Solver.process("texas-holdem 2d4hKcKhTs 9d2s AdAc"));
  }

  @Test
  public void test_texas_holdem_9776_6h9dJhKcTc_2cAc_7h9c_Ts8s_Kd2h_Qs9h() {
    assertEquals(
      "2cAc 7h9c Ts8s Kd2h Qs9h",
      Solver.process("texas-holdem 6h9dJhKcTc 2cAc 7h9c Ts8s Kd2h Qs9h"));
  }

  @Test
  public void test_texas_holdem_9777_3c4c7hJdTc_5h8h_4s9s() {
    assertEquals(
      "5h8h 4s9s",
      Solver.process("texas-holdem 3c4c7hJdTc 5h8h 4s9s"));
  }

  @Test
  public void test_texas_holdem_9778_2s5c5d6s7h_6h8c_KdTs_Tc3d_ThKs_QhJd_6dTd_9cAh() {
    assertEquals(
      "Tc3d QhJd KdTs=ThKs 9cAh 6h8c 6dTd",
      Solver.process("texas-holdem 2s5c5d6s7h 6h8c KdTs Tc3d ThKs QhJd 6dTd 9cAh"));
  }

  @Test
  public void test_texas_holdem_9779_5c6s7cAcJs_8s2d_8d8h_6h5s_5d2c_Ts4c_KdAs_Qd3h_6dQc() {
    assertEquals(
      "8s2d Ts4c Qd3h 5d2c 6dQc 8d8h KdAs 6h5s",
      Solver.process("texas-holdem 5c6s7cAcJs 8s2d 8d8h 6h5s 5d2c Ts4c KdAs Qd3h 6dQc"));
  }

  @Test
  public void test_texas_holdem_9780_3d7h7s9sJs_Qs3c_Jh7c_2d5d_Ad4d_ThTd_7d4c() {
    assertEquals(
      "2d5d Ad4d Qs3c ThTd 7d4c Jh7c",
      Solver.process("texas-holdem 3d7h7s9sJs Qs3c Jh7c 2d5d Ad4d ThTd 7d4c"));
  }

  @Test
  public void test_texas_holdem_9781_6s9hAcTcTs_Ad5s_4cJc() {
    assertEquals(
      "4cJc Ad5s",
      Solver.process("texas-holdem 6s9hAcTcTs Ad5s 4cJc"));
  }

  @Test
  public void test_texas_holdem_9782_3c4h8sKhTd_TcTh_4cQs_7c5c_As3h_Ad7h() {
    assertEquals(
      "7c5c Ad7h As3h 4cQs TcTh",
      Solver.process("texas-holdem 3c4h8sKhTd TcTh 4cQs 7c5c As3h Ad7h"));
  }

  @Test
  public void test_texas_holdem_9783_4h4s5c5d6d_9s8h_7s6h_JhJs_JcKh_2dTs() {
    assertEquals(
      "9s8h 2dTs JcKh 7s6h JhJs",
      Solver.process("texas-holdem 4h4s5c5d6d 9s8h 7s6h JhJs JcKh 2dTs"));
  }

  @Test
  public void test_texas_holdem_9784_6s7cKhTcTs_4c5h_5sQh_ThAs_4h9h_Ad7h_2c8c_KsKc_7sTd_4d2s() {
    assertEquals(
      "4c5h=4d2s 2c8c 4h9h 5sQh Ad7h ThAs 7sTd KsKc",
      Solver.process("texas-holdem 6s7cKhTcTs 4c5h 5sQh ThAs 4h9h Ad7h 2c8c KsKc 7sTd 4d2s"));
  }

  @Test
  public void test_texas_holdem_9785_5h7d7sKcKh_QcQs_7c9s_Qd6c() {
    assertEquals(
      "Qd6c QcQs 7c9s",
      Solver.process("texas-holdem 5h7d7sKcKh QcQs 7c9s Qd6c"));
  }

  @Test
  public void test_texas_holdem_9786_2d5d5sAcJd_4cKh_Js2s_6sTc() {
    assertEquals(
      "6sTc 4cKh Js2s",
      Solver.process("texas-holdem 2d5d5sAcJd 4cKh Js2s 6sTc"));
  }

  @Test
  public void test_texas_holdem_9787_2h4h5h6d9s_7h3c_Ac7d_7cJd_QcJh_AdTc_2d2c_6cAs_3sKh() {
    assertEquals(
      "7cJd QcJh Ac7d AdTc 6cAs 2d2c 3sKh 7h3c",
      Solver.process("texas-holdem 2h4h5h6d9s 7h3c Ac7d 7cJd QcJh AdTc 2d2c 6cAs 3sKh"));
  }

  @Test
  public void test_texas_holdem_9788_7d8sAhKhQh_As4c_Qs5c() {
    assertEquals(
      "Qs5c As4c",
      Solver.process("texas-holdem 7d8sAhKhQh As4c Qs5c"));
  }

  @Test
  public void test_texas_holdem_9789_3h6d9sAhTc_JhTd_Jd4h_Qd8d() {
    assertEquals(
      "Jd4h Qd8d JhTd",
      Solver.process("texas-holdem 3h6d9sAhTc JhTd Jd4h Qd8d"));
  }

  @Test
  public void test_texas_holdem_9790_2d9c9sAdKh_AcTd_7d6c_Ah2h_9h3d_2c5s() {
    assertEquals(
      "7d6c 2c5s AcTd=Ah2h 9h3d",
      Solver.process("texas-holdem 2d9c9sAdKh AcTd 7d6c Ah2h 9h3d 2c5s"));
  }

  @Test
  public void test_texas_holdem_9791_2h2s4dAhTc_9d8d_6s3h_Jc6h_2d9s_AsAc_7cJd_4c5d() {
    assertEquals(
      "6s3h 9d8d 7cJd=Jc6h 4c5d 2d9s AsAc",
      Solver.process("texas-holdem 2h2s4dAhTc 9d8d 6s3h Jc6h 2d9s AsAc 7cJd 4c5d"));
  }

  @Test
  public void test_texas_holdem_9792_7s9sJcKdTh_6s6d_5s5c_Kc8d_Js4c_6hTd_2cQc_JhTc_7h7d_3hJd() {
    assertEquals(
      "5s5c 6s6d 6hTd 3hJd=Js4c JhTc 7h7d Kc8d 2cQc",
      Solver.process("texas-holdem 7s9sJcKdTh 6s6d 5s5c Kc8d Js4c 6hTd 2cQc JhTc 7h7d 3hJd"));
  }

  @Test
  public void test_texas_holdem_9793_2d4h5c9dQh_4dAd_8c8h_3cAc() {
    assertEquals(
      "4dAd 8c8h 3cAc",
      Solver.process("texas-holdem 2d4h5c9dQh 4dAd 8c8h 3cAc"));
  }

  @Test
  public void test_texas_holdem_9794_4d4s7hAcKs_Jh3h_Qs8s_2d5d_8d9c() {
    assertEquals(
      "2d5d 8d9c Jh3h Qs8s",
      Solver.process("texas-holdem 4d4s7hAcKs Jh3h Qs8s 2d5d 8d9c"));
  }

  @Test
  public void test_texas_holdem_9795_2c6s7hAcKc_8s9c_4d2h_3cKs_9h8d_TdJd_5c4h() {
    assertEquals(
      "5c4h 8s9c=9h8d TdJd 4d2h 3cKs",
      Solver.process("texas-holdem 2c6s7hAcKc 8s9c 4d2h 3cKs 9h8d TdJd 5c4h"));
  }

  @Test
  public void test_texas_holdem_9796_2h4h7s9dKd_TdKs_2cJh_9h4c_3sKc_6d7d() {
    assertEquals(
      "2cJh 6d7d 3sKc TdKs 9h4c",
      Solver.process("texas-holdem 2h4h7s9dKd TdKs 2cJh 9h4c 3sKc 6d7d"));
  }

  @Test
  public void test_texas_holdem_9797_3s8cAsJdQc_9d7s_Ks5c_5h8d_6hTh_7c5s() {
    assertEquals(
      "7c5s 9d7s 6hTh Ks5c 5h8d",
      Solver.process("texas-holdem 3s8cAsJdQc 9d7s Ks5c 5h8d 6hTh 7c5s"));
  }

  @Test
  public void test_texas_holdem_9798_2s3d9hJcKs_2h7c_5dQs_8hTs_7h4s_Ac4c() {
    assertEquals(
      "7h4s 8hTs 5dQs Ac4c 2h7c",
      Solver.process("texas-holdem 2s3d9hJcKs 2h7c 5dQs 8hTs 7h4s Ac4c"));
  }

  @Test
  public void test_texas_holdem_9799_5d6hAcAsTc_8s8c_KdQh_4h6c_KcTd() {
    assertEquals(
      "KdQh 4h6c 8s8c KcTd",
      Solver.process("texas-holdem 5d6hAcAsTc 8s8c KdQh 4h6c KcTd"));
  }

  @Test
  public void test_texas_holdem_9800_3c8d8sAdKc_Ts7h_6h4d_Td3h_6s7c_Ks7d_7s5s_3d2c_Kh4h_2s9d() {
    assertEquals(
      "6h4d 6s7c=7s5s 2s9d Ts7h 3d2c=Td3h Kh4h=Ks7d",
      Solver.process("texas-holdem 3c8d8sAdKc Ts7h 6h4d Td3h 6s7c Ks7d 7s5s 3d2c Kh4h 2s9d"));
  }

  @Test
  public void test_texas_holdem_9801_2c2s3d6d8s_9c8h_QsQh_JsAc_Jh6h_JcAs() {
    assertEquals(
      "JcAs=JsAc Jh6h 9c8h QsQh",
      Solver.process("texas-holdem 2c2s3d6d8s 9c8h QsQh JsAc Jh6h JcAs"));
  }

  @Test
  public void test_texas_holdem_9802_4s5d5s6cAd_4h7d_AsAh_8c6d_2dKs_5c4c_Tc7h_Js8s_Kc6h() {
    assertEquals(
      "Tc7h Js8s 2dKs 4h7d 8c6d=Kc6h 5c4c AsAh",
      Solver.process("texas-holdem 4s5d5s6cAd 4h7d AsAh 8c6d 2dKs 5c4c Tc7h Js8s Kc6h"));
  }

  @Test
  public void test_texas_holdem_9803_2s4d6cQsTs_8h5h_As4c_AcTd_7h7c_5cQd_6s8c_6h7s() {
    assertEquals(
      "8h5h As4c 6h7s 6s8c 7h7c AcTd 5cQd",
      Solver.process("texas-holdem 2s4d6cQsTs 8h5h As4c AcTd 7h7c 5cQd 6s8c 6h7s"));
  }

  @Test
  public void test_texas_holdem_9804_3c4c6dAcKd_2c8c_8s3d_7s9h_2s6h_7cAd_7hKh_9c4s() {
    assertEquals(
      "7s9h 8s3d 9c4s 2s6h 7hKh 7cAd 2c8c",
      Solver.process("texas-holdem 3c4c6dAcKd 2c8c 8s3d 7s9h 2s6h 7cAd 7hKh 9c4s"));
  }

  @Test
  public void test_texas_holdem_9805_7dJhJsKdQc_8s6s_9h8d_5hTd_TsJd_6hAd_5c5s() {
    assertEquals(
      "8s6s 9h8d 5hTd 6hAd 5c5s TsJd",
      Solver.process("texas-holdem 7dJhJsKdQc 8s6s 9h8d 5hTd TsJd 6hAd 5c5s"));
  }

  @Test
  public void test_texas_holdem_9806_2s4hKhQsTc_Qh5h_5cAs_Jh3h_5dKc_TsKs_Ad3s_4dJc() {
    assertEquals(
      "Jh3h Ad3s 5cAs 4dJc Qh5h 5dKc TsKs",
      Solver.process("texas-holdem 2s4hKhQsTc Qh5h 5cAs Jh3h 5dKc TsKs Ad3s 4dJc"));
  }

  @Test
  public void test_texas_holdem_9807_4h9hJhQhTc_Js5h_3c4s() {
    assertEquals(
      "3c4s Js5h",
      Solver.process("texas-holdem 4h9hJhQhTc Js5h 3c4s"));
  }

  @Test
  public void test_texas_holdem_9808_5dAhKcQcTh_JhTc_QdTd_Ac2d_Jc8s_4s6d_5h2c_5c3s() {
    assertEquals(
      "4s6d 5c3s=5h2c Ac2d QdTd Jc8s=JhTc",
      Solver.process("texas-holdem 5dAhKcQcTh JhTc QdTd Ac2d Jc8s 4s6d 5h2c 5c3s"));
  }

  @Test
  public void test_texas_holdem_9809_2s4d8s9sTd_4s6s_3cJs_JhAs_6d2c_6c5c_9d8h_5dQh_Tc2h() {
    assertEquals(
      "6c5c 3cJs 5dQh JhAs 6d2c 9d8h Tc2h 4s6s",
      Solver.process("texas-holdem 2s4d8s9sTd 4s6s 3cJs JhAs 6d2c 6c5c 9d8h 5dQh Tc2h"));
  }

  @Test
  public void test_texas_holdem_9810_7h9hAcJcTd_Qd8h_Qc8s_Jd2c_2hKd_QsKc_5hTh_5c7s_4d3d() {
    assertEquals(
      "4d3d 2hKd 5c7s 5hTh Jd2c Qc8s=Qd8h QsKc",
      Solver.process("texas-holdem 7h9hAcJcTd Qd8h Qc8s Jd2c 2hKd QsKc 5hTh 5c7s 4d3d"));
  }

  @Test
  public void test_texas_holdem_9811_2s7s8hAcKs_7h3s_Ts4c_Tc7d_6s5h_3dKh_KdJs_5sQs_Qc3h_Th4s() {
    assertEquals(
      "6s5h Th4s=Ts4c Qc3h 7h3s Tc7d 3dKh KdJs 5sQs",
      Solver.process("texas-holdem 2s7s8hAcKs 7h3s Ts4c Tc7d 6s5h 3dKh KdJs 5sQs Qc3h Th4s"));
  }

  @Test
  public void test_texas_holdem_9812_6d7h7s9cKc_2h8c_3s7c_8s9s_6s2d_4sKd_AsAc_4d7d_3dKs_4cQh() {
    assertEquals(
      "2h8c 4cQh 6s2d 8s9s 3dKs=4sKd AsAc 3s7c=4d7d",
      Solver.process("texas-holdem 6d7h7s9cKc 2h8c 3s7c 8s9s 6s2d 4sKd AsAc 4d7d 3dKs 4cQh"));
  }

  @Test
  public void test_texas_holdem_9813_5c6d7dAhJh_Jd3h_Kd4c_Kh4h_Jc6c_8dAd_As8c_8h5h_6h3c() {
    assertEquals(
      "Kd4c=Kh4h 8h5h 6h3c Jd3h 8dAd=As8c Jc6c",
      Solver.process("texas-holdem 5c6d7dAhJh Jd3h Kd4c Kh4h Jc6c 8dAd As8c 8h5h 6h3c"));
  }

  @Test
  public void test_texas_holdem_9814_3h6s7dQsTd_3d5d_9d9s_9cKs_6c8c_6d4h_2c2h_7sKc_Qc6h() {
    assertEquals(
      "9cKs 2c2h 3d5d 6d4h 6c8c 7sKc 9d9s Qc6h",
      Solver.process("texas-holdem 3h6s7dQsTd 3d5d 9d9s 9cKs 6c8c 6d4h 2c2h 7sKc Qc6h"));
  }

  @Test
  public void test_texas_holdem_9815_6c7cAhQhTh_Ac7h_4s8c_4c2s() {
    assertEquals(
      "4c2s 4s8c Ac7h",
      Solver.process("texas-holdem 6c7cAhQhTh Ac7h 4s8c 4c2s"));
  }

  @Test
  public void test_texas_holdem_9816_5s6sJdJsTh_9dJh_AsJc_Ac2c_9s4c_3c8s_3h9c_5dTs_Td7d() {
    assertEquals(
      "3c8s 3h9c=9s4c Ac2c 5dTs Td7d 9dJh AsJc",
      Solver.process("texas-holdem 5s6sJdJsTh 9dJh AsJc Ac2c 9s4c 3c8s 3h9c 5dTs Td7d"));
  }

  @Test
  public void test_texas_holdem_9817_5s7d7h7sJh_7c2c_6c3d() {
    assertEquals(
      "6c3d 7c2c",
      Solver.process("texas-holdem 5s7d7h7sJh 7c2c 6c3d"));
  }

  @Test
  public void test_texas_holdem_9818_5c9sAhJsTc_7d8c_2hJc_4s9c_3c4h_Qs5d() {
    assertEquals(
      "3c4h Qs5d 4s9c 2hJc 7d8c",
      Solver.process("texas-holdem 5c9sAhJsTc 7d8c 2hJc 4s9c 3c4h Qs5d"));
  }

  @Test
  public void test_texas_holdem_9819_3d4h7c9dTh_Td7h_Kc8s_KsJs() {
    assertEquals(
      "Kc8s KsJs Td7h",
      Solver.process("texas-holdem 3d4h7c9dTh Td7h Kc8s KsJs"));
  }

  @Test
  public void test_texas_holdem_9820_5s6h8d8hQd_Ah4c_3s3h_5cJd_2dAc_7h6s() {
    assertEquals(
      "2dAc=Ah4c 3s3h 5cJd 7h6s",
      Solver.process("texas-holdem 5s6h8d8hQd Ah4c 3s3h 5cJd 2dAc 7h6s"));
  }

  @Test
  public void test_texas_holdem_9821_2s5h9cAsTs_Ah4c_9d9h_AdAc_6h6d_3c4h_Qc8h_JsTc() {
    assertEquals(
      "Qc8h 6h6d JsTc Ah4c 9d9h AdAc 3c4h",
      Solver.process("texas-holdem 2s5h9cAsTs Ah4c 9d9h AdAc 6h6d 3c4h Qc8h JsTc"));
  }

  @Test
  public void test_texas_holdem_9822_4s6s8h9dAs_6hJh_Kh3h_Ts5s() {
    assertEquals(
      "Kh3h 6hJh Ts5s",
      Solver.process("texas-holdem 4s6s8h9dAs 6hJh Kh3h Ts5s"));
  }

  @Test
  public void test_texas_holdem_9823_2c6d6s8cAd_Js4h_KhTd_5cKs_2sJd_5h8h_QdTh_Jh8d_Kc9d_8s9h() {
    assertEquals(
      "Js4h QdTh 5cKs Kc9d KhTd 2sJd 5h8h=8s9h=Jh8d",
      Solver.process("texas-holdem 2c6d6s8cAd Js4h KhTd 5cKs 2sJd 5h8h QdTh Jh8d Kc9d 8s9h"));
  }

  @Test
  public void test_texas_holdem_9824_3h6c8dAhTd_5h9s_8h8c_4hKd() {
    assertEquals(
      "5h9s 4hKd 8h8c",
      Solver.process("texas-holdem 3h6c8dAhTd 5h9s 8h8c 4hKd"));
  }

  @Test
  public void test_texas_holdem_9825_2d2h3hJhJs_6dQs_3c5d_Ad6h_9cQh_5h8c_QdTh_KdTc_9dAc() {
    assertEquals(
      "5h8c 6dQs=9cQh=QdTh KdTc 9dAc=Ad6h 3c5d",
      Solver.process("texas-holdem 2d2h3hJhJs 6dQs 3c5d Ad6h 9cQh 5h8c QdTh KdTc 9dAc"));
  }

  @Test
  public void test_texas_holdem_9826_3s9dJdKdKs_AsTc_3h8h_9c3d_7cQs_QhKc_Ah2s_8d9h_9s4h() {
    assertEquals(
      "7cQs Ah2s AsTc 3h8h 8d9h=9c3d=9s4h QhKc",
      Solver.process("texas-holdem 3s9dJdKdKs AsTc 3h8h 9c3d 7cQs QhKc Ah2s 8d9h 9s4h"));
  }

  @Test
  public void test_texas_holdem_9827_4s6s9d9sJh_7s8h_3cTc_5h5c_8s9c_4dTs_3d6d_9hQd_3hJd_Ad7h() {
    assertEquals(
      "7s8h 3cTc Ad7h 4dTs 5h5c 3d6d 3hJd 8s9c 9hQd",
      Solver.process("texas-holdem 4s6s9d9sJh 7s8h 3cTc 5h5c 8s9c 4dTs 3d6d 9hQd 3hJd Ad7h"));
  }

  @Test
  public void test_texas_holdem_9828_3c3s8cQdQh_2cTs_AsAc_9s4s() {
    assertEquals(
      "9s4s 2cTs AsAc",
      Solver.process("texas-holdem 3c3s8cQdQh 2cTs AsAc 9s4s"));
  }

  @Test
  public void test_texas_holdem_9829_3s5s7hJcTc_AcAd_2c8d_4d4h_Ks4c_4s6d_7d9h() {
    assertEquals(
      "2c8d Ks4c 4d4h 7d9h AcAd 4s6d",
      Solver.process("texas-holdem 3s5s7hJcTc AcAd 2c8d 4d4h Ks4c 4s6d 7d9h"));
  }

  @Test
  public void test_texas_holdem_9830_2d4h8cAsTs_Kd9h_3c6s_JhKh_QhAh() {
    assertEquals(
      "3c6s Kd9h JhKh QhAh",
      Solver.process("texas-holdem 2d4h8cAsTs Kd9h 3c6s JhKh QhAh"));
  }

  @Test
  public void test_texas_holdem_9831_2c2s8h9cQs_7s3c_5dQh_9sAc_KsQd() {
    assertEquals(
      "7s3c 9sAc 5dQh KsQd",
      Solver.process("texas-holdem 2c2s8h9cQs 7s3c 5dQh 9sAc KsQd"));
  }

  @Test
  public void test_texas_holdem_9832_4h8hAhQdTh_8c2h_3c3s_6s6c_QhAd_6h5c_JdJc() {
    assertEquals(
      "3c3s 6s6c JdJc 8c2h 6h5c QhAd",
      Solver.process("texas-holdem 4h8hAhQdTh 8c2h 3c3s 6s6c QhAd 6h5c JdJc"));
  }

  @Test
  public void test_texas_holdem_9833_2h5s6s8sKs_2sQs_8hTh_TcAs() {
    assertEquals(
      "8hTh 2sQs TcAs",
      Solver.process("texas-holdem 2h5s6s8sKs 2sQs 8hTh TcAs"));
  }

  @Test
  public void test_texas_holdem_9834_2s6c6sKsTc_Kh7d_Ac5s_6d4h() {
    assertEquals(
      "Ac5s Kh7d 6d4h",
      Solver.process("texas-holdem 2s6c6sKsTc Kh7d Ac5s 6d4h"));
  }

  @Test
  public void test_texas_holdem_9835_7h8sJcKcKh_8c5h_4sTd_Js5d_6s4c_KdJh_Tc7c_JdQc() {
    assertEquals(
      "6s4c 4sTd Tc7c 8c5h Js5d JdQc KdJh",
      Solver.process("texas-holdem 7h8sJcKcKh 8c5h 4sTd Js5d 6s4c KdJh Tc7c JdQc"));
  }

  @Test
  public void test_texas_holdem_9836_2d3dKsQdTh_8c9c_4h9s_AsTc_4c3h_5sAd_7dAc_3s4d() {
    assertEquals(
      "4h9s 8c9c 5sAd 7dAc 3s4d=4c3h AsTc",
      Solver.process("texas-holdem 2d3dKsQdTh 8c9c 4h9s AsTc 4c3h 5sAd 7dAc 3s4d"));
  }

  @Test
  public void test_texas_holdem_9837_2c5cAhKhQc_4hQd_7s4s_QhJs_3h7c_8dAs_Ts6d_Ac4d_Ks6c() {
    assertEquals(
      "3h7c=7s4s Ts6d 4hQd QhJs Ks6c Ac4d 8dAs",
      Solver.process("texas-holdem 2c5cAhKhQc 4hQd 7s4s QhJs 3h7c 8dAs Ts6d Ac4d Ks6c"));
  }

  @Test
  public void test_texas_holdem_9838_4d7c8sKdKh_Qs5c_KsTh_3d2d_5h4h_8cAs() {
    assertEquals(
      "3d2d Qs5c 5h4h 8cAs KsTh",
      Solver.process("texas-holdem 4d7c8sKdKh Qs5c KsTh 3d2d 5h4h 8cAs"));
  }

  @Test
  public void test_texas_holdem_9839_3d4h7dJhTh_8d5s_5h7h_9hQc_Qd3h() {
    assertEquals(
      "8d5s 9hQc Qd3h 5h7h",
      Solver.process("texas-holdem 3d4h7dJhTh 8d5s 5h7h 9hQc Qd3h"));
  }

  @Test
  public void test_texas_holdem_9840_3s5h6d9hAd_8s6s_Jh4h_9sQs_4cAs_Ks2s_7h6h_Ah4s_8cAc() {
    assertEquals(
      "Jh4h Ks2s 7h6h 8s6s 9sQs 4cAs=Ah4s 8cAc",
      Solver.process("texas-holdem 3s5h6d9hAd 8s6s Jh4h 9sQs 4cAs Ks2s 7h6h Ah4s 8cAc"));
  }

  @Test
  public void test_texas_holdem_9841_3s7h8dAdKd_6hKs_5h4h_5cTd_3h6c() {
    assertEquals(
      "5h4h 5cTd 3h6c 6hKs",
      Solver.process("texas-holdem 3s7h8dAdKd 6hKs 5h4h 5cTd 3h6c"));
  }

  @Test
  public void test_texas_holdem_9842_2c4s9cJsKd_QdTh_2h7s_7h7c() {
    assertEquals(
      "2h7s 7h7c QdTh",
      Solver.process("texas-holdem 2c4s9cJsKd QdTh 2h7s 7h7c"));
  }

  @Test
  public void test_texas_holdem_9843_5c5s6hJdTs_Kh4s_5d8s_KdJh_3c9h_3s8c() {
    assertEquals(
      "3s8c 3c9h Kh4s KdJh 5d8s",
      Solver.process("texas-holdem 5c5s6hJdTs Kh4s 5d8s KdJh 3c9h 3s8c"));
  }

  @Test
  public void test_texas_holdem_9844_3c5c6sJdTc_9cTd_3d8h_Qc9h() {
    assertEquals(
      "Qc9h 3d8h 9cTd",
      Solver.process("texas-holdem 3c5c6sJdTc 9cTd 3d8h Qc9h"));
  }

  @Test
  public void test_texas_holdem_9845_4c5c9sJcTc_Qh2c_Ah8c_6h7c_Kc9c() {
    assertEquals(
      "Qh2c 6h7c Ah8c Kc9c",
      Solver.process("texas-holdem 4c5c9sJcTc Qh2c Ah8c 6h7c Kc9c"));
  }

  @Test
  public void test_texas_holdem_9846_4d8hAdQhTd_Kc4c_JdQc_7dTs_6dJh_As3s_9s9d_5cJs_8c9c() {
    assertEquals(
      "5cJs=6dJh Kc4c 8c9c 9s9d 7dTs JdQc As3s",
      Solver.process("texas-holdem 4d8hAdQhTd Kc4c JdQc 7dTs 6dJh As3s 9s9d 5cJs 8c9c"));
  }

  @Test
  public void test_texas_holdem_9847_4s5c7dJdTc_6d9c_Qc6h_8d5h_6sKh() {
    assertEquals(
      "6d9c Qc6h 6sKh 8d5h",
      Solver.process("texas-holdem 4s5c7dJdTc 6d9c Qc6h 8d5h 6sKh"));
  }

  @Test
  public void test_texas_holdem_9848_5d8s9dQcQd_7sAd_7c3h() {
    assertEquals(
      "7c3h 7sAd",
      Solver.process("texas-holdem 5d8s9dQcQd 7sAd 7c3h"));
  }

  @Test
  public void test_texas_holdem_9849_6c6s9dJdKs_8d5c_5sAh() {
    assertEquals(
      "8d5c 5sAh",
      Solver.process("texas-holdem 6c6s9dJdKs 8d5c 5sAh"));
  }

  @Test
  public void test_texas_holdem_9850_8h8sJdJhQc_3sQd_7s5c_Ks7d_TcAh() {
    assertEquals(
      "7s5c Ks7d TcAh 3sQd",
      Solver.process("texas-holdem 8h8sJdJhQc 3sQd 7s5c Ks7d TcAh"));
  }

  @Test
  public void test_texas_holdem_9851_2h4d7cJdTs_9cAh_3s4s_6h9h_7s3h_Ks8d_2sQc_Ad4h_5h3d_5s4c() {
    assertEquals(
      "5h3d 6h9h Ks8d 9cAh 2sQc 3s4s=5s4c Ad4h 7s3h",
      Solver.process("texas-holdem 2h4d7cJdTs 9cAh 3s4s 6h9h 7s3h Ks8d 2sQc Ad4h 5h3d 5s4c"));
  }

  @Test
  public void test_texas_holdem_9852_3d4h6s7sKs_QsTc_Qd2c_Jh2h_9d4s_KcKh_3h2s_QcQh_5s7h() {
    assertEquals(
      "Jh2h Qd2c QsTc 3h2s 9d4s QcQh KcKh 5s7h",
      Solver.process("texas-holdem 3d4h6s7sKs QsTc Qd2c Jh2h 9d4s KcKh 3h2s QcQh 5s7h"));
  }

  @Test
  public void test_texas_holdem_9853_5c8cJcQcTc_Js2d_Kd7d_3h3d_Ks5h_7sTh() {
    assertEquals(
      "3h3d=7sTh=Js2d=Kd7d=Ks5h",
      Solver.process("texas-holdem 5c8cJcQcTc Js2d Kd7d 3h3d Ks5h 7sTh"));
  }

  @Test
  public void test_texas_holdem_9854_4h5hAcQcTs_3h3c_8s7c_9d2c_6dKh_Jh6h_Ad9s() {
    assertEquals(
      "8s7c 9d2c Jh6h 6dKh 3h3c Ad9s",
      Solver.process("texas-holdem 4h5hAcQcTs 3h3c 8s7c 9d2c 6dKh Jh6h Ad9s"));
  }

  @Test
  public void test_texas_holdem_9855_5s9dAcQhTs_4cKd_4s4h_8cQc_QdTd_5d6s_Ad2s() {
    assertEquals(
      "4cKd 4s4h 5d6s 8cQc Ad2s QdTd",
      Solver.process("texas-holdem 5s9dAcQhTs 4cKd 4s4h 8cQc QdTd 5d6s Ad2s"));
  }

  @Test
  public void test_texas_holdem_9856_4h5d7cAdKh_Ts9h_QhTc_4s6d_AcJs_3hJd() {
    assertEquals(
      "Ts9h 3hJd QhTc 4s6d AcJs",
      Solver.process("texas-holdem 4h5d7cAdKh Ts9h QhTc 4s6d AcJs 3hJd"));
  }

  @Test
  public void test_texas_holdem_9857_2s6h9dKcQc_9hTs_Ad2c_3s7h_6cTh_KhJs_8cJd() {
    assertEquals(
      "3s7h 8cJd Ad2c 6cTh 9hTs KhJs",
      Solver.process("texas-holdem 2s6h9dKcQc 9hTs Ad2c 3s7h 6cTh KhJs 8cJd"));
  }

  @Test
  public void test_texas_holdem_9858_3s4c5c8sQc_9hJh_TdAh_6hTh() {
    assertEquals(
      "6hTh 9hJh TdAh",
      Solver.process("texas-holdem 3s4c5c8sQc 9hJh TdAh 6hTh"));
  }

  @Test
  public void test_texas_holdem_9859_3h7s8d9dJd_3s3c_4d6h_JcQc_5cAd_9s8s_As2h_5d8c_4sJh() {
    assertEquals(
      "4d6h 5cAd=As2h 5d8c 4sJh JcQc 9s8s 3s3c",
      Solver.process("texas-holdem 3h7s8d9dJd 3s3c 4d6h JcQc 5cAd 9s8s As2h 5d8c 4sJh"));
  }

  @Test
  public void test_texas_holdem_9860_3d5sAsQdQs_7s9c_Qh2h_Ah3c_8c8h_3s6s_TsKc_4hKs() {
    assertEquals(
      "7s9c 4hKs TsKc 8c8h Ah3c Qh2h 3s6s",
      Solver.process("texas-holdem 3d5sAsQdQs 7s9c Qh2h Ah3c 8c8h 3s6s TsKc 4hKs"));
  }

  @Test
  public void test_texas_holdem_9861_4c5h9sJdQc_4hAs_4s6s_Qh2h_Ac2s() {
    assertEquals(
      "Ac2s 4s6s 4hAs Qh2h",
      Solver.process("texas-holdem 4c5h9sJdQc 4hAs 4s6s Qh2h Ac2s"));
  }

  @Test
  public void test_texas_holdem_9862_3h4c4d6h8c_2d8h_JsTd_9sAc() {
    assertEquals(
      "JsTd 9sAc 2d8h",
      Solver.process("texas-holdem 3h4c4d6h8c 2d8h JsTd 9sAc"));
  }

  @Test
  public void test_texas_holdem_9863_4h7c8hTcTs_5hAs_Kd9c_2c5d_Ks9d_Td6h() {
    assertEquals(
      "2c5d Kd9c=Ks9d 5hAs Td6h",
      Solver.process("texas-holdem 4h7c8hTcTs 5hAs Kd9c 2c5d Ks9d Td6h"));
  }

  @Test
  public void test_texas_holdem_9864_2s9d9hTdTh_Qs5h_Jh3s_8d2h_7c7h_9cJc_Qh6d() {
    assertEquals(
      "7c7h 8d2h Jh3s Qh6d=Qs5h 9cJc",
      Solver.process("texas-holdem 2s9d9hTdTh Qs5h Jh3s 8d2h 7c7h 9cJc Qh6d"));
  }

  @Test
  public void test_texas_holdem_9865_3cAdAsQsTh_5c3h_3dKs_Js6s() {
    assertEquals(
      "Js6s 5c3h 3dKs",
      Solver.process("texas-holdem 3cAdAsQsTh 5c3h 3dKs Js6s"));
  }

  @Test
  public void test_texas_holdem_9866_2c5h6hKhQc_TcJd_9h2d_KsJs_7h7c_8d6d() {
    assertEquals(
      "TcJd 9h2d 8d6d 7h7c KsJs",
      Solver.process("texas-holdem 2c5h6hKhQc TcJd 9h2d KsJs 7h7c 8d6d"));
  }

  @Test
  public void test_texas_holdem_9867_6h7c7hQcQh_Ad2h_Jh7s_3hKd_4h6s_KcTs_2d2c() {
    assertEquals(
      "2d2c=4h6s 3hKd=KcTs Ad2h Jh7s",
      Solver.process("texas-holdem 6h7c7hQcQh Ad2h Jh7s 3hKd 4h6s KcTs 2d2c"));
  }

  @Test
  public void test_texas_holdem_9868_AcAhJdJhQs_7c9s_4dQd_Jc7d_3s6d_AdTd() {
    assertEquals(
      "3s6d=7c9s 4dQd Jc7d AdTd",
      Solver.process("texas-holdem AcAhJdJhQs 7c9s 4dQd Jc7d 3s6d AdTd"));
  }

  @Test
  public void test_texas_holdem_9869_4h5h7d9sKc_8h2c_Qh8c_Jd9c_5c9d_7c2h_7s2s_6c2d_KhQc() {
    assertEquals(
      "6c2d 8h2c Qh8c 7c2h=7s2s Jd9c KhQc 5c9d",
      Solver.process("texas-holdem 4h5h7d9sKc 8h2c Qh8c Jd9c 5c9d 7c2h 7s2s 6c2d KhQc"));
  }

  @Test
  public void test_texas_holdem_9870_5d9hKdQdTh_Ts5c_8sAd_5hQc_5s2s_9s6c_2d7d_6dJs_9c8h_Qs8c() {
    assertEquals(
      "8sAd 5s2s 9c8h=9s6c Qs8c Ts5c 5hQc 6dJs 2d7d",
      Solver.process("texas-holdem 5d9hKdQdTh Ts5c 8sAd 5hQc 5s2s 9s6c 2d7d 6dJs 9c8h Qs8c"));
  }

  @Test
  public void test_texas_holdem_9871_3s4h8dAdTh_As8s_4cTs_6h6d_7h8c_9d7d() {
    assertEquals(
      "9d7d 6h6d 7h8c 4cTs As8s",
      Solver.process("texas-holdem 3s4h8dAdTh As8s 4cTs 6h6d 7h8c 9d7d"));
  }

  @Test
  public void test_texas_holdem_9872_2d5c7sJsQd_8sQs_4d8h() {
    assertEquals(
      "4d8h 8sQs",
      Solver.process("texas-holdem 2d5c7sJsQd 8sQs 4d8h"));
  }

  @Test
  public void test_texas_holdem_9873_2sJcJsKhKs_3sTc_TdTh_3c6h_2d8d_8s8c_7h4h_QcAs() {
    assertEquals(
      "3c6h 7h4h 2d8d=8s8c 3sTc=TdTh QcAs",
      Solver.process("texas-holdem 2sJcJsKhKs 3sTc TdTh 3c6h 2d8d 8s8c 7h4h QcAs"));
  }

  @Test
  public void test_texas_holdem_9874_4s7h8sAdKc_JdJc_6dJh_9d2h_5sQh_9sAh() {
    assertEquals(
      "9d2h 6dJh 5sQh JdJc 9sAh",
      Solver.process("texas-holdem 4s7h8sAdKc JdJc 6dJh 9d2h 5sQh 9sAh"));
  }

  @Test
  public void test_texas_holdem_9875_2c9hKdTcTs_7h9s_Td4h_2dQs_5c6s_3h6h_AcAs_Ah6c_Ad3c() {
    assertEquals(
      "3h6h=5c6s Ad3c=Ah6c 2dQs 7h9s AcAs Td4h",
      Solver.process("texas-holdem 2c9hKdTcTs 7h9s Td4h 2dQs 5c6s 3h6h AcAs Ah6c Ad3c"));
  }

  @Test
  public void test_texas_holdem_9876_3h8c8hKhQd_Ac6c_Kc4h_5d6d_QhQs() {
    assertEquals(
      "5d6d Ac6c Kc4h QhQs",
      Solver.process("texas-holdem 3h8c8hKhQd Ac6c Kc4h 5d6d QhQs"));
  }

  @Test
  public void test_texas_holdem_9877_2c7d8dJcQh_Th6d_9h7h_2d8c_Ad5s_8sQs_9dJh() {
    assertEquals(
      "Th6d Ad5s 9h7h 9dJh 2d8c 8sQs",
      Solver.process("texas-holdem 2c7d8dJcQh Th6d 9h7h 2d8c Ad5s 8sQs 9dJh"));
  }

  @Test
  public void test_texas_holdem_9878_2s5c9c9hKh_Ac2c_Th3c() {
    assertEquals(
      "Th3c Ac2c",
      Solver.process("texas-holdem 2s5c9c9hKh Ac2c Th3c"));
  }

  @Test
  public void test_texas_holdem_9879_2h4d4hKdKs_3c4s_ThJs_3d8c_4cTd_6d5d_5s2d_2s2c() {
    assertEquals(
      "5s2d 6d5d 3d8c ThJs 2s2c 3c4s=4cTd",
      Solver.process("texas-holdem 2h4d4hKdKs 3c4s ThJs 3d8c 4cTd 6d5d 5s2d 2s2c"));
  }

  @Test
  public void test_texas_holdem_9880_2h2s3s5dQd_6s6h_7d7h_9d8c_2d9h_5cAs() {
    assertEquals(
      "9d8c 5cAs 6s6h 7d7h 2d9h",
      Solver.process("texas-holdem 2h2s3s5dQd 6s6h 7d7h 9d8c 2d9h 5cAs"));
  }

  @Test
  public void test_texas_holdem_9881_2h4d4h6sQc_8cQd_JdJs_9dTc() {
    assertEquals(
      "9dTc JdJs 8cQd",
      Solver.process("texas-holdem 2h4d4h6sQc 8cQd JdJs 9dTc"));
  }

  @Test
  public void test_texas_holdem_9882_3d7s8s9sJh_4hKh_7d6c_8h6s_Jd3c_7h8d_QdTd_5sTc() {
    assertEquals(
      "4hKh 7d6c 8h6s 7h8d Jd3c 5sTc QdTd",
      Solver.process("texas-holdem 3d7s8s9sJh 4hKh 7d6c 8h6s Jd3c 7h8d QdTd 5sTc"));
  }

  @Test
  public void test_texas_holdem_9883_2h3h8c9dJh_As8d_QhAh_JsJc_4c6s_2d6h_9h3c() {
    assertEquals(
      "4c6s 2d6h As8d 9h3c JsJc QhAh",
      Solver.process("texas-holdem 2h3h8c9dJh As8d QhAh JsJc 4c6s 2d6h 9h3c"));
  }

  @Test
  public void test_texas_holdem_9884_2d3h5c5dTs_9cTh_KcJc_Td6h() {
    assertEquals(
      "KcJc Td6h 9cTh",
      Solver.process("texas-holdem 2d3h5c5dTs 9cTh KcJc Td6h"));
  }

  @Test
  public void test_texas_holdem_9885_2d8hAcJsTc_Qs5s_9h3s() {
    assertEquals(
      "9h3s Qs5s",
      Solver.process("texas-holdem 2d8hAcJsTc Qs5s 9h3s"));
  }

  @Test
  public void test_texas_holdem_9886_6c6h9dAdJc_QdQs_2s2c_QcTs_7cAh_4c4h() {
    assertEquals(
      "QcTs 2s2c 4c4h QdQs 7cAh",
      Solver.process("texas-holdem 6c6h9dAdJc QdQs 2s2c QcTs 7cAh 4c4h"));
  }

  @Test
  public void test_texas_holdem_9887_2d6d9sAsTd_Qd3s_5c9h_7s5d_7hKd_Th3c_Js5h_9c4c() {
    assertEquals(
      "7s5d Js5h Qd3s 7hKd 5c9h=9c4c Th3c",
      Solver.process("texas-holdem 2d6d9sAsTd Qd3s 5c9h 7s5d 7hKd Th3c Js5h 9c4c"));
  }

  @Test
  public void test_texas_holdem_9888_8sAcJdKdQs_Jc6h_9s6d_2c4h() {
    assertEquals(
      "2c4h 9s6d Jc6h",
      Solver.process("texas-holdem 8sAcJdKdQs Jc6h 9s6d 2c4h"));
  }

  @Test
  public void test_texas_holdem_9889_3d6s7c8h9c_5dKc_2d4h_4dAs_5hKs_Td9s_Qc3s_KdJc_JhJs() {
    assertEquals(
      "2d4h KdJc 4dAs Qc3s JhJs 5dKc=5hKs Td9s",
      Solver.process("texas-holdem 3d6s7c8h9c 5dKc 2d4h 4dAs 5hKs Td9s Qc3s KdJc JhJs"));
  }

  @Test
  public void test_texas_holdem_9890_3c4h8c8dQs_TsKh_7sQd_4d9d_9sKs() {
    assertEquals(
      "9sKs TsKh 4d9d 7sQd",
      Solver.process("texas-holdem 3c4h8c8dQs TsKh 7sQd 4d9d 9sKs"));
  }

  @Test
  public void test_texas_holdem_9891_2c5c5h7h8h_3h8c_5d6h_7dQd() {
    assertEquals(
      "7dQd 3h8c 5d6h",
      Solver.process("texas-holdem 2c5c5h7h8h 3h8c 5d6h 7dQd"));
  }

  @Test
  public void test_texas_holdem_9892_3d4h7cJdQd_8cTd_KcTs_8s9s() {
    assertEquals(
      "8s9s 8cTd KcTs",
      Solver.process("texas-holdem 3d4h7cJdQd 8cTd KcTs 8s9s"));
  }

  @Test
  public void test_texas_holdem_9893_6c6h7c8hAs_2c7s_Kc9d_Tc7d_9cTh_2h3d_Ad4s_JcQc_Qd3s() {
    assertEquals(
      "2h3d Qd3s JcQc Kc9d 2c7s=Tc7d Ad4s 9cTh",
      Solver.process("texas-holdem 6c6h7c8hAs 2c7s Kc9d Tc7d 9cTh 2h3d Ad4s JcQc Qd3s"));
  }

  @Test
  public void test_texas_holdem_9894_5s9c9sQsTs_Ad7c_4hQd_5c4c_Tc2c_Kd8h_8sJc_JsQh_3cKc_5h7s() {
    assertEquals(
      "3cKc=Kd8h Ad7c 5c4c Tc2c 4hQd 5h7s 8sJc JsQh",
      Solver.process("texas-holdem 5s9c9sQsTs Ad7c 4hQd 5c4c Tc2c Kd8h 8sJc JsQh 3cKc 5h7s"));
  }

  @Test
  public void test_texas_holdem_9895_6h7c7h9cAh_2h9d_KsQs_3h3c_Tc9h_2d2s_3d9s() {
    assertEquals(
      "KsQs 2d2s 3h3c 2h9d=3d9s=Tc9h",
      Solver.process("texas-holdem 6h7c7h9cAh 2h9d KsQs 3h3c Tc9h 2d2s 3d9s"));
  }

  @Test
  public void test_texas_holdem_9896_4h6d8hAdTd_5s5c_JhKc_8c3s_3d3c_TsQh_7hAh_9cQs_Jd2d_AcQd() {
    assertEquals(
      "9cQs JhKc 3d3c 5s5c 8c3s TsQh 7hAh AcQd Jd2d",
      Solver.process("texas-holdem 4h6d8hAdTd 5s5c JhKc 8c3s 3d3c TsQh 7hAh 9cQs Jd2d AcQd"));
  }

  @Test
  public void test_texas_holdem_9897_2h6d7s8sAs_Jc8d_9cKs_AdKd_8c4s() {
    assertEquals(
      "9cKs 8c4s Jc8d AdKd",
      Solver.process("texas-holdem 2h6d7s8sAs Jc8d 9cKs AdKd 8c4s"));
  }

  @Test
  public void test_texas_holdem_9898_4s6d8hKcKs_6hJd_2h7c_Th7h_8d2c_7d5s_Ah3h_2s9c() {
    assertEquals(
      "2h7c 2s9c Th7h Ah3h 6hJd 8d2c 7d5s",
      Solver.process("texas-holdem 4s6d8hKcKs 6hJd 2h7c Th7h 8d2c 7d5s Ah3h 2s9c"));
  }

  @Test
  public void test_texas_holdem_9899_4h5c5sAsKd_5dTh_5h6h() {
    assertEquals(
      "5dTh=5h6h",
      Solver.process("texas-holdem 4h5c5sAsKd 5dTh 5h6h"));
  }

  @Test
  public void test_texas_holdem_9900_4c8d9hJsTs_KhTd_Jh6c_3sKd_QsKs_7c7s_Qh6d_7hQd_As6h_Kc3h() {
    assertEquals(
      "3sKd=Kc3h As6h KhTd Jh6c 7c7s 7hQd=Qh6d QsKs",
      Solver.process("texas-holdem 4c8d9hJsTs KhTd Jh6c 3sKd QsKs 7c7s Qh6d 7hQd As6h Kc3h"));
  }

  @Test
  public void test_texas_holdem_9901_2c2d3c4hKc_5s8s_9d7s() {
    assertEquals(
      "5s8s 9d7s",
      Solver.process("texas-holdem 2c2d3c4hKc 5s8s 9d7s"));
  }

  @Test
  public void test_texas_holdem_9902_3c6d6s7sJd_2s2c_Ts7h_7d9s_AdJs_6hKh_Ac5c() {
    assertEquals(
      "Ac5c 2s2c 7d9s=Ts7h AdJs 6hKh",
      Solver.process("texas-holdem 3c6d6s7sJd 2s2c Ts7h 7d9s AdJs 6hKh Ac5c"));
  }

  @Test
  public void test_texas_holdem_9903_3d4h8c9hTs_6sKd_Th7c_4c9s_Ac4s_2h2d() {
    assertEquals(
      "6sKd 2h2d Ac4s Th7c 4c9s",
      Solver.process("texas-holdem 3d4h8c9hTs 6sKd Th7c 4c9s Ac4s 2h2d"));
  }

  @Test
  public void test_texas_holdem_9904_3c6c9hJhQs_4dJs_9c7h_5sJc_KcAh_Ts7s() {
    assertEquals(
      "Ts7s KcAh 9c7h 4dJs=5sJc",
      Solver.process("texas-holdem 3c6c9hJhQs 4dJs 9c7h 5sJc KcAh Ts7s"));
  }

  @Test
  public void test_texas_holdem_9905_2d3d3h4s9c_ThAd_4dTd_Jc5d() {
    assertEquals(
      "Jc5d ThAd 4dTd",
      Solver.process("texas-holdem 2d3d3h4s9c ThAd 4dTd Jc5d"));
  }

  @Test
  public void test_texas_holdem_9906_2c3d7s8d8h_Tc3h_Ad7d() {
    assertEquals(
      "Tc3h Ad7d",
      Solver.process("texas-holdem 2c3d7s8d8h Tc3h Ad7d"));
  }

  @Test
  public void test_texas_holdem_9907_3c7h8cKdQs_3dAs_3sKc_9h2s_AcQc_Th9d_3h7c() {
    assertEquals(
      "9h2s Th9d 3dAs AcQc 3h7c 3sKc",
      Solver.process("texas-holdem 3c7h8cKdQs 3dAs 3sKc 9h2s AcQc Th9d 3h7c"));
  }

  @Test
  public void test_texas_holdem_9908_4c5cJdKsTc_ThQh_Jh3c_5s8c_KcKh_QdKd_7s2h_6d5h_4h2d_3h7h() {
    assertEquals(
      "3h7h=7s2h 4h2d 5s8c=6d5h ThQh Jh3c QdKd KcKh",
      Solver.process("texas-holdem 4c5cJdKsTc ThQh Jh3c 5s8c KcKh QdKd 7s2h 6d5h 4h2d 3h7h"));
  }

  @Test
  public void test_texas_holdem_9909_3dAcAhAsKc_5d2h_2cJh_TsAd_3s4s_9c8d_5h2s_3h9d() {
    assertEquals(
      "5d2h=5h2s 9c8d 2cJh 3h9d=3s4s TsAd",
      Solver.process("texas-holdem 3dAcAhAsKc 5d2h 2cJh TsAd 3s4s 9c8d 5h2s 3h9d"));
  }

  @Test
  public void test_texas_holdem_9910_3c3d3hQcTh_6dAd_KsJs() {
    assertEquals(
      "KsJs 6dAd",
      Solver.process("texas-holdem 3c3d3hQcTh 6dAd KsJs"));
  }

  @Test
  public void test_texas_holdem_9911_5c9c9d9hTc_Ts3d_KsTd_ThAh_Jc6c_5dKh_Js3h_6d8h_Jh7s_6h2d() {
    assertEquals(
      "6h2d 6d8h Jh7s=Js3h Jc6c 5dKh KsTd=ThAh=Ts3d",
      Solver.process("texas-holdem 5c9c9d9hTc Ts3d KsTd ThAh Jc6c 5dKh Js3h 6d8h Jh7s 6h2d"));
  }

  @Test
  public void test_texas_holdem_9912_8h9cJcKcQs_As8s_4d5s_7d3s_QdTs_5dKh_9d6c_3h5h() {
    assertEquals(
      "3h5h=4d5s=7d3s As8s 9d6c 5dKh QdTs",
      Solver.process("texas-holdem 8h9cJcKcQs As8s 4d5s 7d3s QdTs 5dKh 9d6c 3h5h"));
  }

  @Test
  public void test_texas_holdem_9913_4h6s7h8sAs_5d2d_Th3h_7s7d_2cTs_AhAd() {
    assertEquals(
      "2cTs=Th3h 7s7d AhAd 5d2d",
      Solver.process("texas-holdem 4h6s7h8sAs 5d2d Th3h 7s7d 2cTs AhAd"));
  }

  @Test
  public void test_texas_holdem_9914_2c2dJhTdTs_8h6s_9sQs_5h7c_9hQc_8dKd() {
    assertEquals(
      "5h7c=8h6s 9hQc=9sQs 8dKd",
      Solver.process("texas-holdem 2c2dJhTdTs 8h6s 9sQs 5h7c 9hQc 8dKd"));
  }

  @Test
  public void test_texas_holdem_9915_2h3s4sJcKs_Kc7h_AcJh() {
    assertEquals(
      "AcJh Kc7h",
      Solver.process("texas-holdem 2h3s4sJcKs Kc7h AcJh"));
  }

  @Test
  public void test_texas_holdem_9916_7d9dAcTcTd_Js2c_Ah7h_Qs3c_JdQh_Ts7c_5dJh() {
    assertEquals(
      "5dJh=Js2c Qs3c JdQh Ah7h Ts7c",
      Solver.process("texas-holdem 7d9dAcTcTd Js2c Ah7h Qs3c JdQh Ts7c 5dJh"));
  }

  @Test
  public void test_texas_holdem_9917_4c4h4s6s8c_Kc3s_9sQd_2s2d_9h9d_5s7h_7d8d_AdTc_Th2h_2c8s() {
    assertEquals(
      "Th2h 9sQd Kc3s AdTc 5s7h 2s2d 2c8s=7d8d 9h9d",
      Solver.process("texas-holdem 4c4h4s6s8c Kc3s 9sQd 2s2d 9h9d 5s7h 7d8d AdTc Th2h 2c8s"));
  }

  @Test
  public void test_texas_holdem_9918_3s4s7s9cJh_Qh8d_2sQs_8cAd_2c6c_9hTd_JsAc() {
    assertEquals(
      "2c6c Qh8d 8cAd 9hTd JsAc 2sQs",
      Solver.process("texas-holdem 3s4s7s9cJh Qh8d 2sQs 8cAd 2c6c 9hTd JsAc"));
  }

  @Test
  public void test_texas_holdem_9919_2s5d6c9sQh_Jh3c_7s4c_2hTd_JcQs() {
    assertEquals(
      "7s4c Jh3c 2hTd JcQs",
      Solver.process("texas-holdem 2s5d6c9sQh Jh3c 7s4c 2hTd JcQs"));
  }

  @Test
  public void test_texas_holdem_9920_4c4hAdQhQs_Jc3c_7hAh_9cJs_Jh8c_Qd7c_8hKh() {
    assertEquals(
      "8hKh=9cJs=Jc3c=Jh8c 7hAh Qd7c",
      Solver.process("texas-holdem 4c4hAdQhQs Jc3c 7hAh 9cJs Jh8c Qd7c 8hKh"));
  }

  @Test
  public void test_texas_holdem_9921_5c7hAcTdTs_5s3c_TcQh_Qd2d_9d2c_4sAh_9h6c_6hJc_7dTh_9s4c() {
    assertEquals(
      "9d2c=9h6c=9s4c 6hJc Qd2d 5s3c 4sAh TcQh 7dTh",
      Solver.process("texas-holdem 5c7hAcTdTs 5s3c TcQh Qd2d 9d2c 4sAh 9h6c 6hJc 7dTh 9s4c"));
  }

  @Test
  public void test_texas_holdem_9922_5d5h7dKhTs_4cKs_QhKd() {
    assertEquals(
      "4cKs QhKd",
      Solver.process("texas-holdem 5d5h7dKhTs 4cKs QhKd"));
  }

  @Test
  public void test_texas_holdem_9923_4c4s5d9sQh_3h4h_Jh7c_Ad3s() {
    assertEquals(
      "Jh7c Ad3s 3h4h",
      Solver.process("texas-holdem 4c4s5d9sQh 3h4h Jh7c Ad3s"));
  }

  @Test
  public void test_texas_holdem_9924_4h6c6d8c9c_7s2h_8sTc_AdKc_QcTh_4c3h_9h3d_7dKd() {
    assertEquals(
      "7s2h QcTh 7dKd AdKc 4c3h 8sTc 9h3d",
      Solver.process("texas-holdem 4h6c6d8c9c 7s2h 8sTc AdKc QcTh 4c3h 9h3d 7dKd"));
  }

  @Test
  public void test_texas_holdem_9925_2s4c5h7h9h_AsAd_Jh9c_4sKh_2dQh_6sKc_5sTh_6c8h_6h6d_Ac8s() {
    assertEquals(
      "6sKc Ac8s 2dQh 4sKh 5sTh 6h6d Jh9c AsAd 6c8h",
      Solver.process("texas-holdem 2s4c5h7h9h AsAd Jh9c 4sKh 2dQh 6sKc 5sTh 6c8h 6h6d Ac8s"));
  }

  @Test
  public void test_texas_holdem_9926_7h8sAcAdKc_2d8d_5c4s_Js3c_5hJd_Ah4h_6h7d_Qc7c_2hQs_2s9s() {
    assertEquals(
      "5c4s 2s9s 5hJd=Js3c 2hQs 6h7d=Qc7c 2d8d Ah4h",
      Solver.process("texas-holdem 7h8sAcAdKc 2d8d 5c4s Js3c 5hJd Ah4h 6h7d Qc7c 2hQs 2s9s"));
  }

  @Test
  public void test_texas_holdem_9927_2s6d7cAcAs_3c9h_3h6c() {
    assertEquals(
      "3c9h 3h6c",
      Solver.process("texas-holdem 2s6d7cAcAs 3c9h 3h6c"));
  }

  @Test
  public void test_texas_holdem_9928_3d4h5s7cAs_Ks2c_Ac8s_9sQs_3sTs_9cKd_9h3c_Th5d() {
    assertEquals(
      "9sQs 9cKd 9h3c 3sTs Th5d Ac8s Ks2c",
      Solver.process("texas-holdem 3d4h5s7cAs Ks2c Ac8s 9sQs 3sTs 9cKd 9h3c Th5d"));
  }

  @Test
  public void test_texas_holdem_9929_2d7s8cAcJs_4hQh_3hQs_KsAh_5c8d_3d2c_4s8s_9c9d_Kd3s() {
    assertEquals(
      "3hQs=4hQh Kd3s 3d2c 4s8s=5c8d 9c9d KsAh",
      Solver.process("texas-holdem 2d7s8cAcJs 4hQh 3hQs KsAh 5c8d 3d2c 4s8s 9c9d Kd3s"));
  }

  @Test
  public void test_texas_holdem_9930_7hJhKhQhTs_JcQs_4s5s_As2s_6cQd_9s4d_9cAh_6s3h() {
    assertEquals(
      "4s5s 6cQd JcQs 9s4d As2s 6s3h 9cAh",
      Solver.process("texas-holdem 7hJhKhQhTs JcQs 4s5s As2s 6cQd 9s4d 9cAh 6s3h"));
  }

  @Test
  public void test_texas_holdem_9931_2h3s5d7hKd_Kc4c_9s9c_4hJs_TdTh_QhQs_9hAc_Jh2s_3c8h() {
    assertEquals(
      "4hJs 9hAc Jh2s 3c8h 9s9c TdTh QhQs Kc4c",
      Solver.process("texas-holdem 2h3s5d7hKd Kc4c 9s9c 4hJs TdTh QhQs 9hAc Jh2s 3c8h"));
  }

  @Test
  public void test_texas_holdem_9932_2h4c5dKcTs_KdQd_AcKh_Js8h_As3c_5s6h() {
    assertEquals(
      "Js8h 5s6h KdQd AcKh As3c",
      Solver.process("texas-holdem 2h4c5dKcTs KdQd AcKh Js8h As3c 5s6h"));
  }

  @Test
  public void test_texas_holdem_9933_3s5d8hJcJs_Kc2c_7hQh_Ts6h_4cAd() {
    assertEquals(
      "Ts6h 7hQh Kc2c 4cAd",
      Solver.process("texas-holdem 3s5d8hJcJs Kc2c 7hQh Ts6h 4cAd"));
  }

  @Test
  public void test_texas_holdem_9934_2s8c9h9sJd_3h4d_4sKc_5h8h_JcJs_3s8s_2cKh_5cAh_2hQc() {
    assertEquals(
      "3h4d 4sKc 5cAh 2hQc 2cKh 3s8s=5h8h JcJs",
      Solver.process("texas-holdem 2s8c9h9sJd 3h4d 4sKc 5h8h JcJs 3s8s 2cKh 5cAh 2hQc"));
  }

  @Test
  public void test_texas_holdem_9935_JsKcKdQdTh_2h5d_As4s_7sKh_TsAh_2c2s_Qc5h() {
    assertEquals(
      "2h5d 2c2s Qc5h 7sKh As4s=TsAh",
      Solver.process("texas-holdem JsKcKdQdTh 2h5d As4s 7sKh TsAh 2c2s Qc5h"));
  }

  @Test
  public void test_texas_holdem_9936_2c2hKsThTs_Qs9h_9c8d_5dKh_4sKd_4hAd_Jc6c_9dQc() {
    assertEquals(
      "9c8d=9dQc=Jc6c=Qs9h 4hAd 4sKd 5dKh",
      Solver.process("texas-holdem 2c2hKsThTs Qs9h 9c8d 5dKh 4sKd 4hAd Jc6c 9dQc"));
  }

  @Test
  public void test_texas_holdem_9937_7c7dAcKhQd_3c8c_9h4s_JsQc_9cJh() {
    assertEquals(
      "3c8c=9cJh=9h4s JsQc",
      Solver.process("texas-holdem 7c7dAcKhQd 3c8c 9h4s JsQc 9cJh"));
  }

  @Test
  public void test_texas_holdem_9938_4d7h8c9hTs_4s2c_7c8s() {
    assertEquals(
      "4s2c 7c8s",
      Solver.process("texas-holdem 4d7h8c9hTs 4s2c 7c8s"));
  }

  @Test
  public void test_texas_holdem_9939_2s3d4s9c9h_QdJs_8h8d_6s2h() {
    assertEquals(
      "QdJs 6s2h 8h8d",
      Solver.process("texas-holdem 2s3d4s9c9h QdJs 8h8d 6s2h"));
  }

  @Test
  public void test_texas_holdem_9940_5h8hJsKcTc_AhTh_Ad3h() {
    assertEquals(
      "Ad3h AhTh",
      Solver.process("texas-holdem 5h8hJsKcTc AhTh Ad3h"));
  }

  @Test
  public void test_texas_holdem_9941_3h5c5s9d9s_JdKh_Js9h_2cTc_As6s_Qd6d_7dTh_7cTd_4d9c() {
    assertEquals(
      "2cTc=7cTd=7dTh Qd6d JdKh As6s 4d9c=Js9h",
      Solver.process("texas-holdem 3h5c5s9d9s JdKh Js9h 2cTc As6s Qd6d 7dTh 7cTd 4d9c"));
  }

  @Test
  public void test_texas_holdem_9942_3hJdJsQdTc_3c6h_8s4c_5h8c_Jc7d_2cAd_9h9s_2h3s_Qh6d() {
    assertEquals(
      "5h8c=8s4c 2cAd 2h3s=3c6h 9h9s Qh6d Jc7d",
      Solver.process("texas-holdem 3hJdJsQdTc 3c6h 8s4c 5h8c Jc7d 2cAd 9h9s 2h3s Qh6d"));
  }

  @Test
  public void test_texas_holdem_9943_5c7s8c8d9c_Qs4h_6d4s() {
    assertEquals(
      "Qs4h 6d4s",
      Solver.process("texas-holdem 5c7s8c8d9c Qs4h 6d4s"));
  }

  @Test
  public void test_texas_holdem_9944_4s5cAhKdTs_TcAc_Jc9d_3cTd_Jh2d_3s8c_5d6s_7dJs() {
    assertEquals(
      "3s8c Jh2d 7dJs Jc9d 5d6s 3cTd TcAc",
      Solver.process("texas-holdem 4s5cAhKdTs TcAc Jc9d 3cTd Jh2d 3s8c 5d6s 7dJs"));
  }

  @Test
  public void test_texas_holdem_9945_5h6s7sQsTs_5d9d_AhTc_6h7h_Th6d_AcJd_4sQh_Jc4h_3hAs_Qc8c() {
    assertEquals(
      "Jc4h AcJd 5d9d AhTc Qc8c 6h7h Th6d 4sQh 3hAs",
      Solver.process("texas-holdem 5h6s7sQsTs 5d9d AhTc 6h7h Th6d AcJd 4sQh Jc4h 3hAs Qc8c"));
  }

  @Test
  public void test_texas_holdem_9946_5s7d7hAsTd_5hQc_5dJh_8c7s_3cQd_2c8s_QsJs_2hKs_9s6d_6sKh() {
    assertEquals(
      "2c8s 9s6d 3cQd QsJs 2hKs=6sKh 5dJh=5hQc 8c7s",
      Solver.process("texas-holdem 5s7d7hAsTd 5hQc 5dJh 8c7s 3cQd 2c8s QsJs 2hKs 9s6d 6sKh"));
  }

  @Test
  public void test_texas_holdem_9947_2h6d7cJdKd_QsTd_5dTc_Kh5c() {
    assertEquals(
      "5dTc QsTd Kh5c",
      Solver.process("texas-holdem 2h6d7cJdKd QsTd 5dTc Kh5c"));
  }

  @Test
  public void test_texas_holdem_9948_3d3s8d8sJc_Ah6s_Js6d_KdAc_Tc4s_7h8c_2s4h_9dQc() {
    assertEquals(
      "2s4h=Tc4s 9dQc Ah6s=KdAc Js6d 7h8c",
      Solver.process("texas-holdem 3d3s8d8sJc Ah6s Js6d KdAc Tc4s 7h8c 2s4h 9dQc"));
  }

  @Test
  public void test_texas_holdem_9949_5h7s8s9cKs_4sQs_4c8d_7d5s_6dKd_JsKc_9s4d_Jd9d() {
    assertEquals(
      "4c8d 9s4d Jd9d JsKc 7d5s 6dKd 4sQs",
      Solver.process("texas-holdem 5h7s8s9cKs 4sQs 4c8d 7d5s 6dKd JsKc 9s4d Jd9d"));
  }

  @Test
  public void test_texas_holdem_9950_3c6s7dAhTs_4hKc_5h8c_7s9d_KsAd() {
    assertEquals(
      "5h8c 4hKc 7s9d KsAd",
      Solver.process("texas-holdem 3c6s7dAhTs 4hKc 5h8c 7s9d KsAd"));
  }

  @Test
  public void test_texas_holdem_9951_2c4c6d7sQd_8d8s_2sQs() {
    assertEquals(
      "8d8s 2sQs",
      Solver.process("texas-holdem 2c4c6d7sQd 8d8s 2sQs"));
  }

  @Test
  public void test_texas_holdem_9952_3c3hKsQcQs_TdQd_Th8d_Ah2c_9h5s_9sKh_7c4d() {
    assertEquals(
      "7c4d=9h5s=Th8d Ah2c 9sKh TdQd",
      Solver.process("texas-holdem 3c3hKsQcQs TdQd Th8d Ah2c 9h5s 9sKh 7c4d"));
  }

  @Test
  public void test_texas_holdem_9953_3d6hJsQcTc_Qh7h_5s4h_7d5c() {
    assertEquals(
      "5s4h 7d5c Qh7h",
      Solver.process("texas-holdem 3d6hJsQcTc Qh7h 5s4h 7d5c"));
  }

  @Test
  public void test_texas_holdem_9954_4c6c8hJdKc_7d9c_8c5s_2d2s_JhQc_Ts6d_6hKs_7s6s() {
    assertEquals(
      "7d9c 2d2s 7s6s Ts6d 8c5s JhQc 6hKs",
      Solver.process("texas-holdem 4c6c8hJdKc 7d9c 8c5s 2d2s JhQc Ts6d 6hKs 7s6s"));
  }

  @Test
  public void test_texas_holdem_9955_3d5h6s9hTh_8d6c_9sJh() {
    assertEquals(
      "8d6c 9sJh",
      Solver.process("texas-holdem 3d5h6s9hTh 8d6c 9sJh"));
  }

  @Test
  public void test_texas_holdem_9956_3c3d5d6h9h_3hKh_6c2s_Td4h() {
    assertEquals(
      "Td4h 6c2s 3hKh",
      Solver.process("texas-holdem 3c3d5d6h9h 3hKh 6c2s Td4h"));
  }

  @Test
  public void test_texas_holdem_9957_6d8h9sAhQs_7d9h_2c4h_5cQc_Qd2h_Ks2d() {
    assertEquals(
      "2c4h Ks2d 7d9h 5cQc=Qd2h",
      Solver.process("texas-holdem 6d8h9sAhQs 7d9h 2c4h 5cQc Qd2h Ks2d"));
  }

  @Test
  public void test_texas_holdem_9958_2d3s8d9sQd_Qh6s_7c9c_KsJc_6dJd_7s4d_Kh4s_2cQs_8c6h_4c9h() {
    assertEquals(
      "7s4d Kh4s KsJc 8c6h 4c9h 7c9c Qh6s 2cQs 6dJd",
      Solver.process("texas-holdem 2d3s8d9sQd Qh6s 7c9c KsJc 6dJd 7s4d Kh4s 2cQs 8c6h 4c9h"));
  }

  @Test
  public void test_texas_holdem_9959_4s7cAsKhKs_Qd9h_4hKc_7d9c_2h7h_4c7s_2c5d_Qh2d_3d2s_8c5c() {
    assertEquals(
      "3d2s 2c5d 8c5c Qh2d Qd9h 2h7h=4c7s=7d9c 4hKc",
      Solver.process("texas-holdem 4s7cAsKhKs Qd9h 4hKc 7d9c 2h7h 4c7s 2c5d Qh2d 3d2s 8c5c"));
  }

  @Test
  public void test_texas_holdem_9960_8c9hAsKdKh_5s7s_7h7c_KcJd_Qc2s() {
    assertEquals(
      "5s7s Qc2s 7h7c KcJd",
      Solver.process("texas-holdem 8c9hAsKdKh 5s7s 7h7c KcJd Qc2s"));
  }

  @Test
  public void test_texas_holdem_9961_4d6d7dAdKc_Tc7c_4c4h_As3c_7h9d_2s6h_8s5s_Ks8h() {
    assertEquals(
      "2s6h Tc7c Ks8h As3c 4c4h 8s5s 7h9d",
      Solver.process("texas-holdem 4d6d7dAdKc Tc7c 4c4h As3c 7h9d 2s6h 8s5s Ks8h"));
  }

  @Test
  public void test_texas_holdem_9962_3c9hKdKsTd_2dKc_4c6c_QcJs_TsJc_QhQd_Qs9d_8cTc_Jh4s() {
    assertEquals(
      "4c6c Jh4s Qs9d 8cTc TsJc QhQd 2dKc QcJs",
      Solver.process("texas-holdem 3c9hKdKsTd 2dKc 4c6c QcJs TsJc QhQd Qs9d 8cTc Jh4s"));
  }

  @Test
  public void test_texas_holdem_9963_3c4h8hJcJh_9s5h_JsAd_2h4d_5dKh_5s9h_6s8d_AhQh_3h7s() {
    assertEquals(
      "5s9h=9s5h 5dKh 3h7s 2h4d 6s8d JsAd AhQh",
      Solver.process("texas-holdem 3c4h8hJcJh 9s5h JsAd 2h4d 5dKh 5s9h 6s8d AhQh 3h7s"));
  }

  @Test
  public void test_texas_holdem_9964_2h3c6cAsJc_TdKd_Ac8c_8hKh_3hAh_7c3d_Jh6d_5hTh() {
    assertEquals(
      "5hTh 8hKh TdKd 7c3d Jh6d 3hAh Ac8c",
      Solver.process("texas-holdem 2h3c6cAsJc TdKd Ac8c 8hKh 3hAh 7c3d Jh6d 5hTh"));
  }

  @Test
  public void test_texas_holdem_9965_3h7hJcKcQh_Qs9c_8h6d() {
    assertEquals(
      "8h6d Qs9c",
      Solver.process("texas-holdem 3h7hJcKcQh Qs9c 8h6d"));
  }

  @Test
  public void test_texas_holdem_9966_2s3s4c6dQs_8cAs_7hJc_9d4h_4s6h() {
    assertEquals(
      "7hJc 8cAs 9d4h 4s6h",
      Solver.process("texas-holdem 2s3s4c6dQs 8cAs 7hJc 9d4h 4s6h"));
  }

  @Test
  public void test_texas_holdem_9967_7cAdAsJsTs_QhAc_Kc9c_Qd3h_Qc9h_Tc8d_5d6h_Ah6s() {
    assertEquals(
      "5d6h Qc9h=Qd3h Kc9c Tc8d Ah6s QhAc",
      Solver.process("texas-holdem 7cAdAsJsTs QhAc Kc9c Qd3h Qc9h Tc8d 5d6h Ah6s"));
  }

  @Test
  public void test_texas_holdem_9968_2h7dAcJcQh_2c5d_4c4d_Jh6s_9c6d_4h2s_8s9h() {
    assertEquals(
      "9c6d 8s9h 2c5d=4h2s 4c4d Jh6s",
      Solver.process("texas-holdem 2h7dAcJcQh 2c5d 4c4d Jh6s 9c6d 4h2s 8s9h"));
  }

  @Test
  public void test_texas_holdem_9969_3d7h9h9sQd_8hAc_5h3c_2hKs_9cQh_TdAd_Kc6c_JsJc_ThKh_3s7c() {
    assertEquals(
      "2hKs=Kc6c ThKh 8hAc TdAd 5h3c 3s7c JsJc 9cQh",
      Solver.process("texas-holdem 3d7h9h9sQd 8hAc 5h3c 2hKs 9cQh TdAd Kc6c JsJc ThKh 3s7c"));
  }

  @Test
  public void test_texas_holdem_9970_3c4h9sAhJc_TcQh_Td2h_6d9c_Js2c_3dKh() {
    assertEquals(
      "Td2h TcQh 3dKh 6d9c Js2c",
      Solver.process("texas-holdem 3c4h9sAhJc TcQh Td2h 6d9c Js2c 3dKh"));
  }

  @Test
  public void test_texas_holdem_9971_3d5h6sAsKc_2d7h_Js8h() {
    assertEquals(
      "2d7h Js8h",
      Solver.process("texas-holdem 3d5h6sAsKc 2d7h Js8h"));
  }

  @Test
  public void test_texas_holdem_9972_5cAdKcKhQs_Td6c_8c3d_2h9h_Jh3h_8sTc_Qh4s_JsKs_4h2s_5d6d() {
    assertEquals(
      "4h2s 8c3d 2h9h 8sTc=Td6c Jh3h 5d6d Qh4s JsKs",
      Solver.process("texas-holdem 5cAdKcKhQs Td6c 8c3d 2h9h Jh3h 8sTc Qh4s JsKs 4h2s 5d6d"));
  }

  @Test
  public void test_texas_holdem_9973_2h3c4hAhKh_QsKs_6h3d_9cJs_5sQh() {
    assertEquals(
      "9cJs QsKs 6h3d 5sQh",
      Solver.process("texas-holdem 2h3c4hAhKh QsKs 6h3d 9cJs 5sQh"));
  }

  @Test
  public void test_texas_holdem_9974_3dKdKsQhTd_Ah6c_Js5h_2h8d_3cJh_QcJc_Tc3s_7sKc() {
    assertEquals(
      "2h8d Js5h Ah6c 3cJh Tc3s QcJc 7sKc",
      Solver.process("texas-holdem 3dKdKsQhTd Ah6c Js5h 2h8d 3cJh QcJc Tc3s 7sKc"));
  }

  @Test
  public void test_texas_holdem_9975_6hAhKcKsTd_Kd8h_TcQh() {
    assertEquals(
      "TcQh Kd8h",
      Solver.process("texas-holdem 6hAhKcKsTd Kd8h TcQh"));
  }

  @Test
  public void test_texas_holdem_9976_5h7d8sAdJd_6c9d_ThQs() {
    assertEquals(
      "ThQs 6c9d",
      Solver.process("texas-holdem 5h7d8sAdJd 6c9d ThQs"));
  }

  @Test
  public void test_texas_holdem_9977_3h4c5hJdQs_6s2s_9d6h() {
    assertEquals(
      "9d6h 6s2s",
      Solver.process("texas-holdem 3h4c5hJdQs 6s2s 9d6h"));
  }

  @Test
  public void test_texas_holdem_9978_3d5s6h7dQs_AsKs_TcJh() {
    assertEquals(
      "TcJh AsKs",
      Solver.process("texas-holdem 3d5s6h7dQs AsKs TcJh"));
  }

  @Test
  public void test_texas_holdem_9979_3c3s6h8c9s_7dJs_QdAs_TdQs_5sQh_2sJd_7sJh_3hTs_4hTh() {
    assertEquals(
      "4hTh 2sJd=7dJs=7sJh 5sQh TdQs QdAs 3hTs",
      Solver.process("texas-holdem 3c3s6h8c9s 7dJs QdAs TdQs 5sQh 2sJd 7sJh 3hTs 4hTh"));
  }

  @Test
  public void test_texas_holdem_9980_6dKcKdQcQd_Qh5c_2h8d_6h2c_5d4h_Qs5h() {
    assertEquals(
      "5d4h=6h2c 2h8d Qh5c=Qs5h",
      Solver.process("texas-holdem 6dKcKdQcQd Qh5c 2h8d 6h2c 5d4h Qs5h"));
  }

  @Test
  public void test_texas_holdem_9981_2c6c9dJsQd_3c4d_5cJh_ThJd_2h6s_6d9c_3sTc() {
    assertEquals(
      "3c4d 3sTc 5cJh ThJd 2h6s 6d9c",
      Solver.process("texas-holdem 2c6c9dJsQd 3c4d 5cJh ThJd 2h6s 6d9c 3sTc"));
  }

  @Test
  public void test_texas_holdem_9982_3d4s5cQcTc_QdQs_Jc8s_5dKc_5s2c_3c4d_8c7s_8d6h() {
    assertEquals(
      "8d6h 8c7s Jc8s 5s2c 5dKc 3c4d QdQs",
      Solver.process("texas-holdem 3d4s5cQcTc QdQs Jc8s 5dKc 5s2c 3c4d 8c7s 8d6h"));
  }

  @Test
  public void test_texas_holdem_9983_3s4h8d9hKs_Kh5s_2s6c_JhTh_QcAc() {
    assertEquals(
      "2s6c JhTh QcAc Kh5s",
      Solver.process("texas-holdem 3s4h8d9hKs Kh5s 2s6c JhTh QcAc"));
  }

  @Test
  public void test_texas_holdem_9984_5d7h8dKhTc_8h5h_KsQs() {
    assertEquals(
      "KsQs 8h5h",
      Solver.process("texas-holdem 5d7h8dKhTc 8h5h KsQs"));
  }

  @Test
  public void test_texas_holdem_9985_3s4s9sKhTc_3hAc_2d7d_Kd5d_4hAd() {
    assertEquals(
      "2d7d 3hAc 4hAd Kd5d",
      Solver.process("texas-holdem 3s4s9sKhTc 3hAc 2d7d Kd5d 4hAd"));
  }

  @Test
  public void test_texas_holdem_9986_2c6s8cQcTh_Qh4d_9c8d_5c6c_Tc3d() {
    assertEquals(
      "9c8d Tc3d Qh4d 5c6c",
      Solver.process("texas-holdem 2c6s8cQcTh Qh4d 9c8d 5c6c Tc3d"));
  }

  @Test
  public void test_texas_holdem_9987_3c5c5d6cTc_Ac8c_6sJs_Qh3d() {
    assertEquals(
      "Qh3d 6sJs Ac8c",
      Solver.process("texas-holdem 3c5c5d6cTc Ac8c 6sJs Qh3d"));
  }

  @Test
  public void test_texas_holdem_9988_3c5h8d9dAh_Jd4h_TsJc_9h6c_Td8s_2d3h_3d9s_8c6s() {
    assertEquals(
      "Jd4h TsJc 2d3h 8c6s Td8s 9h6c 3d9s",
      Solver.process("texas-holdem 3c5h8d9dAh Jd4h TsJc 9h6c Td8s 2d3h 3d9s 8c6s"));
  }

  @Test
  public void test_texas_holdem_9989_3c3s5h6c8c_KdQh_2d7h_Js5c_Qc9d_9h7c_9s2s_4cQd_5dTs_Td3h() {
    assertEquals(
      "2d7h 9s2s 4cQd Qc9d KdQh 5dTs Js5c Td3h 9h7c",
      Solver.process("texas-holdem 3c3s5h6c8c KdQh 2d7h Js5c Qc9d 9h7c 9s2s 4cQd 5dTs Td3h"));
  }

  @Test
  public void test_texas_holdem_9990_2s9cAcQhTc_5hAs_6sKs_6h6c_2c8h_6d9d_TsKd_Jh2d() {
    assertEquals(
      "6sKs 2c8h Jh2d 6h6c 6d9d TsKd 5hAs",
      Solver.process("texas-holdem 2s9cAcQhTc 5hAs 6sKs 6h6c 2c8h 6d9d TsKd Jh2d"));
  }

  @Test
  public void test_texas_holdem_9991_2c4d5d6s7h_QdAs_9c2h_7cKh_7sTs_Jd3d_9hKc_Jc5s_7d6c() {
    assertEquals(
      "9hKc QdAs 9c2h Jc5s 7sTs 7cKh 7d6c Jd3d",
      Solver.process("texas-holdem 2c4d5d6s7h QdAs 9c2h 7cKh 7sTs Jd3d 9hKc Jc5s 7d6c"));
  }

  @Test
  public void test_texas_holdem_9992_2c7sAhQhTh_Td7c_Kc5s() {
    assertEquals(
      "Kc5s Td7c",
      Solver.process("texas-holdem 2c7sAhQhTh Td7c Kc5s"));
  }

  @Test
  public void test_texas_holdem_9993_2c4d5s7sJs_Qd8c_6dKc_6h5c_4c3s() {
    assertEquals(
      "Qd8c 6dKc 4c3s 6h5c",
      Solver.process("texas-holdem 2c4d5s7sJs Qd8c 6dKc 6h5c 4c3s"));
  }

  @Test
  public void test_texas_holdem_9994_6cKdKhQcTs_9hQd_Jc4d_Jh4s_3c8h_AsAc_5d2c() {
    assertEquals(
      "5d2c 3c8h Jc4d=Jh4s 9hQd AsAc",
      Solver.process("texas-holdem 6cKdKhQcTs 9hQd Jc4d Jh4s 3c8h AsAc 5d2c"));
  }

  @Test
  public void test_texas_holdem_9995_2d3sAhJhQh_ThAs_5h9h_4c8h_QcAd_JsQs_2s4h() {
    assertEquals(
      "4c8h 2s4h ThAs JsQs QcAd 5h9h",
      Solver.process("texas-holdem 2d3sAhJhQh ThAs 5h9h 4c8h QcAd JsQs 2s4h"));
  }

  @Test
  public void test_texas_holdem_9996_3h4c4dAhQd_Jh2h_3c7h_9s8d_3s5s_4h9d_KhAs_9c6d_7c2c_KsAc() {
    assertEquals(
      "7c2c 9c6d=9s8d Jh2h 3c7h=3s5s KhAs=KsAc 4h9d",
      Solver.process("texas-holdem 3h4c4dAhQd Jh2h 3c7h 9s8d 3s5s 4h9d KhAs 9c6d 7c2c KsAc"));
  }

  @Test
  public void test_texas_holdem_9997_2d3d8h9hQd_9d5h_7sJh_5s6d_Js9s() {
    assertEquals(
      "5s6d 7sJh 9d5h Js9s",
      Solver.process("texas-holdem 2d3d8h9hQd 9d5h 7sJh 5s6d Js9s"));
  }

  @Test
  public void test_texas_holdem_9998_5c8s9d9hKc_8h3d_JsQs_2s7h_4s5h_Jd2d() {
    assertEquals(
      "2s7h Jd2d JsQs 4s5h 8h3d",
      Solver.process("texas-holdem 5c8s9d9hKc 8h3d JsQs 2s7h 4s5h Jd2d"));
  }

  @Test
  public void test_texas_holdem_9999_3c4s5d9hKc_Ac4c_8s2c_5sTh_Kh6c() {
    assertEquals(
      "8s2c Ac4c 5sTh Kh6c",
      Solver.process("texas-holdem 3c4s5d9hKc Ac4c 8s2c 5sTh Kh6c"));
  }

}
