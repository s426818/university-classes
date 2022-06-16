
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver18HiddenTest {


  @Test
  public void test_texas_holdem_4500_4c4d6h8dAd_Ah5h_Kh3c_Qc9h_2sQs_6c8s_JdKd_Qh9d() {
    assertEquals(
      "2sQs Qc9h=Qh9d Kh3c 6c8s Ah5h JdKd",
      Solver.process("texas-holdem 4c4d6h8dAd Ah5h Kh3c Qc9h 2sQs 6c8s JdKd Qh9d"));
  }

  @Test
  public void test_texas_holdem_4501_4d4h6sKcKh_Qh8h_3d2d_7s4c_6dJh_JsTc_8sKs() {
    assertEquals(
      "3d2d JsTc Qh8h 6dJh 7s4c 8sKs",
      Solver.process("texas-holdem 4d4h6sKcKh Qh8h 3d2d 7s4c 6dJh JsTc 8sKs"));
  }

  @Test
  public void test_texas_holdem_4502_2h5c7d8hQc_2s6c_9d9c_As3d_8c8d_9h3h() {
    assertEquals(
      "9h3h As3d 2s6c 9d9c 8c8d",
      Solver.process("texas-holdem 2h5c7d8hQc 2s6c 9d9c As3d 8c8d 9h3h"));
  }

  @Test
  public void test_texas_holdem_4503_4d9hKdThTs_Jh7h_Kh5s_TcJd_4c7c() {
    assertEquals(
      "Jh7h 4c7c Kh5s TcJd",
      Solver.process("texas-holdem 4d9hKdThTs Jh7h Kh5s TcJd 4c7c"));
  }

  @Test
  public void test_texas_holdem_4504_4s5h7hAcJh_7d6h_TdQs_5d7s_Js2c_6s6c_4d5c_2d9h() {
    assertEquals(
      "2d9h TdQs 6s6c 7d6h Js2c 4d5c 5d7s",
      Solver.process("texas-holdem 4s5h7hAcJh 7d6h TdQs 5d7s Js2c 6s6c 4d5c 2d9h"));
  }

  @Test
  public void test_texas_holdem_4505_8d8h8s9cAc_QcKh_8c7d_4c2s_4h5d_3cKc_Jc3s_QdAd() {
    assertEquals(
      "4c2s=4h5d Jc3s 3cKc=QcKh QdAd 8c7d",
      Solver.process("texas-holdem 8d8h8s9cAc QcKh 8c7d 4c2s 4h5d 3cKc Jc3s QdAd"));
  }

  @Test
  public void test_texas_holdem_4506_2s5d8d8s9h_Ac9d_Kh4s_TdKs() {
    assertEquals(
      "Kh4s TdKs Ac9d",
      Solver.process("texas-holdem 2s5d8d8s9h Ac9d Kh4s TdKs"));
  }

  @Test
  public void test_texas_holdem_4507_2d5c5s6sQh_7d9s_4h3d_7h4c_5h4s_8d4d_Jd6d_Tc3s() {
    assertEquals(
      "7h4c 8d4d 7d9s Tc3s Jd6d 5h4s 4h3d",
      Solver.process("texas-holdem 2d5c5s6sQh 7d9s 4h3d 7h4c 5h4s 8d4d Jd6d Tc3s"));
  }

  @Test
  public void test_texas_holdem_4508_3s8h9hAhQs_2h5d_Td2s_4d8s() {
    assertEquals(
      "2h5d Td2s 4d8s",
      Solver.process("texas-holdem 3s8h9hAhQs 2h5d Td2s 4d8s"));
  }

  @Test
  public void test_texas_holdem_4509_5h6s8h9sQc_QhJs_Jc4c_AhTh_Td8c_2h4d_Tc9c_AsQd() {
    assertEquals(
      "2h4d Jc4c AhTh Td8c Tc9c QhJs AsQd",
      Solver.process("texas-holdem 5h6s8h9sQc QhJs Jc4c AhTh Td8c 2h4d Tc9c AsQd"));
  }

  @Test
  public void test_texas_holdem_4510_5d6d6h9cQc_6s9d_5hKs_Ts2c_Qd7c_AdAs_9s3s_8sAh_JsKh() {
    assertEquals(
      "Ts2c JsKh 8sAh 5hKs 9s3s Qd7c AdAs 6s9d",
      Solver.process("texas-holdem 5d6d6h9cQc 6s9d 5hKs Ts2c Qd7c AdAs 9s3s 8sAh JsKh"));
  }

  @Test
  public void test_texas_holdem_4511_5c6c6d7dTh_2dJd_Qd4h() {
    assertEquals(
      "2dJd Qd4h",
      Solver.process("texas-holdem 5c6c6d7dTh 2dJd Qd4h"));
  }

  @Test
  public void test_texas_holdem_4512_6s7h9cQsTc_KsJd_6h6d_2s2d_Th2c_3sQc_5h5c() {
    assertEquals(
      "2s2d 5h5c Th2c 3sQc 6h6d KsJd",
      Solver.process("texas-holdem 6s7h9cQsTc KsJd 6h6d 2s2d Th2c 3sQc 5h5c"));
  }

  @Test
  public void test_texas_holdem_4513_7c7d8sJhQs_3hJs_Th3c_2d4d() {
    assertEquals(
      "2d4d Th3c 3hJs",
      Solver.process("texas-holdem 7c7d8sJhQs 3hJs Th3c 2d4d"));
  }

  @Test
  public void test_texas_holdem_4514_6d6hJsKhQd_7cQc_Ad6s_4c2d() {
    assertEquals(
      "4c2d 7cQc Ad6s",
      Solver.process("texas-holdem 6d6hJsKhQd 7cQc Ad6s 4c2d"));
  }

  @Test
  public void test_texas_holdem_4515_4d4h8c9dQd_Jd7h_9c5h_3hTc_5d3d_Jh8d_Kd7s_ThQs() {
    assertEquals(
      "3hTc Jd7h Kd7s Jh8d 9c5h ThQs 5d3d",
      Solver.process("texas-holdem 4d4h8c9dQd Jd7h 9c5h 3hTc 5d3d Jh8d Kd7s ThQs"));
  }

  @Test
  public void test_texas_holdem_4516_4c4d5hKhQc_Jh6c_2d3h_3c7d_8h7h_5s5d() {
    assertEquals(
      "2d3h 3c7d 8h7h Jh6c 5s5d",
      Solver.process("texas-holdem 4c4d5hKhQc Jh6c 2d3h 3c7d 8h7h 5s5d"));
  }

  @Test
  public void test_texas_holdem_4517_2h9dJsQdQs_Qc3h_QhTd_2cKh() {
    assertEquals(
      "2cKh Qc3h QhTd",
      Solver.process("texas-holdem 2h9dJsQdQs Qc3h QhTd 2cKh"));
  }

  @Test
  public void test_texas_holdem_4518_5c6c7cTcTd_4hAh_8c6h_8d3h_9d7h_4s6d() {
    assertEquals(
      "8d3h 4hAh 4s6d 9d7h 8c6h",
      Solver.process("texas-holdem 5c6c7cTcTd 4hAh 8c6h 8d3h 9d7h 4s6d"));
  }

  @Test
  public void test_texas_holdem_4519_4h7h9sJhQd_As7s_9c3c_5d2s_9dAc_7dJc_3s2h_4s5s() {
    assertEquals(
      "3s2h 5d2s 4s5s As7s 9c3c 9dAc 7dJc",
      Solver.process("texas-holdem 4h7h9sJhQd As7s 9c3c 5d2s 9dAc 7dJc 3s2h 4s5s"));
  }

  @Test
  public void test_texas_holdem_4520_2d5s7c7hKs_Js2c_JhTs_7dJd_9d4h_8hTh_4sKd_8cTc() {
    assertEquals(
      "9d4h 8cTc=8hTh JhTs Js2c 4sKd 7dJd",
      Solver.process("texas-holdem 2d5s7c7hKs Js2c JhTs 7dJd 9d4h 8hTh 4sKd 8cTc"));
  }

  @Test
  public void test_texas_holdem_4521_2d5h6h7dJs_4dKh_Td7h_Qc9h_AdAs_9d3d_3c3s() {
    assertEquals(
      "9d3d Qc9h 4dKh 3c3s Td7h AdAs",
      Solver.process("texas-holdem 2d5h6h7dJs 4dKh Td7h Qc9h AdAs 9d3d 3c3s"));
  }

  @Test
  public void test_texas_holdem_4522_2d8d9cQdTd_Qs3c_7c3s_7dTc() {
    assertEquals(
      "7c3s Qs3c 7dTc",
      Solver.process("texas-holdem 2d8d9cQdTd Qs3c 7c3s 7dTc"));
  }

  @Test
  public void test_texas_holdem_4523_9cAhJsKsTs_Kc3s_6s6c_Th7s_6d2h() {
    assertEquals(
      "6d2h 6s6c Th7s Kc3s",
      Solver.process("texas-holdem 9cAhJsKsTs Kc3s 6s6c Th7s 6d2h"));
  }

  @Test
  public void test_texas_holdem_4524_2sAcKsQcTd_QhJc_As5c_8hJh_Kd4d_Qs3h_2h8c_Ts6c_Th5d_2c5s() {
    assertEquals(
      "2c5s=2h8c Th5d=Ts6c Qs3h Kd4d As5c 8hJh=QhJc",
      Solver.process("texas-holdem 2sAcKsQcTd QhJc As5c 8hJh Kd4d Qs3h 2h8c Ts6c Th5d 2c5s"));
  }

  @Test
  public void test_texas_holdem_4525_3d6cJsKcQd_5sTc_6d9s() {
    assertEquals(
      "5sTc 6d9s",
      Solver.process("texas-holdem 3d6cJsKcQd 5sTc 6d9s"));
  }

  @Test
  public void test_texas_holdem_4526_6c7hJhKcKd_3cAd_2c2h_7dQh() {
    assertEquals(
      "3cAd 2c2h 7dQh",
      Solver.process("texas-holdem 6c7hJhKcKd 3cAd 2c2h 7dQh"));
  }

  @Test
  public void test_texas_holdem_4527_2c8d9cJcKh_Qh6c_4d8s_QdAh_JhAs_7s5c_8cAc() {
    assertEquals(
      "7s5c Qh6c QdAh 4d8s JhAs 8cAc",
      Solver.process("texas-holdem 2c8d9cJcKh Qh6c 4d8s QdAh JhAs 7s5c 8cAc"));
  }

  @Test
  public void test_texas_holdem_4528_2h5c7c9hJh_5hKd_Js4c_8c8h_QsKs_9d7h_6s8s() {
    assertEquals(
      "QsKs 5hKd 8c8h Js4c 9d7h 6s8s",
      Solver.process("texas-holdem 2h5c7c9hJh 5hKd Js4c 8c8h QsKs 9d7h 6s8s"));
  }

  @Test
  public void test_texas_holdem_4529_3h4s5hAcJs_Ks8s_Kh6d_KcTd_Qc7h_Qs3d_5d8d_Ad6c() {
    assertEquals(
      "Qc7h Kh6d Ks8s KcTd Qs3d 5d8d Ad6c",
      Solver.process("texas-holdem 3h4s5hAcJs Ks8s Kh6d KcTd Qc7h Qs3d 5d8d Ad6c"));
  }

  @Test
  public void test_texas_holdem_4530_2d4s7dJcKh_AcAd_8hQd() {
    assertEquals(
      "8hQd AcAd",
      Solver.process("texas-holdem 2d4s7dJcKh AcAd 8hQd"));
  }

  @Test
  public void test_texas_holdem_4531_2h5c6c7dAc_AsQc_7s9c_5sQs_JhTs() {
    assertEquals(
      "JhTs 5sQs 7s9c AsQc",
      Solver.process("texas-holdem 2h5c6c7dAc AsQc 7s9c 5sQs JhTs"));
  }

  @Test
  public void test_texas_holdem_4532_4c6d7sKhTc_QcTs_AsJc() {
    assertEquals(
      "AsJc QcTs",
      Solver.process("texas-holdem 4c6d7sKhTc QcTs AsJc"));
  }

  @Test
  public void test_texas_holdem_4533_3c3sAhKsTh_Td6c_3h4d() {
    assertEquals(
      "Td6c 3h4d",
      Solver.process("texas-holdem 3c3sAhKsTh Td6c 3h4d"));
  }

  @Test
  public void test_texas_holdem_4534_2s7sTcTdTh_9s8s_Js5d_4s8d_Ac6s_9hJc_4cQs_Kh6d() {
    assertEquals(
      "4s8d 9s8s Js5d 9hJc 4cQs Kh6d Ac6s",
      Solver.process("texas-holdem 2s7sTcTdTh 9s8s Js5d 4s8d Ac6s 9hJc 4cQs Kh6d"));
  }

  @Test
  public void test_texas_holdem_4535_5s7c7s8h9s_Kd6d_7dAd_Jd2c_9h3h_AsJh() {
    assertEquals(
      "Jd2c AsJh 9h3h 7dAd Kd6d",
      Solver.process("texas-holdem 5s7c7s8h9s Kd6d 7dAd Jd2c 9h3h AsJh"));
  }

  @Test
  public void test_texas_holdem_4536_2s3c3d5d9c_4d6h_8sJs_QcTs_KdKs() {
    assertEquals(
      "8sJs QcTs KdKs 4d6h",
      Solver.process("texas-holdem 2s3c3d5d9c 4d6h 8sJs QcTs KdKs"));
  }

  @Test
  public void test_texas_holdem_4537_3c6d8d8hQs_4dKs_6h2d_JsQh_5dAd_ThJh_4c6c_Ah6s() {
    assertEquals(
      "ThJh 4dKs 5dAd 4c6c=6h2d Ah6s JsQh",
      Solver.process("texas-holdem 3c6d8d8hQs 4dKs 6h2d JsQh 5dAd ThJh 4c6c Ah6s"));
  }

  @Test
  public void test_texas_holdem_4538_4d8dJsTcTs_QsAs_AdTd_3s8c_7c5s_4s9c_2hQd_2d6h() {
    assertEquals(
      "2d6h 7c5s 2hQd QsAs 4s9c 3s8c AdTd",
      Solver.process("texas-holdem 4d8dJsTcTs QsAs AdTd 3s8c 7c5s 4s9c 2hQd 2d6h"));
  }

  @Test
  public void test_texas_holdem_4539_3c3d7sAsKh_5hKs_Ad5c_3h9s_Qh8s_5s6c_AcTh() {
    assertEquals(
      "5s6c Qh8s 5hKs AcTh=Ad5c 3h9s",
      Solver.process("texas-holdem 3c3d7sAsKh 5hKs Ad5c 3h9s Qh8s 5s6c AcTh"));
  }

  @Test
  public void test_texas_holdem_4540_2h8dAhJhKc_3c4h_7c4c_8hKh_5cQd_KdAc_Js6c_2s8s_7s9s_5hJd() {
    assertEquals(
      "3c4h 7c4c 7s9s 5cQd 5hJd=Js6c 2s8s KdAc 8hKh",
      Solver.process("texas-holdem 2h8dAhJhKc 3c4h 7c4c 8hKh 5cQd KdAc Js6c 2s8s 7s9s 5hJd"));
  }

  @Test
  public void test_texas_holdem_4541_2h7c8dKcQh_8c4s_9s2s_4c2d() {
    assertEquals(
      "4c2d 9s2s 8c4s",
      Solver.process("texas-holdem 2h7c8dKcQh 8c4s 9s2s 4c2d"));
  }

  @Test
  public void test_texas_holdem_4542_6d7s8hKhQs_Tc3h_7d4s_ThAs_9hKd_Kc8d_8c3c_6hAh_3dQc_4d5c() {
    assertEquals(
      "Tc3h ThAs 6hAh 7d4s 8c3c 3dQc 9hKd Kc8d 4d5c",
      Solver.process("texas-holdem 6d7s8hKhQs Tc3h 7d4s ThAs 9hKd Kc8d 8c3c 6hAh 3dQc 4d5c"));
  }

  @Test
  public void test_texas_holdem_4543_3c6d8c8h9d_9c5c_AhAs_9h5d_5h3h_Qc2h() {
    assertEquals(
      "Qc2h 5h3h 9c5c=9h5d AhAs",
      Solver.process("texas-holdem 3c6d8c8h9d 9c5c AhAs 9h5d 5h3h Qc2h"));
  }

  @Test
  public void test_texas_holdem_4544_2s7d9sJhQh_TsKh_6s7c_5s6h_4d8h_3c5d_6d2c() {
    assertEquals(
      "3c5d 5s6h 4d8h 6d2c 6s7c TsKh",
      Solver.process("texas-holdem 2s7d9sJhQh TsKh 6s7c 5s6h 4d8h 3c5d 6d2c"));
  }

  @Test
  public void test_texas_holdem_4545_2s3h4c5cAc_3sKd_Ad2h_9s5h() {
    assertEquals(
      "3sKd=9s5h=Ad2h",
      Solver.process("texas-holdem 2s3h4c5cAc 3sKd Ad2h 9s5h"));
  }

  @Test
  public void test_texas_holdem_4546_4s5c5sAsTc_7s2s_Jh9d_8d8s_5d8h_7cAh_Th3c_Js8c() {
    assertEquals(
      "Jh9d=Js8c 8d8s Th3c 7cAh 5d8h 7s2s",
      Solver.process("texas-holdem 4s5c5sAsTc 7s2s Jh9d 8d8s 5d8h 7cAh Th3c Js8c"));
  }

  @Test
  public void test_texas_holdem_4547_4c4d5c7hAd_2dQs_5d7d_7s5h_Kd4s_6cJc_KcKs() {
    assertEquals(
      "6cJc 2dQs 5d7d=7s5h KcKs Kd4s",
      Solver.process("texas-holdem 4c4d5c7hAd 2dQs 5d7d 7s5h Kd4s 6cJc KcKs"));
  }

  @Test
  public void test_texas_holdem_4548_8sAsJcJhTs_4cJs_6s2s_5h3d_Ks8d_7hTd_3s9c_6d5c_9hAh_7d2h() {
    assertEquals(
      "5h3d=6d5c=7d2h 3s9c Ks8d 7hTd 9hAh 4cJs 6s2s",
      Solver.process("texas-holdem 8sAsJcJhTs 4cJs 6s2s 5h3d Ks8d 7hTd 3s9c 6d5c 9hAh 7d2h"));
  }

  @Test
  public void test_texas_holdem_4549_3c6hJsQsTh_8hTd_9h5d_3s8d_7dJd_5s6s() {
    assertEquals(
      "9h5d 3s8d 5s6s 8hTd 7dJd",
      Solver.process("texas-holdem 3c6hJsQsTh 8hTd 9h5d 3s8d 7dJd 5s6s"));
  }

  @Test
  public void test_texas_holdem_4550_2s6h7s8sQc_Ac5d_8d8h_JhTs_5s3h_Kc3d_3cQh_Js2h_KhJd_4h5c() {
    assertEquals(
      "5s3h JhTs Kc3d KhJd Ac5d Js2h 3cQh 8d8h 4h5c",
      Solver.process("texas-holdem 2s6h7s8sQc Ac5d 8d8h JhTs 5s3h Kc3d 3cQh Js2h KhJd 4h5c"));
  }

  @Test
  public void test_texas_holdem_4551_6d7c7hQdTs_6s2s_3h6h_Th5d_AsAc_3dQs_Kh2h_TdKd_9d8c() {
    assertEquals(
      "Kh2h 3h6h=6s2s Th5d TdKd 3dQs AsAc 9d8c",
      Solver.process("texas-holdem 6d7c7hQdTs 6s2s 3h6h Th5d AsAc 3dQs Kh2h TdKd 9d8c"));
  }

  @Test
  public void test_texas_holdem_4552_2h4c5c8sAd_9cTd_Th9d_7dAc_QdTs_6dKs_Jc7c_Qc5s_3h7h_Qs3s() {
    assertEquals(
      "9cTd=Th9d Jc7c QdTs 6dKs Qc5s 7dAc 3h7h=Qs3s",
      Solver.process("texas-holdem 2h4c5c8sAd 9cTd Th9d 7dAc QdTs 6dKs Jc7c Qc5s 3h7h Qs3s"));
  }

  @Test
  public void test_texas_holdem_4553_2c3dAsJdQs_Tc5c_7cQh_8h4h_9s2s_Ks8d_5s7s_Ad5d_JhQd() {
    assertEquals(
      "5s7s 8h4h Tc5c Ks8d 9s2s 7cQh Ad5d JhQd",
      Solver.process("texas-holdem 2c3dAsJdQs Tc5c 7cQh 8h4h 9s2s Ks8d 5s7s Ad5d JhQd"));
  }

  @Test
  public void test_texas_holdem_4554_2h3c4h5h7c_7d6h_8hKc() {
    assertEquals(
      "8hKc 7d6h",
      Solver.process("texas-holdem 2h3c4h5h7c 7d6h 8hKc"));
  }

  @Test
  public void test_texas_holdem_4555_9sKsQhTdTs_4c8s_Qs2c_Th5s() {
    assertEquals(
      "4c8s Qs2c Th5s",
      Solver.process("texas-holdem 9sKsQhTdTs 4c8s Qs2c Th5s"));
  }

  @Test
  public void test_texas_holdem_4556_3c3d4d9hQc_Jc2c_5c3s() {
    assertEquals(
      "Jc2c 5c3s",
      Solver.process("texas-holdem 3c3d4d9hQc Jc2c 5c3s"));
  }

  @Test
  public void test_texas_holdem_4557_5c7h8s9cQd_6s3c_2hQs_3s9h_2s9d() {
    assertEquals(
      "2s9d=3s9h 2hQs 6s3c",
      Solver.process("texas-holdem 5c7h8s9cQd 6s3c 2hQs 3s9h 2s9d"));
  }

  @Test
  public void test_texas_holdem_4558_6d9c9sAcKd_Qh9d_Qd7s_Qs5c() {
    assertEquals(
      "Qd7s=Qs5c Qh9d",
      Solver.process("texas-holdem 6d9c9sAcKd Qh9d Qd7s Qs5c"));
  }

  @Test
  public void test_texas_holdem_4559_9c9dAcAhJd_9s2d_8d6c() {
    assertEquals(
      "8d6c 9s2d",
      Solver.process("texas-holdem 9c9dAcAhJd 9s2d 8d6c"));
  }

  @Test
  public void test_texas_holdem_4560_2d2h9cJhQc_KhQd_Ah7c_7sAd_4h2s_Qs6s() {
    assertEquals(
      "7sAd=Ah7c Qs6s KhQd 4h2s",
      Solver.process("texas-holdem 2d2h9cJhQc KhQd Ah7c 7sAd 4h2s Qs6s"));
  }

  @Test
  public void test_texas_holdem_4561_7h9d9sKsQh_Ah8h_2sQs() {
    assertEquals(
      "Ah8h 2sQs",
      Solver.process("texas-holdem 7h9d9sKsQh Ah8h 2sQs"));
  }

  @Test
  public void test_texas_holdem_4562_3c4c7c9dKs_Th3h_6d5c_8h5h_Td5s() {
    assertEquals(
      "8h5h Td5s Th3h 6d5c",
      Solver.process("texas-holdem 3c4c7c9dKs Th3h 6d5c 8h5h Td5s"));
  }

  @Test
  public void test_texas_holdem_4563_3s7d8cAhJs_4c5s_Ts2s_Qd8d_7sAd() {
    assertEquals(
      "4c5s Ts2s Qd8d 7sAd",
      Solver.process("texas-holdem 3s7d8cAhJs 4c5s Ts2s Qd8d 7sAd"));
  }

  @Test
  public void test_texas_holdem_4564_3c3h5d9sJh_Ad2s_9dJs_5hJd_8c9h_TcAh_8s5c_6hQd_KsAs() {
    assertEquals(
      "6hQd Ad2s TcAh KsAs 8s5c 8c9h 5hJd 9dJs",
      Solver.process("texas-holdem 3c3h5d9sJh Ad2s 9dJs 5hJd 8c9h TcAh 8s5c 6hQd KsAs"));
  }

  @Test
  public void test_texas_holdem_4565_9dKdKhQcQs_5c4h_9s5d_7hAc_3s8h_4c3h_8s8d_8cTs_Td5s() {
    assertEquals(
      "3s8h=4c3h=5c4h=8s8d=9s5d 8cTs=Td5s 7hAc",
      Solver.process("texas-holdem 9dKdKhQcQs 5c4h 9s5d 7hAc 3s8h 4c3h 8s8d 8cTs Td5s"));
  }

  @Test
  public void test_texas_holdem_4566_3c3d3h8sAs_7cQh_2d8h_Ah6c() {
    assertEquals(
      "7cQh 2d8h Ah6c",
      Solver.process("texas-holdem 3c3d3h8sAs 7cQh 2d8h Ah6c"));
  }

  @Test
  public void test_texas_holdem_4567_5h8dJhQhTd_2d9d_9c7s_5c6s_Ac4h() {
    assertEquals(
      "Ac4h 5c6s 2d9d=9c7s",
      Solver.process("texas-holdem 5h8dJhQhTd 2d9d 9c7s 5c6s Ac4h"));
  }

  @Test
  public void test_texas_holdem_4568_4s6c9sJhTs_2cQc_5d6s_6h7s_KcAh_4hQd_Jc7d_As3d() {
    assertEquals(
      "2cQc As3d KcAh 4hQd 5d6s=6h7s Jc7d",
      Solver.process("texas-holdem 4s6c9sJhTs 2cQc 5d6s 6h7s KcAh 4hQd Jc7d As3d"));
  }

  @Test
  public void test_texas_holdem_4569_5s7d8dTdTs_7s3c_5hTh() {
    assertEquals(
      "7s3c 5hTh",
      Solver.process("texas-holdem 5s7d8dTdTs 7s3c 5hTh"));
  }

  @Test
  public void test_texas_holdem_4570_3s4c5sAdJc_TcJs_2sTh_QdKh_8hJh_TsJd() {
    assertEquals(
      "QdKh 8hJh TcJs=TsJd 2sTh",
      Solver.process("texas-holdem 3s4c5sAdJc TcJs 2sTh QdKh 8hJh TsJd"));
  }

  @Test
  public void test_texas_holdem_4571_2c4h6d7cKc_Kd9h_6cTh_4c7h() {
    assertEquals(
      "6cTh Kd9h 4c7h",
      Solver.process("texas-holdem 2c4h6d7cKc Kd9h 6cTh 4c7h"));
  }

  @Test
  public void test_texas_holdem_4572_5d7s9sAhAs_9dQd_2h8d_7d6d_9hAd_5s5h() {
    assertEquals(
      "2h8d 7d6d 9dQd 5s5h 9hAd",
      Solver.process("texas-holdem 5d7s9sAhAs 9dQd 2h8d 7d6d 9hAd 5s5h"));
  }

  @Test
  public void test_texas_holdem_4573_3d6h9sKdTc_4s2s_KhTd_2h4c_2d8h_Ad8s_8dKc_5cQc_3sKs() {
    assertEquals(
      "2h4c=4s2s 2d8h 5cQc Ad8s 8dKc 3sKs KhTd",
      Solver.process("texas-holdem 3d6h9sKdTc 4s2s KhTd 2h4c 2d8h Ad8s 8dKc 5cQc 3sKs"));
  }

  @Test
  public void test_texas_holdem_4574_2d7d8sJhKc_6c4s_2c8c_Ks6s_Ah5c_9h7h_Qh5d_5h4c() {
    assertEquals(
      "5h4c 6c4s Qh5d Ah5c 9h7h Ks6s 2c8c",
      Solver.process("texas-holdem 2d7d8sJhKc 6c4s 2c8c Ks6s Ah5c 9h7h Qh5d 5h4c"));
  }

  @Test
  public void test_texas_holdem_4575_5s6d8hAcTs_3cJd_Ad8s_AhTc_Kc6c_2sJs_4h4s_9d6s_2d9h() {
    assertEquals(
      "2d9h 2sJs=3cJd 4h4s 9d6s Kc6c Ad8s AhTc",
      Solver.process("texas-holdem 5s6d8hAcTs 3cJd Ad8s AhTc Kc6c 2sJs 4h4s 9d6s 2d9h"));
  }

  @Test
  public void test_texas_holdem_4576_3s6c8c8hAs_2s5d_4sTd_3hTs_4c2h_QdJd_3c4d_7sJh() {
    assertEquals(
      "4c2h 2s5d 4sTd 7sJh QdJd 3c4d=3hTs",
      Solver.process("texas-holdem 3s6c8c8hAs 2s5d 4sTd 3hTs 4c2h QdJd 3c4d 7sJh"));
  }

  @Test
  public void test_texas_holdem_4577_AcAsKcKdQh_8d2c_3c4s_AhTh_8h5s_8sQc_Jh6h_3dTs() {
    assertEquals(
      "3c4s=3dTs=8d2c=8h5s=8sQc=Jh6h AhTh",
      Solver.process("texas-holdem AcAsKcKdQh 8d2c 3c4s AhTh 8h5s 8sQc Jh6h 3dTs"));
  }

  @Test
  public void test_texas_holdem_4578_6c8c9hJsQd_3d2c_5sTc_9c3s_Ks3c_9d7d_8h5h_Qs5d_6s7c() {
    assertEquals(
      "3d2c Ks3c 6s7c 8h5h 9c3s=9d7d Qs5d 5sTc",
      Solver.process("texas-holdem 6c8c9hJsQd 3d2c 5sTc 9c3s Ks3c 9d7d 8h5h Qs5d 6s7c"));
  }

  @Test
  public void test_texas_holdem_4579_2s4d9d9sKh_8cKs_5hJh_Kd4h_Jd2c() {
    assertEquals(
      "5hJh Jd2c Kd4h 8cKs",
      Solver.process("texas-holdem 2s4d9d9sKh 8cKs 5hJh Kd4h Jd2c"));
  }

  @Test
  public void test_texas_holdem_4580_2c3c4dJsKd_3hAd_Jd5d() {
    assertEquals(
      "3hAd Jd5d",
      Solver.process("texas-holdem 2c3c4dJsKd 3hAd Jd5d"));
  }

  @Test
  public void test_texas_holdem_4581_3h9sJdJsTs_3cJh_2sQh_6h7c_2c6s_2hKs_Kd3d_8s5d() {
    assertEquals(
      "2c6s 6h7c 8s5d 2sQh 2hKs Kd3d 3cJh",
      Solver.process("texas-holdem 3h9sJdJsTs 3cJh 2sQh 6h7c 2c6s 2hKs Kd3d 8s5d"));
  }

  @Test
  public void test_texas_holdem_4582_2s5s8s9dQd_7cQc_7s2c() {
    assertEquals(
      "7s2c 7cQc",
      Solver.process("texas-holdem 2s5s8s9dQd 7cQc 7s2c"));
  }

  @Test
  public void test_texas_holdem_4583_5c6h7s9dAc_3cQc_Th4c_3s2s_Tc5s() {
    assertEquals(
      "3s2s Th4c 3cQc Tc5s",
      Solver.process("texas-holdem 5c6h7s9dAc 3cQc Th4c 3s2s Tc5s"));
  }

  @Test
  public void test_texas_holdem_4584_5d7s8hKcTc_2s4s_9hTs_5hTd_2cKs_8c9s_Jd8d_Jc3c_3s6h_2dQc() {
    assertEquals(
      "2s4s 3s6h Jc3c 2dQc 8c9s Jd8d 9hTs 2cKs 5hTd",
      Solver.process("texas-holdem 5d7s8hKcTc 2s4s 9hTs 5hTd 2cKs 8c9s Jd8d Jc3c 3s6h 2dQc"));
  }

  @Test
  public void test_texas_holdem_4585_4h8dAdAsJc_Ac6d_Kc5s_Kd9c_Ah3c_9h8c_8hTc_QhJs_9d4d_3sQd() {
    assertEquals(
      "3sQd Kc5s Kd9c 9d4d 8hTc=9h8c QhJs Ac6d=Ah3c",
      Solver.process("texas-holdem 4h8dAdAsJc Ac6d Kc5s Kd9c Ah3c 9h8c 8hTc QhJs 9d4d 3sQd"));
  }

  @Test
  public void test_texas_holdem_4586_3h4h6hAsQc_3d4d_9s3c_8s8h_Js9c() {
    assertEquals(
      "Js9c 9s3c 8s8h 3d4d",
      Solver.process("texas-holdem 3h4h6hAsQc 3d4d 9s3c 8s8h Js9c"));
  }

  @Test
  public void test_texas_holdem_4587_2h3cQcQdTh_5c8h_Ah5h_8s5s_Qs9s() {
    assertEquals(
      "5c8h=8s5s Ah5h Qs9s",
      Solver.process("texas-holdem 2h3cQcQdTh 5c8h Ah5h 8s5s Qs9s"));
  }

  @Test
  public void test_texas_holdem_4588_2d2s4c6d7h_KhAd_AcQh_9s8c_2h7c_4dJh_4sTs_Kc8s_4hKs_6cTc() {
    assertEquals(
      "9s8c Kc8s AcQh KhAd 4sTs 4dJh 4hKs 6cTc 2h7c",
      Solver.process("texas-holdem 2d2s4c6d7h KhAd AcQh 9s8c 2h7c 4dJh 4sTs Kc8s 4hKs 6cTc"));
  }

  @Test
  public void test_texas_holdem_4589_5d7d7h9sTd_8dAh_4s6h_Jc7s_5c6s() {
    assertEquals(
      "4s6h 8dAh 5c6s Jc7s",
      Solver.process("texas-holdem 5d7d7h9sTd 8dAh 4s6h Jc7s 5c6s"));
  }

  @Test
  public void test_texas_holdem_4590_4c5h7s8d8h_3cTs_QhQs_9h9c_AhTc_As2h_Ks3d_2c9s_6dKh_Td8c() {
    assertEquals(
      "2c9s 3cTs Ks3d As2h AhTc 9h9c QhQs Td8c 6dKh",
      Solver.process("texas-holdem 4c5h7s8d8h 3cTs QhQs 9h9c AhTc As2h Ks3d 2c9s 6dKh Td8c"));
  }

  @Test
  public void test_texas_holdem_4591_8s9hJcJdKh_Qh2d_4sAc_9c8d_4c3s_7c5h_Ts9d_4hJs_7hAh() {
    assertEquals(
      "4c3s=7c5h Qh2d 4sAc=7hAh 9c8d=Ts9d 4hJs",
      Solver.process("texas-holdem 8s9hJcJdKh Qh2d 4sAc 9c8d 4c3s 7c5h Ts9d 4hJs 7hAh"));
  }

  @Test
  public void test_texas_holdem_4592_6cJcJhKdQs_Qh8s_8hTc_7cKs_3hTs_9h5d_2d2c_3c9s_KcQc_5c4h() {
    assertEquals(
      "5c4h 3c9s=9h5d 3hTs=8hTc 2d2c Qh8s 7cKs KcQc",
      Solver.process("texas-holdem 6cJcJhKdQs Qh8s 8hTc 7cKs 3hTs 9h5d 2d2c 3c9s KcQc 5c4h"));
  }

  @Test
  public void test_texas_holdem_4593_4s7cAcQsTs_6cAd_7sJh_As8s_8c7d_Qd9h_QcKd_Kc2h() {
    assertEquals(
      "Kc2h 8c7d 7sJh Qd9h QcKd 6cAd As8s",
      Solver.process("texas-holdem 4s7cAcQsTs 6cAd 7sJh As8s 8c7d Qd9h QcKd Kc2h"));
  }

  @Test
  public void test_texas_holdem_4594_2s9cAcAdQs_5s5h_3dQh_7cKd() {
    assertEquals(
      "7cKd 5s5h 3dQh",
      Solver.process("texas-holdem 2s9cAcAdQs 5s5h 3dQh 7cKd"));
  }

  @Test
  public void test_texas_holdem_4595_2d3h6sJdKd_Qs8s_TsAs_7hJc_Td2s_Qc2h_3s3c_7sQh() {
    assertEquals(
      "7sQh Qs8s TsAs Td2s Qc2h 7hJc 3s3c",
      Solver.process("texas-holdem 2d3h6sJdKd Qs8s TsAs 7hJc Td2s Qc2h 3s3c 7sQh"));
  }

  @Test
  public void test_texas_holdem_4596_2c5s9h9sAh_8cKs_3h7h_4sJc_KcKh_3s7c_8d2d_QsQh() {
    assertEquals(
      "3h7h=3s7c 4sJc 8cKs 8d2d QsQh KcKh",
      Solver.process("texas-holdem 2c5s9h9sAh 8cKs 3h7h 4sJc KcKh 3s7c 8d2d QsQh"));
  }

  @Test
  public void test_texas_holdem_4597_7s8s9cKhQs_8h3d_6d8c_QhJc_7h5s_Kc2s_AdQd_5hTd_4dKs_JdQc() {
    assertEquals(
      "5hTd 7h5s 6d8c=8h3d JdQc=QhJc AdQd 4dKs=Kc2s",
      Solver.process("texas-holdem 7s8s9cKhQs 8h3d 6d8c QhJc 7h5s Kc2s AdQd 5hTd 4dKs JdQc"));
  }

  @Test
  public void test_texas_holdem_4598_3c7d8h9dQc_8s2d_AdQh_6d6h() {
    assertEquals(
      "6d6h 8s2d AdQh",
      Solver.process("texas-holdem 3c7d8h9dQc 8s2d AdQh 6d6h"));
  }

  @Test
  public void test_texas_holdem_4599_3d8sJsKcKh_4s8c_Ks9h_5d4c_AsKd_8dJh_5sTh_6cTd_4h2d_6sAh() {
    assertEquals(
      "4h2d 5d4c 5sTh=6cTd 6sAh 4s8c 8dJh Ks9h AsKd",
      Solver.process("texas-holdem 3d8sJsKcKh 4s8c Ks9h 5d4c AsKd 8dJh 5sTh 6cTd 4h2d 6sAh"));
  }

  @Test
  public void test_texas_holdem_4600_5d7h8d8hAc_Jc2h_2c9h_6s6h_Kc2d_Ad4s_4cJh_TcKd_5sTd_3h3c() {
    assertEquals(
      "2c9h 4cJh=Jc2h Kc2d TcKd 3h3c 5sTd 6s6h Ad4s",
      Solver.process("texas-holdem 5d7h8d8hAc Jc2h 2c9h 6s6h Kc2d Ad4s 4cJh TcKd 5sTd 3h3c"));
  }

  @Test
  public void test_texas_holdem_4601_3c8hJcJdTc_8sQd_ThAh() {
    assertEquals(
      "8sQd ThAh",
      Solver.process("texas-holdem 3c8hJcJdTc 8sQd ThAh"));
  }

  @Test
  public void test_texas_holdem_4602_4s6cAcAdAs_2cJc_KcTd_9h6s() {
    assertEquals(
      "2cJc KcTd 9h6s",
      Solver.process("texas-holdem 4s6cAcAdAs 2cJc KcTd 9h6s"));
  }

  @Test
  public void test_texas_holdem_4603_3d5s9cJdKs_8c8s_Ts3h_Kh2h() {
    assertEquals(
      "Ts3h 8c8s Kh2h",
      Solver.process("texas-holdem 3d5s9cJdKs 8c8s Ts3h Kh2h"));
  }

  @Test
  public void test_texas_holdem_4604_4c5c6dJcKd_2s9s_3h7d_5sAh_5h8h_7hJs_7s8c_9hKs_4sTc() {
    assertEquals(
      "2s9s 4sTc 5h8h 5sAh 7hJs 9hKs 3h7d 7s8c",
      Solver.process("texas-holdem 4c5c6dJcKd 2s9s 3h7d 5sAh 5h8h 7hJs 7s8c 9hKs 4sTc"));
  }

  @Test
  public void test_texas_holdem_4605_AdJhJsKcKh_Td5d_3sJc_KdTs_5s3h_TcQs_9d3d_7dAc() {
    assertEquals(
      "5s3h=9d3d=Td5d 7dAc TcQs 3sJc KdTs",
      Solver.process("texas-holdem AdJhJsKcKh Td5d 3sJc KdTs 5s3h TcQs 9d3d 7dAc"));
  }

  @Test
  public void test_texas_holdem_4606_2d2s7cAcAd_8c7s_3s8s_QhTh_6c5h_4hJh_7hAh() {
    assertEquals(
      "6c5h 3s8s 4hJh QhTh 8c7s 7hAh",
      Solver.process("texas-holdem 2d2s7cAcAd 8c7s 3s8s QhTh 6c5h 4hJh 7hAh"));
  }

  @Test
  public void test_texas_holdem_4607_5c5d9dJdQd_Th4d_9sQh_5s4c_Jc7c_3sJh_6s5h_Kd3d_6c6d() {
    assertEquals(
      "3sJh=Jc7c 9sQh 5s4c=6s5h Th4d 6c6d Kd3d",
      Solver.process("texas-holdem 5c5d9dJdQd Th4d 9sQh 5s4c Jc7c 3sJh 6s5h Kd3d 6c6d"));
  }

  @Test
  public void test_texas_holdem_4608_4h7h8cAdQs_Jd6s_8h9d_2hTc_5c2s_Jc6c() {
    assertEquals(
      "5c2s 2hTc Jc6c=Jd6s 8h9d",
      Solver.process("texas-holdem 4h7h8cAdQs Jd6s 8h9d 2hTc 5c2s Jc6c"));
  }

  @Test
  public void test_texas_holdem_4609_6d7d8sAcJs_5hAs_3s4c_8c2c_6c3c() {
    assertEquals(
      "3s4c 6c3c 8c2c 5hAs",
      Solver.process("texas-holdem 6d7d8sAcJs 5hAs 3s4c 8c2c 6c3c"));
  }

  @Test
  public void test_texas_holdem_4610_3s9hAhJdKd_AsTh_Td5s_6sTs_Kh9c_8d5c_AdKc_2hKs_8s3c_Qh4c() {
    assertEquals(
      "8d5c 6sTs=Td5s Qh4c 8s3c 2hKs AsTh Kh9c AdKc",
      Solver.process("texas-holdem 3s9hAhJdKd AsTh Td5s 6sTs Kh9c 8d5c AdKc 2hKs 8s3c Qh4c"));
  }

  @Test
  public void test_texas_holdem_4611_5h7c8sJdKd_QsTh_6dJc_5sAc_8c3c() {
    assertEquals(
      "QsTh 5sAc 8c3c 6dJc",
      Solver.process("texas-holdem 5h7c8sJdKd QsTh 6dJc 5sAc 8c3c"));
  }

  @Test
  public void test_texas_holdem_4612_4c6c6hKcTd_Th2s_Ah4d_3s7s_9h2d_5sJs_JhQd_7h3c_4sQc() {
    assertEquals(
      "3s7s=7h3c 9h2d 5sJs JhQd 4sQc Ah4d Th2s",
      Solver.process("texas-holdem 4c6c6hKcTd Th2s Ah4d 3s7s 9h2d 5sJs JhQd 7h3c 4sQc"));
  }

  @Test
  public void test_texas_holdem_4613_2s9cAdKsTd_5dJs_Qh6c_Ts8s() {
    assertEquals(
      "5dJs Qh6c Ts8s",
      Solver.process("texas-holdem 2s9cAdKsTd 5dJs Qh6c Ts8s"));
  }

  @Test
  public void test_texas_holdem_4614_2c4h8h9cTc_Jc7d_Ah9d() {
    assertEquals(
      "Ah9d Jc7d",
      Solver.process("texas-holdem 2c4h8h9cTc Jc7d Ah9d"));
  }

  @Test
  public void test_texas_holdem_4615_9sAcKdQcTc_4s3c_8cJc_Qd7h_TdTs_6h9d_5h3s_Js8h() {
    assertEquals(
      "4s3c=5h3s 6h9d Qd7h TdTs Js8h 8cJc",
      Solver.process("texas-holdem 9sAcKdQcTc 4s3c 8cJc Qd7h TdTs 6h9d 5h3s Js8h"));
  }

  @Test
  public void test_texas_holdem_4616_4c6h7c9dAc_3c2c_4hKh() {
    assertEquals(
      "4hKh 3c2c",
      Solver.process("texas-holdem 4c6h7c9dAc 3c2c 4hKh"));
  }

  @Test
  public void test_texas_holdem_4617_4c8c9sAdKd_5hTh_9dTd() {
    assertEquals(
      "5hTh 9dTd",
      Solver.process("texas-holdem 4c8c9sAdKd 5hTh 9dTd"));
  }

  @Test
  public void test_texas_holdem_4618_2d9d9hAdAh_JcKc_Kd6d() {
    assertEquals(
      "JcKc Kd6d",
      Solver.process("texas-holdem 2d9d9hAdAh JcKc Kd6d"));
  }

  @Test
  public void test_texas_holdem_4619_2s6sAcKhTs_2hKc_9c6c_QsQc_9s8c_4c7s() {
    assertEquals(
      "4c7s 9s8c 9c6c QsQc 2hKc",
      Solver.process("texas-holdem 2s6sAcKhTs 2hKc 9c6c QsQc 9s8c 4c7s"));
  }

  @Test
  public void test_texas_holdem_4620_3c7hQcTdTs_8s5c_JcAs_9c6d_7c7s_9h3h_Qd2s_8dKc_4d2d_3d6h() {
    assertEquals(
      "4d2d 8s5c 9c6d 8dKc JcAs 3d6h=9h3h Qd2s 7c7s",
      Solver.process("texas-holdem 3c7hQcTdTs 8s5c JcAs 9c6d 7c7s 9h3h Qd2s 8dKc 4d2d 3d6h"));
  }

  @Test
  public void test_texas_holdem_4621_2c5c6hJdTd_TsAc_Th5d() {
    assertEquals(
      "TsAc Th5d",
      Solver.process("texas-holdem 2c5c6hJdTd TsAc Th5d"));
  }

  @Test
  public void test_texas_holdem_4622_2h4d4h9hQc_5cJd_9c8d_8c7s_Qs3d() {
    assertEquals(
      "8c7s 5cJd 9c8d Qs3d",
      Solver.process("texas-holdem 2h4d4h9hQc 5cJd 9c8d 8c7s Qs3d"));
  }

  @Test
  public void test_texas_holdem_4623_6s8h8sAsKh_4h8d_Jd7d_6hAd_2h5h_7cQc_Td3h_5c8c() {
    assertEquals(
      "2h5h Td3h Jd7d 7cQc 6hAd 4h8d=5c8c",
      Solver.process("texas-holdem 6s8h8sAsKh 4h8d Jd7d 6hAd 2h5h 7cQc Td3h 5c8c"));
  }

  @Test
  public void test_texas_holdem_4624_6dAcJhKcTd_8dAd_9d6h_As2s_4cTh_5cQh() {
    assertEquals(
      "9d6h 4cTh 8dAd=As2s 5cQh",
      Solver.process("texas-holdem 6dAcJhKcTd 8dAd 9d6h As2s 4cTh 5cQh"));
  }

  @Test
  public void test_texas_holdem_4625_3c7sJcJhQc_2h3d_2d5c_AhTc_3sQh_QsKh_4h2s() {
    assertEquals(
      "4h2s 2d5c AhTc 2h3d 3sQh QsKh",
      Solver.process("texas-holdem 3c7sJcJhQc 2h3d 2d5c AhTc 3sQh QsKh 4h2s"));
  }

  @Test
  public void test_texas_holdem_4626_3h4d7d9c9d_2cAd_3cJh() {
    assertEquals(
      "2cAd 3cJh",
      Solver.process("texas-holdem 3h4d7d9c9d 2cAd 3cJh"));
  }

  @Test
  public void test_texas_holdem_4627_2s3sAsKsTs_4hAh_8sJc() {
    assertEquals(
      "4hAh 8sJc",
      Solver.process("texas-holdem 2s3sAsKsTs 4hAh 8sJc"));
  }

  @Test
  public void test_texas_holdem_4628_2c8dAdQcTc_8c7d_Th2d_Td6d_4d9h() {
    assertEquals(
      "4d9h 8c7d Td6d Th2d",
      Solver.process("texas-holdem 2c8dAdQcTc 8c7d Th2d Td6d 4d9h"));
  }

  @Test
  public void test_texas_holdem_4629_2h6c9cKhTh_Kc3c_JhAh_5hTc_8c7h_3h4c_9s6d() {
    assertEquals(
      "3h4c 5hTc Kc3c 9s6d 8c7h JhAh",
      Solver.process("texas-holdem 2h6c9cKhTh Kc3c JhAh 5hTc 8c7h 3h4c 9s6d"));
  }

  @Test
  public void test_texas_holdem_4630_2h5h7sQhTh_Tc9s_Td2s_3c6c_9cJc_6sKd() {
    assertEquals(
      "3c6c 9cJc 6sKd Tc9s Td2s",
      Solver.process("texas-holdem 2h5h7sQhTh Tc9s Td2s 3c6c 9cJc 6sKd"));
  }

  @Test
  public void test_texas_holdem_4631_4c9hKhQhTs_4h6s_9cJh_3h7h_9s4d_5cJd_Qc7c() {
    assertEquals(
      "4h6s Qc7c 9s4d 5cJd=9cJh 3h7h",
      Solver.process("texas-holdem 4c9hKhQhTs 4h6s 9cJh 3h7h 9s4d 5cJd Qc7c"));
  }

  @Test
  public void test_texas_holdem_4632_4d4s6s9cAd_Qh2s_2h5s_Jd2d_3cQd_4h5c() {
    assertEquals(
      "2h5s Jd2d 3cQd=Qh2s 4h5c",
      Solver.process("texas-holdem 4d4s6s9cAd Qh2s 2h5s Jd2d 3cQd 4h5c"));
  }

  @Test
  public void test_texas_holdem_4633_4c8c9cJdJh_Qd4h_Ts7c_5hJs_3s5d_4sJc_Kh7h() {
    assertEquals(
      "3s5d Kh7h Qd4h 5hJs Ts7c 4sJc",
      Solver.process("texas-holdem 4c8c9cJdJh Qd4h Ts7c 5hJs 3s5d 4sJc Kh7h"));
  }

  @Test
  public void test_texas_holdem_4634_3c7dAsJcTs_6sKh_7hJd() {
    assertEquals(
      "6sKh 7hJd",
      Solver.process("texas-holdem 3c7dAsJcTs 6sKh 7hJd"));
  }

  @Test
  public void test_texas_holdem_4635_5c5sJsKdKh_8h2d_Qc3s_Kc6s() {
    assertEquals(
      "8h2d Qc3s Kc6s",
      Solver.process("texas-holdem 5c5sJsKdKh 8h2d Qc3s Kc6s"));
  }

  @Test
  public void test_texas_holdem_4636_3d5d7d8cTd_Ah8d_7h5h() {
    assertEquals(
      "7h5h Ah8d",
      Solver.process("texas-holdem 3d5d7d8cTd Ah8d 7h5h"));
  }

  @Test
  public void test_texas_holdem_4637_4c5dAdJdQh_2c5s_3cJc() {
    assertEquals(
      "2c5s 3cJc",
      Solver.process("texas-holdem 4c5dAdJdQh 2c5s 3cJc"));
  }

  @Test
  public void test_texas_holdem_4638_2c6c8cJdKd_As7d_6s8d_5h9s_4dTd_8s5c_3d4h_7s2d() {
    assertEquals(
      "3d4h 5h9s 4dTd As7d 7s2d 8s5c 6s8d",
      Solver.process("texas-holdem 2c6c8cJdKd As7d 6s8d 5h9s 4dTd 8s5c 3d4h 7s2d"));
  }

  @Test
  public void test_texas_holdem_4639_5h6d7s8cQc_Kh4h_7h3c_2d5c_2h3d_Td4s_AdAc_QdJs_TsTh_7dQs() {
    assertEquals(
      "2h3d 2d5c 7h3c TsTh QdJs AdAc 7dQs Kh4h=Td4s",
      Solver.process("texas-holdem 5h6d7s8cQc Kh4h 7h3c 2d5c 2h3d Td4s AdAc QdJs TsTh 7dQs"));
  }

  @Test
  public void test_texas_holdem_4640_3c7c8h8sKc_2s7d_4sJc_5cQc_7sKd_Jd2c_2d6h_4d3h_Qd6c() {
    assertEquals(
      "2d6h 4sJc=Jd2c Qd6c 4d3h 2s7d 7sKd 5cQc",
      Solver.process("texas-holdem 3c7c8h8sKc 2s7d 4sJc 5cQc 7sKd Jd2c 2d6h 4d3h Qd6c"));
  }

  @Test
  public void test_texas_holdem_4641_7dAdKhTdTh_Qh7h_Kd4c_As3h() {
    assertEquals(
      "Qh7h Kd4c As3h",
      Solver.process("texas-holdem 7dAdKhTdTh Qh7h Kd4c As3h"));
  }

  @Test
  public void test_texas_holdem_4642_3h4s6cAhAs_7d4d_6d6h_3s5c_8sQs_3cKh() {
    assertEquals(
      "8sQs 3s5c 3cKh 7d4d 6d6h",
      Solver.process("texas-holdem 3h4s6cAhAs 7d4d 6d6h 3s5c 8sQs 3cKh"));
  }

  @Test
  public void test_texas_holdem_4643_9hJcJhKcKh_4c8d_9s8h_As5c_5sAh_Kd3d_Ad6s_5dJd_7s8s() {
    assertEquals(
      "4c8d=7s8s=9s8h 5sAh=Ad6s=As5c 5dJd Kd3d",
      Solver.process("texas-holdem 9hJcJhKcKh 4c8d 9s8h As5c 5sAh Kd3d Ad6s 5dJd 7s8s"));
  }

  @Test
  public void test_texas_holdem_4644_4d6h7d8h9h_QhTc_Ah4s_3dKd() {
    assertEquals(
      "3dKd Ah4s QhTc",
      Solver.process("texas-holdem 4d6h7d8h9h QhTc Ah4s 3dKd"));
  }

  @Test
  public void test_texas_holdem_4645_3s6d7s9hJc_QhJs_8cAd_Ac9c() {
    assertEquals(
      "8cAd Ac9c QhJs",
      Solver.process("texas-holdem 3s6d7s9hJc QhJs 8cAd Ac9c"));
  }

  @Test
  public void test_texas_holdem_4646_3s7s8hQdTs_Tc2c_2s8c() {
    assertEquals(
      "2s8c Tc2c",
      Solver.process("texas-holdem 3s7s8hQdTs Tc2c 2s8c"));
  }

  @Test
  public void test_texas_holdem_4647_4h5sKdQcTs_Tc6s_3d5c_Th8d_3h7s_Ac2s() {
    assertEquals(
      "3h7s Ac2s 3d5c Tc6s Th8d",
      Solver.process("texas-holdem 4h5sKdQcTs Tc6s 3d5c Th8d 3h7s Ac2s"));
  }

  @Test
  public void test_texas_holdem_4648_8c8s9sJhTd_3dQd_6c5h() {
    assertEquals(
      "6c5h 3dQd",
      Solver.process("texas-holdem 8c8s9sJhTd 3dQd 6c5h"));
  }

  @Test
  public void test_texas_holdem_4649_6s8sAdAsTh_Kc9s_2c6d_Qd7c_Ac7s_2h3c_5h8h_9dQc() {
    assertEquals(
      "2h3c Qd7c 9dQc Kc9s 2c6d 5h8h Ac7s",
      Solver.process("texas-holdem 6s8sAdAsTh Kc9s 2c6d Qd7c Ac7s 2h3c 5h8h 9dQc"));
  }

  @Test
  public void test_texas_holdem_4650_5h5s6sJcTc_8d2d_8h4c_4d9c_Ad4s_6cTh_QsKc_JhAs_Jd7s() {
    assertEquals(
      "8d2d=8h4c 4d9c QsKc Ad4s 6cTh Jd7s JhAs",
      Solver.process("texas-holdem 5h5s6sJcTc 8d2d 8h4c 4d9c Ad4s 6cTh QsKc JhAs Jd7s"));
  }

  @Test
  public void test_texas_holdem_4651_5h6cAdQdQh_7hTs_9h2d() {
    assertEquals(
      "9h2d 7hTs",
      Solver.process("texas-holdem 5h6cAdQdQh 7hTs 9h2d"));
  }

  @Test
  public void test_texas_holdem_4652_3s7c8dAhTd_4c2h_Jd4d_Qh5d_2s3h() {
    assertEquals(
      "4c2h Jd4d Qh5d 2s3h",
      Solver.process("texas-holdem 3s7c8dAhTd 4c2h Jd4d Qh5d 2s3h"));
  }

  @Test
  public void test_texas_holdem_4653_4c9sAcAhTh_2sTc_3dTd_3s4d_Qs9d() {
    assertEquals(
      "3s4d Qs9d 2sTc=3dTd",
      Solver.process("texas-holdem 4c9sAcAhTh 2sTc 3dTd 3s4d Qs9d"));
  }

  @Test
  public void test_texas_holdem_4654_2h4c5c7hJc_Ac2s_Qd4s_4d6c_9dQs_Td3s_Js4h() {
    assertEquals(
      "Td3s 9dQs Ac2s 4d6c Qd4s Js4h",
      Solver.process("texas-holdem 2h4c5c7hJc Ac2s Qd4s 4d6c 9dQs Td3s Js4h"));
  }

  @Test
  public void test_texas_holdem_4655_2h3s4dKsQc_3c3h_9s7h_5d6d_2s6h_TsKd_6cTd_4s8c() {
    assertEquals(
      "9s7h 6cTd 2s6h 4s8c TsKd 3c3h 5d6d",
      Solver.process("texas-holdem 2h3s4dKsQc 3c3h 9s7h 5d6d 2s6h TsKd 6cTd 4s8c"));
  }

  @Test
  public void test_texas_holdem_4656_2h6d8hAdTh_6hQs_2d2c_9h5s_Ac9d_3c8c_QdQc_Qh9c_Jd4d() {
    assertEquals(
      "9h5s Jd4d Qh9c 6hQs 3c8c QdQc Ac9d 2d2c",
      Solver.process("texas-holdem 2h6d8hAdTh 6hQs 2d2c 9h5s Ac9d 3c8c QdQc Qh9c Jd4d"));
  }

  @Test
  public void test_texas_holdem_4657_7d8c8d9cTs_Qd5h_2s8s_3cJs_Ac7h_Jd4d_Td6c_4hJh() {
    assertEquals(
      "Qd5h Ac7h 2s8s Td6c 3cJs=4hJh=Jd4d",
      Solver.process("texas-holdem 7d8c8d9cTs Qd5h 2s8s 3cJs Ac7h Jd4d Td6c 4hJh"));
  }

  @Test
  public void test_texas_holdem_4658_2s3h9dJhQd_6s3s_7dAs_Ah5h_Ad7c_Tc5c_6hQc_4h6d_Ac9h() {
    assertEquals(
      "4h6d Tc5c Ah5h 7dAs=Ad7c 6s3s Ac9h 6hQc",
      Solver.process("texas-holdem 2s3h9dJhQd 6s3s 7dAs Ah5h Ad7c Tc5c 6hQc 4h6d Ac9h"));
  }

  @Test
  public void test_texas_holdem_4659_2d2s3hQdQs_5hKs_8h4d_Kc9c_Tc4s_9hJd_Th5c_6d4h() {
    assertEquals(
      "6d4h 8h4d Tc4s=Th5c 9hJd 5hKs=Kc9c",
      Solver.process("texas-holdem 2d2s3hQdQs 5hKs 8h4d Kc9c Tc4s 9hJd Th5c 6d4h"));
  }

  @Test
  public void test_texas_holdem_4660_3c6h7h9cAd_8c9d_3s4h_Qs8s_Qh3h_Jh2s_ThAs_7cJc_Kc3d() {
    assertEquals(
      "Jh2s Qs8s 3s4h Qh3h Kc3d 7cJc 8c9d ThAs",
      Solver.process("texas-holdem 3c6h7h9cAd 8c9d 3s4h Qs8s Qh3h Jh2s ThAs 7cJc Kc3d"));
  }

  @Test
  public void test_texas_holdem_4661_2c2s4c7cJc_Td5d_2dQc_Kd6h_TcQs_KcKs_Qh3s_7d9d() {
    assertEquals(
      "Td5d Qh3s Kd6h 7d9d TcQs 2dQc KcKs",
      Solver.process("texas-holdem 2c2s4c7cJc Td5d 2dQc Kd6h TcQs KcKs Qh3s 7d9d"));
  }

  @Test
  public void test_texas_holdem_4662_3c5sJhKdTd_8c2s_Jc4c_KhKs_2cTs() {
    assertEquals(
      "8c2s 2cTs Jc4c KhKs",
      Solver.process("texas-holdem 3c5sJhKdTd 8c2s Jc4c KhKs 2cTs"));
  }

  @Test
  public void test_texas_holdem_4663_2h4h7d9cAh_Kd3s_Ad2c_7sTh_Kh5d_5cTd() {
    assertEquals(
      "5cTd Kd3s Kh5d 7sTh Ad2c",
      Solver.process("texas-holdem 2h4h7d9cAh Kd3s Ad2c 7sTh Kh5d 5cTd"));
  }

  @Test
  public void test_texas_holdem_4664_2s5h6s7hTh_TsTd_5d9h() {
    assertEquals(
      "5d9h TsTd",
      Solver.process("texas-holdem 2s5h6s7hTh TsTd 5d9h"));
  }

  @Test
  public void test_texas_holdem_4665_2s4c8cKhTh_9d6h_5cJc_As9s_5sTc() {
    assertEquals(
      "9d6h 5cJc As9s 5sTc",
      Solver.process("texas-holdem 2s4c8cKhTh 9d6h 5cJc As9s 5sTc"));
  }

  @Test
  public void test_texas_holdem_4666_4d4h6h6s9s_7hKh_As5s_Qc4c() {
    assertEquals(
      "7hKh As5s Qc4c",
      Solver.process("texas-holdem 4d4h6h6s9s 7hKh As5s Qc4c"));
  }

  @Test
  public void test_texas_holdem_4667_2d4s5d5s8c_3dJc_3cKh_6sKs_Js9s_QhQd() {
    assertEquals(
      "3dJc Js9s 3cKh 6sKs QhQd",
      Solver.process("texas-holdem 2d4s5d5s8c 3dJc 3cKh 6sKs Js9s QhQd"));
  }

  @Test
  public void test_texas_holdem_4668_7c7d7sAsKc_8c6d_4sKs_8s3d_8hQh_TcJh_Ts2s() {
    assertEquals(
      "8c6d=8hQh=8s3d=TcJh=Ts2s 4sKs",
      Solver.process("texas-holdem 7c7d7sAsKc 8c6d 4sKs 8s3d 8hQh TcJh Ts2s"));
  }

  @Test
  public void test_texas_holdem_4669_4s9cJdJsQh_TdJh_5s5d() {
    assertEquals(
      "5s5d TdJh",
      Solver.process("texas-holdem 4s9cJdJsQh TdJh 5s5d"));
  }

  @Test
  public void test_texas_holdem_4670_2c3h5cAdJd_3dTh_KhQh() {
    assertEquals(
      "KhQh 3dTh",
      Solver.process("texas-holdem 2c3h5cAdJd 3dTh KhQh"));
  }

  @Test
  public void test_texas_holdem_4671_4d4s5s6c7c_Ad8c_JcKd_2h6d_5c6s_TdJd_8dKc_7h8s_3dQh() {
    assertEquals(
      "TdJd JcKd 2h6d 5c6s 3dQh 7h8s=8dKc=Ad8c",
      Solver.process("texas-holdem 4d4s5s6c7c Ad8c JcKd 2h6d 5c6s TdJd 8dKc 7h8s 3dQh"));
  }

  @Test
  public void test_texas_holdem_4672_3c5c6d7h8h_Ad5h_6s4d_Ah6h() {
    assertEquals(
      "Ad5h Ah6h 6s4d",
      Solver.process("texas-holdem 3c5c6d7h8h Ad5h 6s4d Ah6h"));
  }

  @Test
  public void test_texas_holdem_4673_2s7cAdJdJs_9c5h_As6c_Ac7s() {
    assertEquals(
      "9c5h Ac7s=As6c",
      Solver.process("texas-holdem 2s7cAdJdJs 9c5h As6c Ac7s"));
  }

  @Test
  public void test_texas_holdem_4674_4c6hAsKdQd_Ac3h_9cTh_Kc5h_TdKs_Qh8h_7d3d_9d6d_5sJd_2dKh() {
    assertEquals(
      "7d3d 9cTh 5sJd 9d6d Qh8h 2dKh=Kc5h TdKs Ac3h",
      Solver.process("texas-holdem 4c6hAsKdQd Ac3h 9cTh Kc5h TdKs Qh8h 7d3d 9d6d 5sJd 2dKh"));
  }

  @Test
  public void test_texas_holdem_4675_2d2s3s4h6s_6h8s_5s5c_Jc4s_2hKh_4cKc_TsJd() {
    assertEquals(
      "TsJd Jc4s 4cKc 6h8s 2hKh 5s5c",
      Solver.process("texas-holdem 2d2s3s4h6s 6h8s 5s5c Jc4s 2hKh 4cKc TsJd"));
  }

  @Test
  public void test_texas_holdem_4676_3d6h9dJsTd_Jh9c_2h6d_Qs8s_JcQd_4h6c() {
    assertEquals(
      "2h6d=4h6c JcQd Jh9c Qs8s",
      Solver.process("texas-holdem 3d6h9dJsTd Jh9c 2h6d Qs8s JcQd 4h6c"));
  }

  @Test
  public void test_texas_holdem_4677_5c6c8sAcJs_AdJd_Ah2c_4c3c_8h5h_Qc7s_9sTs_3d9c_4dJh_4s8d() {
    assertEquals(
      "3d9c 9sTs Qc7s 4s8d 4dJh Ah2c 8h5h AdJd 4c3c",
      Solver.process("texas-holdem 5c6c8sAcJs AdJd Ah2c 4c3c 8h5h Qc7s 9sTs 3d9c 4dJh 4s8d"));
  }

  @Test
  public void test_texas_holdem_4678_3d4cAcQcQs_8d7s_3sTd_7h5c_Qh4d_As8h_3h7c_Ah7d_Ts4h_Jh9c() {
    assertEquals(
      "7h5c 8d7s Jh9c 3h7c=3sTd Ts4h Ah7d As8h Qh4d",
      Solver.process("texas-holdem 3d4cAcQcQs 8d7s 3sTd 7h5c Qh4d As8h 3h7c Ah7d Ts4h Jh9c"));
  }

  @Test
  public void test_texas_holdem_4679_2c4cAhQsTh_AsKh_Qh8d_9cTc() {
    assertEquals(
      "9cTc Qh8d AsKh",
      Solver.process("texas-holdem 2c4cAhQsTh AsKh Qh8d 9cTc"));
  }

  @Test
  public void test_texas_holdem_4680_2h5c6sJdQs_9c7c_Jh5h_Jc4d() {
    assertEquals(
      "9c7c Jc4d Jh5h",
      Solver.process("texas-holdem 2h5c6sJdQs 9c7c Jh5h Jc4d"));
  }

  @Test
  public void test_texas_holdem_4681_5c6s7s8hKc_JdQc_9hTh_2sAc_JhKh() {
    assertEquals(
      "JdQc 2sAc JhKh 9hTh",
      Solver.process("texas-holdem 5c6s7s8hKc JdQc 9hTh 2sAc JhKh"));
  }

  @Test
  public void test_texas_holdem_4682_5d7cJhKcQc_3h8s_JcAd() {
    assertEquals(
      "3h8s JcAd",
      Solver.process("texas-holdem 5d7cJhKcQc 3h8s JcAd"));
  }

  @Test
  public void test_texas_holdem_4683_2d6c6d7d8s_KhTd_KsQs_7s4s_KcKd_TcTs() {
    assertEquals(
      "KhTd KsQs 7s4s TcTs KcKd",
      Solver.process("texas-holdem 2d6c6d7d8s KhTd KsQs 7s4s KcKd TcTs"));
  }

  @Test
  public void test_texas_holdem_4684_2c3s7c8hJh_Jc4s_2s6d_Qd7h_7dJs_2dAc() {
    assertEquals(
      "2s6d 2dAc Qd7h Jc4s 7dJs",
      Solver.process("texas-holdem 2c3s7c8hJh Jc4s 2s6d Qd7h 7dJs 2dAc"));
  }

  @Test
  public void test_texas_holdem_4685_7d7sAsJcKd_Kc3h_4s4h_2c3s_6s4d_Ks2s_8s8d_2dAc() {
    assertEquals(
      "2c3s=6s4d 4s4h 8s8d Kc3h=Ks2s 2dAc",
      Solver.process("texas-holdem 7d7sAsJcKd Kc3h 4s4h 2c3s 6s4d Ks2s 8s8d 2dAc"));
  }

  @Test
  public void test_texas_holdem_4686_2d4s5d8sTs_Ah7c_5hKd_TcJd_Qc5s_As5c_8hQs_2cKc() {
    assertEquals(
      "Ah7c 2cKc Qc5s 5hKd As5c 8hQs TcJd",
      Solver.process("texas-holdem 2d4s5d8sTs Ah7c 5hKd TcJd Qc5s As5c 8hQs 2cKc"));
  }

  @Test
  public void test_texas_holdem_4687_2h4c9hJcQc_Qh6s_KcKh_4s5s_KdTh() {
    assertEquals(
      "4s5s Qh6s KcKh KdTh",
      Solver.process("texas-holdem 2h4c9hJcQc Qh6s KcKh 4s5s KdTh"));
  }

  @Test
  public void test_texas_holdem_4688_2d4d8s9dTc_QcKd_Jc9c_TsAs() {
    assertEquals(
      "QcKd Jc9c TsAs",
      Solver.process("texas-holdem 2d4d8s9dTc QcKd Jc9c TsAs"));
  }

  @Test
  public void test_texas_holdem_4689_2d3s8h8sTd_9dQs_JdTh_4cAd_Kd7s_2cAh() {
    assertEquals(
      "9dQs Kd7s 4cAd 2cAh JdTh",
      Solver.process("texas-holdem 2d3s8h8sTd 9dQs JdTh 4cAd Kd7s 2cAh"));
  }

  @Test
  public void test_texas_holdem_4690_3h7dAsJcKs_Td6s_4h9c_2c2s_6c7s_KhQc_5h9d() {
    assertEquals(
      "4h9c=5h9d Td6s 2c2s 6c7s KhQc",
      Solver.process("texas-holdem 3h7dAsJcKs Td6s 4h9c 2c2s 6c7s KhQc 5h9d"));
  }

  @Test
  public void test_texas_holdem_4691_4h6c7d9cJh_Kh3s_Ah2d() {
    assertEquals(
      "Kh3s Ah2d",
      Solver.process("texas-holdem 4h6c7d9cJh Kh3s Ah2d"));
  }

  @Test
  public void test_texas_holdem_4692_2d2s7dJcJh_4c9s_8c9c_Ah6c_Qh2h_4d8d_6dJd() {
    assertEquals(
      "4d8d 4c9s=8c9c Ah6c Qh2h 6dJd",
      Solver.process("texas-holdem 2d2s7dJcJh 4c9s 8c9c Ah6c Qh2h 4d8d 6dJd"));
  }

  @Test
  public void test_texas_holdem_4693_4d5h6s7sAc_8c4c_9hAh_JhKh_JsKd_As3c_7d8h() {
    assertEquals(
      "JhKh=JsKd 9hAh As3c 7d8h=8c4c",
      Solver.process("texas-holdem 4d5h6s7sAc 8c4c 9hAh JhKh JsKd As3c 7d8h"));
  }

  @Test
  public void test_texas_holdem_4694_2c5c9sJdTs_Kh9h_7h6c_4s8s_6h7s() {
    assertEquals(
      "6h7s=7h6c 4s8s Kh9h",
      Solver.process("texas-holdem 2c5c9sJdTs Kh9h 7h6c 4s8s 6h7s"));
  }

  @Test
  public void test_texas_holdem_4695_2s6d8s9sQd_9d8c_9c6c_6hQs_7hAh() {
    assertEquals(
      "7hAh 9c6c 9d8c 6hQs",
      Solver.process("texas-holdem 2s6d8s9sQd 9d8c 9c6c 6hQs 7hAh"));
  }

  @Test
  public void test_texas_holdem_4696_7d7s9h9sJs_9dQs_5hAs_6d4c() {
    assertEquals(
      "6d4c 5hAs 9dQs",
      Solver.process("texas-holdem 7d7s9h9sJs 9dQs 5hAs 6d4c"));
  }

  @Test
  public void test_texas_holdem_4697_3h7s9dJdKs_TcJc_8hKh_4h2d_7dJs_Td2s_QdQc_5hKc() {
    assertEquals(
      "4h2d Td2s TcJc QdQc 5hKc 8hKh 7dJs",
      Solver.process("texas-holdem 3h7s9dJdKs TcJc 8hKh 4h2d 7dJs Td2s QdQc 5hKc"));
  }

  @Test
  public void test_texas_holdem_4698_4h6c8hJhTc_9d3s_9h3h_As5c_Kh3c_Kc4d_7d2d() {
    assertEquals(
      "7d2d 9d3s Kh3c As5c Kc4d 9h3h",
      Solver.process("texas-holdem 4h6c8hJhTc 9d3s 9h3h As5c Kh3c Kc4d 7d2d"));
  }

  @Test
  public void test_texas_holdem_4699_7h9sAhAsTs_Jd4h_Qs5c_2d5d_3d4s_Ad6h_9d3c_8dKs_JsKd_Kc8h() {
    assertEquals(
      "2d5d=3d4s Jd4h Qs5c 8dKs=Kc8h JsKd 9d3c Ad6h",
      Solver.process("texas-holdem 7h9sAhAsTs Jd4h Qs5c 2d5d 3d4s Ad6h 9d3c 8dKs JsKd Kc8h"));
  }

  @Test
  public void test_texas_holdem_4700_3d3h7d8s9d_2dAh_5d2c_QdTh_5s4d_Tc7s_6sJs() {
    assertEquals(
      "5d2c=5s4d 6sJs QdTh 2dAh Tc7s",
      Solver.process("texas-holdem 3d3h7d8s9d 2dAh 5d2c QdTh 5s4d Tc7s 6sJs"));
  }

  @Test
  public void test_texas_holdem_4701_4d6c6s8cAd_9c3d_4hJc_Ac6d_7h8s_9dKc_JhTs_8d3c_ThJs_Qh3h() {
    assertEquals(
      "9c3d JhTs=ThJs Qh3h 9dKc 4hJc 7h8s=8d3c Ac6d",
      Solver.process("texas-holdem 4d6c6s8cAd 9c3d 4hJc Ac6d 7h8s 9dKc JhTs 8d3c ThJs Qh3h"));
  }

  @Test
  public void test_texas_holdem_4702_2d5cKsQdTh_Td2s_6s5s_7hQh_6h4c_3c5h_Ac9d_8hQs_2h5d() {
    assertEquals(
      "6h4c Ac9d 3c5h=6s5s 7hQh 8hQs 2h5d Td2s",
      Solver.process("texas-holdem 2d5cKsQdTh Td2s 6s5s 7hQh 6h4c 3c5h Ac9d 8hQs 2h5d"));
  }

  @Test
  public void test_texas_holdem_4703_3c4s5d8dKd_Ts2s_5c7h() {
    assertEquals(
      "Ts2s 5c7h",
      Solver.process("texas-holdem 3c4s5d8dKd Ts2s 5c7h"));
  }

  @Test
  public void test_texas_holdem_4704_3c3s6s7hAh_6cKs_4h8d_5sKd() {
    assertEquals(
      "4h8d 5sKd 6cKs",
      Solver.process("texas-holdem 3c3s6s7hAh 6cKs 4h8d 5sKd"));
  }

  @Test
  public void test_texas_holdem_4705_3sJcJsKdTh_5h2c_9c7d_6d3c_6cQs_9hJd_4c9d_Ah4s_QdQh() {
    assertEquals(
      "5h2c 4c9d=9c7d 6cQs Ah4s 6d3c QdQh 9hJd",
      Solver.process("texas-holdem 3sJcJsKdTh 5h2c 9c7d 6d3c 6cQs 9hJd 4c9d Ah4s QdQh"));
  }

  @Test
  public void test_texas_holdem_4706_3d8sAcAhJd_4hKd_2c8c_JcKs_2d4d_Jh6s() {
    assertEquals(
      "2d4d 4hKd 2c8c Jh6s JcKs",
      Solver.process("texas-holdem 3d8sAcAhJd 4hKd 2c8c JcKs 2d4d Jh6s"));
  }

  @Test
  public void test_texas_holdem_4707_5h6h7dAdKs_5s2s_Kh8s_Kd7s() {
    assertEquals(
      "5s2s Kh8s Kd7s",
      Solver.process("texas-holdem 5h6h7dAdKs 5s2s Kh8s Kd7s"));
  }

  @Test
  public void test_texas_holdem_4708_2h7d7s8dQd_Jc6d_TsJh_Qh5d_3c2c_3h9c_5cAh_3d4h_7hKs_9d7c() {
    assertEquals(
      "3d4h 3h9c Jc6d TsJh 5cAh 3c2c Qh5d 9d7c 7hKs",
      Solver.process("texas-holdem 2h7d7s8dQd Jc6d TsJh Qh5d 3c2c 3h9c 5cAh 3d4h 7hKs 9d7c"));
  }

  @Test
  public void test_texas_holdem_4709_2c8d9sJsQh_4h8s_4s3d_9d2d_3s8c() {
    assertEquals(
      "4s3d 3s8c=4h8s 9d2d",
      Solver.process("texas-holdem 2c8d9sJsQh 4h8s 4s3d 9d2d 3s8c"));
  }

  @Test
  public void test_texas_holdem_4710_3s4d5c9hQs_6d7d_QhAc_3cAs_Tc3h_4s5d_Ad2d_6c8s_AhJc_Td4h() {
    assertEquals(
      "6c8s AhJc Tc3h 3cAs Td4h QhAc 4s5d Ad2d 6d7d",
      Solver.process("texas-holdem 3s4d5c9hQs 6d7d QhAc 3cAs Tc3h 4s5d Ad2d 6c8s AhJc Td4h"));
  }

  @Test
  public void test_texas_holdem_4711_7h8c8hKdQd_3c7d_9s8s_2s4s_4h5s_2cJc_3h3s_6s9h() {
    assertEquals(
      "2s4s=4h5s 6s9h 2cJc 3h3s 3c7d 9s8s",
      Solver.process("texas-holdem 7h8c8hKdQd 3c7d 9s8s 2s4s 4h5s 2cJc 3h3s 6s9h"));
  }

  @Test
  public void test_texas_holdem_4712_5cAdAhKsQc_2c6d_3dTs_8c4h_QdAs_Kc6s_7h9c_3sJc() {
    assertEquals(
      "2c6d 8c4h 7h9c 3dTs 3sJc Kc6s QdAs",
      Solver.process("texas-holdem 5cAdAhKsQc 2c6d 3dTs 8c4h QdAs Kc6s 7h9c 3sJc"));
  }

  @Test
  public void test_texas_holdem_4713_4d6cAdJsKd_5h7c_8dQd_JdJh_AsTs() {
    assertEquals(
      "5h7c AsTs JdJh 8dQd",
      Solver.process("texas-holdem 4d6cAdJsKd 5h7c 8dQd JdJh AsTs"));
  }

  @Test
  public void test_texas_holdem_4714_5d7cJdQcTh_6sKh_4d3d_2d9c() {
    assertEquals(
      "4d3d 2d9c 6sKh",
      Solver.process("texas-holdem 5d7cJdQcTh 6sKh 4d3d 2d9c"));
  }

  @Test
  public void test_texas_holdem_4715_3d4c5hQsTd_9c2s_Kh7c_AdAc_6dJh_6h5c_2cAh_7h3h_ThAs_3c5s() {
    assertEquals(
      "9c2s 6dJh Kh7c 7h3h 6h5c ThAs AdAc 3c5s 2cAh",
      Solver.process("texas-holdem 3d4c5hQsTd 9c2s Kh7c AdAc 6dJh 6h5c 2cAh 7h3h ThAs 3c5s"));
  }

  @Test
  public void test_texas_holdem_4716_2h5s6cAsQd_TdJc_KcTc() {
    assertEquals(
      "TdJc KcTc",
      Solver.process("texas-holdem 2h5s6cAsQd TdJc KcTc"));
  }

  @Test
  public void test_texas_holdem_4717_2h5hAcAdKs_8h3c_Td9h_ThTc_2c6s_As8d_5c7s_TsQh_9s4s_JdJs() {
    assertEquals(
      "8h3c 9s4s Td9h TsQh 2c6s 5c7s ThTc JdJs As8d",
      Solver.process("texas-holdem 2h5hAcAdKs 8h3c Td9h ThTc 2c6s As8d 5c7s TsQh 9s4s JdJs"));
  }

  @Test
  public void test_texas_holdem_4718_3c4s8cJdKh_Ks7d_9s2c_3h7s_Jh5c_2d7c_Qc4h_3d4c_TsQs_Qd5h() {
    assertEquals(
      "2d7c 9s2c Qd5h TsQs 3h7s Qc4h Jh5c Ks7d 3d4c",
      Solver.process("texas-holdem 3c4s8cJdKh Ks7d 9s2c 3h7s Jh5c 2d7c Qc4h 3d4c TsQs Qd5h"));
  }

  @Test
  public void test_texas_holdem_4719_5s9cAdQcTc_8cJc_AhJh_Kc9h_4cQh_5c2s_7cTs_Js3s_7d7h() {
    assertEquals(
      "Js3s 5c2s 7d7h Kc9h 7cTs 4cQh AhJh 8cJc",
      Solver.process("texas-holdem 5s9cAdQcTc 8cJc AhJh Kc9h 4cQh 5c2s 7cTs Js3s 7d7h"));
  }

  @Test
  public void test_texas_holdem_4720_4s5c9dKcTs_AdTd_Jd7s_3cKs() {
    assertEquals(
      "Jd7s AdTd 3cKs",
      Solver.process("texas-holdem 4s5c9dKcTs AdTd Jd7s 3cKs"));
  }

  @Test
  public void test_texas_holdem_4721_2h3d6c9sTd_8h6s_4c8d_Ks6d_AcJc_2c8s_3s9d_5sQd_7hQh_TsKc() {
    assertEquals(
      "4c8d 5sQd 7hQh AcJc 2c8s 8h6s Ks6d TsKc 3s9d",
      Solver.process("texas-holdem 2h3d6c9sTd 8h6s 4c8d Ks6d AcJc 2c8s 3s9d 5sQd 7hQh TsKc"));
  }

  @Test
  public void test_texas_holdem_4722_4h8h9cJhQc_AcQs_ThAs_Jc5s_8dKs_3c7s_4dKh_AdQd_2hTd() {
    assertEquals(
      "3c7s 4dKh 8dKs Jc5s AcQs=AdQd 2hTd=ThAs",
      Solver.process("texas-holdem 4h8h9cJhQc AcQs ThAs Jc5s 8dKs 3c7s 4dKh AdQd 2hTd"));
  }

  @Test
  public void test_texas_holdem_4723_2h7c7s8hAh_9hTd_Jc4d_8d4h_3dQs_2d7h_5sTh_4cAc() {
    assertEquals(
      "5sTh 9hTd Jc4d 3dQs 8d4h 4cAc 2d7h",
      Solver.process("texas-holdem 2h7c7s8hAh 9hTd Jc4d 8d4h 3dQs 2d7h 5sTh 4cAc"));
  }

  @Test
  public void test_texas_holdem_4724_7c8dAsJsTh_2c9d_9c9s_2s8c_Jc8h_KdKs_Ad3d() {
    assertEquals(
      "2s8c KdKs Ad3d Jc8h 2c9d=9c9s",
      Solver.process("texas-holdem 7c8dAsJsTh 2c9d 9c9s 2s8c Jc8h KdKs Ad3d"));
  }

  @Test
  public void test_texas_holdem_4725_6sJcKcKsTs_6h9s_3c3s_5h6c() {
    assertEquals(
      "3c3s 5h6c=6h9s",
      Solver.process("texas-holdem 6sJcKcKsTs 6h9s 3c3s 5h6c"));
  }

  @Test
  public void test_texas_holdem_4726_5c7dAhJhTs_3d3h_KdQs_7hTh() {
    assertEquals(
      "3d3h 7hTh KdQs",
      Solver.process("texas-holdem 5c7dAhJhTs 3d3h KdQs 7hTh"));
  }

  @Test
  public void test_texas_holdem_4727_2h3c8c8sKd_4hTs_4s9d() {
    assertEquals(
      "4s9d 4hTs",
      Solver.process("texas-holdem 2h3c8c8sKd 4hTs 4s9d"));
  }

  @Test
  public void test_texas_holdem_4728_4d4h5sAcAh_7dQd_Jc2s_3hTh() {
    assertEquals(
      "3hTh Jc2s 7dQd",
      Solver.process("texas-holdem 4d4h5sAcAh 7dQd Jc2s 3hTh"));
  }

  @Test
  public void test_texas_holdem_4729_3d4h8sAcAd_9s8c_5dTs_Qs2s_2c5c_KdQd() {
    assertEquals(
      "5dTs Qs2s KdQd 9s8c 2c5c",
      Solver.process("texas-holdem 3d4h8sAcAd 9s8c 5dTs Qs2s 2c5c KdQd"));
  }

  @Test
  public void test_texas_holdem_4730_5s7s8cAcJh_QhJs_5h3d_8h2d() {
    assertEquals(
      "5h3d 8h2d QhJs",
      Solver.process("texas-holdem 5s7s8cAcJh QhJs 5h3d 8h2d"));
  }

  @Test
  public void test_texas_holdem_4731_2d2h6dAhJs_As8d_6cAd_2c3c_9h5c_JhAc_6s9s_7d2s() {
    assertEquals(
      "9h5c 6s9s As8d 6cAd JhAc 2c3c=7d2s",
      Solver.process("texas-holdem 2d2h6dAhJs As8d 6cAd 2c3c 9h5c JhAc 6s9s 7d2s"));
  }

  @Test
  public void test_texas_holdem_4732_3d4c5h6c7s_3s7c_2h5s_TdQd_KsKh_5cAs() {
    assertEquals(
      "2h5s=3s7c=5cAs=KsKh=TdQd",
      Solver.process("texas-holdem 3d4c5h6c7s 3s7c 2h5s TdQd KsKh 5cAs"));
  }

  @Test
  public void test_texas_holdem_4733_5c5s6dAsJs_Ah2c_3s7h_Td9d_6sKc_QdKd_7c8c_8sJh() {
    assertEquals(
      "3s7h 7c8c Td9d QdKd 6sKc 8sJh Ah2c",
      Solver.process("texas-holdem 5c5s6dAsJs Ah2c 3s7h Td9d 6sKc QdKd 7c8c 8sJh"));
  }

  @Test
  public void test_texas_holdem_4734_2h5d7d7s9h_4d9d_KsJc_6s6h_5cJs_JdTh_Kc6c_Td4h_AsKh_TsTc() {
    assertEquals(
      "Td4h JdTh Kc6c KsJc AsKh 5cJs 6s6h 4d9d TsTc",
      Solver.process("texas-holdem 2h5d7d7s9h 4d9d KsJc 6s6h 5cJs JdTh Kc6c Td4h AsKh TsTc"));
  }

  @Test
  public void test_texas_holdem_4735_2s4d5sJsKs_9dJh_JdQh() {
    assertEquals(
      "9dJh JdQh",
      Solver.process("texas-holdem 2s4d5sJsKs 9dJh JdQh"));
  }

  @Test
  public void test_texas_holdem_4736_4d5h7c9cQd_2cJd_Ah7h_Ad6d_AsQs_JcJs_Jh7s_2hKc_3s2d_5s5d() {
    assertEquals(
      "3s2d 2cJd 2hKc Ad6d Jh7s Ah7h JcJs AsQs 5s5d",
      Solver.process("texas-holdem 4d5h7c9cQd 2cJd Ah7h Ad6d AsQs JcJs Jh7s 2hKc 3s2d 5s5d"));
  }

  @Test
  public void test_texas_holdem_4737_4h5d6s7c7d_Jh2d_9cTh() {
    assertEquals(
      "9cTh Jh2d",
      Solver.process("texas-holdem 4h5d6s7c7d Jh2d 9cTh"));
  }

  @Test
  public void test_texas_holdem_4738_4d7sJdKcQd_9s6s_4hTh_Qc9h_Ah5d_7cJh_6c3s_8s3c_8cAd_Ks2h() {
    assertEquals(
      "6c3s 8s3c 9s6s Ah5d 8cAd 4hTh Qc9h Ks2h 7cJh",
      Solver.process("texas-holdem 4d7sJdKcQd 9s6s 4hTh Qc9h Ah5d 7cJh 6c3s 8s3c 8cAd Ks2h"));
  }

  @Test
  public void test_texas_holdem_4739_4c4d5h7c9h_6s8d_8sAh() {
    assertEquals(
      "8sAh 6s8d",
      Solver.process("texas-holdem 4c4d5h7c9h 6s8d 8sAh"));
  }

  @Test
  public void test_texas_holdem_4740_5h6cJcQsTd_Js4d_9s2c() {
    assertEquals(
      "9s2c Js4d",
      Solver.process("texas-holdem 5h6cJcQsTd Js4d 9s2c"));
  }

  @Test
  public void test_texas_holdem_4741_3h6h9dQcTd_3c2d_4dQd_4c9h_2hKs_Js2s_8hTh_Kc5s_Jh2c() {
    assertEquals(
      "Jh2c=Js2s 2hKs=Kc5s 3c2d 4c9h 8hTh 4dQd",
      Solver.process("texas-holdem 3h6h9dQcTd 3c2d 4dQd 4c9h 2hKs Js2s 8hTh Kc5s Jh2c"));
  }

  @Test
  public void test_texas_holdem_4742_7s8sJdJhQh_7hAh_7c6s_8h8c_Ac2h_6dTc_ThQc() {
    assertEquals(
      "6dTc Ac2h 7c6s 7hAh ThQc 8h8c",
      Solver.process("texas-holdem 7s8sJdJhQh 7hAh 7c6s 8h8c Ac2h 6dTc ThQc"));
  }

  @Test
  public void test_texas_holdem_4743_5d6dAcKsTh_4hKd_7d9h_Qs7h_8dQc_Jh4c_Kh8s_Ts8c() {
    assertEquals(
      "7d9h Jh4c Qs7h 8dQc Ts8c 4hKd Kh8s",
      Solver.process("texas-holdem 5d6dAcKsTh 4hKd 7d9h Qs7h 8dQc Jh4c Kh8s Ts8c"));
  }

  @Test
  public void test_texas_holdem_4744_4s7d9sAcAh_2d9c_As3h_8d7s() {
    assertEquals(
      "8d7s 2d9c As3h",
      Solver.process("texas-holdem 4s7d9sAcAh 2d9c As3h 8d7s"));
  }

  @Test
  public void test_texas_holdem_4745_3h4h4s7hKs_Jc7d_QhTd_Th7c_6h6s_4d2s_KcKd_8sAd_3cQc() {
    assertEquals(
      "QhTd 8sAd 3cQc 6h6s Jc7d=Th7c 4d2s KcKd",
      Solver.process("texas-holdem 3h4h4s7hKs Jc7d QhTd Th7c 6h6s 4d2s KcKd 8sAd 3cQc"));
  }

  @Test
  public void test_texas_holdem_4746_2c3s6d8dKc_Qc9c_Kd2h() {
    assertEquals(
      "Qc9c Kd2h",
      Solver.process("texas-holdem 2c3s6d8dKc Qc9c Kd2h"));
  }

  @Test
  public void test_texas_holdem_4747_2d5c7sQcTd_5d4h_3h5s_3sJh_4c9h_QsAh_6cAc_2cTh_Kc9s_2s6h() {
    assertEquals(
      "4c9h 3sJh Kc9s 6cAc 2s6h 3h5s=5d4h QsAh 2cTh",
      Solver.process("texas-holdem 2d5c7sQcTd 5d4h 3h5s 3sJh 4c9h QsAh 6cAc 2cTh Kc9s 2s6h"));
  }

  @Test
  public void test_texas_holdem_4748_4c4h7h9sTh_6h4s_9dTd_Ts2s_Ac3c() {
    assertEquals(
      "Ac3c Ts2s 9dTd 6h4s",
      Solver.process("texas-holdem 4c4h7h9sTh 6h4s 9dTd Ts2s Ac3c"));
  }

  @Test
  public void test_texas_holdem_4749_2d3d5c9cKd_Kc7s_5hQs_Qd8s() {
    assertEquals(
      "Qd8s 5hQs Kc7s",
      Solver.process("texas-holdem 2d3d5c9cKd Kc7s 5hQs Qd8s"));
  }

}
