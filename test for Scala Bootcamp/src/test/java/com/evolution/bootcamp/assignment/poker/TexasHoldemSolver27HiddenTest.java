
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver27HiddenTest {


  @Test
  public void test_texas_holdem_6750_2s7d8c8hTs_8s7h_Qh8d_Ks2c_4d6h_6s9c_Tc3d_3sKc() {
    assertEquals(
      "4d6h 3sKc Ks2c Tc3d Qh8d 6s9c 8s7h",
      Solver.process("texas-holdem 2s7d8c8hTs 8s7h Qh8d Ks2c 4d6h 6s9c Tc3d 3sKc"));
  }

  @Test
  public void test_texas_holdem_6751_5d5h7c9cJs_KcTd_6c9s() {
    assertEquals(
      "KcTd 6c9s",
      Solver.process("texas-holdem 5d5h7c9cJs KcTd 6c9s"));
  }

  @Test
  public void test_texas_holdem_6752_6h8sAdKcQc_7sJs_3hJc() {
    assertEquals(
      "3hJc=7sJs",
      Solver.process("texas-holdem 6h8sAdKcQc 7sJs 3hJc"));
  }

  @Test
  public void test_texas_holdem_6753_2s4h8dAdQd_Qh3h_Jd9h_5c4c_AsTh_3s6c_8s3c_3dJc() {
    assertEquals(
      "3s6c 3dJc Jd9h 5c4c 8s3c Qh3h AsTh",
      Solver.process("texas-holdem 2s4h8dAdQd Qh3h Jd9h 5c4c AsTh 3s6c 8s3c 3dJc"));
  }

  @Test
  public void test_texas_holdem_6754_2d3s9hJhKc_Ac8s_Qs6d_4d9d_4c5d_8hTs() {
    assertEquals(
      "4c5d 8hTs Qs6d Ac8s 4d9d",
      Solver.process("texas-holdem 2d3s9hJhKc Ac8s Qs6d 4d9d 4c5d 8hTs"));
  }

  @Test
  public void test_texas_holdem_6755_2h3h4dQdTc_AhJh_5s5h_JsAd() {
    assertEquals(
      "AhJh=JsAd 5s5h",
      Solver.process("texas-holdem 2h3h4dQdTc AhJh 5s5h JsAd"));
  }

  @Test
  public void test_texas_holdem_6756_2d3cAdAsKh_Kd8h_8s2c_6c7h_Ks6h_5hJs_3d8c_3s5s() {
    assertEquals(
      "6c7h 5hJs 8s2c 3d8c=3s5s Ks6h Kd8h",
      Solver.process("texas-holdem 2d3cAdAsKh Kd8h 8s2c 6c7h Ks6h 5hJs 3d8c 3s5s"));
  }

  @Test
  public void test_texas_holdem_6757_3h4d4s6sJs_2d2c_3c5c_4c5s_Th6c_8cQs_7dKc_TcKh() {
    assertEquals(
      "8cQs 7dKc TcKh 2d2c 3c5c Th6c 4c5s",
      Solver.process("texas-holdem 3h4d4s6sJs 2d2c 3c5c 4c5s Th6c 8cQs 7dKc TcKh"));
  }

  @Test
  public void test_texas_holdem_6758_2d4c4h8d9c_3d2c_QdTs_3cTd() {
    assertEquals(
      "3cTd QdTs 3d2c",
      Solver.process("texas-holdem 2d4c4h8d9c 3d2c QdTs 3cTd"));
  }

  @Test
  public void test_texas_holdem_6759_6cAdQsTdTs_7c4d_5dKd_5sJc() {
    assertEquals(
      "7c4d 5sJc 5dKd",
      Solver.process("texas-holdem 6cAdQsTdTs 7c4d 5dKd 5sJc"));
  }

  @Test
  public void test_texas_holdem_6760_2c5d8cTcTd_AsJs_Qd7h_4c2s_AhTh_6h6d_6s5h() {
    assertEquals(
      "Qd7h AsJs 4c2s 6s5h 6h6d AhTh",
      Solver.process("texas-holdem 2c5d8cTcTd AsJs Qd7h 4c2s AhTh 6h6d 6s5h"));
  }

  @Test
  public void test_texas_holdem_6761_2c3h8c8sJc_TdKc_2sTs_TcKd_QdAh_9dQs_5sAc() {
    assertEquals(
      "9dQs TcKd=TdKc 5sAc QdAh 2sTs",
      Solver.process("texas-holdem 2c3h8c8sJc TdKc 2sTs TcKd QdAh 9dQs 5sAc"));
  }

  @Test
  public void test_texas_holdem_6762_2h8c9d9hJh_KcJd_QdKh_7h8s() {
    assertEquals(
      "QdKh 7h8s KcJd",
      Solver.process("texas-holdem 2h8c9d9hJh KcJd QdKh 7h8s"));
  }

  @Test
  public void test_texas_holdem_6763_4c7s8c9hKd_Jc3d_5c2h_ThTs_Qs6c_5d7c() {
    assertEquals(
      "5c2h Jc3d Qs6c 5d7c ThTs",
      Solver.process("texas-holdem 4c7s8c9hKd Jc3d 5c2h ThTs Qs6c 5d7c"));
  }

  @Test
  public void test_texas_holdem_6764_2s3d8h9dQs_Tc6s_Js6h() {
    assertEquals(
      "Tc6s Js6h",
      Solver.process("texas-holdem 2s3d8h9dQs Tc6s Js6h"));
  }

  @Test
  public void test_texas_holdem_6765_3c8cAhQhTh_8d6c_7c4s_5h3s_4dQs_6s5s_2h2s() {
    assertEquals(
      "6s5s 7c4s 2h2s 5h3s 8d6c 4dQs",
      Solver.process("texas-holdem 3c8cAhQhTh 8d6c 7c4s 5h3s 4dQs 6s5s 2h2s"));
  }

  @Test
  public void test_texas_holdem_6766_8sJdJsKsQc_9s4s_7c2h_3cAh_9d7s() {
    assertEquals(
      "7c2h 9d7s 3cAh 9s4s",
      Solver.process("texas-holdem 8sJdJsKsQc 9s4s 7c2h 3cAh 9d7s"));
  }

  @Test
  public void test_texas_holdem_6767_2d4s6d8sAc_Qs5s_KhTs_KdJh_4hTh_3hKs() {
    assertEquals(
      "Qs5s 3hKs KhTs KdJh 4hTh",
      Solver.process("texas-holdem 2d4s6d8sAc Qs5s KhTs KdJh 4hTh 3hKs"));
  }

  @Test
  public void test_texas_holdem_6768_2d4d5c5dKc_Ts3c_2s9h_2h5h() {
    assertEquals(
      "Ts3c 2s9h 2h5h",
      Solver.process("texas-holdem 2d4d5c5dKc Ts3c 2s9h 2h5h"));
  }

  @Test
  public void test_texas_holdem_6769_2d3s6dKcKd_AsTs_Jd3c_4dQd_3h9d_7cAh_7h6h_ThQc() {
    assertEquals(
      "ThQc 7cAh AsTs 3h9d Jd3c 7h6h 4dQd",
      Solver.process("texas-holdem 2d3s6dKcKd AsTs Jd3c 4dQd 3h9d 7cAh 7h6h ThQc"));
  }

  @Test
  public void test_texas_holdem_6770_4h6dAhTcTs_3sKs_5hJh() {
    assertEquals(
      "5hJh 3sKs",
      Solver.process("texas-holdem 4h6dAhTcTs 3sKs 5hJh"));
  }

  @Test
  public void test_texas_holdem_6771_3c4d9sAcQd_6h9h_JcQc_4c2d_Qh5d_9d3s() {
    assertEquals(
      "4c2d 6h9h Qh5d JcQc 9d3s",
      Solver.process("texas-holdem 3c4d9sAcQd 6h9h JcQc 4c2d Qh5d 9d3s"));
  }

  @Test
  public void test_texas_holdem_6772_6c6d7c8cKh_6sAh_2h3s_3d4d_5h8h_QcQd_4sKs_9s5c() {
    assertEquals(
      "2h3s=3d4d 5h8h QcQd 4sKs 6sAh 9s5c",
      Solver.process("texas-holdem 6c6d7c8cKh 6sAh 2h3s 3d4d 5h8h QcQd 4sKs 9s5c"));
  }

  @Test
  public void test_texas_holdem_6773_2s5h6d6h7d_3h3c_KhQs_2d3s_7s9h() {
    assertEquals(
      "KhQs 2d3s 3h3c 7s9h",
      Solver.process("texas-holdem 2s5h6d6h7d 3h3c KhQs 2d3s 7s9h"));
  }

  @Test
  public void test_texas_holdem_6774_2h3h5d5h6c_3cJd_KcTc() {
    assertEquals(
      "KcTc 3cJd",
      Solver.process("texas-holdem 2h3h5d5h6c 3cJd KcTc"));
  }

  @Test
  public void test_texas_holdem_6775_4s5s7c7hTc_Ts2c_6s9d_Kd2s_Kh2h_5d3s_Th4d() {
    assertEquals(
      "6s9d Kd2s=Kh2h 5d3s Th4d=Ts2c",
      Solver.process("texas-holdem 4s5s7c7hTc Ts2c 6s9d Kd2s Kh2h 5d3s Th4d"));
  }

  @Test
  public void test_texas_holdem_6776_2d3d3hAcTs_7cQd_Kc8d_Ks8h_6dQc_Ah5d_2h2s_JsTh() {
    assertEquals(
      "6dQc=7cQd Kc8d=Ks8h JsTh Ah5d 2h2s",
      Solver.process("texas-holdem 2d3d3hAcTs 7cQd Kc8d Ks8h 6dQc Ah5d 2h2s JsTh"));
  }

  @Test
  public void test_texas_holdem_6777_3c3s8h9sQh_9d2s_JdAh_9hKh_QcAs_Js7h_9cTd() {
    assertEquals(
      "Js7h JdAh 9cTd=9d2s 9hKh QcAs",
      Solver.process("texas-holdem 3c3s8h9sQh 9d2s JdAh 9hKh QcAs Js7h 9cTd"));
  }

  @Test
  public void test_texas_holdem_6778_3s8sAhKhQh_7c6s_2s3d_8h6d_Jc7d_6h2h_Jd4s_6cKc_QsJh_JsKs() {
    assertEquals(
      "7c6s Jc7d=Jd4s 2s3d 8h6d QsJh 6cKc JsKs 6h2h",
      Solver.process("texas-holdem 3s8sAhKhQh 7c6s 2s3d 8h6d Jc7d 6h2h Jd4s 6cKc QsJh JsKs"));
  }

  @Test
  public void test_texas_holdem_6779_8sAsKhQcTs_2s4s_3sJh_KdKs_TdTc_Kc8h_Ah5h_9d9h_3c5s() {
    assertEquals(
      "3c5s 9d9h Ah5h Kc8h TdTc KdKs 3sJh 2s4s",
      Solver.process("texas-holdem 8sAsKhQcTs 2s4s 3sJh KdKs TdTc Kc8h Ah5h 9d9h 3c5s"));
  }

  @Test
  public void test_texas_holdem_6780_6sAcJhQhTc_Kc2s_3d7h_5hTh() {
    assertEquals(
      "3d7h 5hTh Kc2s",
      Solver.process("texas-holdem 6sAcJhQhTc Kc2s 3d7h 5hTh"));
  }

  @Test
  public void test_texas_holdem_6781_AhJdKdQdTd_7d5s_AdJc_8dTs_2c6h_2dKh() {
    assertEquals(
      "2c6h 2dKh 7d5s 8dTs AdJc",
      Solver.process("texas-holdem AhJdKdQdTd 7d5s AdJc 8dTs 2c6h 2dKh"));
  }

  @Test
  public void test_texas_holdem_6782_2h3h8dAcTh_9s7s_7hQc_5d6c() {
    assertEquals(
      "5d6c 9s7s 7hQc",
      Solver.process("texas-holdem 2h3h8dAcTh 9s7s 7hQc 5d6c"));
  }

  @Test
  public void test_texas_holdem_6783_4d5c6s8sKc_JhJs_7hTd_AsKh_6dQs_2h8h_9sQc_2c9c_5s6c_Th3c() {
    assertEquals(
      "2c9c Th3c 9sQc 6dQs 2h8h JhJs AsKh 5s6c 7hTd",
      Solver.process("texas-holdem 4d5c6s8sKc JhJs 7hTd AsKh 6dQs 2h8h 9sQc 2c9c 5s6c Th3c"));
  }

  @Test
  public void test_texas_holdem_6784_2c2h7dAcTs_Kd8s_Th2d_9d6c_Jh6s_9c8h_3s9h_5dJc() {
    assertEquals(
      "3s9h=9c8h=9d6c 5dJc=Jh6s Kd8s Th2d",
      Solver.process("texas-holdem 2c2h7dAcTs Kd8s Th2d 9d6c Jh6s 9c8h 3s9h 5dJc"));
  }

  @Test
  public void test_texas_holdem_6785_2d5dJsKcKh_AsJc_6c4d_4s2s_8d6s_JdQc_Qd4c_9d5s() {
    assertEquals(
      "6c4d 8d6s Qd4c 4s2s 9d5s JdQc AsJc",
      Solver.process("texas-holdem 2d5dJsKcKh AsJc 6c4d 4s2s 8d6s JdQc Qd4c 9d5s"));
  }

  @Test
  public void test_texas_holdem_6786_3h5c5d7cJd_2sQc_8c8d() {
    assertEquals(
      "2sQc 8c8d",
      Solver.process("texas-holdem 3h5c5d7cJd 2sQc 8c8d"));
  }

  @Test
  public void test_texas_holdem_6787_8hAdQcQhTs_4c9s_2h3c() {
    assertEquals(
      "2h3c 4c9s",
      Solver.process("texas-holdem 8hAdQcQhTs 4c9s 2h3c"));
  }

  @Test
  public void test_texas_holdem_6788_5h6d8cAdKc_2d4h_3c8h_5d6s_As9c() {
    assertEquals(
      "2d4h 3c8h As9c 5d6s",
      Solver.process("texas-holdem 5h6d8cAdKc 2d4h 3c8h 5d6s As9c"));
  }

  @Test
  public void test_texas_holdem_6789_5h8d9sQcQd_8h6s_9c2c_3s4h_Ts9h() {
    assertEquals(
      "3s4h 8h6s 9c2c Ts9h",
      Solver.process("texas-holdem 5h8d9sQcQd 8h6s 9c2c 3s4h Ts9h"));
  }

  @Test
  public void test_texas_holdem_6790_2s5h9cKdTs_TdKc_7d2h_8dTh_8h5s() {
    assertEquals(
      "7d2h 8h5s 8dTh TdKc",
      Solver.process("texas-holdem 2s5h9cKdTs TdKc 7d2h 8dTh 8h5s"));
  }

  @Test
  public void test_texas_holdem_6791_2h3s8d8sKh_KcJc_9c4d_5c2d() {
    assertEquals(
      "9c4d 5c2d KcJc",
      Solver.process("texas-holdem 2h3s8d8sKh KcJc 9c4d 5c2d"));
  }

  @Test
  public void test_texas_holdem_6792_2c5h6h8h9s_Qh6s_Ac7s_Th4h_Jh3s_QsAd() {
    assertEquals(
      "Jh3s QsAd Qh6s Ac7s Th4h",
      Solver.process("texas-holdem 2c5h6h8h9s Qh6s Ac7s Th4h Jh3s QsAd"));
  }

  @Test
  public void test_texas_holdem_6793_3h8cKcKdTs_5c6s_Jd3d_Td8h_Jc8d() {
    assertEquals(
      "5c6s Jd3d Jc8d Td8h",
      Solver.process("texas-holdem 3h8cKcKdTs 5c6s Jd3d Td8h Jc8d"));
  }

  @Test
  public void test_texas_holdem_6794_3d6c6h8hQs_6s7d_KsKc_2sQh_7h9s() {
    assertEquals(
      "7h9s 2sQh KsKc 6s7d",
      Solver.process("texas-holdem 3d6c6h8hQs 6s7d KsKc 2sQh 7h9s"));
  }

  @Test
  public void test_texas_holdem_6795_6s7dJsKsQc_8s5s_Jh9h_8h3d_Th5h_JdJc_8dTs_AhQs_4s9d() {
    assertEquals(
      "8h3d 4s9d Th5h 8dTs Jh9h AhQs JdJc 8s5s",
      Solver.process("texas-holdem 6s7dJsKsQc 8s5s Jh9h 8h3d Th5h JdJc 8dTs AhQs 4s9d"));
  }

  @Test
  public void test_texas_holdem_6796_3d8dAcAhQs_ThTs_3h6d_2d7s() {
    assertEquals(
      "2d7s 3h6d ThTs",
      Solver.process("texas-holdem 3d8dAcAhQs ThTs 3h6d 2d7s"));
  }

  @Test
  public void test_texas_holdem_6797_2c8dJsKhQc_JdQd_Kd3c_2h6h_9c5h_6sAh_2sTh_4d5c() {
    assertEquals(
      "4d5c 9c5h 6sAh 2h6h=2sTh Kd3c JdQd",
      Solver.process("texas-holdem 2c8dJsKhQc JdQd Kd3c 2h6h 9c5h 6sAh 2sTh 4d5c"));
  }

  @Test
  public void test_texas_holdem_6798_4h4s7cAsQd_3s2s_7hJs_Ts2d_5hKh_Ks6s_7sJc_5c3d() {
    assertEquals(
      "3s2s=5c3d Ts2d 5hKh=Ks6s 7hJs=7sJc",
      Solver.process("texas-holdem 4h4s7cAsQd 3s2s 7hJs Ts2d 5hKh Ks6s 7sJc 5c3d"));
  }

  @Test
  public void test_texas_holdem_6799_3s7c7s8dKh_3cTc_8c4h_3hJs() {
    assertEquals(
      "3cTc=3hJs 8c4h",
      Solver.process("texas-holdem 3s7c7s8dKh 3cTc 8c4h 3hJs"));
  }

  @Test
  public void test_texas_holdem_6800_4h4s6s7hKs_2cQc_8d9s_KcKd_5s2d_9hAd_3hTs_Jc5h() {
    assertEquals(
      "5s2d 8d9s 3hTs Jc5h 2cQc 9hAd KcKd",
      Solver.process("texas-holdem 4h4s6s7hKs 2cQc 8d9s KcKd 5s2d 9hAd 3hTs Jc5h"));
  }

  @Test
  public void test_texas_holdem_6801_2c3h4s7cTh_6d2d_6sTd_8hJd() {
    assertEquals(
      "8hJd 6d2d 6sTd",
      Solver.process("texas-holdem 2c3h4s7cTh 6d2d 6sTd 8hJd"));
  }

  @Test
  public void test_texas_holdem_6802_AcAsJdQhQs_9cQd_4s2d() {
    assertEquals(
      "4s2d 9cQd",
      Solver.process("texas-holdem AcAsJdQhQs 9cQd 4s2d"));
  }

  @Test
  public void test_texas_holdem_6803_6h8dAdJhTs_As9s_3hQc_4c6c_6dQd_Jc5s_Ac9d_2h3c_2c2s_KdKs() {
    assertEquals(
      "2h3c 3hQc 2c2s 4c6c 6dQd Jc5s KdKs Ac9d=As9s",
      Solver.process("texas-holdem 6h8dAdJhTs As9s 3hQc 4c6c 6dQd Jc5s Ac9d 2h3c 2c2s KdKs"));
  }

  @Test
  public void test_texas_holdem_6804_2c3c7c8hKd_9hJs_3s5c_3h5h_Td9d_KhTc_6dJd_Qs4c() {
    assertEquals(
      "Td9d 6dJd 9hJs Qs4c 3h5h=3s5c KhTc",
      Solver.process("texas-holdem 2c3c7c8hKd 9hJs 3s5c 3h5h Td9d KhTc 6dJd Qs4c"));
  }

  @Test
  public void test_texas_holdem_6805_8hAdAsJdQc_2d7c_7s6d_9h9s_TdQs_Jc6h_Ah8c_9dTc_Jh3s() {
    assertEquals(
      "2d7c=7s6d 9h9s Jc6h=Jh3s TdQs 9dTc Ah8c",
      Solver.process("texas-holdem 8hAdAsJdQc 2d7c 7s6d 9h9s TdQs Jc6h Ah8c 9dTc Jh3s"));
  }

  @Test
  public void test_texas_holdem_6806_4c5s6s7hJd_AcTs_9sTd_Ah4d_9hJh_3s7s_Tc4s_9d2s_8d4h() {
    assertEquals(
      "9d2s 9sTd AcTs Tc4s Ah4d 9hJh 3s7s 8d4h",
      Solver.process("texas-holdem 4c5s6s7hJd AcTs 9sTd Ah4d 9hJh 3s7s Tc4s 9d2s 8d4h"));
  }

  @Test
  public void test_texas_holdem_6807_2h3d7c7hQs_6h8d_5hKc_3hAs_5dQh() {
    assertEquals(
      "6h8d 5hKc 3hAs 5dQh",
      Solver.process("texas-holdem 2h3d7c7hQs 6h8d 5hKc 3hAs 5dQh"));
  }

  @Test
  public void test_texas_holdem_6808_6c8hJsQdTs_Kd8d_2d5d_7s9d_5cJh_Ad6s_5hQc_6d4h_9cJd() {
    assertEquals(
      "2d5d 6d4h Ad6s Kd8d 5cJh 5hQc 7s9d=9cJd",
      Solver.process("texas-holdem 6c8hJsQdTs Kd8d 2d5d 7s9d 5cJh Ad6s 5hQc 6d4h 9cJd"));
  }

  @Test
  public void test_texas_holdem_6809_4c4d4h6sJh_6hAc_8h7h_Jc3c_TdQd() {
    assertEquals(
      "8h7h TdQd 6hAc Jc3c",
      Solver.process("texas-holdem 4c4d4h6sJh 6hAc 8h7h Jc3c TdQd"));
  }

  @Test
  public void test_texas_holdem_6810_6hJdJhQdTs_Js3s_7h8h_5h9s_6d2d_Tc5d_Kc3c_4d9d_Kh6c() {
    assertEquals(
      "7h8h 4d9d=5h9s Kc3c 6d2d Kh6c Tc5d Js3s",
      Solver.process("texas-holdem 6hJdJhQdTs Js3s 7h8h 5h9s 6d2d Tc5d Kc3c 4d9d Kh6c"));
  }

  @Test
  public void test_texas_holdem_6811_5s6hJdKhKs_8dQh_9s6s_3d8h_7h2c_Ah5c_Ad2d() {
    assertEquals(
      "7h2c 3d8h 8dQh Ad2d Ah5c 9s6s",
      Solver.process("texas-holdem 5s6hJdKhKs 8dQh 9s6s 3d8h 7h2c Ah5c Ad2d"));
  }

  @Test
  public void test_texas_holdem_6812_2s4dQdTcTd_Th9h_7c8c_8d3d_Jh4h_2h6c() {
    assertEquals(
      "7c8c 2h6c Jh4h Th9h 8d3d",
      Solver.process("texas-holdem 2s4dQdTcTd Th9h 7c8c 8d3d Jh4h 2h6c"));
  }

  @Test
  public void test_texas_holdem_6813_3c6c6hQdQh_9s5d_5c5s() {
    assertEquals(
      "5c5s 9s5d",
      Solver.process("texas-holdem 3c6c6hQdQh 9s5d 5c5s"));
  }

  @Test
  public void test_texas_holdem_6814_5sJsKdQcTd_8s8c_8hTh_Qh3s_9d2h_AhJc() {
    assertEquals(
      "8s8c 8hTh Qh3s 9d2h AhJc",
      Solver.process("texas-holdem 5sJsKdQcTd 8s8c 8hTh Qh3s 9d2h AhJc"));
  }

  @Test
  public void test_texas_holdem_6815_4c5c5h9cTc_QcTs_6hAs_8s8h_6cAc_6s8d_4h8c_QdKc() {
    assertEquals(
      "6s8d 6hAs 8s8h 4h8c QcTs QdKc 6cAc",
      Solver.process("texas-holdem 4c5c5h9cTc QcTs 6hAs 8s8h 6cAc 6s8d 4h8c QdKc"));
  }

  @Test
  public void test_texas_holdem_6816_8d8h9cThTs_Kc9h_8cJd() {
    assertEquals(
      "Kc9h 8cJd",
      Solver.process("texas-holdem 8d8h9cThTs Kc9h 8cJd"));
  }

  @Test
  public void test_texas_holdem_6817_6d7h9sJcKs_7c3s_KdQh_AdAc_Qd3c_4dTd() {
    assertEquals(
      "4dTd Qd3c 7c3s KdQh AdAc",
      Solver.process("texas-holdem 6d7h9sJcKs 7c3s KdQh AdAc Qd3c 4dTd"));
  }

  @Test
  public void test_texas_holdem_6818_2h4h7hAhKc_Jh9s_2dQh() {
    assertEquals(
      "Jh9s 2dQh",
      Solver.process("texas-holdem 2h4h7hAhKc Jh9s 2dQh"));
  }

  @Test
  public void test_texas_holdem_6819_2cAhJcKcKh_5s3s_JsTh_As4c() {
    assertEquals(
      "5s3s JsTh As4c",
      Solver.process("texas-holdem 2cAhJcKcKh 5s3s JsTh As4c"));
  }

  @Test
  public void test_texas_holdem_6820_3s7s8sAcAh_AsQh_3hJh_9dKd_7dQd_Jc9h_6s7h_3c4s() {
    assertEquals(
      "Jc9h 9dKd 3c4s 3hJh 6s7h 7dQd AsQh",
      Solver.process("texas-holdem 3s7s8sAcAh AsQh 3hJh 9dKd 7dQd Jc9h 6s7h 3c4s"));
  }

  @Test
  public void test_texas_holdem_6821_3h6c8c9hQd_6hQh_9cTd() {
    assertEquals(
      "9cTd 6hQh",
      Solver.process("texas-holdem 3h6c8c9hQd 6hQh 9cTd"));
  }

  @Test
  public void test_texas_holdem_6822_7d9sKdQcTs_Ad6c_5sQd_5d4h_JsAs_5c3s_TcTh_6d8c_3d7c() {
    assertEquals(
      "5c3s=5d4h Ad6c 3d7c 5sQd TcTh 6d8c JsAs",
      Solver.process("texas-holdem 7d9sKdQcTs Ad6c 5sQd 5d4h JsAs 5c3s TcTh 6d8c 3d7c"));
  }

  @Test
  public void test_texas_holdem_6823_2c5c9cAdKh_9sJd_7dTs_4sAs_2sAh_5s7h_TdQd() {
    assertEquals(
      "7dTs TdQd 5s7h 9sJd 4sAs 2sAh",
      Solver.process("texas-holdem 2c5c9cAdKh 9sJd 7dTs 4sAs 2sAh 5s7h TdQd"));
  }

  @Test
  public void test_texas_holdem_6824_2c7h8cJdQc_KsAc_Kh2d_5s3s_5h7c_As7d_9dTc_Kd3h_6h6c() {
    assertEquals(
      "5s3s Kd3h KsAc Kh2d 6h6c 5h7c As7d 9dTc",
      Solver.process("texas-holdem 2c7h8cJdQc KsAc Kh2d 5s3s 5h7c As7d 9dTc Kd3h 6h6c"));
  }

  @Test
  public void test_texas_holdem_6825_2s7cAhKhQh_4hJc_Ks9h_4d5d_JdAd() {
    assertEquals(
      "4d5d 4hJc Ks9h JdAd",
      Solver.process("texas-holdem 2s7cAhKhQh 4hJc Ks9h 4d5d JdAd"));
  }

  @Test
  public void test_texas_holdem_6826_6d7s8dQhQs_7d9d_8h6c_6sJs_Th6h_5hTd_8cQd_7c2s_2cAs() {
    assertEquals(
      "5hTd 2cAs Th6h 6sJs 7c2s 7d9d 8h6c 8cQd",
      Solver.process("texas-holdem 6d7s8dQhQs 7d9d 8h6c 6sJs Th6h 5hTd 8cQd 7c2s 2cAs"));
  }

  @Test
  public void test_texas_holdem_6827_2d3hAhJhTd_2h9d_5c9h() {
    assertEquals(
      "5c9h 2h9d",
      Solver.process("texas-holdem 2d3hAhJhTd 2h9d 5c9h"));
  }

  @Test
  public void test_texas_holdem_6828_4dAdJcJdJh_6d8d_9h6c_KsTd_TcAs_2c8c_Kh5c_4c6s() {
    assertEquals(
      "2c8c 9h6c Kh5c=KsTd 6d8d 4c6s TcAs",
      Solver.process("texas-holdem 4dAdJcJdJh 6d8d 9h6c KsTd TcAs 2c8c Kh5c 4c6s"));
  }

  @Test
  public void test_texas_holdem_6829_3c3sAsJcKc_4hQs_6hTh_Ah5d_7sQc_Kd9h_Qd2d() {
    assertEquals(
      "6hTh 4hQs=7sQc=Qd2d Kd9h Ah5d",
      Solver.process("texas-holdem 3c3sAsJcKc 4hQs 6hTh Ah5d 7sQc Kd9h Qd2d"));
  }

  @Test
  public void test_texas_holdem_6830_3h3s5h6hAs_5s8s_Qc2d_5cTc_QhQs_Td9c_7c8h_9d3c_4cKs() {
    assertEquals(
      "7c8h Td9c Qc2d 4cKs 5cTc=5s8s QhQs 9d3c",
      Solver.process("texas-holdem 3h3s5h6hAs 5s8s Qc2d 5cTc QhQs Td9c 7c8h 9d3c 4cKs"));
  }

  @Test
  public void test_texas_holdem_6831_2h6hKsQhQs_3c7h_7cKc_Ah9s_2c4s_Jd8h() {
    assertEquals(
      "3c7h Jd8h Ah9s 2c4s 7cKc",
      Solver.process("texas-holdem 2h6hKsQhQs 3c7h 7cKc Ah9s 2c4s Jd8h"));
  }

  @Test
  public void test_texas_holdem_6832_5c8c9hJhQc_Qd6d_4c8d_Ts6c_Th7c_2c4d_Kd7d_TdJd_8s3h_7s4s() {
    assertEquals(
      "2c4d 7s4s Kd7d 4c8d=8s3h Qd6d TdJd=Th7c=Ts6c",
      Solver.process("texas-holdem 5c8c9hJhQc Qd6d 4c8d Ts6c Th7c 2c4d Kd7d TdJd 8s3h 7s4s"));
  }

  @Test
  public void test_texas_holdem_6833_5c6d8s9hJc_3cKh_As9d_2dQs_5d5h() {
    assertEquals(
      "2dQs 3cKh As9d 5d5h",
      Solver.process("texas-holdem 5c6d8s9hJc 3cKh As9d 2dQs 5d5h"));
  }

  @Test
  public void test_texas_holdem_6834_4s5d9sJdTc_Qh6d_4d8d_AsJc_7cQc() {
    assertEquals(
      "Qh6d 7cQc 4d8d AsJc",
      Solver.process("texas-holdem 4s5d9sJdTc Qh6d 4d8d AsJc 7cQc"));
  }

  @Test
  public void test_texas_holdem_6835_3s4c5sJdKh_Tc2s_QdQs_2d9s_8h8d_Js9h_7c3h_2h7s_9c9d() {
    assertEquals(
      "2h7s 2d9s Tc2s 7c3h 8h8d 9c9d Js9h QdQs",
      Solver.process("texas-holdem 3s4c5sJdKh Tc2s QdQs 2d9s 8h8d Js9h 7c3h 2h7s 9c9d"));
  }

  @Test
  public void test_texas_holdem_6836_3s6s9c9dQh_4s5h_Jc3d_Ah8c_8hQc_9sAs_Jh5s_2sKh_5cTc_4c7d() {
    assertEquals(
      "4s5h 4c7d 5cTc Jh5s 2sKh Ah8c Jc3d 8hQc 9sAs",
      Solver.process("texas-holdem 3s6s9c9dQh 4s5h Jc3d Ah8c 8hQc 9sAs Jh5s 2sKh 5cTc 4c7d"));
  }

  @Test
  public void test_texas_holdem_6837_7h7s8hQhTd_Jd6s_AhAc_JsQc_QdKd_9sQs_Ts5s() {
    assertEquals(
      "Jd6s Ts5s 9sQs JsQc QdKd AhAc",
      Solver.process("texas-holdem 7h7s8hQhTd Jd6s AhAc JsQc QdKd 9sQs Ts5s"));
  }

  @Test
  public void test_texas_holdem_6838_9h9sQdQhTs_Qc2h_9c6s_TdAd_2cAs_KsKh_5s8d_Kd6h_KcQs() {
    assertEquals(
      "5s8d Kd6h 2cAs TdAd KsKh 9c6s KcQs=Qc2h",
      Solver.process("texas-holdem 9h9sQdQhTs Qc2h 9c6s TdAd 2cAs KsKh 5s8d Kd6h KcQs"));
  }

  @Test
  public void test_texas_holdem_6839_2c3s4d8hQc_Tc6h_8d6d_9d4c_Jd9c_Jh2h_Kd3d_Th6s_Ks9h_7d2d() {
    assertEquals(
      "Tc6h=Th6s Jd9c Ks9h 7d2d Jh2h Kd3d 9d4c 8d6d",
      Solver.process("texas-holdem 2c3s4d8hQc Tc6h 8d6d 9d4c Jd9c Jh2h Kd3d Th6s Ks9h 7d2d"));
  }

  @Test
  public void test_texas_holdem_6840_2c5c8hKcKd_Js9s_7c7s_KhTc_AdTd_AcJh_8sQs_Ts9d_Qh6h_3dQc() {
    assertEquals(
      "Ts9d Js9s 3dQc Qh6h AdTd AcJh 7c7s 8sQs KhTc",
      Solver.process("texas-holdem 2c5c8hKcKd Js9s 7c7s KhTc AdTd AcJh 8sQs Ts9d Qh6h 3dQc"));
  }

  @Test
  public void test_texas_holdem_6841_3c3h7s9cQd_3sKh_4c7d_2sQs_5s7c_5d9s() {
    assertEquals(
      "4c7d=5s7c 5d9s 2sQs 3sKh",
      Solver.process("texas-holdem 3c3h7s9cQd 3sKh 4c7d 2sQs 5s7c 5d9s"));
  }

  @Test
  public void test_texas_holdem_6842_2d4hKdTcTs_2c7c_8s6h_3h8h_7h5d() {
    assertEquals(
      "7h5d 3h8h 8s6h 2c7c",
      Solver.process("texas-holdem 2d4hKdTcTs 2c7c 8s6h 3h8h 7h5d"));
  }

  @Test
  public void test_texas_holdem_6843_2d6c7h9hAc_8sTd_TsJc() {
    assertEquals(
      "TsJc 8sTd",
      Solver.process("texas-holdem 2d6c7h9hAc 8sTd TsJc"));
  }

  @Test
  public void test_texas_holdem_6844_2d3c4h6cKd_8d3s_TdQs() {
    assertEquals(
      "TdQs 8d3s",
      Solver.process("texas-holdem 2d3c4h6cKd 8d3s TdQs"));
  }

  @Test
  public void test_texas_holdem_6845_2s4d6dKhQc_KcQd_9c4c_5s9d_6s9h_4h2h_AsJc_9s8c_6hJd_8hAh() {
    assertEquals(
      "5s9d 9s8c 8hAh AsJc 9c4c 6s9h 6hJd 4h2h KcQd",
      Solver.process("texas-holdem 2s4d6dKhQc KcQd 9c4c 5s9d 6s9h 4h2h AsJc 9s8c 6hJd 8hAh"));
  }

  @Test
  public void test_texas_holdem_6846_2s4h5hKcTh_QcTd_AsAc_3s7h_4dAd_6d9d_Qs6c_4s7d_3c3h() {
    assertEquals(
      "3s7h 6d9d Qs6c 3c3h 4s7d 4dAd QcTd AsAc",
      Solver.process("texas-holdem 2s4h5hKcTh QcTd AsAc 3s7h 4dAd 6d9d Qs6c 4s7d 3c3h"));
  }

  @Test
  public void test_texas_holdem_6847_3cAcKhQcTs_6d4s_6hJc_5c4c() {
    assertEquals(
      "6d4s 6hJc 5c4c",
      Solver.process("texas-holdem 3cAcKhQcTs 6d4s 6hJc 5c4c"));
  }

  @Test
  public void test_texas_holdem_6848_2d9sJcQcTd_2h7s_6cKs() {
    assertEquals(
      "2h7s 6cKs",
      Solver.process("texas-holdem 2d9sJcQcTd 2h7s 6cKs"));
  }

  @Test
  public void test_texas_holdem_6849_2d4cAsKdTd_4sQc_Th8s() {
    assertEquals(
      "4sQc Th8s",
      Solver.process("texas-holdem 2d4cAsKdTd 4sQc Th8s"));
  }

  @Test
  public void test_texas_holdem_6850_2d5c6s7dTd_TcQd_8cQs() {
    assertEquals(
      "8cQs TcQd",
      Solver.process("texas-holdem 2d5c6s7dTd TcQd 8cQs"));
  }

  @Test
  public void test_texas_holdem_6851_2d4s7dAdJc_Ks5c_QdKd() {
    assertEquals(
      "Ks5c QdKd",
      Solver.process("texas-holdem 2d4s7dAdJc Ks5c QdKd"));
  }

  @Test
  public void test_texas_holdem_6852_5c7c8c9dKs_Jh5h_KcKd_QhAc_7hQd_8d5s_4c5d_4h2c_2d6h() {
    assertEquals(
      "4h2c QhAc 4c5d Jh5h 7hQd 8d5s KcKd 2d6h",
      Solver.process("texas-holdem 5c7c8c9dKs Jh5h KcKd QhAc 7hQd 8d5s 4c5d 4h2c 2d6h"));
  }

  @Test
  public void test_texas_holdem_6853_7s9dQcTcTs_2dAd_8sJh_Qd9h_Td6c_Ks2h_9c8h_4hAh_4d9s() {
    assertEquals(
      "Ks2h 2dAd=4hAh 4d9s=9c8h Qd9h Td6c 8sJh",
      Solver.process("texas-holdem 7s9dQcTcTs 2dAd 8sJh Qd9h Td6c Ks2h 9c8h 4hAh 4d9s"));
  }

  @Test
  public void test_texas_holdem_6854_4h5d8hAhKh_JsQh_4sAc() {
    assertEquals(
      "4sAc JsQh",
      Solver.process("texas-holdem 4h5d8hAhKh JsQh 4sAc"));
  }

  @Test
  public void test_texas_holdem_6855_3c3d6s9hQc_2d4c_Kd3s_5hAc_6dAh_QdTc_8s2s_TdAs_8c7h() {
    assertEquals(
      "2d4c 8c7h=8s2s 5hAc TdAs 6dAh QdTc Kd3s",
      Solver.process("texas-holdem 3c3d6s9hQc 2d4c Kd3s 5hAc 6dAh QdTc 8s2s TdAs 8c7h"));
  }

  @Test
  public void test_texas_holdem_6856_3s5s6d7h9c_4h6s_QdKs_9hQh_8d3d_8hTs_4c9d_5d5c_Jh7c_6hAd() {
    assertEquals(
      "QdKs 6hAd Jh7c 9hQh 5d5c 4c9d=4h6s 8d3d 8hTs",
      Solver.process("texas-holdem 3s5s6d7h9c 4h6s QdKs 9hQh 8d3d 8hTs 4c9d 5d5c Jh7c 6hAd"));
  }

  @Test
  public void test_texas_holdem_6857_2h5h7hQcTd_7c6s_9hKh_4d2d() {
    assertEquals(
      "4d2d 7c6s 9hKh",
      Solver.process("texas-holdem 2h5h7hQcTd 7c6s 9hKh 4d2d"));
  }

  @Test
  public void test_texas_holdem_6858_5dJhKcKhTc_8dKs_5c7h_2c9h_6s2d() {
    assertEquals(
      "6s2d 2c9h 5c7h 8dKs",
      Solver.process("texas-holdem 5dJhKcKhTc 8dKs 5c7h 2c9h 6s2d"));
  }

  @Test
  public void test_texas_holdem_6859_2c5d6s9dQd_Qs3h_7s4s_7c3c_JcAd_Kh3s_8dQc_Th8s_9hKs_9s5c() {
    assertEquals(
      "7c3c=7s4s Th8s Kh3s JcAd 9hKs Qs3h 8dQc 9s5c",
      Solver.process("texas-holdem 2c5d6s9dQd Qs3h 7s4s 7c3c JcAd Kh3s 8dQc Th8s 9hKs 9s5c"));
  }

  @Test
  public void test_texas_holdem_6860_3c7d9dQcQs_Ad9h_2dJc_8c7s_Kh5c() {
    assertEquals(
      "2dJc Kh5c 8c7s Ad9h",
      Solver.process("texas-holdem 3c7d9dQcQs Ad9h 2dJc 8c7s Kh5c"));
  }

  @Test
  public void test_texas_holdem_6861_2s3h4c5s8s_QsQd_Tc9d() {
    assertEquals(
      "Tc9d QsQd",
      Solver.process("texas-holdem 2s3h4c5s8s QsQd Tc9d"));
  }

  @Test
  public void test_texas_holdem_6862_2c4s9hJcJh_Qs9s_2d9d_6sQd_2s3c_7cAh_5cTc() {
    assertEquals(
      "5cTc 6sQd 7cAh 2s3c 2d9d Qs9s",
      Solver.process("texas-holdem 2c4s9hJcJh Qs9s 2d9d 6sQd 2s3c 7cAh 5cTc"));
  }

  @Test
  public void test_texas_holdem_6863_7c7dAdAsJd_Kc5d_6sAh() {
    assertEquals(
      "Kc5d 6sAh",
      Solver.process("texas-holdem 7c7dAdAsJd Kc5d 6sAh"));
  }

  @Test
  public void test_texas_holdem_6864_6c6h6s7cQh_2c5s_4s8c_TdTs_4cJc_9cKc_JhTc() {
    assertEquals(
      "2c5s 4s8c 4cJc=JhTc 9cKc TdTs",
      Solver.process("texas-holdem 6c6h6s7cQh 2c5s 4s8c TdTs 4cJc 9cKc JhTc"));
  }

  @Test
  public void test_texas_holdem_6865_2d5d5s6h7h_3dKh_Th4h_QcTs_6c4d_9s7d_3s9h() {
    assertEquals(
      "3s9h Th4h QcTs 3dKh 6c4d 9s7d",
      Solver.process("texas-holdem 2d5d5s6h7h 3dKh Th4h QcTs 6c4d 9s7d 3s9h"));
  }

  @Test
  public void test_texas_holdem_6866_2d2h7s9cAs_AdJc_8c3s_5c7d() {
    assertEquals(
      "8c3s 5c7d AdJc",
      Solver.process("texas-holdem 2d2h7s9cAs AdJc 8c3s 5c7d"));
  }

  @Test
  public void test_texas_holdem_6867_2d4h7hKsTh_6d6h_9h2h_9d4c() {
    assertEquals(
      "9d4c 6d6h 9h2h",
      Solver.process("texas-holdem 2d4h7hKsTh 6d6h 9h2h 9d4c"));
  }

  @Test
  public void test_texas_holdem_6868_2d5d5h5sKd_9c4h_AsKs_Qs3d_4sTc_7sTd_Ts6c_Jc8c_3hJs_5c8h() {
    assertEquals(
      "9c4h 4sTc=7sTd=Ts6c 3hJs=Jc8c Qs3d AsKs 5c8h",
      Solver.process("texas-holdem 2d5d5h5sKd 9c4h AsKs Qs3d 4sTc 7sTd Ts6c Jc8c 3hJs 5c8h"));
  }

  @Test
  public void test_texas_holdem_6869_5c9sAsTcTs_6h7d_7s2c() {
    assertEquals(
      "6h7d=7s2c",
      Solver.process("texas-holdem 5c9sAsTcTs 6h7d 7s2c"));
  }

  @Test
  public void test_texas_holdem_6870_6d7c8h9cKc_3hAc_7hAd() {
    assertEquals(
      "3hAc 7hAd",
      Solver.process("texas-holdem 6d7c8h9cKc 3hAc 7hAd"));
  }

  @Test
  public void test_texas_holdem_6871_2c3h9dAcAs_7hQc_JcTc_Ks2d_8cKd_Jh6h_TdTs_6s9s() {
    assertEquals(
      "Jh6h JcTc 7hQc 8cKd Ks2d 6s9s TdTs",
      Solver.process("texas-holdem 2c3h9dAcAs 7hQc JcTc Ks2d 8cKd Jh6h TdTs 6s9s"));
  }

  @Test
  public void test_texas_holdem_6872_2c2d2s4sQs_5s8d_Qh8s_QcKc_Ks6h_Kd3h_2h8h_JdAc_7d4c_9h5h() {
    assertEquals(
      "5s8d 9h5h Kd3h=Ks6h JdAc 7d4c QcKc=Qh8s 2h8h",
      Solver.process("texas-holdem 2c2d2s4sQs 5s8d Qh8s QcKc Ks6h Kd3h 2h8h JdAc 7d4c 9h5h"));
  }

  @Test
  public void test_texas_holdem_6873_6h9c9dJcKs_Js4c_4h8s_AdAs_4sKd_6d7d_3cQd_7cTh() {
    assertEquals(
      "4h8s 7cTh 3cQd 6d7d Js4c 4sKd AdAs",
      Solver.process("texas-holdem 6h9c9dJcKs Js4c 4h8s AdAs 4sKd 6d7d 3cQd 7cTh"));
  }

  @Test
  public void test_texas_holdem_6874_5h6c9cKhKs_8c8h_TsAc() {
    assertEquals(
      "TsAc 8c8h",
      Solver.process("texas-holdem 5h6c9cKhKs 8c8h TsAc"));
  }

  @Test
  public void test_texas_holdem_6875_2c5c8hJcKs_6hTs_QsAd_Qh3s_6dTh_7dKh_3hQd_Js2s_8sQc() {
    assertEquals(
      "6dTh=6hTs 3hQd=Qh3s QsAd 8sQc 7dKh Js2s",
      Solver.process("texas-holdem 2c5c8hJcKs 6hTs QsAd Qh3s 6dTh 7dKh 3hQd Js2s 8sQc"));
  }

  @Test
  public void test_texas_holdem_6876_4h7c7sAsTc_Ah3s_4c8h_6h4s() {
    assertEquals(
      "4c8h=6h4s Ah3s",
      Solver.process("texas-holdem 4h7c7sAsTc Ah3s 4c8h 6h4s"));
  }

  @Test
  public void test_texas_holdem_6877_2s4c4s5h8h_9h6s_4dAd_Ts3d() {
    assertEquals(
      "9h6s Ts3d 4dAd",
      Solver.process("texas-holdem 2s4c4s5h8h 9h6s 4dAd Ts3d"));
  }

  @Test
  public void test_texas_holdem_6878_5s6s8d9hTs_Kc2h_7cJs_7sQc_8c5h_As5d_2cKs_4s3s() {
    assertEquals(
      "2cKs=Kc2h As5d 8c5h 7sQc 7cJs 4s3s",
      Solver.process("texas-holdem 5s6s8d9hTs Kc2h 7cJs 7sQc 8c5h As5d 2cKs 4s3s"));
  }

  @Test
  public void test_texas_holdem_6879_2d6dAcKhTh_Ts5c_4s4c_Tc3d_6h8s_2c7d_Jd2s_9c8d_8h3c_6sQs() {
    assertEquals(
      "8h3c 9c8d 2c7d Jd2s 4s4c 6h8s 6sQs Tc3d=Ts5c",
      Solver.process("texas-holdem 2d6dAcKhTh Ts5c 4s4c Tc3d 6h8s 2c7d Jd2s 9c8d 8h3c 6sQs"));
  }

  @Test
  public void test_texas_holdem_6880_2c4d6hAcQc_7c2s_3c2d_8dKc() {
    assertEquals(
      "8dKc 3c2d 7c2s",
      Solver.process("texas-holdem 2c4d6hAcQc 7c2s 3c2d 8dKc"));
  }

  @Test
  public void test_texas_holdem_6881_2c3d3h5hAd_QsKc_Qh2s_4hQd_KsAs_6d9d_JsTs_Ah9s() {
    assertEquals(
      "6d9d JsTs QsKc Qh2s Ah9s KsAs 4hQd",
      Solver.process("texas-holdem 2c3d3h5hAd QsKc Qh2s 4hQd KsAs 6d9d JsTs Ah9s"));
  }

  @Test
  public void test_texas_holdem_6882_2s5h9c9hQd_Th7c_2d6c() {
    assertEquals(
      "Th7c 2d6c",
      Solver.process("texas-holdem 2s5h9c9hQd Th7c 2d6c"));
  }

  @Test
  public void test_texas_holdem_6883_2d7h8sKdQc_7sAc_6hTd_4hKs_3sAd_5h9c_4s4c_5c6s() {
    assertEquals(
      "5c6s 5h9c 6hTd 3sAd 4s4c 7sAc 4hKs",
      Solver.process("texas-holdem 2d7h8sKdQc 7sAc 6hTd 4hKs 3sAd 5h9c 4s4c 5c6s"));
  }

  @Test
  public void test_texas_holdem_6884_4d7d8sJcQc_6sAh_5hKc_3h4c_3d5s_4hAc_7c9d_4s2h() {
    assertEquals(
      "3d5s 5hKc 6sAh 3h4c=4s2h 4hAc 7c9d",
      Solver.process("texas-holdem 4d7d8sJcQc 6sAh 5hKc 3h4c 3d5s 4hAc 7c9d 4s2h"));
  }

  @Test
  public void test_texas_holdem_6885_2s4c8c9sQs_6h6s_9cQd_Ah5s_9dQh() {
    assertEquals(
      "Ah5s 6h6s 9cQd=9dQh",
      Solver.process("texas-holdem 2s4c8c9sQs 6h6s 9cQd Ah5s 9dQh"));
  }

  @Test
  public void test_texas_holdem_6886_2h7h9hAcJs_AsKs_2s7d_KdTs_6s8h_4d2d_Qh4s_5cTd_QcAd() {
    assertEquals(
      "6s8h 5cTd Qh4s KdTs 4d2d QcAd AsKs 2s7d",
      Solver.process("texas-holdem 2h7h9hAcJs AsKs 2s7d KdTs 6s8h 4d2d Qh4s 5cTd QcAd"));
  }

  @Test
  public void test_texas_holdem_6887_2c2h5h7hTs_Jh5s_7sAh() {
    assertEquals(
      "Jh5s 7sAh",
      Solver.process("texas-holdem 2c2h5h7hTs Jh5s 7sAh"));
  }

  @Test
  public void test_texas_holdem_6888_2d4d6s7dTd_6c7c_As3c_6dJs() {
    assertEquals(
      "As3c 6c7c 6dJs",
      Solver.process("texas-holdem 2d4d6s7dTd 6c7c As3c 6dJs"));
  }

  @Test
  public void test_texas_holdem_6889_4d6s7h8c8d_3c5s_Kc2s_QsKd_Js3s() {
    assertEquals(
      "Js3s Kc2s QsKd 3c5s",
      Solver.process("texas-holdem 4d6s7h8c8d 3c5s Kc2s QsKd Js3s"));
  }

  @Test
  public void test_texas_holdem_6890_2c4c6hAhJh_7h9d_KcTh() {
    assertEquals(
      "7h9d KcTh",
      Solver.process("texas-holdem 2c4c6hAhJh 7h9d KcTh"));
  }

  @Test
  public void test_texas_holdem_6891_2c6cAdKsTd_7h2h_6d3h_Qh7s_Qs5h_6h5d_2dKh_4s4c() {
    assertEquals(
      "Qs5h Qh7s 7h2h 4s4c 6d3h=6h5d 2dKh",
      Solver.process("texas-holdem 2c6cAdKsTd 7h2h 6d3h Qh7s Qs5h 6h5d 2dKh 4s4c"));
  }

  @Test
  public void test_texas_holdem_6892_2c2h7c8sTc_7h9d_2s7s_Td7d_Jd6d() {
    assertEquals(
      "Jd6d 7h9d Td7d 2s7s",
      Solver.process("texas-holdem 2c2h7c8sTc 7h9d 2s7s Td7d Jd6d"));
  }

  @Test
  public void test_texas_holdem_6893_3d4hJdJsQd_4d8h_KcJh_9hTh_2sAh_AcKd_3sQs_Jc5d_Ad3h() {
    assertEquals(
      "9hTh 2sAh AcKd Ad3h 4d8h 3sQs Jc5d KcJh",
      Solver.process("texas-holdem 3d4hJdJsQd 4d8h KcJh 9hTh 2sAh AcKd 3sQs Jc5d Ad3h"));
  }

  @Test
  public void test_texas_holdem_6894_3s5c9hQsTs_8cQd_AcKs_6h8h() {
    assertEquals(
      "6h8h AcKs 8cQd",
      Solver.process("texas-holdem 3s5c9hQsTs 8cQd AcKs 6h8h"));
  }

  @Test
  public void test_texas_holdem_6895_2h4s5d7dKd_Qs6s_JcQh_5c5s_Jd4c_4d4h_Kc9d() {
    assertEquals(
      "Qs6s JcQh Jd4c Kc9d 4d4h 5c5s",
      Solver.process("texas-holdem 2h4s5d7dKd Qs6s JcQh 5c5s Jd4c 4d4h Kc9d"));
  }

  @Test
  public void test_texas_holdem_6896_6h7cAdJcTc_Td5d_6c4c_8dQd_3h6s_5h4d_8s9h_AhKc_9cJs() {
    assertEquals(
      "5h4d 8dQd 3h6s Td5d 9cJs AhKc 8s9h 6c4c",
      Solver.process("texas-holdem 6h7cAdJcTc Td5d 6c4c 8dQd 3h6s 5h4d 8s9h AhKc 9cJs"));
  }

  @Test
  public void test_texas_holdem_6897_2c6dAhJcTh_5sKh_8s5d_7d7h() {
    assertEquals(
      "8s5d 5sKh 7d7h",
      Solver.process("texas-holdem 2c6dAhJcTh 5sKh 8s5d 7d7h"));
  }

  @Test
  public void test_texas_holdem_6898_3h5cAdQcQh_Qd5d_Ts3d_8sAs_5hTd_6h4h_Kd7s_Qs3s_2s7h() {
    assertEquals(
      "6h4h 2s7h Kd7s Ts3d 5hTd 8sAs Qs3s Qd5d",
      Solver.process("texas-holdem 3h5cAdQcQh Qd5d Ts3d 8sAs 5hTd 6h4h Kd7s Qs3s 2s7h"));
  }

  @Test
  public void test_texas_holdem_6899_2h6s8hQdTc_Qc2d_8d3h_JdTd_9s7d_8sAd_ThTs() {
    assertEquals(
      "8d3h 8sAd JdTd Qc2d ThTs 9s7d",
      Solver.process("texas-holdem 2h6s8hQdTc Qc2d 8d3h JdTd 9s7d 8sAd ThTs"));
  }

  @Test
  public void test_texas_holdem_6900_3d6c6sAcTh_Ah9c_Ts4c() {
    assertEquals(
      "Ts4c Ah9c",
      Solver.process("texas-holdem 3d6c6sAcTh Ah9c Ts4c"));
  }

  @Test
  public void test_texas_holdem_6901_4s6h7h7sQc_Jh3h_9d5c_Ah5h_Kh4c_2s2d_3c5s_6cAs_Jc2c() {
    assertEquals(
      "9d5c Jc2c=Jh3h Ah5h 2s2d Kh4c 6cAs 3c5s",
      Solver.process("texas-holdem 4s6h7h7sQc Jh3h 9d5c Ah5h Kh4c 2s2d 3c5s 6cAs Jc2c"));
  }

  @Test
  public void test_texas_holdem_6902_4s8hKsQsTd_5d6d_JhKh_7sQh() {
    assertEquals(
      "5d6d 7sQh JhKh",
      Solver.process("texas-holdem 4s8hKsQsTd 5d6d JhKh 7sQh"));
  }

  @Test
  public void test_texas_holdem_6903_6s9cAdKcTc_8cQd_6cKd_QcTs_7hJs_9hJd_4sQs_5s4c_3h3c() {
    assertEquals(
      "5s4c 7hJs 4sQs=8cQd 3h3c 9hJd QcTs 6cKd",
      Solver.process("texas-holdem 6s9cAdKcTc 8cQd 6cKd QcTs 7hJs 9hJd 4sQs 5s4c 3h3c"));
  }

  @Test
  public void test_texas_holdem_6904_2d7sAcAhJs_9d9c_7d5h() {
    assertEquals(
      "7d5h 9d9c",
      Solver.process("texas-holdem 2d7sAcAhJs 9d9c 7d5h"));
  }

  @Test
  public void test_texas_holdem_6905_3d4c9sJdKc_6c2d_Js7h_JcQs_Tc3h_4dAd_KdQh_4s9d_7d6s() {
    assertEquals(
      "6c2d 7d6s Tc3h 4dAd Js7h JcQs KdQh 4s9d",
      Solver.process("texas-holdem 3d4c9sJdKc 6c2d Js7h JcQs Tc3h 4dAd KdQh 4s9d 7d6s"));
  }

  @Test
  public void test_texas_holdem_6906_9sAcJdJhQd_3cTc_7cKd_Qc7d() {
    assertEquals(
      "3cTc 7cKd Qc7d",
      Solver.process("texas-holdem 9sAcJdJhQd 3cTc 7cKd Qc7d"));
  }

  @Test
  public void test_texas_holdem_6907_4c5d9dAhTd_4sJh_7hAs_Th9s_3d7d_2h9c() {
    assertEquals(
      "4sJh 2h9c 7hAs Th9s 3d7d",
      Solver.process("texas-holdem 4c5d9dAhTd 4sJh 7hAs Th9s 3d7d 2h9c"));
  }

  @Test
  public void test_texas_holdem_6908_5c7c9dThTs_AcKs_3sJd_8cAs() {
    assertEquals(
      "3sJd 8cAs AcKs",
      Solver.process("texas-holdem 5c7c9dThTs AcKs 3sJd 8cAs"));
  }

  @Test
  public void test_texas_holdem_6909_5d9cAhKsQd_7s3h_2hTs_6s4d_Kh2c_4hKc_3d8s_AcQc_5sTc() {
    assertEquals(
      "6s4d 7s3h 3d8s 2hTs 5sTc 4hKc=Kh2c AcQc",
      Solver.process("texas-holdem 5d9cAhKsQd 7s3h 2hTs 6s4d Kh2c 4hKc 3d8s AcQc 5sTc"));
  }

  @Test
  public void test_texas_holdem_6910_3d4h9dKcQc_9h3h_8c8d_Qd4s_5hAd_5cTc() {
    assertEquals(
      "5cTc 5hAd 8c8d 9h3h Qd4s",
      Solver.process("texas-holdem 3d4h9dKcQc 9h3h 8c8d Qd4s 5hAd 5cTc"));
  }

  @Test
  public void test_texas_holdem_6911_2c4h8d8hKd_7sQc_Ts4d_4c6c() {
    assertEquals(
      "7sQc 4c6c=Ts4d",
      Solver.process("texas-holdem 2c4h8d8hKd 7sQc Ts4d 4c6c"));
  }

  @Test
  public void test_texas_holdem_6912_3d7hKsQhQs_4c7c_Ts4d_TdAh() {
    assertEquals(
      "Ts4d TdAh 4c7c",
      Solver.process("texas-holdem 3d7hKsQhQs 4c7c Ts4d TdAh"));
  }

  @Test
  public void test_texas_holdem_6913_4h5h7hTcTd_KdKs_7c3c_8cKh_5sQd_Ac2c_4d9c_6c3d_Qh8d() {
    assertEquals(
      "Qh8d 8cKh Ac2c 4d9c 5sQd 7c3c KdKs 6c3d",
      Solver.process("texas-holdem 4h5h7hTcTd KdKs 7c3c 8cKh 5sQd Ac2c 4d9c 6c3d Qh8d"));
  }

  @Test
  public void test_texas_holdem_6914_5d6d8s9cQh_8c9h_6cJh_2s5h_3cKc_5c5s_Jd9d_Js3d_Kh6s_4h4s() {
    assertEquals(
      "Js3d 3cKc 4h4s 2s5h 6cJh Kh6s Jd9d 8c9h 5c5s",
      Solver.process("texas-holdem 5d6d8s9cQh 8c9h 6cJh 2s5h 3cKc 5c5s Jd9d Js3d Kh6s 4h4s"));
  }

  @Test
  public void test_texas_holdem_6915_8d8sJcJhKs_3d2h_6c4s_6d5d_2c9s() {
    assertEquals(
      "2c9s=3d2h=6c4s=6d5d",
      Solver.process("texas-holdem 8d8sJcJhKs 3d2h 6c4s 6d5d 2c9s"));
  }

  @Test
  public void test_texas_holdem_6916_4c6s9hKdKs_4sJs_Ah7s_AdAc_9s7h_KhJc() {
    assertEquals(
      "Ah7s 4sJs 9s7h AdAc KhJc",
      Solver.process("texas-holdem 4c6s9hKdKs 4sJs Ah7s AdAc 9s7h KhJc"));
  }

  @Test
  public void test_texas_holdem_6917_4c5c6s9hJh_AsQs_7hJd_Js3d_TcAh_8dQd_6d4h() {
    assertEquals(
      "8dQd TcAh AsQs Js3d 7hJd 6d4h",
      Solver.process("texas-holdem 4c5c6s9hJh AsQs 7hJd Js3d TcAh 8dQd 6d4h"));
  }

  @Test
  public void test_texas_holdem_6918_6s8s9cJcQd_9hAh_3hTc_JhAc_9s6d_5c8c() {
    assertEquals(
      "5c8c 9hAh JhAc 9s6d 3hTc",
      Solver.process("texas-holdem 6s8s9cJcQd 9hAh 3hTc JhAc 9s6d 5c8c"));
  }

  @Test
  public void test_texas_holdem_6919_3h4d6d7sKs_5dKc_2s2h_Ad8s_QdKd_Jc6c_5h3s_Js3c() {
    assertEquals(
      "Ad8s 2s2h Js3c Jc6c QdKd 5dKc=5h3s",
      Solver.process("texas-holdem 3h4d6d7sKs 5dKc 2s2h Ad8s QdKd Jc6c 5h3s Js3c"));
  }

  @Test
  public void test_texas_holdem_6920_2s3c6dAcTs_Ah8h_3d7d_9h8d_Qd5h() {
    assertEquals(
      "9h8d Qd5h 3d7d Ah8h",
      Solver.process("texas-holdem 2s3c6dAcTs Ah8h 3d7d 9h8d Qd5h"));
  }

  @Test
  public void test_texas_holdem_6921_2h6h6s8d9d_AdTs_As3s_TcKc_2dJd_8c2s() {
    assertEquals(
      "TcKc As3s AdTs 2dJd 8c2s",
      Solver.process("texas-holdem 2h6h6s8d9d AdTs As3s TcKc 2dJd 8c2s"));
  }

  @Test
  public void test_texas_holdem_6922_3h6s7d8dJc_Js6h_2d6c_Ad5s() {
    assertEquals(
      "Ad5s 2d6c Js6h",
      Solver.process("texas-holdem 3h6s7d8dJc Js6h 2d6c Ad5s"));
  }

  @Test
  public void test_texas_holdem_6923_4s8dAdTdTs_8cJs_3d6c() {
    assertEquals(
      "3d6c 8cJs",
      Solver.process("texas-holdem 4s8dAdTdTs 8cJs 3d6c"));
  }

  @Test
  public void test_texas_holdem_6924_8c8d9cKsQs_6c5h_Tc2c_4cQd_Kc2d_KdAh_2hKh() {
    assertEquals(
      "6c5h Tc2c 4cQd 2hKh=Kc2d KdAh",
      Solver.process("texas-holdem 8c8d9cKsQs 6c5h Tc2c 4cQd Kc2d KdAh 2hKh"));
  }

  @Test
  public void test_texas_holdem_6925_7h8s9cQsTs_AhKh_Ac6s_6cJc_Jh2h_4c5h_Qc7s() {
    assertEquals(
      "4c5h AhKh Qc7s Ac6s 6cJc=Jh2h",
      Solver.process("texas-holdem 7h8s9cQsTs AhKh Ac6s 6cJc Jh2h 4c5h Qc7s"));
  }

  @Test
  public void test_texas_holdem_6926_3d5s6c8c8s_4s5c_2s6s() {
    assertEquals(
      "4s5c 2s6s",
      Solver.process("texas-holdem 3d5s6c8c8s 4s5c 2s6s"));
  }

  @Test
  public void test_texas_holdem_6927_2d6s9dAcTh_2sJd_8sQh_9hKc_7c8h_Tc6d() {
    assertEquals(
      "8sQh 2sJd 9hKc Tc6d 7c8h",
      Solver.process("texas-holdem 2d6s9dAcTh 2sJd 8sQh 9hKc 7c8h Tc6d"));
  }

  @Test
  public void test_texas_holdem_6928_2h5c7c8hJs_Jc9d_Qs7s_AcAd_Qd4h() {
    assertEquals(
      "Qd4h Qs7s Jc9d AcAd",
      Solver.process("texas-holdem 2h5c7c8hJs Jc9d Qs7s AcAd Qd4h"));
  }

  @Test
  public void test_texas_holdem_6929_4h5c6c7sKs_AcTd_9hQd_5s2d_6d4d_Kc7c_As9c_3h8s_9d8d() {
    assertEquals(
      "9hQd As9c AcTd 5s2d 6d4d Kc7c 3h8s 9d8d",
      Solver.process("texas-holdem 4h5c6c7sKs AcTd 9hQd 5s2d 6d4d Kc7c As9c 3h8s 9d8d"));
  }

  @Test
  public void test_texas_holdem_6930_6c8hAdKhQc_2d8s_Ks5s_6d8d() {
    assertEquals(
      "2d8s Ks5s 6d8d",
      Solver.process("texas-holdem 6c8hAdKhQc 2d8s Ks5s 6d8d"));
  }

  @Test
  public void test_texas_holdem_6931_3d5h9cQhQs_Jh4s_5dKd_Ks5s_7hJc_Ts6s_Th9s() {
    assertEquals(
      "Ts6s Jh4s 7hJc 5dKd=Ks5s Th9s",
      Solver.process("texas-holdem 3d5h9cQhQs Jh4s 5dKd Ks5s 7hJc Ts6s Th9s"));
  }

  @Test
  public void test_texas_holdem_6932_3s4s5s6sKc_7d2s_As6h_8s4h_7s3d() {
    assertEquals(
      "8s4h As6h 7d2s 7s3d",
      Solver.process("texas-holdem 3s4s5s6sKc 7d2s As6h 8s4h 7s3d"));
  }

  @Test
  public void test_texas_holdem_6933_5h5s7s8c8d_9hAs_6h2s_JcKc_Qd4s() {
    assertEquals(
      "6h2s Qd4s JcKc 9hAs",
      Solver.process("texas-holdem 5h5s7s8c8d 9hAs 6h2s JcKc Qd4s"));
  }

  @Test
  public void test_texas_holdem_6934_3d3h5sJcTs_Ad8h_6c9d_KhJs_Th3s_7d7c_Qc8s_3c5c_2h6s() {
    assertEquals(
      "2h6s 6c9d Qc8s Ad8h 7d7c KhJs 3c5c Th3s",
      Solver.process("texas-holdem 3d3h5sJcTs Ad8h 6c9d KhJs Th3s 7d7c Qc8s 3c5c 2h6s"));
  }

  @Test
  public void test_texas_holdem_6935_5d8s9dQhTh_KcQd_Ad6c() {
    assertEquals(
      "Ad6c KcQd",
      Solver.process("texas-holdem 5d8s9dQhTh KcQd Ad6c"));
  }

  @Test
  public void test_texas_holdem_6936_3d7hKsQcTh_8sJc_Ah4s_KcJs_3c7s_8c9c_KhQd_9s4d_AcKd() {
    assertEquals(
      "9s4d 8c9c 8sJc Ah4s KcJs AcKd 3c7s KhQd",
      Solver.process("texas-holdem 3d7hKsQcTh 8sJc Ah4s KcJs 3c7s 8c9c KhQd 9s4d AcKd"));
  }

  @Test
  public void test_texas_holdem_6937_4s5s8d9cQc_2c4c_AhTs_8cKd_Th3s_Qd4h_2s5h_Js5c() {
    assertEquals(
      "Th3s AhTs 2c4c 2s5h Js5c 8cKd Qd4h",
      Solver.process("texas-holdem 4s5s8d9cQc 2c4c AhTs 8cKd Th3s Qd4h 2s5h Js5c"));
  }

  @Test
  public void test_texas_holdem_6938_4c6h8sAcAh_4s8c_Jc5h_3h6s_Td3c_5s7s() {
    assertEquals(
      "Td3c Jc5h 3h6s 4s8c 5s7s",
      Solver.process("texas-holdem 4c6h8sAcAh 4s8c Jc5h 3h6s Td3c 5s7s"));
  }

  @Test
  public void test_texas_holdem_6939_2c2h3hJcTc_6dKs_ThJs_AhAs_9d4c_8s7d_Qd8c() {
    assertEquals(
      "8s7d 9d4c Qd8c 6dKs ThJs AhAs",
      Solver.process("texas-holdem 2c2h3hJcTc 6dKs ThJs AhAs 9d4c 8s7d Qd8c"));
  }

  @Test
  public void test_texas_holdem_6940_2h2sKhKsTs_3sJs_5h5c_7h4h_3hAs_JhKc_6hAc_Jd5s_4cQc_3c2c() {
    assertEquals(
      "7h4h Jd5s 4cQc 3hAs=6hAc 5h5c 3sJs 3c2c JhKc",
      Solver.process("texas-holdem 2h2sKhKsTs 3sJs 5h5c 7h4h 3hAs JhKc 6hAc Jd5s 4cQc 3c2c"));
  }

  @Test
  public void test_texas_holdem_6941_2h9sJdJhTh_Js2s_Td3s_6h9d() {
    assertEquals(
      "6h9d Td3s Js2s",
      Solver.process("texas-holdem 2h9sJdJhTh Js2s Td3s 6h9d"));
  }

  @Test
  public void test_texas_holdem_6942_6cJdJhQcQd_8s7h_Qh4s_5dAc_Kh7c_8hTh_7dTd_Ts9c() {
    assertEquals(
      "8s7h 7dTd=8hTh=Ts9c Kh7c 5dAc Qh4s",
      Solver.process("texas-holdem 6cJdJhQcQd 8s7h Qh4s 5dAc Kh7c 8hTh 7dTd Ts9c"));
  }

  @Test
  public void test_texas_holdem_6943_2c6d9hKcTd_AdQs_3dQd_7h5s_Ac2d_TcAs() {
    assertEquals(
      "7h5s 3dQd AdQs Ac2d TcAs",
      Solver.process("texas-holdem 2c6d9hKcTd AdQs 3dQd 7h5s Ac2d TcAs"));
  }

  @Test
  public void test_texas_holdem_6944_2h4h7cKcQs_9sTh_Ac8d_5d6d_9hKh_Jd9d_4c8h_Jc7s_Ts3h() {
    assertEquals(
      "5d6d Ts3h 9sTh Jd9d Ac8d 4c8h Jc7s 9hKh",
      Solver.process("texas-holdem 2h4h7cKcQs 9sTh Ac8d 5d6d 9hKh Jd9d 4c8h Jc7s Ts3h"));
  }

  @Test
  public void test_texas_holdem_6945_3h9sAsJsQc_QdJh_2d6s() {
    assertEquals(
      "2d6s QdJh",
      Solver.process("texas-holdem 3h9sAsJsQc QdJh 2d6s"));
  }

  @Test
  public void test_texas_holdem_6946_2d5d5h7cKs_Qd4d_5c2s_8dAd_5s3d_7hKh_7dTd_QcAs_8sTs() {
    assertEquals(
      "8sTs Qd4d 8dAd QcAs 7dTd 7hKh 5s3d 5c2s",
      Solver.process("texas-holdem 2d5d5h7cKs Qd4d 5c2s 8dAd 5s3d 7hKh 7dTd QcAs 8sTs"));
  }

  @Test
  public void test_texas_holdem_6947_5h6cJcQcQh_QdAh_2dJh() {
    assertEquals(
      "2dJh QdAh",
      Solver.process("texas-holdem 5h6cJcQcQh QdAh 2dJh"));
  }

  @Test
  public void test_texas_holdem_6948_5h6hKdQsTd_4cKh_Jc7s_5d8d_6c3h_Ts2c_3d8c_Ad9s_2s6s_9hKs() {
    assertEquals(
      "3d8c Jc7s Ad9s 5d8d 2s6s=6c3h Ts2c 4cKh 9hKs",
      Solver.process("texas-holdem 5h6hKdQsTd 4cKh Jc7s 5d8d 6c3h Ts2c 3d8c Ad9s 2s6s 9hKs"));
  }

  @Test
  public void test_texas_holdem_6949_3c6sAhJcJh_Ad5s_5d4c_6h9s_9dTh() {
    assertEquals(
      "5d4c 9dTh 6h9s Ad5s",
      Solver.process("texas-holdem 3c6sAhJcJh Ad5s 5d4c 6h9s 9dTh"));
  }

  @Test
  public void test_texas_holdem_6950_2d5h6s9hTs_4hJh_4d7d_3s2s_7h7c_3dJs_Kc3h_9c2h() {
    assertEquals(
      "4d7d 3dJs=4hJh Kc3h 3s2s 7h7c 9c2h",
      Solver.process("texas-holdem 2d5h6s9hTs 4hJh 4d7d 3s2s 7h7c 3dJs Kc3h 9c2h"));
  }

  @Test
  public void test_texas_holdem_6951_4cJhKcTcTd_KhQs_Ah7s_JcAd_Kd9d_Js4d_3dQc_5hAc_7d4s_2d9s() {
    assertEquals(
      "2d9s 3dQc 5hAc=Ah7s 7d4s Js4d JcAd Kd9d KhQs",
      Solver.process("texas-holdem 4cJhKcTcTd KhQs Ah7s JcAd Kd9d Js4d 3dQc 5hAc 7d4s 2d9s"));
  }

  @Test
  public void test_texas_holdem_6952_3d7dJcKsTs_2c3h_TdJh_5d6d_Kd7h_4d9c_AsQs_8cKh() {
    assertEquals(
      "5d6d 4d9c 2c3h 8cKh TdJh Kd7h AsQs",
      Solver.process("texas-holdem 3d7dJcKsTs 2c3h TdJh 5d6d Kd7h 4d9c AsQs 8cKh"));
  }

  @Test
  public void test_texas_holdem_6953_3d6d7h8hTs_2s9h_9c2h_Th6h_Kh2c() {
    assertEquals(
      "Kh2c Th6h 2s9h=9c2h",
      Solver.process("texas-holdem 3d6d7h8hTs 2s9h 9c2h Th6h Kh2c"));
  }

  @Test
  public void test_texas_holdem_6954_5d5s6c7d8c_8h9h_7h3s_5c2c() {
    assertEquals(
      "7h3s 5c2c 8h9h",
      Solver.process("texas-holdem 5d5s6c7d8c 8h9h 7h3s 5c2c"));
  }

  @Test
  public void test_texas_holdem_6955_2h7h8sAcKc_5c7c_Td5d_8cJh_4h9c_6s5h_9h4c() {
    assertEquals(
      "6s5h 4h9c=9h4c Td5d 5c7c 8cJh",
      Solver.process("texas-holdem 2h7h8sAcKc 5c7c Td5d 8cJh 4h9c 6s5h 9h4c"));
  }

  @Test
  public void test_texas_holdem_6956_2c8dJcKcTd_7cTs_8s2h_Jh4c_Ks8h_6hAs_Qh4s_5dAd_9c5s_7d3c() {
    assertEquals(
      "7d3c 9c5s Qh4s 5dAd=6hAs 7cTs Jh4c 8s2h Ks8h",
      Solver.process("texas-holdem 2c8dJcKcTd 7cTs 8s2h Jh4c Ks8h 6hAs Qh4s 5dAd 9c5s 7d3c"));
  }

  @Test
  public void test_texas_holdem_6957_3d5h9c9dTh_7cQh_4s2c_4cQc_8sJh_8h7d_Qs8d_6s5s_As3s_7hJc() {
    assertEquals(
      "4s2c 8h7d 7hJc 8sJh 4cQc 7cQh Qs8d As3s 6s5s",
      Solver.process("texas-holdem 3d5h9c9dTh 7cQh 4s2c 4cQc 8sJh 8h7d Qs8d 6s5s As3s 7hJc"));
  }

  @Test
  public void test_texas_holdem_6958_3h5hAhQsTh_2cKs_8c4h_Qh7c_4s7s() {
    assertEquals(
      "4s7s 2cKs 8c4h Qh7c",
      Solver.process("texas-holdem 3h5hAhQsTh 2cKs 8c4h Qh7c 4s7s"));
  }

  @Test
  public void test_texas_holdem_6959_2h5c9h9sKd_6s8c_KcJd() {
    assertEquals(
      "6s8c KcJd",
      Solver.process("texas-holdem 2h5c9h9sKd 6s8c KcJd"));
  }

  @Test
  public void test_texas_holdem_6960_2s4c6c7hTs_Jd2d_Ks4s_Th4h() {
    assertEquals(
      "Jd2d Ks4s Th4h",
      Solver.process("texas-holdem 2s4c6c7hTs Jd2d Ks4s Th4h"));
  }

  @Test
  public void test_texas_holdem_6961_2c4d5d6dJh_TcTd_Qs3h_Th5h_Qd2h() {
    assertEquals(
      "Qd2h Th5h TcTd Qs3h",
      Solver.process("texas-holdem 2c4d5d6dJh TcTd Qs3h Th5h Qd2h"));
  }

  @Test
  public void test_texas_holdem_6962_8cAdAsJcQs_Js9s_3dTh_2hKh_5cKd_5s2c_Ks5d_2sKc_7c8h() {
    assertEquals(
      "5s2c 3dTh 2hKh=2sKc=5cKd=Ks5d 7c8h Js9s",
      Solver.process("texas-holdem 8cAdAsJcQs Js9s 3dTh 2hKh 5cKd 5s2c Ks5d 2sKc 7c8h"));
  }

  @Test
  public void test_texas_holdem_6963_2c7c7dAhJc_Qc5d_8d8c_Tc5c_3hTh_9d4c_Kc3s_6c6d_Js4s_Ks4h() {
    assertEquals(
      "9d4c 3hTh Qc5d Kc3s=Ks4h 6c6d 8d8c Js4s Tc5c",
      Solver.process("texas-holdem 2c7c7dAhJc Qc5d 8d8c Tc5c 3hTh 9d4c Kc3s 6c6d Js4s Ks4h"));
  }

  @Test
  public void test_texas_holdem_6964_3s8hJcJdTh_Ah4h_Td2s_9h5s() {
    assertEquals(
      "9h5s Ah4h Td2s",
      Solver.process("texas-holdem 3s8hJcJdTh Ah4h Td2s 9h5s"));
  }

  @Test
  public void test_texas_holdem_6965_3s4s6hAdKh_6c6s_Ac4c_5h4h_9c9d_5sJc() {
    assertEquals(
      "5sJc 5h4h 9c9d Ac4c 6c6s",
      Solver.process("texas-holdem 3s4s6hAdKh 6c6s Ac4c 5h4h 9c9d 5sJc"));
  }

  @Test
  public void test_texas_holdem_6966_3h3s8sQsTd_Ts9h_4c4h_6dKc() {
    assertEquals(
      "6dKc 4c4h Ts9h",
      Solver.process("texas-holdem 3h3s8sQsTd Ts9h 4c4h 6dKc"));
  }

  @Test
  public void test_texas_holdem_6967_2dQcQdQhTs_ThKh_4h3c_4d3h_9d7s_Ks6h_7c3s() {
    assertEquals(
      "4d3h=4h3c 7c3s 9d7s Ks6h ThKh",
      Solver.process("texas-holdem 2dQcQdQhTs ThKh 4h3c 4d3h 9d7s Ks6h 7c3s"));
  }

  @Test
  public void test_texas_holdem_6968_4c5h6c8cJc_Ks8s_Jd3s_5s2s_8dTh() {
    assertEquals(
      "5s2s 8dTh Ks8s Jd3s",
      Solver.process("texas-holdem 4c5h6c8cJc Ks8s Jd3s 5s2s 8dTh"));
  }

  @Test
  public void test_texas_holdem_6969_2c5h6h9dKh_QcJc_3sAc_4d6s_3d5s_2hQh_QsKc_5d8c() {
    assertEquals(
      "QcJc 3sAc 3d5s 5d8c 4d6s QsKc 2hQh",
      Solver.process("texas-holdem 2c5h6h9dKh QcJc 3sAc 4d6s 3d5s 2hQh QsKc 5d8c"));
  }

  @Test
  public void test_texas_holdem_6970_3h4c7sJdKc_Ks8c_QhJc_Th6s_2sJh_4s6h_2dJs_Qd3c_5s7c() {
    assertEquals(
      "Th6s Qd3c 4s6h 5s7c 2dJs=2sJh QhJc Ks8c",
      Solver.process("texas-holdem 3h4c7sJdKc Ks8c QhJc Th6s 2sJh 4s6h 2dJs Qd3c 5s7c"));
  }

  @Test
  public void test_texas_holdem_6971_5c9c9dKsTc_2sAc_5sQs_7cQh_5dKh_8s6d_7s8h() {
    assertEquals(
      "7s8h=8s6d 7cQh 2sAc 5sQs 5dKh",
      Solver.process("texas-holdem 5c9c9dKsTc 2sAc 5sQs 7cQh 5dKh 8s6d 7s8h"));
  }

  @Test
  public void test_texas_holdem_6972_6d7dJhKhQd_3c2s_2dJs_KdQh_5c5h_4d7s() {
    assertEquals(
      "3c2s 5c5h 4d7s 2dJs KdQh",
      Solver.process("texas-holdem 6d7dJhKhQd 3c2s 2dJs KdQh 5c5h 4d7s"));
  }

  @Test
  public void test_texas_holdem_6973_4s7c7s8d9c_Jd6c_7dKh() {
    assertEquals(
      "Jd6c 7dKh",
      Solver.process("texas-holdem 4s7c7s8d9c Jd6c 7dKh"));
  }

  @Test
  public void test_texas_holdem_6974_2c6s7cAdQs_5h5s_4cQh_Th4s() {
    assertEquals(
      "Th4s 5h5s 4cQh",
      Solver.process("texas-holdem 2c6s7cAdQs 5h5s 4cQh Th4s"));
  }

  @Test
  public void test_texas_holdem_6975_2c2s5d7dAd_Qc5c_Kc9s_Ks6s_9dAc_5sAh() {
    assertEquals(
      "Ks6s Kc9s Qc5c 9dAc 5sAh",
      Solver.process("texas-holdem 2c2s5d7dAd Qc5c Kc9s Ks6s 9dAc 5sAh"));
  }

  @Test
  public void test_texas_holdem_6976_3h4hJhKcTd_9h4s_5s3c_2c3d_8h5c_6h6d_TcKs() {
    assertEquals(
      "8h5c 2c3d=5s3c 9h4s 6h6d TcKs",
      Solver.process("texas-holdem 3h4hJhKcTd 9h4s 5s3c 2c3d 8h5c 6h6d TcKs"));
  }

  @Test
  public void test_texas_holdem_6977_4c9c9sJsQh_5s7d_8d3d_AsQc() {
    assertEquals(
      "5s7d 8d3d AsQc",
      Solver.process("texas-holdem 4c9c9sJsQh 5s7d 8d3d AsQc"));
  }

  @Test
  public void test_texas_holdem_6978_9c9hKdQhTh_3s7c_Qd9s_6cAc_9dJc_TsJs_TcKc() {
    assertEquals(
      "3s7c 6cAc TcKc 9dJc=TsJs Qd9s",
      Solver.process("texas-holdem 9c9hKdQhTh 3s7c Qd9s 6cAc 9dJc TsJs TcKc"));
  }

  @Test
  public void test_texas_holdem_6979_5d7c9hKdQd_3c2h_8h2s_3sQs_Ad4d_Kh9c_QhKs_Ac2c() {
    assertEquals(
      "3c2h 8h2s Ac2c 3sQs Kh9c QhKs Ad4d",
      Solver.process("texas-holdem 5d7c9hKdQd 3c2h 8h2s 3sQs Ad4d Kh9c QhKs Ac2c"));
  }

  @Test
  public void test_texas_holdem_6980_3h7d9dJcQd_8c6h_2sKh_4hAd_9cKd() {
    assertEquals(
      "8c6h 2sKh 4hAd 9cKd",
      Solver.process("texas-holdem 3h7d9dJcQd 8c6h 2sKh 4hAd 9cKd"));
  }

  @Test
  public void test_texas_holdem_6981_3s7c7hAcQs_6hTh_Kd9h_2c8d_8c6d_4c7d_Qh9c() {
    assertEquals(
      "2c8d=8c6d 6hTh Kd9h Qh9c 4c7d",
      Solver.process("texas-holdem 3s7c7hAcQs 6hTh Kd9h 2c8d 8c6d 4c7d Qh9c"));
  }

  @Test
  public void test_texas_holdem_6982_3h4d8sAcKs_Qd3d_5s5c_Qc8c_2d8h_AhKc_AdKh() {
    assertEquals(
      "Qd3d 5s5c 2d8h Qc8c AdKh=AhKc",
      Solver.process("texas-holdem 3h4d8sAcKs Qd3d 5s5c Qc8c 2d8h AhKc AdKh"));
  }

  @Test
  public void test_texas_holdem_6983_4sJcQcTcTd_5h8c_3d5d() {
    assertEquals(
      "3d5d 5h8c",
      Solver.process("texas-holdem 4sJcQcTcTd 5h8c 3d5d"));
  }

  @Test
  public void test_texas_holdem_6984_6c6d6sJcKd_8hAc_8dTs_Qs7s_5hAh_Jd7h() {
    assertEquals(
      "8dTs Qs7s 5hAh=8hAc Jd7h",
      Solver.process("texas-holdem 6c6d6sJcKd 8hAc 8dTs Qs7s 5hAh Jd7h"));
  }

  @Test
  public void test_texas_holdem_6985_3s6h9dAhJc_TsAs_4h4d_TcQs_3dJs_Jh3c_4s7c() {
    assertEquals(
      "4s7c TcQs 4h4d TsAs 3dJs=Jh3c",
      Solver.process("texas-holdem 3s6h9dAhJc TsAs 4h4d TcQs 3dJs Jh3c 4s7c"));
  }

  @Test
  public void test_texas_holdem_6986_3c3s6sKsQs_2s7d_Ts4h_9h8s() {
    assertEquals(
      "2s7d 9h8s Ts4h",
      Solver.process("texas-holdem 3c3s6sKsQs 2s7d Ts4h 9h8s"));
  }

  @Test
  public void test_texas_holdem_6987_3c3sJdJhQs_2d3h_7dJs_7cTc_9d5d() {
    assertEquals(
      "7cTc=9d5d 2d3h 7dJs",
      Solver.process("texas-holdem 3c3sJdJhQs 2d3h 7dJs 7cTc 9d5d"));
  }

  @Test
  public void test_texas_holdem_6988_2c8c8sJsQh_Jh4h_5h3h() {
    assertEquals(
      "5h3h Jh4h",
      Solver.process("texas-holdem 2c8c8sJsQh Jh4h 5h3h"));
  }

  @Test
  public void test_texas_holdem_6989_4c5h9c9hQc_Tc6d_KcAh_2h7d_Ad2s() {
    assertEquals(
      "2h7d Tc6d Ad2s KcAh",
      Solver.process("texas-holdem 4c5h9c9hQc Tc6d KcAh 2h7d Ad2s"));
  }

  @Test
  public void test_texas_holdem_6990_5d7d9c9sKh_4s6c_TdKd_2d2s_6dKs_7hAs() {
    assertEquals(
      "4s6c 2d2s 7hAs 6dKs TdKd",
      Solver.process("texas-holdem 5d7d9c9sKh 4s6c TdKd 2d2s 6dKs 7hAs"));
  }

  @Test
  public void test_texas_holdem_6991_8cAcAsKsQd_2d5s_7dTs() {
    assertEquals(
      "2d5s 7dTs",
      Solver.process("texas-holdem 8cAcAsKsQd 2d5s 7dTs"));
  }

  @Test
  public void test_texas_holdem_6992_2cAcAdQsTs_9h2h_ThKd_6d6s_4s4d_5cJh_Qh7s_4hJd_6hQc() {
    assertEquals(
      "4hJd=5cJh 9h2h 4s4d 6d6s ThKd 6hQc=Qh7s",
      Solver.process("texas-holdem 2cAcAdQsTs 9h2h ThKd 6d6s 4s4d 5cJh Qh7s 4hJd 6hQc"));
  }

  @Test
  public void test_texas_holdem_6993_2d3s4hKsQs_9h7s_Kh8c() {
    assertEquals(
      "9h7s Kh8c",
      Solver.process("texas-holdem 2d3s4hKsQs 9h7s Kh8c"));
  }

  @Test
  public void test_texas_holdem_6994_5c6c6hJhKh_6d2h_Jc2s_AdKc_4sAc() {
    assertEquals(
      "4sAc Jc2s AdKc 6d2h",
      Solver.process("texas-holdem 5c6c6hJhKh 6d2h Jc2s AdKc 4sAc"));
  }

  @Test
  public void test_texas_holdem_6995_3d6s8hAcJd_7sKs_Td2d_9dKh_7h8c() {
    assertEquals(
      "Td2d 7sKs 9dKh 7h8c",
      Solver.process("texas-holdem 3d6s8hAcJd 7sKs Td2d 9dKh 7h8c"));
  }

  @Test
  public void test_texas_holdem_6996_7d7s8cKhTc_5c9s_Th6c() {
    assertEquals(
      "5c9s Th6c",
      Solver.process("texas-holdem 7d7s8cKhTc 5c9s Th6c"));
  }

  @Test
  public void test_texas_holdem_6997_2d4d7h8dTs_6s3d_6dQc_Ad5c_Kd9h_7sKh_9dQs_Jc7c_6h9c() {
    assertEquals(
      "6s3d 6dQc 9dQs Kd9h Ad5c Jc7c 7sKh 6h9c",
      Solver.process("texas-holdem 2d4d7h8dTs 6s3d 6dQc Ad5c Kd9h 7sKh 9dQs Jc7c 6h9c"));
  }

  @Test
  public void test_texas_holdem_6998_2d2h7c7d9d_Tc3d_5d9c_ThAh_KcTs() {
    assertEquals(
      "Tc3d KcTs ThAh 5d9c",
      Solver.process("texas-holdem 2d2h7c7d9d Tc3d 5d9c ThAh KcTs"));
  }

  @Test
  public void test_texas_holdem_6999_4h5c5s6h9d_Qs4s_As4d_9s2h_Ac2d_8s8d_Td9h() {
    assertEquals(
      "Ac2d Qs4s As4d 8s8d 9s2h Td9h",
      Solver.process("texas-holdem 4h5c5s6h9d Qs4s As4d 9s2h Ac2d 8s8d Td9h"));
  }

}
