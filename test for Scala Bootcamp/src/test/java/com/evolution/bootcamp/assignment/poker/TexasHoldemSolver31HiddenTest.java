
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver31HiddenTest {


  @Test
  public void test_texas_holdem_7750_2c8dJdJsKd_3h2h_AcTd_Qh6h_JcTc() {
    assertEquals(
      "Qh6h AcTd 3h2h JcTc",
      Solver.process("texas-holdem 2c8dJdJsKd 3h2h AcTd Qh6h JcTc"));
  }

  @Test
  public void test_texas_holdem_7751_2d4d4sJdTc_Qd2h_9sJc_KcQh_5s7d() {
    assertEquals(
      "5s7d KcQh Qd2h 9sJc",
      Solver.process("texas-holdem 2d4d4sJdTc Qd2h 9sJc KcQh 5s7d"));
  }

  @Test
  public void test_texas_holdem_7752_2d3s5c9hKs_8h2s_Qc7d_2c3c_KdJh_9d2h_Kc9s() {
    assertEquals(
      "Qc7d 8h2s KdJh 2c3c 9d2h Kc9s",
      Solver.process("texas-holdem 2d3s5c9hKs 8h2s Qc7d 2c3c KdJh 9d2h Kc9s"));
  }

  @Test
  public void test_texas_holdem_7753_4d6h7cQsTd_As4s_6c9c_9s5h() {
    assertEquals(
      "9s5h As4s 6c9c",
      Solver.process("texas-holdem 4d6h7cQsTd As4s 6c9c 9s5h"));
  }

  @Test
  public void test_texas_holdem_7754_4d7c7dJsQc_6c2s_3s8c_TdAc_2h4h_KsJc_KhJh_AsJd_TsQs() {
    assertEquals(
      "6c2s 3s8c TdAc 2h4h KhJh=KsJc AsJd TsQs",
      Solver.process("texas-holdem 4d7c7dJsQc 6c2s 3s8c TdAc 2h4h KsJc KhJh AsJd TsQs"));
  }

  @Test
  public void test_texas_holdem_7755_2h9sKhKsTc_7cQc_ThTs_Kc9c_Ad7s() {
    assertEquals(
      "7cQc Ad7s ThTs Kc9c",
      Solver.process("texas-holdem 2h9sKhKsTc 7cQc ThTs Kc9c Ad7s"));
  }

  @Test
  public void test_texas_holdem_7756_6h8cAcQhTs_AdAh_9h4h() {
    assertEquals(
      "9h4h AdAh",
      Solver.process("texas-holdem 6h8cAcQhTs AdAh 9h4h"));
  }

  @Test
  public void test_texas_holdem_7757_8dJdKcKsQs_7cQc_Jc5h_5cAc_Js5d_2s5s_6c4c_ThAd() {
    assertEquals(
      "2s5s=6c4c 5cAc Jc5h=Js5d 7cQc ThAd",
      Solver.process("texas-holdem 8dJdKcKsQs 7cQc Jc5h 5cAc Js5d 2s5s 6c4c ThAd"));
  }

  @Test
  public void test_texas_holdem_7758_5c7s9c9dTc_3c2s_4dAc_Qc8h_4s2h_KhAd_Qd7h_4c6h_6d5h() {
    assertEquals(
      "3c2s=4s2h 4c6h Qc8h 4dAc KhAd 6d5h Qd7h",
      Solver.process("texas-holdem 5c7s9c9dTc 3c2s 4dAc Qc8h 4s2h KhAd Qd7h 4c6h 6d5h"));
  }

  @Test
  public void test_texas_holdem_7759_3s6c9cJcQc_6sAd_8cTc_4sQs_9dTs() {
    assertEquals(
      "6sAd 9dTs 4sQs 8cTc",
      Solver.process("texas-holdem 3s6c9cJcQc 6sAd 8cTc 4sQs 9dTs"));
  }

  @Test
  public void test_texas_holdem_7760_2h4h9c9dTc_6h8s_3s5s_3h7s_5cQc_Jc9s_Td4c_9h5h_JsKc() {
    assertEquals(
      "3s5s 3h7s 6h8s 5cQc JsKc Td4c 9h5h Jc9s",
      Solver.process("texas-holdem 2h4h9c9dTc 6h8s 3s5s 3h7s 5cQc Jc9s Td4c 9h5h JsKc"));
  }

  @Test
  public void test_texas_holdem_7761_8hKhKsTcTh_JhQs_Qd4h_5s4c_6sJc_9hAh_AcJs() {
    assertEquals(
      "5s4c 6sJc JhQs=Qd4h AcJs 9hAh",
      Solver.process("texas-holdem 8hKhKsTcTh JhQs Qd4h 5s4c 6sJc 9hAh AcJs"));
  }

  @Test
  public void test_texas_holdem_7762_4s7h7sKdTh_Js3c_6h2c_Kc8d_7dKh_AsKs_Ts8h_Ah4c_3d2s_4h6c() {
    assertEquals(
      "3d2s 6h2c Js3c 4h6c Ah4c Ts8h Kc8d AsKs 7dKh",
      Solver.process("texas-holdem 4s7h7sKdTh Js3c 6h2c Kc8d 7dKh AsKs Ts8h Ah4c 3d2s 4h6c"));
  }

  @Test
  public void test_texas_holdem_7763_3d8dAcKcTd_3h4s_Th5h_7h8c_7d5c_7c4d_Jh9c() {
    assertEquals(
      "7c4d=7d5c Jh9c 3h4s 7h8c Th5h",
      Solver.process("texas-holdem 3d8dAcKcTd 3h4s Th5h 7h8c 7d5c 7c4d Jh9c"));
  }

  @Test
  public void test_texas_holdem_7764_3s6s8d9sKs_Jd6d_2c7s_TcQd_Kd7c_4dAd_Qh5c() {
    assertEquals(
      "Qh5c TcQd 4dAd Jd6d Kd7c 2c7s",
      Solver.process("texas-holdem 3s6s8d9sKs Jd6d 2c7s TcQd Kd7c 4dAd Qh5c"));
  }

  @Test
  public void test_texas_holdem_7765_2c3c3s5sKd_QsAd_9dQh_Tc2s() {
    assertEquals(
      "9dQh QsAd Tc2s",
      Solver.process("texas-holdem 2c3c3s5sKd QsAd 9dQh Tc2s"));
  }

  @Test
  public void test_texas_holdem_7766_2d4hAhKdTc_7sJh_8s7h_6h5h_Qd2h() {
    assertEquals(
      "6h5h 8s7h 7sJh Qd2h",
      Solver.process("texas-holdem 2d4hAhKdTc 7sJh 8s7h 6h5h Qd2h"));
  }

  @Test
  public void test_texas_holdem_7767_5c5dJcTdTs_7c2s_TcAh() {
    assertEquals(
      "7c2s TcAh",
      Solver.process("texas-holdem 5c5dJcTdTs 7c2s TcAh"));
  }

  @Test
  public void test_texas_holdem_7768_4sAcJsKsTh_Ts5h_Qs8h_KcTd() {
    assertEquals(
      "Ts5h KcTd Qs8h",
      Solver.process("texas-holdem 4sAcJsKsTh Ts5h Qs8h KcTd"));
  }

  @Test
  public void test_texas_holdem_7769_2d3d5s9cAh_Qd4s_QcJh_2sJd_3hKc_TcAs_KsJs_7d6s_6c8c() {
    assertEquals(
      "7d6s 6c8c QcJh KsJs 2sJd 3hKc TcAs Qd4s",
      Solver.process("texas-holdem 2d3d5s9cAh Qd4s QcJh 2sJd 3hKc TcAs KsJs 7d6s 6c8c"));
  }

  @Test
  public void test_texas_holdem_7770_3c5s7hJdJs_8s2d_3h4c_9cQs() {
    assertEquals(
      "8s2d 9cQs 3h4c",
      Solver.process("texas-holdem 3c5s7hJdJs 8s2d 3h4c 9cQs"));
  }

  @Test
  public void test_texas_holdem_7771_8dAsQhQsTh_6sJc_7h6d_9sTs_9c3d_4hAd_Ac3s_5dTd() {
    assertEquals(
      "7h6d 9c3d 6sJc 5dTd=9sTs 4hAd=Ac3s",
      Solver.process("texas-holdem 8dAsQhQsTh 6sJc 7h6d 9sTs 9c3d 4hAd Ac3s 5dTd"));
  }

  @Test
  public void test_texas_holdem_7772_4s9sJhKdKh_Td8c_Ks3c_2hQh_3hAc_4d6c() {
    assertEquals(
      "Td8c 2hQh 3hAc 4d6c Ks3c",
      Solver.process("texas-holdem 4s9sJhKdKh Td8c Ks3c 2hQh 3hAc 4d6c"));
  }

  @Test
  public void test_texas_holdem_7773_2h7c9cAdTs_Jh3s_3d7h_6dAc_8cJc_6h4h_5c4s_5s9h_As5d() {
    assertEquals(
      "5c4s 6h4h Jh3s 3d7h 5s9h 6dAc=As5d 8cJc",
      Solver.process("texas-holdem 2h7c9cAdTs Jh3s 3d7h 6dAc 8cJc 6h4h 5c4s 5s9h As5d"));
  }

  @Test
  public void test_texas_holdem_7774_2d4h6s7cTs_5dQs_5hKc_Tc3s_6hQh_9s3c_4s9h_5cKs_2h8s() {
    assertEquals(
      "9s3c 5dQs 5cKs=5hKc 2h8s 4s9h 6hQh Tc3s",
      Solver.process("texas-holdem 2d4h6s7cTs 5dQs 5hKc Tc3s 6hQh 9s3c 4s9h 5cKs 2h8s"));
  }

  @Test
  public void test_texas_holdem_7775_2c8d8sAdQs_9c7h_Kd2h_Jd2s_4s9d() {
    assertEquals(
      "4s9d=9c7h Jd2s=Kd2h",
      Solver.process("texas-holdem 2c8d8sAdQs 9c7h Kd2h Jd2s 4s9d"));
  }

  @Test
  public void test_texas_holdem_7776_3s5s8dJcQc_6h2s_5h6c_9s3h_3d9h_ThJs_2c9d_7sAh_4s8h_2hKd() {
    assertEquals(
      "6h2s 2c9d 2hKd 7sAh 3d9h=9s3h 5h6c 4s8h ThJs",
      Solver.process("texas-holdem 3s5s8dJcQc 6h2s 5h6c 9s3h 3d9h ThJs 2c9d 7sAh 4s8h 2hKd"));
  }

  @Test
  public void test_texas_holdem_7777_2c6sJhKdQs_JcTc_9hAc_6hTs_4h6c_Th8c() {
    assertEquals(
      "Th8c 9hAc 4h6c=6hTs JcTc",
      Solver.process("texas-holdem 2c6sJhKdQs JcTc 9hAc 6hTs 4h6c Th8c"));
  }

  @Test
  public void test_texas_holdem_7778_4d4h6cTcTh_As7c_8sKs_5sTd_8h9c_2cAh_Kc4c() {
    assertEquals(
      "8h9c 8sKs 2cAh=As7c Kc4c 5sTd",
      Solver.process("texas-holdem 4d4h6cTcTh As7c 8sKs 5sTd 8h9c 2cAh Kc4c"));
  }

  @Test
  public void test_texas_holdem_7779_5c7c8hKcKs_7sTc_TdJh_3cKh_4hQc_7d6s_Kd2c() {
    assertEquals(
      "TdJh 4hQc 7d6s 7sTc 3cKh=Kd2c",
      Solver.process("texas-holdem 5c7c8hKcKs 7sTc TdJh 3cKh 4hQc 7d6s Kd2c"));
  }

  @Test
  public void test_texas_holdem_7780_5s7cAcJsTd_9c5h_Kc3s_9h2s_As9s_QsJh_3h8d() {
    assertEquals(
      "3h8d 9h2s Kc3s 9c5h QsJh As9s",
      Solver.process("texas-holdem 5s7cAcJsTd 9c5h Kc3s 9h2s As9s QsJh 3h8d"));
  }

  @Test
  public void test_texas_holdem_7781_8s9cJcJdJh_QsQc_9d2c_3dAd_5d5c_9h3c_5hKc_2h6c_Td4s() {
    assertEquals(
      "2h6c Td4s 5hKc 3dAd 5d5c 9d2c=9h3c QsQc",
      Solver.process("texas-holdem 8s9cJcJdJh QsQc 9d2c 3dAd 5d5c 9h3c 5hKc 2h6c Td4s"));
  }

  @Test
  public void test_texas_holdem_7782_5h6hAhAsQc_8c9c_7cQs_2dTd_4cJc_7hKs_Jh3s_8s9h() {
    assertEquals(
      "8c9c=8s9h 2dTd 4cJc=Jh3s 7hKs 7cQs",
      Solver.process("texas-holdem 5h6hAhAsQc 8c9c 7cQs 2dTd 4cJc 7hKs Jh3s 8s9h"));
  }

  @Test
  public void test_texas_holdem_7783_5d8cJhKhQd_4cKc_3hQs_2c2d_TcJc_3cAs_6c3s_Js9s_9cAd() {
    assertEquals(
      "6c3s 3cAs 9cAd 2c2d Js9s TcJc 3hQs 4cKc",
      Solver.process("texas-holdem 5d8cJhKhQd 4cKc 3hQs 2c2d TcJc 3cAs 6c3s Js9s 9cAd"));
  }

  @Test
  public void test_texas_holdem_7784_2s6d6s9sQc_8dQd_7s3h_Jc5h_Kc9c_4dQs_6cJh_Kd4h() {
    assertEquals(
      "7s3h Jc5h Kd4h Kc9c 4dQs=8dQd 6cJh",
      Solver.process("texas-holdem 2s6d6s9sQc 8dQd 7s3h Jc5h Kc9c 4dQs 6cJh Kd4h"));
  }

  @Test
  public void test_texas_holdem_7785_2h8sJcJdJh_9c4s_7d8h() {
    assertEquals(
      "9c4s 7d8h",
      Solver.process("texas-holdem 2h8sJcJdJh 9c4s 7d8h"));
  }

  @Test
  public void test_texas_holdem_7786_3s4h5h6hJd_Qs9c_2d7c_7h3c_Td8h_7s2c_Kh8s_9s3h_TsJs_8cQd() {
    assertEquals(
      "Td8h 8cQd Qs9c Kh8s 9s3h TsJs 2d7c=7h3c=7s2c",
      Solver.process("texas-holdem 3s4h5h6hJd Qs9c 2d7c 7h3c Td8h 7s2c Kh8s 9s3h TsJs 8cQd"));
  }

  @Test
  public void test_texas_holdem_7787_4s6s9sAhTd_Qd6d_6h4h_Th7d_Qs3d() {
    assertEquals(
      "Qs3d Qd6d Th7d 6h4h",
      Solver.process("texas-holdem 4s6s9sAhTd Qd6d 6h4h Th7d Qs3d"));
  }

  @Test
  public void test_texas_holdem_7788_2d3h7sJhTh_3s5h_AdKh_6c3c_4sJd() {
    assertEquals(
      "AdKh 3s5h=6c3c 4sJd",
      Solver.process("texas-holdem 2d3h7sJhTh 3s5h AdKh 6c3c 4sJd"));
  }

  @Test
  public void test_texas_holdem_7789_2c2d4h5dTs_4d7s_7dAd_9h9c() {
    assertEquals(
      "7dAd 4d7s 9h9c",
      Solver.process("texas-holdem 2c2d4h5dTs 4d7s 7dAd 9h9c"));
  }

  @Test
  public void test_texas_holdem_7790_4h7d7hAcAd_2h4s_9dQd_5c2c_8cKc_ThKh_8hAs() {
    assertEquals(
      "2h4s 5c2c 9dQd 8cKc=ThKh 8hAs",
      Solver.process("texas-holdem 4h7d7hAcAd 2h4s 9dQd 5c2c 8cKc ThKh 8hAs"));
  }

  @Test
  public void test_texas_holdem_7791_3h5h9hAhJh_5s9c_3d6s_8sQh() {
    assertEquals(
      "3d6s=5s9c 8sQh",
      Solver.process("texas-holdem 3h5h9hAhJh 5s9c 3d6s 8sQh"));
  }

  @Test
  public void test_texas_holdem_7792_3s6cKcQcTh_7h7c_9h2c_Jh2s_Ad4h_7sAh_9sTc_8s6s_4s9d_KhJd() {
    assertEquals(
      "4s9d=9h2c Jh2s Ad4h 7sAh 8s6s 7h7c 9sTc KhJd",
      Solver.process("texas-holdem 3s6cKcQcTh 7h7c 9h2c Jh2s Ad4h 7sAh 9sTc 8s6s 4s9d KhJd"));
  }

  @Test
  public void test_texas_holdem_7793_2d7d7hQcTs_8dQd_6cTc_Jh7c_5sAh_9h9d_8h4s_6sQs_4d5h() {
    assertEquals(
      "4d5h 8h4s 5sAh 9h9d 6cTc 6sQs=8dQd Jh7c",
      Solver.process("texas-holdem 2d7d7hQcTs 8dQd 6cTc Jh7c 5sAh 9h9d 8h4s 6sQs 4d5h"));
  }

  @Test
  public void test_texas_holdem_7794_7d9c9hJsQc_6d7h_5d4c_3cAs_4s4d_Kd7c_5h8c() {
    assertEquals(
      "5d4c 5h8c 3cAs 4s4d 6d7h Kd7c",
      Solver.process("texas-holdem 7d9c9hJsQc 6d7h 5d4c 3cAs 4s4d Kd7c 5h8c"));
  }

  @Test
  public void test_texas_holdem_7795_2d5s6cAdJh_Qh9d_2c4h_QcAc_Qs7d_6s4d_3dJd_6dKh_7h5d_8c5c() {
    assertEquals(
      "Qs7d Qh9d 2c4h 7h5d 8c5c 6s4d 6dKh 3dJd QcAc",
      Solver.process("texas-holdem 2d5s6cAdJh Qh9d 2c4h QcAc Qs7d 6s4d 3dJd 6dKh 7h5d 8c5c"));
  }

  @Test
  public void test_texas_holdem_7796_8h9h9sKcKs_AdKh_4s8s_5d5c_8d6c_2dQh_QcJd_As5h_Qd2h_7c9d() {
    assertEquals(
      "4s8s=5d5c=8d6c 2dQh=QcJd=Qd2h As5h 7c9d AdKh",
      Solver.process("texas-holdem 8h9h9sKcKs AdKh 4s8s 5d5c 8d6c 2dQh QcJd As5h Qd2h 7c9d"));
  }

  @Test
  public void test_texas_holdem_7797_5h5s6dAcKc_7c9c_KsJd_KhJs_AhTc_2s3d_8hKd_QhJh() {
    assertEquals(
      "2s3d 7c9c QhJh 8hKd=KhJs=KsJd AhTc",
      Solver.process("texas-holdem 5h5s6dAcKc 7c9c KsJd KhJs AhTc 2s3d 8hKd QhJh"));
  }

  @Test
  public void test_texas_holdem_7798_3c4s8sJhTs_4cTh_9cJc_7d3s_Ac6s_QdAd_2s7h() {
    assertEquals(
      "2s7h Ac6s QdAd 7d3s 9cJc 4cTh",
      Solver.process("texas-holdem 3c4s8sJhTs 4cTh 9cJc 7d3s Ac6s QdAd 2s7h"));
  }

  @Test
  public void test_texas_holdem_7799_5d5s7cJsKc_8s3h_KdJd_6h8d() {
    assertEquals(
      "6h8d=8s3h KdJd",
      Solver.process("texas-holdem 5d5s7cJsKc 8s3h KdJd 6h8d"));
  }

  @Test
  public void test_texas_holdem_7800_7c8h9hJsKh_Tc5d_Qd6d_QhKd_7dAs_5h9c_8d3d() {
    assertEquals(
      "Qd6d 7dAs 8d3d 5h9c QhKd Tc5d",
      Solver.process("texas-holdem 7c8h9hJsKh Tc5d Qd6d QhKd 7dAs 5h9c 8d3d"));
  }

  @Test
  public void test_texas_holdem_7801_7c8c8dAhJh_Jd5s_8h6h_KdAs_7sKh() {
    assertEquals(
      "7sKh Jd5s KdAs 8h6h",
      Solver.process("texas-holdem 7c8c8dAhJh Jd5s 8h6h KdAs 7sKh"));
  }

  @Test
  public void test_texas_holdem_7802_3c6cKhKsTd_Ts9c_2sAc_7d7h_Kc2d() {
    assertEquals(
      "2sAc 7d7h Ts9c Kc2d",
      Solver.process("texas-holdem 3c6cKhKsTd Ts9c 2sAc 7d7h Kc2d"));
  }

  @Test
  public void test_texas_holdem_7803_2h5h6hKsQs_Th8d_Js7s_4h2s() {
    assertEquals(
      "Th8d Js7s 4h2s",
      Solver.process("texas-holdem 2h5h6hKsQs Th8d Js7s 4h2s"));
  }

  @Test
  public void test_texas_holdem_7804_5d8c9d9sAh_Tc8s_3h5s_8h6h_Jh2d_Qc4d_7sJd_Js2h_KdTd() {
    assertEquals(
      "7sJd=Jh2d=Js2h Qc4d KdTd 3h5s 8h6h=Tc8s",
      Solver.process("texas-holdem 5d8c9d9sAh Tc8s 3h5s 8h6h Jh2d Qc4d 7sJd Js2h KdTd"));
  }

  @Test
  public void test_texas_holdem_7805_2h4c5cKdTc_9sAc_7h4h_2dAs_5dJh_3c5h_6h7c() {
    assertEquals(
      "6h7c 9sAc 2dAs 7h4h 3c5h 5dJh",
      Solver.process("texas-holdem 2h4c5cKdTc 9sAc 7h4h 2dAs 5dJh 3c5h 6h7c"));
  }

  @Test
  public void test_texas_holdem_7806_2s6h7hJhTs_Ac5d_4dQd_Td9s_Kh8s() {
    assertEquals(
      "4dQd Kh8s Ac5d Td9s",
      Solver.process("texas-holdem 2s6h7hJhTs Ac5d 4dQd Td9s Kh8s"));
  }

  @Test
  public void test_texas_holdem_7807_4c6h7sJdQc_8sJs_5d2h() {
    assertEquals(
      "5d2h 8sJs",
      Solver.process("texas-holdem 4c6h7sJdQc 8sJs 5d2h"));
  }

  @Test
  public void test_texas_holdem_7808_2h5c5hQhTd_5dTs_Jc9c_7c2s_9d2d_Jh6d_8c3c_2cJd_4sKc_KdTc() {
    assertEquals(
      "8c3c Jc9c=Jh6d 4sKc 2cJd=7c2s=9d2d KdTc 5dTs",
      Solver.process("texas-holdem 2h5c5hQhTd 5dTs Jc9c 7c2s 9d2d Jh6d 8c3c 2cJd 4sKc KdTc"));
  }

  @Test
  public void test_texas_holdem_7809_5s7c7h8hQc_4c6c_9dAh() {
    assertEquals(
      "9dAh 4c6c",
      Solver.process("texas-holdem 5s7c7h8hQc 4c6c 9dAh"));
  }

  @Test
  public void test_texas_holdem_7810_2cAsKhQcQh_Td8h_6h4h() {
    assertEquals(
      "6h4h Td8h",
      Solver.process("texas-holdem 2cAsKhQcQh Td8h 6h4h"));
  }

  @Test
  public void test_texas_holdem_7811_2d9dQdQhQs_Kd7c_7s2c_2h8s_5h7h_6d6s_9s5d() {
    assertEquals(
      "5h7h Kd7c 2h8s=7s2c 6d6s 9s5d",
      Solver.process("texas-holdem 2d9dQdQhQs Kd7c 7s2c 2h8s 5h7h 6d6s 9s5d"));
  }

  @Test
  public void test_texas_holdem_7812_2s4c4d4s9d_6cKh_6h3h() {
    assertEquals(
      "6h3h 6cKh",
      Solver.process("texas-holdem 2s4c4d4s9d 6cKh 6h3h"));
  }

  @Test
  public void test_texas_holdem_7813_5s6d8h9h9s_7h8s_4cKh_7c2c() {
    assertEquals(
      "4cKh 7c2c=7h8s",
      Solver.process("texas-holdem 5s6d8h9h9s 7h8s 4cKh 7c2c"));
  }

  @Test
  public void test_texas_holdem_7814_2h3c8s9sQh_7sAh_4sAs_7d3d() {
    assertEquals(
      "4sAs 7sAh 7d3d",
      Solver.process("texas-holdem 2h3c8s9sQh 7sAh 4sAs 7d3d"));
  }

  @Test
  public void test_texas_holdem_7815_4c4d5s7d8s_JhAs_5h3c_Ts8h_6h7h_4hKs_7c8c() {
    assertEquals(
      "JhAs 5h3c Ts8h 7c8c 4hKs 6h7h",
      Solver.process("texas-holdem 4c4d5s7d8s JhAs 5h3c Ts8h 6h7h 4hKs 7c8c"));
  }

  @Test
  public void test_texas_holdem_7816_2d4s7cJsKc_Ah6h_7sKs_QcQh_6s3h_3s4d_Ad5h_2h6c_9dQs() {
    assertEquals(
      "6s3h 9dQs Ad5h Ah6h 2h6c 3s4d QcQh 7sKs",
      Solver.process("texas-holdem 2d4s7cJsKc Ah6h 7sKs QcQh 6s3h 3s4d Ad5h 2h6c 9dQs"));
  }

  @Test
  public void test_texas_holdem_7817_2s7c7s8c9c_Ac3d_2cQc_QhJs() {
    assertEquals(
      "QhJs Ac3d 2cQc",
      Solver.process("texas-holdem 2s7c7s8c9c Ac3d 2cQc QhJs"));
  }

  @Test
  public void test_texas_holdem_7818_5d6cQcQdTc_2d4d_Qh3h_Ks5c_5h3c_7c8d_3s4s() {
    assertEquals(
      "2d4d=3s4s 7c8d 5h3c Ks5c Qh3h",
      Solver.process("texas-holdem 5d6cQcQdTc 2d4d Qh3h Ks5c 5h3c 7c8d 3s4s"));
  }

  @Test
  public void test_texas_holdem_7819_4h7sJsQcQs_9h7c_JdKs_Qh7d_8d9d_Ah3h_KcJc_8cJh_Th4d() {
    assertEquals(
      "8d9d Ah3h Th4d 9h7c 8cJh JdKs=KcJc Qh7d",
      Solver.process("texas-holdem 4h7sJsQcQs 9h7c JdKs Qh7d 8d9d Ah3h KcJc 8cJh Th4d"));
  }

  @Test
  public void test_texas_holdem_7820_2d4c5cKsTc_3s5s_KhJc_As5d_Ad8h() {
    assertEquals(
      "Ad8h 3s5s As5d KhJc",
      Solver.process("texas-holdem 2d4c5cKsTc 3s5s KhJc As5d Ad8h"));
  }

  @Test
  public void test_texas_holdem_7821_2s4d5dAsTh_8sQs_4s2h() {
    assertEquals(
      "8sQs 4s2h",
      Solver.process("texas-holdem 2s4d5dAsTh 8sQs 4s2h"));
  }

  @Test
  public void test_texas_holdem_7822_3c3d7hQcTh_5c3s_5h6d_9dTs_9c6c_4cTd_7s7d() {
    assertEquals(
      "5h6d 9c6c 4cTd=9dTs 5c3s 7s7d",
      Solver.process("texas-holdem 3c3d7hQcTh 5c3s 5h6d 9dTs 9c6c 4cTd 7s7d"));
  }

  @Test
  public void test_texas_holdem_7823_2h3d7hAdTd_8hTs_5dAh_5c4h_6c3c() {
    assertEquals(
      "6c3c 8hTs 5dAh 5c4h",
      Solver.process("texas-holdem 2h3d7hAdTd 8hTs 5dAh 5c4h 6c3c"));
  }

  @Test
  public void test_texas_holdem_7824_3d4s6d7hJh_8c7s_5cAs_Js6c_KdTc() {
    assertEquals(
      "KdTc 8c7s Js6c 5cAs",
      Solver.process("texas-holdem 3d4s6d7hJh 8c7s 5cAs Js6c KdTc"));
  }

  @Test
  public void test_texas_holdem_7825_2d8d8s9d9h_ThTs_TcJs_6d7h_Jd2h_4d7c_3dAd_Kc5s() {
    assertEquals(
      "4d7c=6d7h Jd2h=TcJs Kc5s ThTs 3dAd",
      Solver.process("texas-holdem 2d8d8s9d9h ThTs TcJs 6d7h Jd2h 4d7c 3dAd Kc5s"));
  }

  @Test
  public void test_texas_holdem_7826_3h5d6d8h9h_6s2c_7sTd_9s2h_Kh5s_KdTc_Jd5h_4sKc_9dQd() {
    assertEquals(
      "4sKc KdTc Jd5h Kh5s 6s2c 9s2h 9dQd 7sTd",
      Solver.process("texas-holdem 3h5d6d8h9h 6s2c 7sTd 9s2h Kh5s KdTc Jd5h 4sKc 9dQd"));
  }

  @Test
  public void test_texas_holdem_7827_7c8sJcQcQs_KcJd_9dKd_8c7s_9hTh_JhKs_5c3d_6c4d() {
    assertEquals(
      "5c3d=6c4d 9dKd 8c7s JhKs=KcJd 9hTh",
      Solver.process("texas-holdem 7c8sJcQcQs KcJd 9dKd 8c7s 9hTh JhKs 5c3d 6c4d"));
  }

  @Test
  public void test_texas_holdem_7828_4d5c5d7cTd_8sAd_KdJc_3cAs_8d9d_KsTs_Qh6s_8cJd_Jh5s() {
    assertEquals(
      "8cJd Qh6s KdJc 3cAs 8sAd KsTs Jh5s 8d9d",
      Solver.process("texas-holdem 4d5c5d7cTd 8sAd KdJc 3cAs 8d9d KsTs Qh6s 8cJd Jh5s"));
  }

  @Test
  public void test_texas_holdem_7829_5d6d8d8hAd_QsQh_4h6c_8cQd_2c5h() {
    assertEquals(
      "2c5h 4h6c QsQh 8cQd",
      Solver.process("texas-holdem 5d6d8d8hAd QsQh 4h6c 8cQd 2c5h"));
  }

  @Test
  public void test_texas_holdem_7830_3d3h3sQhTd_5c3c_7s4h_Js8d_4dKh() {
    assertEquals(
      "7s4h Js8d 4dKh 5c3c",
      Solver.process("texas-holdem 3d3h3sQhTd 5c3c 7s4h Js8d 4dKh"));
  }

  @Test
  public void test_texas_holdem_7831_3c5s8cKdQd_3h6d_ThKc_TsQs_Ah7d_Td4c_Ks3d_Qh2h_Tc9d_5c8h() {
    assertEquals(
      "Td4c Tc9d Ah7d 3h6d Qh2h TsQs ThKc 5c8h Ks3d",
      Solver.process("texas-holdem 3c5s8cKdQd 3h6d ThKc TsQs Ah7d Td4c Ks3d Qh2h Tc9d 5c8h"));
  }

  @Test
  public void test_texas_holdem_7832_7c7hKhKsQh_5cQd_JsJh_2cJd_8cAc_QcTd() {
    assertEquals(
      "2cJd 8cAc JsJh 5cQd QcTd",
      Solver.process("texas-holdem 7c7hKhKsQh 5cQd JsJh 2cJd 8cAc QcTd"));
  }

  @Test
  public void test_texas_holdem_7833_6h8cAhJsTs_5c5h_7c9s_Td2s_9h3d() {
    assertEquals(
      "9h3d 5c5h Td2s 7c9s",
      Solver.process("texas-holdem 6h8cAhJsTs 5c5h 7c9s Td2s 9h3d"));
  }

  @Test
  public void test_texas_holdem_7834_2h6h7h9c9s_6d3c_4s4d_2sAc_8hAs_2d8d_6s5h() {
    assertEquals(
      "8hAs 2d8d 2sAc 4s4d 6d3c=6s5h",
      Solver.process("texas-holdem 2h6h7h9c9s 6d3c 4s4d 2sAc 8hAs 2d8d 6s5h"));
  }

  @Test
  public void test_texas_holdem_7835_2c2d8h9hKs_KcJc_5h6h() {
    assertEquals(
      "5h6h KcJc",
      Solver.process("texas-holdem 2c2d8h9hKs KcJc 5h6h"));
  }

  @Test
  public void test_texas_holdem_7836_4s5d8hJcJs_4d7h_9s5h_TdKc_8s7s_5sJd_Ac3d_Qh6s_Tc2h_9c6c() {
    assertEquals(
      "9c6c Tc2h Qh6s TdKc Ac3d 4d7h 9s5h 8s7s 5sJd",
      Solver.process("texas-holdem 4s5d8hJcJs 4d7h 9s5h TdKc 8s7s 5sJd Ac3d Qh6s Tc2h 9c6c"));
  }

  @Test
  public void test_texas_holdem_7837_2c2h4h4sKs_3cTc_Kd3s_4c9h_8s9c_AhJc_6hQs_Ac3d() {
    assertEquals(
      "3cTc=6hQs=8s9c Ac3d=AhJc Kd3s 4c9h",
      Solver.process("texas-holdem 2c2h4h4sKs 3cTc Kd3s 4c9h 8s9c AhJc 6hQs Ac3d"));
  }

  @Test
  public void test_texas_holdem_7838_3c5d7hAsTh_9d9c_5s3s() {
    assertEquals(
      "9d9c 5s3s",
      Solver.process("texas-holdem 3c5d7hAsTh 9d9c 5s3s"));
  }

  @Test
  public void test_texas_holdem_7839_4c4h6d8hJc_Ac8c_3h9c() {
    assertEquals(
      "3h9c Ac8c",
      Solver.process("texas-holdem 4c4h6d8hJc Ac8c 3h9c"));
  }

  @Test
  public void test_texas_holdem_7840_5hAsJdKdTd_9c7d_6c8d_6s9d_3d7h_2h3c_AdAh_9h5d_KcQd_8hJh() {
    assertEquals(
      "2h3c 3d7h 6c8d 6s9d=9c7d 9h5d 8hJh AdAh KcQd",
      Solver.process("texas-holdem 5hAsJdKdTd 9c7d 6c8d 6s9d 3d7h 2h3c AdAh 9h5d KcQd 8hJh"));
  }

  @Test
  public void test_texas_holdem_7841_2d2h4c8hTh_8dAd_2s4d_Kh5s_4sAc_5h9h_6cKd_Jd6h() {
    assertEquals(
      "Jd6h 6cKd=Kh5s 4sAc 8dAd 5h9h 2s4d",
      Solver.process("texas-holdem 2d2h4c8hTh 8dAd 2s4d Kh5s 4sAc 5h9h 6cKd Jd6h"));
  }

  @Test
  public void test_texas_holdem_7842_4s8d8hJdKc_TcJc_7hJh() {
    assertEquals(
      "7hJh=TcJc",
      Solver.process("texas-holdem 4s8d8hJdKc TcJc 7hJh"));
  }

  @Test
  public void test_texas_holdem_7843_8sAsJcJsKh_Td3s_8h3c_KcKd_4d2s_9d5d_3h4h() {
    assertEquals(
      "3h4h=4d2s 9d5d Td3s 8h3c KcKd",
      Solver.process("texas-holdem 8sAsJcJsKh Td3s 8h3c KcKd 4d2s 9d5d 3h4h"));
  }

  @Test
  public void test_texas_holdem_7844_4c6hJsKcKd_Qh4h_Ks4s_8c4d_Td9s_5c5s_6d8s() {
    assertEquals(
      "Td9s 8c4d Qh4h 5c5s 6d8s Ks4s",
      Solver.process("texas-holdem 4c6hJsKcKd Qh4h Ks4s 8c4d Td9s 5c5s 6d8s"));
  }

  @Test
  public void test_texas_holdem_7845_5c6hJdQcTd_7cKs_7s2d_3cQs_4c7h() {
    assertEquals(
      "4c7h=7s2d 7cKs 3cQs",
      Solver.process("texas-holdem 5c6hJdQcTd 7cKs 7s2d 3cQs 4c7h"));
  }

  @Test
  public void test_texas_holdem_7846_5c6c6s7dKs_Ah8h_Ad3s_Qc3h_3d8s_5h9s_Kc8d() {
    assertEquals(
      "3d8s Qc3h Ad3s Ah8h 5h9s Kc8d",
      Solver.process("texas-holdem 5c6c6s7dKs Ah8h Ad3s Qc3h 3d8s 5h9s Kc8d"));
  }

  @Test
  public void test_texas_holdem_7847_4h5h5sKcTs_JsKh_8d3d_5c6h_2cAs() {
    assertEquals(
      "8d3d 2cAs JsKh 5c6h",
      Solver.process("texas-holdem 4h5h5sKcTs JsKh 8d3d 5c6h 2cAs"));
  }

  @Test
  public void test_texas_holdem_7848_2c4h5d6dTd_8s3s_9sTh_AsKc() {
    assertEquals(
      "AsKc 9sTh 8s3s",
      Solver.process("texas-holdem 2c4h5d6dTd 8s3s 9sTh AsKc"));
  }

  @Test
  public void test_texas_holdem_7849_6dAhJdQdTc_As9d_7s7c_7h6s_2c5d_3d7d() {
    assertEquals(
      "2c5d 7h6s 7s7c As9d 3d7d",
      Solver.process("texas-holdem 6dAhJdQdTc As9d 7s7c 7h6s 2c5d 3d7d"));
  }

  @Test
  public void test_texas_holdem_7850_8sJhJsKdQs_Qd3d_4s8h_3s4h_2d7h() {
    assertEquals(
      "2d7h=3s4h 4s8h Qd3d",
      Solver.process("texas-holdem 8sJhJsKdQs Qd3d 4s8h 3s4h 2d7h"));
  }

  @Test
  public void test_texas_holdem_7851_2d3d3s4hTs_8dKh_6dKd_AdJs_9c3h_3c5c_7c7d_Tc9d_5sQc() {
    assertEquals(
      "5sQc 6dKd 8dKh AdJs 7c7d Tc9d 3c5c 9c3h",
      Solver.process("texas-holdem 2d3d3s4hTs 8dKh 6dKd AdJs 9c3h 3c5c 7c7d Tc9d 5sQc"));
  }

  @Test
  public void test_texas_holdem_7852_4d8cAdJcTs_AcQd_Qs5s_6hKs_2c6c_6d2s_9dAh() {
    assertEquals(
      "2c6c=6d2s Qs5s 6hKs 9dAh AcQd",
      Solver.process("texas-holdem 4d8cAdJcTs AcQd Qs5s 6hKs 2c6c 6d2s 9dAh"));
  }

  @Test
  public void test_texas_holdem_7853_5hJcKsQhTc_5c2s_9s4h_QsKc_4c4d_QcTs() {
    assertEquals(
      "4c4d 5c2s QcTs QsKc 9s4h",
      Solver.process("texas-holdem 5hJcKsQhTc 5c2s 9s4h QsKc 4c4d QcTs"));
  }

  @Test
  public void test_texas_holdem_7854_3h9dAhKcQh_4h2c_Jc5c_AcQd() {
    assertEquals(
      "4h2c Jc5c AcQd",
      Solver.process("texas-holdem 3h9dAhKcQh 4h2c Jc5c AcQd"));
  }

  @Test
  public void test_texas_holdem_7855_2d5c7h9dQs_5s9s_KsJs_TsTc() {
    assertEquals(
      "KsJs TsTc 5s9s",
      Solver.process("texas-holdem 2d5c7h9dQs 5s9s KsJs TsTc"));
  }

  @Test
  public void test_texas_holdem_7856_3s4c9dAcKc_Qd5d_3c3d_QhKs_8hTs_2hAs_9hJc_8s8c_9c2s() {
    assertEquals(
      "8hTs Qd5d 8s8c 9c2s 9hJc QhKs 2hAs 3c3d",
      Solver.process("texas-holdem 3s4c9dAcKc Qd5d 3c3d QhKs 8hTs 2hAs 9hJc 8s8c 9c2s"));
  }

  @Test
  public void test_texas_holdem_7857_2s9dAcAsTd_7cQc_6cKc_7s2d_9c6d_2h3h_Js5s() {
    assertEquals(
      "Js5s 7cQc 6cKc 2h3h=7s2d 9c6d",
      Solver.process("texas-holdem 2s9dAcAsTd 7cQc 6cKc 7s2d 9c6d 2h3h Js5s"));
  }

  @Test
  public void test_texas_holdem_7858_3s5d6dJdKh_7c6c_2cJs_Ac5h_Ah5s_5cKd() {
    assertEquals(
      "Ac5h=Ah5s 7c6c 2cJs 5cKd",
      Solver.process("texas-holdem 3s5d6dJdKh 7c6c 2cJs Ac5h Ah5s 5cKd"));
  }

  @Test
  public void test_texas_holdem_7859_4d5c6c7d8s_2sTh_7c7h_Kh2c_Kc9h_4h3d_2h9c() {
    assertEquals(
      "2sTh=4h3d=7c7h=Kh2c 2h9c=Kc9h",
      Solver.process("texas-holdem 4d5c6c7d8s 2sTh 7c7h Kh2c Kc9h 4h3d 2h9c"));
  }

  @Test
  public void test_texas_holdem_7860_2c4d5cAcTh_9h3s_JcAs_3c3d_Kd4s_Qs5s_8d9c_2h3h_Qc6d_Ts7c() {
    assertEquals(
      "8d9c Qc6d Kd4s Qs5s Ts7c JcAs 2h3h=3c3d=9h3s",
      Solver.process("texas-holdem 2c4d5cAcTh 9h3s JcAs 3c3d Kd4s Qs5s 8d9c 2h3h Qc6d Ts7c"));
  }

  @Test
  public void test_texas_holdem_7861_2h5h7hAcQd_7cAd_2cJh_7d2d_Qs4s_6sTd_KcAs_Qh8d_6d2s() {
    assertEquals(
      "6sTd 6d2s 2cJh Qs4s Qh8d KcAs 7d2d 7cAd",
      Solver.process("texas-holdem 2h5h7hAcQd 7cAd 2cJh 7d2d Qs4s 6sTd KcAs Qh8d 6d2s"));
  }

  @Test
  public void test_texas_holdem_7862_8s9sAcKdKh_3sTs_Jd8d() {
    assertEquals(
      "3sTs Jd8d",
      Solver.process("texas-holdem 8s9sAcKdKh 3sTs Jd8d"));
  }

  @Test
  public void test_texas_holdem_7863_4d4s5d6sKh_KdQs_3sJh_4hJd() {
    assertEquals(
      "3sJh KdQs 4hJd",
      Solver.process("texas-holdem 4d4s5d6sKh KdQs 3sJh 4hJd"));
  }

  @Test
  public void test_texas_holdem_7864_3c3h4s8dQc_2s9c_7d5c_4dAh_8hJd() {
    assertEquals(
      "7d5c 2s9c 4dAh 8hJd",
      Solver.process("texas-holdem 3c3h4s8dQc 2s9c 7d5c 4dAh 8hJd"));
  }

  @Test
  public void test_texas_holdem_7865_5s7s8c8sKc_9sAh_4cJd_5c8d_Ks2c_AdTs_KdAs_7h6s_6hTc() {
    assertEquals(
      "6hTc 4cJd 9sAh AdTs 7h6s Ks2c KdAs 5c8d",
      Solver.process("texas-holdem 5s7s8c8sKc 9sAh 4cJd 5c8d Ks2c AdTs KdAs 7h6s 6hTc"));
  }

  @Test
  public void test_texas_holdem_7866_4c5c6c9hKs_ThTc_JcJs_8dKc_Kh7d_2s4h_3d3s() {
    assertEquals(
      "3d3s 2s4h ThTc JcJs Kh7d 8dKc",
      Solver.process("texas-holdem 4c5c6c9hKs ThTc JcJs 8dKc Kh7d 2s4h 3d3s"));
  }

  @Test
  public void test_texas_holdem_7867_5s8sKdTcTd_4c5c_7h2d_KsAc_As4d_9d7s_5d6s_Js4s_Th9s_Qs5h() {
    assertEquals(
      "7h2d 9d7s Js4s As4d 4c5c=5d6s=Qs5h KsAc Th9s",
      Solver.process("texas-holdem 5s8sKdTcTd 4c5c 7h2d KsAc As4d 9d7s 5d6s Js4s Th9s Qs5h"));
  }

  @Test
  public void test_texas_holdem_7868_4s7c8dJhJs_9d2c_9s9c_KcQh_7h4h_Ac8c_JdAh_8sTd_Kd3c() {
    assertEquals(
      "9d2c Kd3c KcQh 7h4h 8sTd Ac8c 9s9c JdAh",
      Solver.process("texas-holdem 4s7c8dJhJs 9d2c 9s9c KcQh 7h4h Ac8c JdAh 8sTd Kd3c"));
  }

  @Test
  public void test_texas_holdem_7869_5h7dAcKhTd_6s2d_6h9h_5s7c() {
    assertEquals(
      "6s2d 6h9h 5s7c",
      Solver.process("texas-holdem 5h7dAcKhTd 6s2d 6h9h 5s7c"));
  }

  @Test
  public void test_texas_holdem_7870_4d5d7sKcTh_Qs8c_5s7d_7c4h_Ks5c_KdAh_AsJs_Qd2h() {
    assertEquals(
      "Qd2h Qs8c AsJs KdAh 7c4h 5s7d Ks5c",
      Solver.process("texas-holdem 4d5d7sKcTh Qs8c 5s7d 7c4h Ks5c KdAh AsJs Qd2h"));
  }

  @Test
  public void test_texas_holdem_7871_3cAhKdKsQc_6c2d_5c7c_Qd6h_JdKh() {
    assertEquals(
      "6c2d 5c7c Qd6h JdKh",
      Solver.process("texas-holdem 3cAhKdKsQc 6c2d 5c7c Qd6h JdKh"));
  }

  @Test
  public void test_texas_holdem_7872_2s5s7s9sTs_7dAs_8s4s_JhTd_6sKc_Kd9h_5dKs_8d2h() {
    assertEquals(
      "8d2h=JhTd=Kd9h 6sKc 8s4s 5dKs 7dAs",
      Solver.process("texas-holdem 2s5s7s9sTs 7dAs 8s4s JhTd 6sKc Kd9h 5dKs 8d2h"));
  }

  @Test
  public void test_texas_holdem_7873_2d2h6dKcQs_QcJd_TsAs_Ac5c_9sJc_8s7c_KsQh_Ah6c_Kh8c_4c4h() {
    assertEquals(
      "8s7c 9sJc Ac5c=TsAs 4c4h Ah6c QcJd Kh8c KsQh",
      Solver.process("texas-holdem 2d2h6dKcQs QcJd TsAs Ac5c 9sJc 8s7c KsQh Ah6c Kh8c 4c4h"));
  }

  @Test
  public void test_texas_holdem_7874_2h7d9sJcQc_6dTs_KdKc_9cAd() {
    assertEquals(
      "6dTs 9cAd KdKc",
      Solver.process("texas-holdem 2h7d9sJcQc 6dTs KdKc 9cAd"));
  }

  @Test
  public void test_texas_holdem_7875_3c3s4d6dQh_5hKh_Ks5s_6sKd_8c9d_6h4h_Jd8h_7s2s_2d7d_5dAh() {
    assertEquals(
      "2d7d=7s2s 8c9d Jd8h 5hKh=Ks5s 5dAh 6sKd 6h4h",
      Solver.process("texas-holdem 3c3s4d6dQh 5hKh Ks5s 6sKd 8c9d 6h4h Jd8h 7s2s 2d7d 5dAh"));
  }

  @Test
  public void test_texas_holdem_7876_5d5s6d6h7c_QhQs_4d2c_KdAh() {
    assertEquals(
      "4d2c KdAh QhQs",
      Solver.process("texas-holdem 5d5s6d6h7c QhQs 4d2c KdAh"));
  }

  @Test
  public void test_texas_holdem_7877_6c8c8hJsKh_AdAh_As7d_Qd6h_2d6d_Th4c_QsTc_Qh8s() {
    assertEquals(
      "Th4c QsTc As7d 2d6d=Qd6h AdAh Qh8s",
      Solver.process("texas-holdem 6c8c8hJsKh AdAh As7d Qd6h 2d6d Th4c QsTc Qh8s"));
  }

  @Test
  public void test_texas_holdem_7878_5s7h8sAdTh_8h7s_8d3s_AhAs_4hQh_7dJs_QcJc_2dJh_6s5c_8c6c() {
    assertEquals(
      "2dJh 4hQh QcJc 6s5c 7dJs 8c6c=8d3s 8h7s AhAs",
      Solver.process("texas-holdem 5s7h8sAdTh 8h7s 8d3s AhAs 4hQh 7dJs QcJc 2dJh 6s5c 8c6c"));
  }

  @Test
  public void test_texas_holdem_7879_4c4dAdAsTd_QdAc_5sKc_Js7d_Ts9h_5dAh_7cQs_3c4s() {
    assertEquals(
      "Js7d 7cQs 5sKc Ts9h 3c4s 5dAh=QdAc",
      Solver.process("texas-holdem 4c4dAdAsTd QdAc 5sKc Js7d Ts9h 5dAh 7cQs 3c4s"));
  }

  @Test
  public void test_texas_holdem_7880_7dJhKdKsTs_Th6s_7cKc() {
    assertEquals(
      "Th6s 7cKc",
      Solver.process("texas-holdem 7dJhKdKsTs Th6s 7cKc"));
  }

  @Test
  public void test_texas_holdem_7881_5c8d8sAdKd_9d7d_Qs3d_9s8h_9cJc_5hKs_5d3h() {
    assertEquals(
      "9cJc Qs3d 5d3h 5hKs 9s8h 9d7d",
      Solver.process("texas-holdem 5c8d8sAdKd 9d7d Qs3d 9s8h 9cJc 5hKs 5d3h"));
  }

  @Test
  public void test_texas_holdem_7882_6h7h8d9sTd_7s9c_2sTs_QcKd_6d3d_Jc2h_AsKc() {
    assertEquals(
      "2sTs=6d3d=7s9c=AsKc=QcKd Jc2h",
      Solver.process("texas-holdem 6h7h8d9sTd 7s9c 2sTs QcKd 6d3d Jc2h AsKc"));
  }

  @Test
  public void test_texas_holdem_7883_4h9sAcJcJd_Tc8s_7h6d_Ad3h_5dAs_QcQd_5cTh() {
    assertEquals(
      "7h6d 5cTh=Tc8s QcQd 5dAs=Ad3h",
      Solver.process("texas-holdem 4h9sAcJcJd Tc8s 7h6d Ad3h 5dAs QcQd 5cTh"));
  }

  @Test
  public void test_texas_holdem_7884_5sJcQsTdTs_7d5d_2c5h_6d8s_9d4c_As3d_Kh8c_8hQc_6sJd_3c3s() {
    assertEquals(
      "6d8s 9d4c Kh8c As3d 3c3s 2c5h=7d5d 6sJd 8hQc",
      Solver.process("texas-holdem 5sJcQsTdTs 7d5d 2c5h 6d8s 9d4c As3d Kh8c 8hQc 6sJd 3c3s"));
  }

  @Test
  public void test_texas_holdem_7885_3c6s8hAdTc_7c9d_8d4s_6cQh_TdKd_AhTh_3s7d_5sKs_Qc3h() {
    assertEquals(
      "5sKs 3s7d Qc3h 6cQh 8d4s TdKd AhTh 7c9d",
      Solver.process("texas-holdem 3c6s8hAdTc 7c9d 8d4s 6cQh TdKd AhTh 3s7d 5sKs Qc3h"));
  }

  @Test
  public void test_texas_holdem_7886_2s8s9sQcTh_AsAd_7hJh_5sTs_Qs2c_6c7d_8c4s() {
    assertEquals(
      "8c4s AsAd Qs2c 6c7d 7hJh 5sTs",
      Solver.process("texas-holdem 2s8s9sQcTh AsAd 7hJh 5sTs Qs2c 6c7d 8c4s"));
  }

  @Test
  public void test_texas_holdem_7887_2c3s5c6cJs_KsTd_4d6s_2s3h_3dQc_Ah9s_AcKh_Jc4s_8c6h() {
    assertEquals(
      "KsTd Ah9s AcKh 3dQc 8c6h 2s3h 4d6s=Jc4s",
      Solver.process("texas-holdem 2c3s5c6cJs KsTd 4d6s 2s3h 3dQc Ah9s AcKh Jc4s 8c6h"));
  }

  @Test
  public void test_texas_holdem_7888_3s4c8dJsTh_9c6c_9d4s_Qd6d_As6h_7sAc_Jd2s_7c9s() {
    assertEquals(
      "9c6c Qd6d As6h 7sAc 9d4s Jd2s 7c9s",
      Solver.process("texas-holdem 3s4c8dJsTh 9c6c 9d4s Qd6d As6h 7sAc Jd2s 7c9s"));
  }

  @Test
  public void test_texas_holdem_7889_2h5d6sAsQh_7cJs_Ac6h() {
    assertEquals(
      "7cJs Ac6h",
      Solver.process("texas-holdem 2h5d6sAsQh 7cJs Ac6h"));
  }

  @Test
  public void test_texas_holdem_7890_3d3h9cJsQc_3s6h_Jd9h_6d2s_2d8h() {
    assertEquals(
      "2d8h=6d2s Jd9h 3s6h",
      Solver.process("texas-holdem 3d3h9cJsQc 3s6h Jd9h 6d2s 2d8h"));
  }

  @Test
  public void test_texas_holdem_7891_4s6s9sJhQh_3dQd_9cTh_Js8d_Jc5c_Ad8c_Ts6d() {
    assertEquals(
      "Ad8c Ts6d 9cTh Jc5c Js8d 3dQd",
      Solver.process("texas-holdem 4s6s9sJhQh 3dQd 9cTh Js8d Jc5c Ad8c Ts6d"));
  }

  @Test
  public void test_texas_holdem_7892_AhJhKsTdTh_7d9s_QsAs_5d4c_5c3s_7s3h_5s9d_6d6c() {
    assertEquals(
      "5c3s=5d4c=5s9d=7d9s=7s3h 6d6c QsAs",
      Solver.process("texas-holdem AhJhKsTdTh 7d9s QsAs 5d4c 5c3s 7s3h 5s9d 6d6c"));
  }

  @Test
  public void test_texas_holdem_7893_2c3s7sJhQs_5s9c_4h9h_KdJd_TsJs_2s8s_5c6s() {
    assertEquals(
      "5c6s 4h9h 5s9c KdJd 2s8s TsJs",
      Solver.process("texas-holdem 2c3s7sJhQs 5s9c 4h9h KdJd TsJs 2s8s 5c6s"));
  }

  @Test
  public void test_texas_holdem_7894_3h7cAsKhTc_ThKc_9hQs_Js4d_7s7h() {
    assertEquals(
      "Js4d 9hQs ThKc 7s7h",
      Solver.process("texas-holdem 3h7cAsKhTc ThKc 9hQs Js4d 7s7h"));
  }

  @Test
  public void test_texas_holdem_7895_4dAdKdKhTd_7s6s_4sAc_Qd8h_Jd9c_7d6d_8d6h_5h2d_8s7h() {
    assertEquals(
      "7s6s 8s7h 4sAc 5h2d 7d6d 8d6h Jd9c Qd8h",
      Solver.process("texas-holdem 4dAdKdKhTd 7s6s 4sAc Qd8h Jd9c 7d6d 8d6h 5h2d 8s7h"));
  }

  @Test
  public void test_texas_holdem_7896_3d3h9sJhTh_5s2d_Kc8h_Qc6d_Ts5c_5d3c_2sJc() {
    assertEquals(
      "5s2d Qc6d Kc8h Ts5c 2sJc 5d3c",
      Solver.process("texas-holdem 3d3h9sJhTh 5s2d Kc8h Qc6d Ts5c 5d3c 2sJc"));
  }

  @Test
  public void test_texas_holdem_7897_3h4d7d8cKc_QcQh_5h3s_2hJs_Ah5s_5d2d_6c8h_4c2c_6d4s() {
    assertEquals(
      "5d2d 2hJs Ah5s 5h3s 4c2c=6d4s 6c8h QcQh",
      Solver.process("texas-holdem 3h4d7d8cKc QcQh 5h3s 2hJs Ah5s 5d2d 6c8h 4c2c 6d4s"));
  }

  @Test
  public void test_texas_holdem_7898_5s6s8c9sQd_Ts9c_8h5h_Jh2h_2s9h_8d2c_5dQc_Kd4h_3c2d() {
    assertEquals(
      "3c2d Jh2h Kd4h 8d2c 2s9h Ts9c 8h5h 5dQc",
      Solver.process("texas-holdem 5s6s8c9sQd Ts9c 8h5h Jh2h 2s9h 8d2c 5dQc Kd4h 3c2d"));
  }

  @Test
  public void test_texas_holdem_7899_3c5d7c7sTs_5sTc_Qh2c_6sAh_7d9c_3hQd_2s2d_QcJc_4hKh_TdKc() {
    assertEquals(
      "Qh2c QcJc 4hKh 6sAh 2s2d 3hQd 5sTc TdKc 7d9c",
      Solver.process("texas-holdem 3c5d7c7sTs 5sTc Qh2c 6sAh 7d9c 3hQd 2s2d QcJc 4hKh TdKc"));
  }

  @Test
  public void test_texas_holdem_7900_3d3s5d8dTd_4hKs_Ac9c_4dAh_6h8c_4c6d_9hKh_6s9d_2c8h_7h5c() {
    assertEquals(
      "4hKs 9hKh Ac9c 7h5c 2c8h=6h8c 4dAh 4c6d 6s9d",
      Solver.process("texas-holdem 3d3s5d8dTd 4hKs Ac9c 4dAh 6h8c 4c6d 9hKh 6s9d 2c8h 7h5c"));
  }

  @Test
  public void test_texas_holdem_7901_7h8cKhQhQs_Ts8h_7c8s_6c4s_QcKs_TcJd_3dJc_5s5c_3s7d_4h4d() {
    assertEquals(
      "6c4s 3dJc TcJd 4h4d 5s5c 3s7d 7c8s=Ts8h QcKs",
      Solver.process("texas-holdem 7h8cKhQhQs Ts8h 7c8s 6c4s QcKs TcJd 3dJc 5s5c 3s7d 4h4d"));
  }

  @Test
  public void test_texas_holdem_7902_3s6s7hJhQc_8h9h_QhTc_ThTd_7d2h_9d3c_As3h() {
    assertEquals(
      "8h9h 9d3c As3h 7d2h ThTd QhTc",
      Solver.process("texas-holdem 3s6s7hJhQc 8h9h QhTc ThTd 7d2h 9d3c As3h"));
  }

  @Test
  public void test_texas_holdem_7903_3h4s5d7cTh_8c6h_6dAd_Qd3d_KhKc_As2h_2s9h_Jh9d_6s9c() {
    assertEquals(
      "2s9h Jh9d Qd3d KhKc As2h 6dAd=6s9c 8c6h",
      Solver.process("texas-holdem 3h4s5d7cTh 8c6h 6dAd Qd3d KhKc As2h 2s9h Jh9d 6s9c"));
  }

  @Test
  public void test_texas_holdem_7904_5d9hAdAhJs_Td4s_8h8c_KhKc_9cKs_7cKd_9s3s() {
    assertEquals(
      "Td4s 7cKd 8h8c 9s3s 9cKs KhKc",
      Solver.process("texas-holdem 5d9hAdAhJs Td4s 8h8c KhKc 9cKs 7cKd 9s3s"));
  }

  @Test
  public void test_texas_holdem_7905_3h4c8dJhKc_Jd8c_5hAd_2s7s_9s6c_2hAc_Ts4d() {
    assertEquals(
      "2s7s 9s6c 2hAc 5hAd Ts4d Jd8c",
      Solver.process("texas-holdem 3h4c8dJhKc Jd8c 5hAd 2s7s 9s6c 2hAc Ts4d"));
  }

  @Test
  public void test_texas_holdem_7906_4d4h5cAhKd_2hTh_Qh6h_6s6c_9dAs_3s4s_3c2s_2c7d_3d9s_7cAd() {
    assertEquals(
      "2c7d 3d9s 2hTh Qh6h 6s6c 7cAd=9dAs 3s4s 3c2s",
      Solver.process("texas-holdem 4d4h5cAhKd 2hTh Qh6h 6s6c 9dAs 3s4s 3c2s 2c7d 3d9s 7cAd"));
  }

  @Test
  public void test_texas_holdem_7907_4h4s5d8d8s_Qc2h_7dTd_Ks7c_Ac7s() {
    assertEquals(
      "7dTd Qc2h Ks7c Ac7s",
      Solver.process("texas-holdem 4h4s5d8d8s Qc2h 7dTd Ks7c Ac7s"));
  }

  @Test
  public void test_texas_holdem_7908_4h6s7c9dAd_KcJh_4dQh_QdAc_2c7d_Th6c() {
    assertEquals(
      "KcJh 4dQh Th6c 2c7d QdAc",
      Solver.process("texas-holdem 4h6s7c9dAd KcJh 4dQh QdAc 2c7d Th6c"));
  }

  @Test
  public void test_texas_holdem_7909_9c9dAsKcTs_5dJd_7s4d_Ac4c() {
    assertEquals(
      "7s4d 5dJd Ac4c",
      Solver.process("texas-holdem 9c9dAsKcTs 5dJd 7s4d Ac4c"));
  }

  @Test
  public void test_texas_holdem_7910_2s3h4h7cAh_ThAs_Qc2h_Tc6c_JcKh_Qh8d_6d2c() {
    assertEquals(
      "Tc6c Qh8d JcKh 6d2c Qc2h ThAs",
      Solver.process("texas-holdem 2s3h4h7cAh ThAs Qc2h Tc6c JcKh Qh8d 6d2c"));
  }

  @Test
  public void test_texas_holdem_7911_5c7hJsQcTh_2s7s_Jc7c() {
    assertEquals(
      "2s7s Jc7c",
      Solver.process("texas-holdem 5c7hJsQcTh 2s7s Jc7c"));
  }

  @Test
  public void test_texas_holdem_7912_2d6s9hAdQd_Td4h_8sKd() {
    assertEquals(
      "Td4h 8sKd",
      Solver.process("texas-holdem 2d6s9hAdQd Td4h 8sKd"));
  }

  @Test
  public void test_texas_holdem_7913_4h7h8dJdQh_7d2s_QsAs_6h9c_6sJs_Jh9h_4d6d_Tc9s_8hTs_6cTh() {
    assertEquals(
      "6h9c 6cTh 4d6d 7d2s 8hTs 6sJs QsAs Tc9s Jh9h",
      Solver.process("texas-holdem 4h7h8dJdQh 7d2s QsAs 6h9c 6sJs Jh9h 4d6d Tc9s 8hTs 6cTh"));
  }

  @Test
  public void test_texas_holdem_7914_2c6s9sAcKs_Qs4d_6hAs_8s9c() {
    assertEquals(
      "Qs4d 8s9c 6hAs",
      Solver.process("texas-holdem 2c6s9sAcKs Qs4d 6hAs 8s9c"));
  }

  @Test
  public void test_texas_holdem_7915_2d6dAdKdQd_6h7d_8dTc_Js5d_2sQs_3dQc_8h4s_5c8s_8cKs() {
    assertEquals(
      "2sQs=5c8s=8cKs=8h4s 3dQc Js5d 6h7d 8dTc",
      Solver.process("texas-holdem 2d6dAdKdQd 6h7d 8dTc Js5d 2sQs 3dQc 8h4s 5c8s 8cKs"));
  }

  @Test
  public void test_texas_holdem_7916_2s5cQhTdTs_8dKs_AcJh() {
    assertEquals(
      "8dKs AcJh",
      Solver.process("texas-holdem 2s5cQhTdTs 8dKs AcJh"));
  }

  @Test
  public void test_texas_holdem_7917_2d5h8h9cJc_KsJd_6h8d_9s2s_JhAd() {
    assertEquals(
      "6h8d KsJd JhAd 9s2s",
      Solver.process("texas-holdem 2d5h8h9cJc KsJd 6h8d 9s2s JhAd"));
  }

  @Test
  public void test_texas_holdem_7918_2d2h3hKdKs_8s7d_7s4h_4d5d_JsQc() {
    assertEquals(
      "4d5d 7s4h 8s7d JsQc",
      Solver.process("texas-holdem 2d2h3hKdKs 8s7d 7s4h 4d5d JsQc"));
  }

  @Test
  public void test_texas_holdem_7919_4d6d6sAcKh_Tc5s_Kd2c_9cJc_7h4s_QhAs_2s8d_7cTd_6cJh_3c3d() {
    assertEquals(
      "2s8d 7cTd=Tc5s 9cJc 3c3d 7h4s Kd2c QhAs 6cJh",
      Solver.process("texas-holdem 4d6d6sAcKh Tc5s Kd2c 9cJc 7h4s QhAs 2s8d 7cTd 6cJh 3c3d"));
  }

  @Test
  public void test_texas_holdem_7920_6c7d9hAsKh_2s4h_5hJh_3d8h() {
    assertEquals(
      "2s4h 3d8h 5hJh",
      Solver.process("texas-holdem 6c7d9hAsKh 2s4h 5hJh 3d8h"));
  }

  @Test
  public void test_texas_holdem_7921_2c7c8hJsQc_4c4d_TsQd_8dJh_9dKd_8c9c_9s3c_6cTh_7d7s() {
    assertEquals(
      "9s3c 6cTh 9dKd 4c4d TsQd 8dJh 7d7s 8c9c",
      Solver.process("texas-holdem 2c7c8hJsQc 4c4d TsQd 8dJh 9dKd 8c9c 9s3c 6cTh 7d7s"));
  }

  @Test
  public void test_texas_holdem_7922_3c5d9cQdTs_Ac7h_AhTh_3dJd_4sKd() {
    assertEquals(
      "4sKd Ac7h 3dJd AhTh",
      Solver.process("texas-holdem 3c5d9cQdTs Ac7h AhTh 3dJd 4sKd"));
  }

  @Test
  public void test_texas_holdem_7923_3s9d9h9sQh_6cTs_Kh8c() {
    assertEquals(
      "6cTs Kh8c",
      Solver.process("texas-holdem 3s9d9h9sQh 6cTs Kh8c"));
  }

  @Test
  public void test_texas_holdem_7924_2c4c7d7hAh_ThTd_2s5d_6h9h_3c8h_6s9s() {
    assertEquals(
      "3c8h 6h9h=6s9s 2s5d ThTd",
      Solver.process("texas-holdem 2c4c7d7hAh ThTd 2s5d 6h9h 3c8h 6s9s"));
  }

  @Test
  public void test_texas_holdem_7925_2d3h4h4s8h_5dKh_Tc2c_Ah5h_4dAc_KdTd_6sJc() {
    assertEquals(
      "6sJc 5dKh KdTd Tc2c 4dAc Ah5h",
      Solver.process("texas-holdem 2d3h4h4s8h 5dKh Tc2c Ah5h 4dAc KdTd 6sJc"));
  }

  @Test
  public void test_texas_holdem_7926_7c8s9hAhJc_2h3h_9dQc_Qd2s_8hTh_Ts7s_AsTc_9cJs() {
    assertEquals(
      "2h3h Qd2s 9dQc 9cJs 8hTh=AsTc=Ts7s",
      Solver.process("texas-holdem 7c8s9hAhJc 2h3h 9dQc Qd2s 8hTh Ts7s AsTc 9cJs"));
  }

  @Test
  public void test_texas_holdem_7927_6d8c8hAcQd_Kc5s_5h4h_2c5c_7h3s() {
    assertEquals(
      "2c5c=5h4h 7h3s Kc5s",
      Solver.process("texas-holdem 6d8c8hAcQd Kc5s 5h4h 2c5c 7h3s"));
  }

  @Test
  public void test_texas_holdem_7928_3s5s6d9cKc_2hKd_4s4d_Td9d_6h3c_5d2s_Js6c() {
    assertEquals(
      "4s4d 5d2s Js6c Td9d 2hKd 6h3c",
      Solver.process("texas-holdem 3s5s6d9cKc 2hKd 4s4d Td9d 6h3c 5d2s Js6c"));
  }

  @Test
  public void test_texas_holdem_7929_2c6d9cKhKs_Jd3c_3d4s() {
    assertEquals(
      "3d4s Jd3c",
      Solver.process("texas-holdem 2c6d9cKhKs Jd3c 3d4s"));
  }

  @Test
  public void test_texas_holdem_7930_3d3h5d7hKd_5cQh_7dTh_9sAh_Ks8c_TcAs_4h9d_5s6c_6s4c() {
    assertEquals(
      "4h9d 9sAh TcAs 5cQh=5s6c 7dTh Ks8c 6s4c",
      Solver.process("texas-holdem 3d3h5d7hKd 5cQh 7dTh 9sAh Ks8c TcAs 4h9d 5s6c 6s4c"));
  }

  @Test
  public void test_texas_holdem_7931_4s8d9dAhQh_5h7s_TsKd_7dAc_5sAs_3s7c_Qc3c_5dJd_2h9s_Jh9c() {
    assertEquals(
      "3s7c=5h7s 5dJd TsKd 2h9s Jh9c Qc3c 5sAs=7dAc",
      Solver.process("texas-holdem 4s8d9dAhQh 5h7s TsKd 7dAc 5sAs 3s7c Qc3c 5dJd 2h9s Jh9c"));
  }

  @Test
  public void test_texas_holdem_7932_2s3c8sKdTs_Kc5c_Tc6h_Td7h_ThAh_Jc8d() {
    assertEquals(
      "Jc8d Tc6h Td7h ThAh Kc5c",
      Solver.process("texas-holdem 2s3c8sKdTs Kc5c Tc6h Td7h ThAh Jc8d"));
  }

  @Test
  public void test_texas_holdem_7933_2c2h4sAdJc_7sTd_9dJs_6cKc() {
    assertEquals(
      "7sTd 6cKc 9dJs",
      Solver.process("texas-holdem 2c2h4sAdJc 7sTd 9dJs 6cKc"));
  }

  @Test
  public void test_texas_holdem_7934_6h8s9dAsJs_4dTh_7dJd_Ks9s_7sKd() {
    assertEquals(
      "4dTh 7sKd 7dJd Ks9s",
      Solver.process("texas-holdem 6h8s9dAsJs 4dTh 7dJd Ks9s 7sKd"));
  }

  @Test
  public void test_texas_holdem_7935_4d5c5sQdTh_5d3d_8s2d_2h9c_2c3c_Qc8c() {
    assertEquals(
      "2c3c 8s2d 2h9c Qc8c 5d3d",
      Solver.process("texas-holdem 4d5c5sQdTh 5d3d 8s2d 2h9c 2c3c Qc8c"));
  }

  @Test
  public void test_texas_holdem_7936_5h6h8hJdTs_Jh3d_2h5c() {
    assertEquals(
      "2h5c Jh3d",
      Solver.process("texas-holdem 5h6h8hJdTs Jh3d 2h5c"));
  }

  @Test
  public void test_texas_holdem_7937_3c3s4d7sQd_AhKc_Qc2s_Ad7d_2c6h_Qh9c_Kh9d() {
    assertEquals(
      "2c6h Kh9d AhKc Ad7d Qc2s Qh9c",
      Solver.process("texas-holdem 3c3s4d7sQd AhKc Qc2s Ad7d 2c6h Qh9c Kh9d"));
  }

  @Test
  public void test_texas_holdem_7938_2cKcKdThTs_TdKs_2h2s() {
    assertEquals(
      "2h2s TdKs",
      Solver.process("texas-holdem 2cKcKdThTs TdKs 2h2s"));
  }

  @Test
  public void test_texas_holdem_7939_2s5d5h8h9h_TcAd_2hQc() {
    assertEquals(
      "TcAd 2hQc",
      Solver.process("texas-holdem 2s5d5h8h9h TcAd 2hQc"));
  }

  @Test
  public void test_texas_holdem_7940_4h5c8cAhQh_7h2d_3sQs_3h2c_JdQc_9cQd_KhKd() {
    assertEquals(
      "7h2d 3sQs 9cQd JdQc KhKd 3h2c",
      Solver.process("texas-holdem 4h5c8cAhQh 7h2d 3sQs 3h2c JdQc 9cQd KhKd"));
  }

  @Test
  public void test_texas_holdem_7941_2h3s7dQcTs_JdAh_2dTc() {
    assertEquals(
      "JdAh 2dTc",
      Solver.process("texas-holdem 2h3s7dQcTs JdAh 2dTc"));
  }

  @Test
  public void test_texas_holdem_7942_8c8sAcKcQh_QdJc_As8h_6d4d_9d7s_8d5d_2h4s_4h6c() {
    assertEquals(
      "2h4s=4h6c=6d4d=9d7s QdJc 8d5d As8h",
      Solver.process("texas-holdem 8c8sAcKcQh QdJc As8h 6d4d 9d7s 8d5d 2h4s 4h6c"));
  }

  @Test
  public void test_texas_holdem_7943_3s8s9d9sTd_5c5h_8hTc_Ac2s() {
    assertEquals(
      "Ac2s 5c5h 8hTc",
      Solver.process("texas-holdem 3s8s9d9sTd 5c5h 8hTc Ac2s"));
  }

  @Test
  public void test_texas_holdem_7944_2h5d5sAcTh_Ah8c_6h5h_QsJh_3s9h() {
    assertEquals(
      "3s9h QsJh Ah8c 6h5h",
      Solver.process("texas-holdem 2h5d5sAcTh Ah8c 6h5h QsJh 3s9h"));
  }

  @Test
  public void test_texas_holdem_7945_5d7h9sJdQs_4dTh_AcJs_7sQc_9h7c_6c6s_Qd5h() {
    assertEquals(
      "4dTh 6c6s AcJs 9h7c Qd5h 7sQc",
      Solver.process("texas-holdem 5d7h9sJdQs 4dTh AcJs 7sQc 9h7c 6c6s Qd5h"));
  }

  @Test
  public void test_texas_holdem_7946_6d7cKcQdTh_AcQh_7h2c_6c6s_AdJc() {
    assertEquals(
      "7h2c AcQh 6c6s AdJc",
      Solver.process("texas-holdem 6d7cKcQdTh AcQh 7h2c 6c6s AdJc"));
  }

  @Test
  public void test_texas_holdem_7947_3s4h5h8d8s_Ks6c_7cAc_6s6h_JcTd_4d2d_Js2h() {
    assertEquals(
      "Js2h JcTd Ks6c 7cAc 4d2d 6s6h",
      Solver.process("texas-holdem 3s4h5h8d8s Ks6c 7cAc 6s6h JcTd 4d2d Js2h"));
  }

  @Test
  public void test_texas_holdem_7948_2s3h6h8sKc_2h5h_Ac8h_Ks9s_6s8d_7c7s() {
    assertEquals(
      "2h5h 7c7s Ac8h Ks9s 6s8d",
      Solver.process("texas-holdem 2s3h6h8sKc 2h5h Ac8h Ks9s 6s8d 7c7s"));
  }

  @Test
  public void test_texas_holdem_7949_3d9dAdAsJs_8c4h_Ah6c_3c5h_QcKs() {
    assertEquals(
      "8c4h QcKs 3c5h Ah6c",
      Solver.process("texas-holdem 3d9dAdAsJs 8c4h Ah6c 3c5h QcKs"));
  }

  @Test
  public void test_texas_holdem_7950_7h8sKsQcTs_3sKh_7s7c_3hKd_9h3d_Kc9s() {
    assertEquals(
      "9h3d 3hKd=3sKh Kc9s 7s7c",
      Solver.process("texas-holdem 7h8sKsQcTs 3sKh 7s7c 3hKd 9h3d Kc9s"));
  }

  @Test
  public void test_texas_holdem_7951_6d7d9cKsTs_9h7c_QsTh() {
    assertEquals(
      "QsTh 9h7c",
      Solver.process("texas-holdem 6d7d9cKsTs 9h7c QsTh"));
  }

  @Test
  public void test_texas_holdem_7952_8dJdKsQdQh_9d9h_4c2s_8h6s_ThKh_7sQs_Jh7h_Ad6h_Kd6d() {
    assertEquals(
      "4c2s Ad6h 8h6s 9d9h Jh7h ThKh 7sQs Kd6d",
      Solver.process("texas-holdem 8dJdKsQdQh 9d9h 4c2s 8h6s ThKh 7sQs Jh7h Ad6h Kd6d"));
  }

  @Test
  public void test_texas_holdem_7953_3c3h5hAhQc_5d7h_6sQh_8hAs_Js3s_TcKc_9dQs_Ac7d_3dTh_2c5c() {
    assertEquals(
      "TcKc 2c5c=5d7h 6sQh=9dQs 8hAs=Ac7d 3dTh=Js3s",
      Solver.process("texas-holdem 3c3h5hAhQc 5d7h 6sQh 8hAs Js3s TcKc 9dQs Ac7d 3dTh 2c5c"));
  }

  @Test
  public void test_texas_holdem_7954_2d3s6c6s7d_4c5d_3c9c_6dAs_7s8c_3h7c() {
    assertEquals(
      "3c9c 3h7c 7s8c 6dAs 4c5d",
      Solver.process("texas-holdem 2d3s6c6s7d 4c5d 3c9c 6dAs 7s8c 3h7c"));
  }

  @Test
  public void test_texas_holdem_7955_5d7sJsKhQs_5hJh_7c9s_9hKs_Jd3s() {
    assertEquals(
      "7c9s Jd3s 9hKs 5hJh",
      Solver.process("texas-holdem 5d7sJsKhQs 5hJh 7c9s 9hKs Jd3s"));
  }

  @Test
  public void test_texas_holdem_7956_4c6d8cAdTs_Kh7c_3dAc_9c3c_Qs4d_6s9s_Jh6h_8s8d() {
    assertEquals(
      "9c3c Kh7c Qs4d 6s9s Jh6h 3dAc 8s8d",
      Solver.process("texas-holdem 4c6d8cAdTs Kh7c 3dAc 9c3c Qs4d 6s9s Jh6h 8s8d"));
  }

  @Test
  public void test_texas_holdem_7957_4h7c7h9hJs_Jd5c_QdTd_Ad6d_7s8d_5d8h_3dQc_KhJc_Qh3c_Jh8c() {
    assertEquals(
      "5d8h 3dQc=Qh3c QdTd Ad6d Jd5c=Jh8c KhJc 7s8d",
      Solver.process("texas-holdem 4h7c7h9hJs Jd5c QdTd Ad6d 7s8d 5d8h 3dQc KhJc Qh3c Jh8c"));
  }

  @Test
  public void test_texas_holdem_7958_9cAdJdThTs_3s9d_4sQc_6s7h_Qd8s_QhKc_2sJh_6h3h_4cAh_Jc5c() {
    assertEquals(
      "6h3h=6s7h 4sQc 3s9d 2sJh=Jc5c 4cAh Qd8s QhKc",
      Solver.process("texas-holdem 9cAdJdThTs 3s9d 4sQc 6s7h Qd8s QhKc 2sJh 6h3h 4cAh Jc5c"));
  }

  @Test
  public void test_texas_holdem_7959_3d8sAsJsKs_6dJd_8c4d_2d7d_8dTs_Ad8h_QhAh_4sJc_3cKc_3sKd() {
    assertEquals(
      "2d7d 8c4d 6dJd QhAh 3cKc Ad8h 3sKd 4sJc 8dTs",
      Solver.process("texas-holdem 3d8sAsJsKs 6dJd 8c4d 2d7d 8dTs Ad8h QhAh 4sJc 3cKc 3sKd"));
  }

  @Test
  public void test_texas_holdem_7960_2d6s8c9sKc_Qh5d_5cKh_Ad7s_6c2s_6hTd() {
    assertEquals(
      "Qh5d Ad7s 6hTd 5cKh 6c2s",
      Solver.process("texas-holdem 2d6s8c9sKc Qh5d 5cKh Ad7s 6c2s 6hTd"));
  }

  @Test
  public void test_texas_holdem_7961_7s8sJdQdQs_Js3c_2dQc() {
    assertEquals(
      "Js3c 2dQc",
      Solver.process("texas-holdem 7s8sJdQdQs Js3c 2dQc"));
  }

  @Test
  public void test_texas_holdem_7962_2c8cAhKdQd_Ts6s_8d9c_Th9s_KcQs_6h4c() {
    assertEquals(
      "6h4c Ts6s Th9s 8d9c KcQs",
      Solver.process("texas-holdem 2c8cAhKdQd Ts6s 8d9c Th9s KcQs 6h4c"));
  }

  @Test
  public void test_texas_holdem_7963_3s6c6s9dKs_ThKc_TsJh_QhTc_9h7d_2s5s_4h3c_4cQd_8hAd_3d8c() {
    assertEquals(
      "TsJh 4cQd QhTc 8hAd 3d8c=4h3c 9h7d ThKc 2s5s",
      Solver.process("texas-holdem 3s6c6s9dKs ThKc TsJh QhTc 9h7d 2s5s 4h3c 4cQd 8hAd 3d8c"));
  }

  @Test
  public void test_texas_holdem_7964_4s5c5h7cQh_8c7d_AhAd_Tc4h_Ts2c_3h4d_7hAs_AcQd_7sJs_JcKs() {
    assertEquals(
      "Ts2c JcKs 3h4d=Tc4h 7sJs=8c7d 7hAs AcQd AhAd",
      Solver.process("texas-holdem 4s5c5h7cQh 8c7d AhAd Tc4h Ts2c 3h4d 7hAs AcQd 7sJs JcKs"));
  }

  @Test
  public void test_texas_holdem_7965_7d8d9c9hKs_Qd6c_5d4c_2d6h() {
    assertEquals(
      "2d6h=5d4c Qd6c",
      Solver.process("texas-holdem 7d8d9c9hKs Qd6c 5d4c 2d6h"));
  }

  @Test
  public void test_texas_holdem_7966_2c3d3h6h7h_4d5s_KsJd_AcTs_8h7c_Th6d() {
    assertEquals(
      "KsJd AcTs Th6d 8h7c 4d5s",
      Solver.process("texas-holdem 2c3d3h6h7h 4d5s KsJd AcTs 8h7c Th6d"));
  }

  @Test
  public void test_texas_holdem_7967_4d4s8sKdQs_9dAd_7dKh_Jd4c_2hTc_6cTh_3c2s() {
    assertEquals(
      "3c2s 2hTc=6cTh 9dAd 7dKh Jd4c",
      Solver.process("texas-holdem 4d4s8sKdQs 9dAd 7dKh Jd4c 2hTc 6cTh 3c2s"));
  }

  @Test
  public void test_texas_holdem_7968_2h4s9sAhQd_2dAd_QsKd_7h7s_JsKc_Td5c_3hTh_3c6c() {
    assertEquals(
      "3c6c 3hTh Td5c JsKc 7h7s QsKd 2dAd",
      Solver.process("texas-holdem 2h4s9sAhQd 2dAd QsKd 7h7s JsKc Td5c 3hTh 3c6c"));
  }

  @Test
  public void test_texas_holdem_7969_2dAdQsTcTh_9c7d_Ts8d_2s6s_JdKc_4s6c_9h7c_8c3d_8h7h_3s4c() {
    assertEquals(
      "3s4c 4s6c 8c3d=8h7h 9c7d=9h7c 2s6s Ts8d JdKc",
      Solver.process("texas-holdem 2dAdQsTcTh 9c7d Ts8d 2s6s JdKc 4s6c 9h7c 8c3d 8h7h 3s4c"));
  }

  @Test
  public void test_texas_holdem_7970_3d4h5dAhQd_2cTc_6c8d_TsAd() {
    assertEquals(
      "6c8d TsAd 2cTc",
      Solver.process("texas-holdem 3d4h5dAhQd 2cTc 6c8d TsAd"));
  }

  @Test
  public void test_texas_holdem_7971_6h8c9sAcQc_9cJh_4s7d_8d7c_5sTh_3d4d_8s5c_3s7s_6c2c() {
    assertEquals(
      "3d4d 3s7s=4s7d 5sTh 8d7c=8s5c 9cJh 6c2c",
      Solver.process("texas-holdem 6h8c9sAcQc 9cJh 4s7d 8d7c 5sTh 3d4d 8s5c 3s7s 6c2c"));
  }

  @Test
  public void test_texas_holdem_7972_7s8s9sKdKh_JsQs_3h5d_Ac4h_4c4s() {
    assertEquals(
      "3h5d Ac4h 4c4s JsQs",
      Solver.process("texas-holdem 7s8s9sKdKh JsQs 3h5d Ac4h 4c4s"));
  }

  @Test
  public void test_texas_holdem_7973_3h4h4sJsTc_2d7h_3d4c_5s2c_9dAs_8d6d_7c2h_5dJh_9c6h_KsQh() {
    assertEquals(
      "5s2c 2d7h=7c2h 8d6d 9c6h KsQh 9dAs 5dJh 3d4c",
      Solver.process("texas-holdem 3h4h4sJsTc 2d7h 3d4c 5s2c 9dAs 8d6d 7c2h 5dJh 9c6h KsQh"));
  }

  @Test
  public void test_texas_holdem_7974_2s7h9c9dKd_Jh6h_5h6c_6dJd_AsTh() {
    assertEquals(
      "5h6c 6dJd=Jh6h AsTh",
      Solver.process("texas-holdem 2s7h9c9dKd Jh6h 5h6c 6dJd AsTh"));
  }

  @Test
  public void test_texas_holdem_7975_2h2s7d9cQs_TsTh_4s3d_Ad6c_6dJc_5d6s_Qd7h() {
    assertEquals(
      "4s3d=5d6s 6dJc Ad6c TsTh Qd7h",
      Solver.process("texas-holdem 2h2s7d9cQs TsTh 4s3d Ad6c 6dJc 5d6s Qd7h"));
  }

  @Test
  public void test_texas_holdem_7976_4d9dKsQhQs_9sAc_Tc2s() {
    assertEquals(
      "Tc2s 9sAc",
      Solver.process("texas-holdem 4d9dKsQhQs 9sAc Tc2s"));
  }

  @Test
  public void test_texas_holdem_7977_5h7c9hQhQs_Jc6c_TsQd_3cKd() {
    assertEquals(
      "Jc6c 3cKd TsQd",
      Solver.process("texas-holdem 5h7c9hQhQs Jc6c TsQd 3cKd"));
  }

  @Test
  public void test_texas_holdem_7978_4s5d6s7c9c_2s5h_5sKc_Ks2h_JhQc_Th5c_Ts7s_4dJc_7dKd() {
    assertEquals(
      "JhQc Ks2h 4dJc 2s5h Th5c 5sKc Ts7s 7dKd",
      Solver.process("texas-holdem 4s5d6s7c9c 2s5h 5sKc Ks2h JhQc Th5c Ts7s 4dJc 7dKd"));
  }

  @Test
  public void test_texas_holdem_7979_3s4sQcQdTh_KsJc_As9d_Js6d() {
    assertEquals(
      "Js6d KsJc As9d",
      Solver.process("texas-holdem 3s4sQcQdTh KsJc As9d Js6d"));
  }

  @Test
  public void test_texas_holdem_7980_4s8c9sJhTh_Js6c_7s6s_4hTc_Jc2h_5cKs_8d6h_4d8s_Qd2c() {
    assertEquals(
      "5cKs 8d6h Jc2h=Js6c 4d8s 4hTc 7s6s Qd2c",
      Solver.process("texas-holdem 4s8c9sJhTh Js6c 7s6s 4hTc Jc2h 5cKs 8d6h 4d8s Qd2c"));
  }

  @Test
  public void test_texas_holdem_7981_6c9cKcKdKs_Qh5s_7dAd_TsJh() {
    assertEquals(
      "TsJh Qh5s 7dAd",
      Solver.process("texas-holdem 6c9cKcKdKs Qh5s 7dAd TsJh"));
  }

  @Test
  public void test_texas_holdem_7982_2hJhKhTcTs_Ad8d_9hJs_4c9c_6hAs_5dAh_9s8s_4s6c_3s9d() {
    assertEquals(
      "4s6c 3s9d=4c9c=9s8s 5dAh=6hAs=Ad8d 9hJs",
      Solver.process("texas-holdem 2hJhKhTcTs Ad8d 9hJs 4c9c 6hAs 5dAh 9s8s 4s6c 3s9d"));
  }

  @Test
  public void test_texas_holdem_7983_2h4h5s7dAc_Tc3s_5cJs_9cAd_ThAs_9h9d_6sKc_2cKs_4c6d_KhAh() {
    assertEquals(
      "6sKc 2cKs 4c6d 5cJs 9h9d 9cAd ThAs KhAh Tc3s",
      Solver.process("texas-holdem 2h4h5s7dAc Tc3s 5cJs 9cAd ThAs 9h9d 6sKc 2cKs 4c6d KhAh"));
  }

  @Test
  public void test_texas_holdem_7984_3s6h8sJsQh_As2h_2c4s_8h9s_7d7c_TsKh_5c5s_Qc9c_8c9d() {
    assertEquals(
      "2c4s TsKh As2h 5c5s 7d7c 8c9d=8h9s Qc9c",
      Solver.process("texas-holdem 3s6h8sJsQh As2h 2c4s 8h9s 7d7c TsKh 5c5s Qc9c 8c9d"));
  }

  @Test
  public void test_texas_holdem_7985_3cJsKdKsQs_Jc3s_5sJh_TdAh_As6h_Jd9d_3d7c_5c2s_7hTh_6cAd() {
    assertEquals(
      "5c2s 7hTh 6cAd=As6h 3d7c 5sJh=Jc3s=Jd9d TdAh",
      Solver.process("texas-holdem 3cJsKdKsQs Jc3s 5sJh TdAh As6h Jd9d 3d7c 5c2s 7hTh 6cAd"));
  }

  @Test
  public void test_texas_holdem_7986_2c6s7dQcQs_Jd5s_TsJs_Jh5c_3d8h() {
    assertEquals(
      "3d8h Jd5s=Jh5c TsJs",
      Solver.process("texas-holdem 2c6s7dQcQs Jd5s TsJs Jh5c 3d8h"));
  }

  @Test
  public void test_texas_holdem_7987_2c5h8dQdTs_Ac4s_7s8s_9c2h_2dKh_9hQc_4hKs_6dAd() {
    assertEquals(
      "4hKs Ac4s 6dAd 9c2h 2dKh 7s8s 9hQc",
      Solver.process("texas-holdem 2c5h8dQdTs Ac4s 7s8s 9c2h 2dKh 9hQc 4hKs 6dAd"));
  }

  @Test
  public void test_texas_holdem_7988_2s8dAhJsKh_5c5s_Td4s_As2h_9dTh_7h3h_Tc9h() {
    assertEquals(
      "7h3h Td4s 9dTh=Tc9h 5c5s As2h",
      Solver.process("texas-holdem 2s8dAhJsKh 5c5s Td4s As2h 9dTh 7h3h Tc9h"));
  }

  @Test
  public void test_texas_holdem_7989_2c5s8cJhQs_3cTc_3dAs_2sKd() {
    assertEquals(
      "3cTc 3dAs 2sKd",
      Solver.process("texas-holdem 2c5s8cJhQs 3cTc 3dAs 2sKd"));
  }

  @Test
  public void test_texas_holdem_7990_4c5d8sAsTc_5sJd_8h7c_5h8d_6c8c_AhQd() {
    assertEquals(
      "5sJd 6c8c 8h7c AhQd 5h8d",
      Solver.process("texas-holdem 4c5d8sAsTc 5sJd 8h7c 5h8d 6c8c AhQd"));
  }

  @Test
  public void test_texas_holdem_7991_4c5h6sAcQd_Qc4d_8h7s() {
    assertEquals(
      "Qc4d 8h7s",
      Solver.process("texas-holdem 4c5h6sAcQd Qc4d 8h7s"));
  }

  @Test
  public void test_texas_holdem_7992_2c7c7s9sJh_Kh3s_Qs6d_Ts7d_3d5s_4c6h_QdJd_Ac6c_5h3c() {
    assertEquals(
      "3d5s=5h3c 4c6h Qs6d Kh3s Ac6c QdJd Ts7d",
      Solver.process("texas-holdem 2c7c7s9sJh Kh3s Qs6d Ts7d 3d5s 4c6h QdJd Ac6c 5h3c"));
  }

  @Test
  public void test_texas_holdem_7993_2s5h5s7dJc_4cKs_3hKd() {
    assertEquals(
      "3hKd=4cKs",
      Solver.process("texas-holdem 2s5h5s7dJc 4cKs 3hKd"));
  }

  @Test
  public void test_texas_holdem_7994_2c5c6c6sAc_4d7h_3c4c_Js9s_Jh9h_Td7d_9c6d_KhAs() {
    assertEquals(
      "4d7h Td7d Jh9h=Js9s KhAs 9c6d 3c4c",
      Solver.process("texas-holdem 2c5c6c6sAc 4d7h 3c4c Js9s Jh9h Td7d 9c6d KhAs"));
  }

  @Test
  public void test_texas_holdem_7995_4d4h5c8c9h_Ah4c_4s6s_5s2c_9cQh_7d6c_As3s_Td5h_Ac7h_Jd2d() {
    assertEquals(
      "Jd2d Ac7h=As3s 5s2c Td5h 9cQh 4s6s Ah4c 7d6c",
      Solver.process("texas-holdem 4d4h5c8c9h Ah4c 4s6s 5s2c 9cQh 7d6c As3s Td5h Ac7h Jd2d"));
  }

  @Test
  public void test_texas_holdem_7996_3d8hAhJsQd_5sJh_6s3h_6h6d_3sJd() {
    assertEquals(
      "6s3h 6h6d 5sJh 3sJd",
      Solver.process("texas-holdem 3d8hAhJsQd 5sJh 6s3h 6h6d 3sJd"));
  }

  @Test
  public void test_texas_holdem_7997_3dAsJcTcTs_5hAh_7s3c_Ks4s_Qd5s_Kd2h() {
    assertEquals(
      "Qd5s Kd2h=Ks4s 7s3c 5hAh",
      Solver.process("texas-holdem 3dAsJcTcTs 5hAh 7s3c Ks4s Qd5s Kd2h"));
  }

  @Test
  public void test_texas_holdem_7998_3s6s7h8sKs_6h5s_QsTd_KdQc_3dJd_2hTs_4dKc_QdJs_2cAc() {
    assertEquals(
      "2cAc 3dJd 4dKc KdQc 6h5s 2hTs QdJs QsTd",
      Solver.process("texas-holdem 3s6s7h8sKs 6h5s QsTd KdQc 3dJd 2hTs 4dKc QdJs 2cAc"));
  }

  @Test
  public void test_texas_holdem_7999_2s4s7cJdKc_Qd3h_Ts7s_6d3s() {
    assertEquals(
      "6d3s Qd3h Ts7s",
      Solver.process("texas-holdem 2s4s7cJdKc Qd3h Ts7s 6d3s"));
  }

}
