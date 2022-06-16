
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver34HiddenTest {


  @Test
  public void test_omaha_holdem_8500_3h8sKcQhTd_2h2c7c6d_6sJhJd6h_5c9sKs9h_AdKdTs8c_KhAh8h5s_2d4cTh3s_As4dQs4h_9c5d8d6c() {
    assertEquals(
      "2h2c7c6d 9c5d8d6c 6sJhJd6h As4dQs4h 5c9sKs9h 2d4cTh3s KhAh8h5s AdKdTs8c",
      Solver.process("omaha-holdem 3h8sKcQhTd 2h2c7c6d 6sJhJd6h 5c9sKs9h AdKdTs8c KhAh8h5s 2d4cTh3s As4dQs4h 9c5d8d6c"));
  }

  @Test
  public void test_omaha_holdem_8501_3d4s6hAdAs_Ks3s8d2h_Tc4h3cKh_9h9d6c8s_Td2s8hJd_2dJs4c9c_AhQd3h7h() {
    assertEquals(
      "Td2s8hJd Ks3s8d2h 2dJs4c9c Tc4h3cKh 9h9d6c8s AhQd3h7h",
      Solver.process("omaha-holdem 3d4s6hAdAs Ks3s8d2h Tc4h3cKh 9h9d6c8s Td2s8hJd 2dJs4c9c AhQd3h7h"));
  }

  @Test
  public void test_omaha_holdem_8502_4c5c8c8sJh_5sKh9sQs_2hTdJdAc_7sTsAh9h_3h3c6s4d_4s9c2d7c_7dAs4h5h_AdKcTc6d_KdQhQcTh() {
    assertEquals(
      "7sTsAh9h 3h3c6s4d 5sKh9sQs 7dAs4h5h 2hTdJdAc KdQhQcTh 4s9c2d7c AdKcTc6d",
      Solver.process("omaha-holdem 4c5c8c8sJh 5sKh9sQs 2hTdJdAc 7sTsAh9h 3h3c6s4d 4s9c2d7c 7dAs4h5h AdKcTc6d KdQhQcTh"));
  }

  @Test
  public void test_omaha_holdem_8503_2s3c9d9sJd_JhKh2c8c_5dKd7c4c_KcQcTs4h() {
    assertEquals(
      "5dKd7c4c KcQcTs4h JhKh2c8c",
      Solver.process("omaha-holdem 2s3c9d9sJd JhKh2c8c 5dKd7c4c KcQcTs4h"));
  }

  @Test
  public void test_omaha_holdem_8504_2s6c7hJsQs_JdAd4d2h_9h7cJcQd_AcAs9s7s_Qc3cTdTh_8cKcTc2d_Kh5s8d6d_5d3h4h7d_Ah4sTs3d() {
    assertEquals(
      "8cKcTc2d Kh5s8d6d 5d3h4h7d Qc3cTdTh JdAd4d2h 9h7cJcQd Ah4sTs3d AcAs9s7s",
      Solver.process("omaha-holdem 2s6c7hJsQs JdAd4d2h 9h7cJcQd AcAs9s7s Qc3cTdTh 8cKcTc2d Kh5s8d6d 5d3h4h7d Ah4sTs3d"));
  }

  @Test
  public void test_omaha_holdem_8505_2h5h7dJdTs_Jh4d8d9d_5sTh8h9s_8s7sAs2d_Qd3cQsKs_6h3d4sQh_KcAc7h4h_6cJs6d5c_9cAh5dAd() {
    assertEquals(
      "6h3d4sQh KcAc7h4h Qd3cQsKs 9cAh5dAd 8s7sAs2d 6cJs6d5c 5sTh8h9s=Jh4d8d9d",
      Solver.process("omaha-holdem 2h5h7dJdTs Jh4d8d9d 5sTh8h9s 8s7sAs2d Qd3cQsKs 6h3d4sQh KcAc7h4h 6cJs6d5c 9cAh5dAd"));
  }

  @Test
  public void test_omaha_holdem_8506_5c7h8cJdKh_QcKc9sTd_3d2h5h8h_4c8dJs6s_Kd9c7cJh_3c6d2d5d_6hQs9h4d_AcTs7d4h_Ks8sAd7s() {
    assertEquals(
      "3c6d2d5d AcTs7d4h 3d2h5h8h Ks8sAd7s Kd9c7cJh 4c8dJs6s 6hQs9h4d QcKc9sTd",
      Solver.process("omaha-holdem 5c7h8cJdKh QcKc9sTd 3d2h5h8h 4c8dJs6s Kd9c7cJh 3c6d2d5d 6hQs9h4d AcTs7d4h Ks8sAd7s"));
  }

  @Test
  public void test_omaha_holdem_8507_9c9sAsTdTs_7hKc8cAh_7sKs5s5d() {
    assertEquals(
      "7hKc8cAh 7sKs5s5d",
      Solver.process("omaha-holdem 9c9sAsTdTs 7hKc8cAh 7sKs5s5d"));
  }

  @Test
  public void test_omaha_holdem_8508_4d5d6d9c9h_3s7dQh9s_6h4c7cQd_5h3hAsQc_7h8d2hAh_Kh8s2cTh_2d3d8c8h_Jc5cAc4s_6c6sTc7s_Js4hKdQs() {
    assertEquals(
      "Kh8s2cTh Js4hKdQs 5h3hAsQc=Jc5cAc4s 6h4c7cQd 3s7dQh9s 7h8d2hAh 6c6sTc7s 2d3d8c8h",
      Solver.process("omaha-holdem 4d5d6d9c9h 3s7dQh9s 6h4c7cQd 5h3hAsQc 7h8d2hAh Kh8s2cTh 2d3d8c8h Jc5cAc4s 6c6sTc7s Js4hKdQs"));
  }

  @Test
  public void test_omaha_holdem_8509_2s3d4cJsQh_9h4d3s3c_TdAhTs5h_7sKd2c7c_6c6h3hKc() {
    assertEquals(
      "6c6h3hKc 7sKd2c7c 9h4d3s3c TdAhTs5h",
      Solver.process("omaha-holdem 2s3d4cJsQh 9h4d3s3c TdAhTs5h 7sKd2c7c 6c6h3hKc"));
  }

  @Test
  public void test_omaha_holdem_8510_3d3h7c8cQh_8hQcTsKc_AsAc8d6h_3c7hAdKd_Tc6dKhJc_2cQs4d4s_Jh5d9cTh_2d8s6cTd_Ah9sQd4h() {
    assertEquals(
      "Jh5d9cTh Tc6dKhJc 2d8s6cTd 2cQs4d4s Ah9sQd4h 8hQcTsKc AsAc8d6h 3c7hAdKd",
      Solver.process("omaha-holdem 3d3h7c8cQh 8hQcTsKc AsAc8d6h 3c7hAdKd Tc6dKhJc 2cQs4d4s Jh5d9cTh 2d8s6cTd Ah9sQd4h"));
  }

  @Test
  public void test_omaha_holdem_8511_6h7h7s9dJd_8s7cKcQh_8h4h9s2h_5s3hJsTs_Jh3d2c9h_AhAsThKs_3sJc2d4s_7d5cAdQd_6c3cAc6s_4d5hQc2s() {
    assertEquals(
      "4d5hQc2s 8h4h9s2h 3sJc2d4s 5s3hJsTs Jh3d2c9h AhAsThKs 8s7cKcQh 7d5cAdQd 6c3cAc6s",
      Solver.process("omaha-holdem 6h7h7s9dJd 8s7cKcQh 8h4h9s2h 5s3hJsTs Jh3d2c9h AhAsThKs 3sJc2d4s 7d5cAdQd 6c3cAc6s 4d5hQc2s"));
  }

  @Test
  public void test_omaha_holdem_8512_4c7s9cJcTh_KhKc5c7c_AsTs2c3s() {
    assertEquals(
      "AsTs2c3s KhKc5c7c",
      Solver.process("omaha-holdem 4c7s9cJcTh KhKc5c7c AsTs2c3s"));
  }

  @Test
  public void test_omaha_holdem_8513_4s9sAcQdTd_7d7sAsJs_Qh6cKdTh_3c6d8hAh_Jc2hKs9c() {
    assertEquals(
      "3c6d8hAh 7d7sAsJs Qh6cKdTh Jc2hKs9c",
      Solver.process("omaha-holdem 4s9sAcQdTd 7d7sAsJs Qh6cKdTh 3c6d8hAh Jc2hKs9c"));
  }

  @Test
  public void test_omaha_holdem_8514_5s6s7h9hQd_ThKdAsQc_8cKsJs3h_3s8hJc4s_9s2cKh6h_7s3d3c9d_2d4hTs9c() {
    assertEquals(
      "8cKsJs3h 2d4hTs9c ThKdAsQc 9s2cKh6h 7s3d3c9d 3s8hJc4s",
      Solver.process("omaha-holdem 5s6s7h9hQd ThKdAsQc 8cKsJs3h 3s8hJc4s 9s2cKh6h 7s3d3c9d 2d4hTs9c"));
  }

  @Test
  public void test_omaha_holdem_8515_4d6d7hAhKs_Kh7c4c2c_5d8h6h7s_8d3h3d5s_9hAcTs2s_Kc3s7d5h() {
    assertEquals(
      "9hAcTs2s Kh7c4c2c Kc3s7d5h 5d8h6h7s=8d3h3d5s",
      Solver.process("omaha-holdem 4d6d7hAhKs Kh7c4c2c 5d8h6h7s 8d3h3d5s 9hAcTs2s Kc3s7d5h"));
  }

  @Test
  public void test_omaha_holdem_8516_4c4s7dAsQs_5s3dAd9d_Kh2dQd5c_5d2sJh5h_9cJcKd6d_Tc6s7hTd_9s7c6c9h_6hQh8c8s_Js3s4dAh_Ts3hKc8d() {
    assertEquals(
      "Ts3hKc8d 9cJcKd6d 5d2sJh5h 9s7c6c9h Tc6s7hTd 6hQh8c8s Kh2dQd5c 5s3dAd9d Js3s4dAh",
      Solver.process("omaha-holdem 4c4s7dAsQs 5s3dAd9d Kh2dQd5c 5d2sJh5h 9cJcKd6d Tc6s7hTd 9s7c6c9h 6hQh8c8s Js3s4dAh Ts3hKc8d"));
  }

  @Test
  public void test_omaha_holdem_8517_6h6s7s8cJc_3s6d4d9h_JsQh9sTs_KcAs5sTh_7h4c7d4s() {
    assertEquals(
      "KcAs5sTh 3s6d4d9h JsQh9sTs 7h4c7d4s",
      Solver.process("omaha-holdem 6h6s7s8cJc 3s6d4d9h JsQh9sTs KcAs5sTh 7h4c7d4s"));
  }

  @Test
  public void test_omaha_holdem_8518_3d5h6c6h9s_3s8hAs2h_Th6dTc9c_Ac4hKdKc_KhJc8c5c_2d8sAdTs() {
    assertEquals(
      "2d8sAdTs 3s8hAs2h KhJc8c5c Ac4hKdKc Th6dTc9c",
      Solver.process("omaha-holdem 3d5h6c6h9s 3s8hAs2h Th6dTc9c Ac4hKdKc KhJc8c5c 2d8sAdTs"));
  }

  @Test
  public void test_omaha_holdem_8519_6s7s8c8h9s_JcTc4d7c_Kd4hKhTd_3cJs4s5d() {
    assertEquals(
      "Kd4hKhTd JcTc4d7c 3cJs4s5d",
      Solver.process("omaha-holdem 6s7s8c8h9s JcTc4d7c Kd4hKhTd 3cJs4s5d"));
  }

  @Test
  public void test_omaha_holdem_8520_5c8d8sAsKd_9sJc7dTs_QcAh8h3d_Qd9d3s2s_Js5hTc2d_Jh4d5s6s_6c8cThAc() {
    assertEquals(
      "9sJc7dTs Qd9d3s2s Jh4d5s6s=Js5hTc2d 6c8cThAc=QcAh8h3d",
      Solver.process("omaha-holdem 5c8d8sAsKd 9sJc7dTs QcAh8h3d Qd9d3s2s Js5hTc2d Jh4d5s6s 6c8cThAc"));
  }

  @Test
  public void test_omaha_holdem_8521_2s5sAsKsQc_Js3d2cJc_8h5dAd9d() {
    assertEquals(
      "Js3d2cJc 8h5dAd9d",
      Solver.process("omaha-holdem 2s5sAsKsQc Js3d2cJc 8h5dAd9d"));
  }

  @Test
  public void test_omaha_holdem_8522_7d9dAhJsTs_6c4dKc9h_3cJhKs8s_4h8h9s8d_Kh6s5c2c_4s5dJcAd_2dAc3d6h() {
    assertEquals(
      "Kh6s5c2c 6c4dKc9h 2dAc3d6h 4s5dJcAd 3cJhKs8s=4h8h9s8d",
      Solver.process("omaha-holdem 7d9dAhJsTs 6c4dKc9h 3cJhKs8s 4h8h9s8d Kh6s5c2c 4s5dJcAd 2dAc3d6h"));
  }

  @Test
  public void test_omaha_holdem_8523_3c3d4cQcQs_5sTd3h9h_2dJh6d8c_4h8dKsAh_As4d7s8s_KcJcKh9d() {
    assertEquals(
      "2dJh6d8c 4h8dKsAh=As4d7s8s 5sTd3h9h KcJcKh9d",
      Solver.process("omaha-holdem 3c3d4cQcQs 5sTd3h9h 2dJh6d8c 4h8dKsAh As4d7s8s KcJcKh9d"));
  }

  @Test
  public void test_omaha_holdem_8524_3c7h8dAdAs_2hQh4d2s_3d4sTd3s_6h4hJh3h_Qs9hTs6s_Tc5dKd2c_Qc4c6d5h_9sJcJs7s_7dQd2d5s() {
    assertEquals(
      "Qc4c6d5h Qs9hTs6s Tc5dKd2c 2hQh4d2s 6h4hJh3h 7dQd2d5s 9sJcJs7s 3d4sTd3s",
      Solver.process("omaha-holdem 3c7h8dAdAs 2hQh4d2s 3d4sTd3s 6h4hJh3h Qs9hTs6s Tc5dKd2c Qc4c6d5h 9sJcJs7s 7dQd2d5s"));
  }

  @Test
  public void test_omaha_holdem_8525_7d9sAhJhTc_8hJc8d6s_3c6h4sQd_2dTdKh5d_3s2c5c9h_6dQh9c5h_KsTs5sQc_Qs6c7h7s_4hAs4cKd() {
    assertEquals(
      "3c6h4sQd 3s2c5c9h 6dQh9c5h 2dTdKh5d 4hAs4cKd Qs6c7h7s 8hJc8d6s KsTs5sQc",
      Solver.process("omaha-holdem 7d9sAhJhTc 8hJc8d6s 3c6h4sQd 2dTdKh5d 3s2c5c9h 6dQh9c5h KsTs5sQc Qs6c7h7s 4hAs4cKd"));
  }

  @Test
  public void test_omaha_holdem_8526_2c2d4s8hAc_5dAdQcJd_9cQh4h9d_Jc7d5hQd_Ks8d6hTd_9sKhKcJs_Ts7h9hJh_5s4c3s5c_QsThAh3d_3c7c6c7s() {
    assertEquals(
      "Ts7h9hJh Jc7d5hQd 3c7c6c7s Ks8d6hTd 9cQh4h9d 9sKhKcJs 5dAdQcJd=QsThAh3d 5s4c3s5c",
      Solver.process("omaha-holdem 2c2d4s8hAc 5dAdQcJd 9cQh4h9d Jc7d5hQd Ks8d6hTd 9sKhKcJs Ts7h9hJh 5s4c3s5c QsThAh3d 3c7c6c7s"));
  }

  @Test
  public void test_omaha_holdem_8527_3c4s8h8sJh_Ts7s9s3d_5cAdKh5d_6d2c3hKd() {
    assertEquals(
      "Ts7s9s3d 6d2c3hKd 5cAdKh5d",
      Solver.process("omaha-holdem 3c4s8h8sJh Ts7s9s3d 5cAdKh5d 6d2c3hKd"));
  }

  @Test
  public void test_omaha_holdem_8528_3s4c7sJdQc_TcTd7h3d_6c8c5dJh_9hKcAd4h_9d7dAsTs_8dAcJsKs_Qs2cJcAh_6h5s5hQd_7c5c2d4d() {
    assertEquals(
      "9hKcAd4h 9d7dAsTs 8dAcJsKs TcTd7h3d 7c5c2d4d Qs2cJcAh 6c8c5dJh=6h5s5hQd",
      Solver.process("omaha-holdem 3s4c7sJdQc TcTd7h3d 6c8c5dJh 9hKcAd4h 9d7dAsTs 8dAcJsKs Qs2cJcAh 6h5s5hQd 7c5c2d4d"));
  }

  @Test
  public void test_omaha_holdem_8529_3s4h9dAdQs_8c7cAcQd_3hAs7dTh_TsJh5s2d_Tc6d7sKh_Qc8h6hKd_7h5h9s2c_KcJdTd9c_8d5c9h2h_Qh4d3cJs() {
    assertEquals(
      "Tc6d7sKh KcJdTd9c Qc8h6hKd Qh4d3cJs 3hAs7dTh 8c7cAcQd 7h5h9s2c=8d5c9h2h=TsJh5s2d",
      Solver.process("omaha-holdem 3s4h9dAdQs 8c7cAcQd 3hAs7dTh TsJh5s2d Tc6d7sKh Qc8h6hKd 7h5h9s2c KcJdTd9c 8d5c9h2h Qh4d3cJs"));
  }

  @Test
  public void test_omaha_holdem_8530_2c5d7cAdTc_Ah9hTsKh_3sAcThJh_Qd8cJd2d_4c8d3c4d_3h7h6sAs_6c2sKs9c_Js8sTd4s() {
    assertEquals(
      "Qd8cJd2d Js8sTd4s 3h7h6sAs 3sAcThJh=Ah9hTsKh 4c8d3c4d 6c2sKs9c",
      Solver.process("omaha-holdem 2c5d7cAdTc Ah9hTsKh 3sAcThJh Qd8cJd2d 4c8d3c4d 3h7h6sAs 6c2sKs9c Js8sTd4s"));
  }

  @Test
  public void test_omaha_holdem_8531_2h6cAcQdQs_Jd9s9h8c_5c6d9dJh_Qh5sTs9c_2d7s7c3s() {
    assertEquals(
      "5c6d9dJh 2d7s7c3s Jd9s9h8c Qh5sTs9c",
      Solver.process("omaha-holdem 2h6cAcQdQs Jd9s9h8c 5c6d9dJh Qh5sTs9c 2d7s7c3s"));
  }

  @Test
  public void test_omaha_holdem_8532_5h7s8sAsTc_3cTs9hQc_3d3s8hJc_QhKd4d4c_Ad9d6dQd() {
    assertEquals(
      "QhKd4d4c 3d3s8hJc 3cTs9hQc Ad9d6dQd",
      Solver.process("omaha-holdem 5h7s8sAsTc 3cTs9hQc 3d3s8hJc QhKd4d4c Ad9d6dQd"));
  }

  @Test
  public void test_omaha_holdem_8533_3c3s4d4hTd_Kc9dQd6d_As9hQh7s_9c5d5s6s() {
    assertEquals(
      "Kc9dQd6d As9hQh7s 9c5d5s6s",
      Solver.process("omaha-holdem 3c3s4d4hTd Kc9dQd6d As9hQh7s 9c5d5s6s"));
  }

  @Test
  public void test_omaha_holdem_8534_2d2s5sJhKs_3hQd3cTc_AcKhQc8h_Kc5cQsAs_3s9sTsJd_6c2hQh4h_5hJs8s7d_6d8c2c5d_6s9c7cTd() {
    assertEquals(
      "6s9c7cTd 3hQd3cTc AcKhQc8h 6c2hQh4h 3s9sTsJd 5hJs8s7d Kc5cQsAs 6d8c2c5d",
      Solver.process("omaha-holdem 2d2s5sJhKs 3hQd3cTc AcKhQc8h Kc5cQsAs 3s9sTsJd 6c2hQh4h 5hJs8s7d 6d8c2c5d 6s9c7cTd"));
  }

  @Test
  public void test_omaha_holdem_8535_5c8cAhKcKh_As4c4d4s_6dAc7d3h_8s3d9c2c_TdAdKdTc_QhJd3cQc_Js9s8dQs() {
    assertEquals(
      "Js9s8dQs As4c4d4s 6dAc7d3h 8s3d9c2c QhJd3cQc TdAdKdTc",
      Solver.process("omaha-holdem 5c8cAhKcKh As4c4d4s 6dAc7d3h 8s3d9c2c TdAdKdTc QhJd3cQc Js9s8dQs"));
  }

  @Test
  public void test_omaha_holdem_8536_7sAsJhJsQc_9d9h2c2h_3cAc3sTd_TcAhTs8h_KcAd7h7d() {
    assertEquals(
      "9d9h2c2h 3cAc3sTd=TcAhTs8h KcAd7h7d",
      Solver.process("omaha-holdem 7sAsJhJsQc 9d9h2c2h 3cAc3sTd TcAhTs8h KcAd7h7d"));
  }

  @Test
  public void test_omaha_holdem_8537_3d4c4d6d9c_AdKh2d5c_TcJs9s5s_AhQc6cJc() {
    assertEquals(
      "AhQc6cJc TcJs9s5s AdKh2d5c",
      Solver.process("omaha-holdem 3d4c4d6d9c AdKh2d5c TcJs9s5s AhQc6cJc"));
  }

  @Test
  public void test_omaha_holdem_8538_3c3h4dAcQs_8cJd8sQc_Jc7s8dTh_Js6d3s2c_4h5sKhKs_AsAh6hKc_2h2sQd4c_5c4sQh9s() {
    assertEquals(
      "Jc7s8dTh 8cJd8sQc 2h2sQd4c=5c4sQh9s 4h5sKhKs Js6d3s2c AsAh6hKc",
      Solver.process("omaha-holdem 3c3h4dAcQs 8cJd8sQc Jc7s8dTh Js6d3s2c 4h5sKhKs AsAh6hKc 2h2sQd4c 5c4sQh9s"));
  }

  @Test
  public void test_omaha_holdem_8539_2s5h7h8sTd_Ks6sQh7d_2d6dTs6h_9c7c3s2h_3dTcKcKh_9d4d4sJs() {
    assertEquals(
      "Ks6sQh7d 3dTcKcKh 9c7c3s2h 2d6dTs6h 9d4d4sJs",
      Solver.process("omaha-holdem 2s5h7h8sTd Ks6sQh7d 2d6dTs6h 9c7c3s2h 3dTcKcKh 9d4d4sJs"));
  }

  @Test
  public void test_omaha_holdem_8540_3c5hJcJdQc_8h9sKh8d_8sKs7cQs_Kc6cTc2d_ThAh5d3h_6dTd4c2h_Jh6hQd2s_Ts2c8c3d_7d5s9hAc_7h4d7sKd() {
    assertEquals(
      "6dTd4c2h 7d5s9hAc=ThAh5d3h 7h4d7sKd 8h9sKh8d 8sKs7cQs Ts2c8c3d Kc6cTc2d Jh6hQd2s",
      Solver.process("omaha-holdem 3c5hJcJdQc 8h9sKh8d 8sKs7cQs Kc6cTc2d ThAh5d3h 6dTd4c2h Jh6hQd2s Ts2c8c3d 7d5s9hAc 7h4d7sKd"));
  }

  @Test
  public void test_omaha_holdem_8541_2c3dJdKcTd_QcAh9h4c_AcJhKh2s_6h8cQh8d_ThTsAd7h_As7cKs5s_Tc9cJs3h_6c9s4h7s_7d9d2d5c() {
    assertEquals(
      "6c9s4h7s 6h8cQh8d As7cKs5s Tc9cJs3h AcJhKh2s ThTsAd7h QcAh9h4c 7d9d2d5c",
      Solver.process("omaha-holdem 2c3dJdKcTd QcAh9h4c AcJhKh2s 6h8cQh8d ThTsAd7h As7cKs5s Tc9cJs3h 6c9s4h7s 7d9d2d5c"));
  }

  @Test
  public void test_omaha_holdem_8542_3c4h6h7cKh_9sTh9dQd_AhJd7h6c_5h6d3s8s_Td6s3dTc_Ks5s4c7d_8dJcAd3h() {
    assertEquals(
      "8dJcAd3h 9sTh9dQd Td6s3dTc Ks5s4c7d 5h6d3s8s AhJd7h6c",
      Solver.process("omaha-holdem 3c4h6h7cKh 9sTh9dQd AhJd7h6c 5h6d3s8s Td6s3dTc Ks5s4c7d 8dJcAd3h"));
  }

  @Test
  public void test_omaha_holdem_8543_2h3s8cJdJs_5s7c8hAh_7dKc2sQh() {
    assertEquals(
      "7dKc2sQh 5s7c8hAh",
      Solver.process("omaha-holdem 2h3s8cJdJs 5s7c8hAh 7dKc2sQh"));
  }

  @Test
  public void test_omaha_holdem_8544_3h5d5hAdTs_JhAhQs6c_Kd2s8h5c_Qc8dAc7s_Kh5s4c7h_6h8cJd2h_4dKc7d6d() {
    assertEquals(
      "6h8cJd2h 4dKc7d6d JhAhQs6c=Qc8dAc7s Kd2s8h5c=Kh5s4c7h",
      Solver.process("omaha-holdem 3h5d5hAdTs JhAhQs6c Kd2s8h5c Qc8dAc7s Kh5s4c7h 6h8cJd2h 4dKc7d6d"));
  }

  @Test
  public void test_omaha_holdem_8545_2d4s5dKhQh_7h4c2s6h_3dTc7d2c() {
    assertEquals(
      "3dTc7d2c 7h4c2s6h",
      Solver.process("omaha-holdem 2d4s5dKhQh 7h4c2s6h 3dTc7d2c"));
  }

  @Test
  public void test_omaha_holdem_8546_2h4dJcQdTc_7h2dKs5s_KcQs9c4h_Kd5h6hQh() {
    assertEquals(
      "7h2dKs5s Kd5h6hQh KcQs9c4h",
      Solver.process("omaha-holdem 2h4dJcQdTc 7h2dKs5s KcQs9c4h Kd5h6hQh"));
  }

  @Test
  public void test_omaha_holdem_8547_5hJdJsKsQc_3s8cAh7d_KhTh7cKc_4hAd5sKd_4d6h4s4c_6c5cJh3c_8d2c6s7h_7sQhQdTd() {
    assertEquals(
      "8d2c6s7h 3s8cAh7d 4d6h4s4c 4hAd5sKd 6c5cJh3c 7sQhQdTd KhTh7cKc",
      Solver.process("omaha-holdem 5hJdJsKsQc 3s8cAh7d KhTh7cKc 4hAd5sKd 4d6h4s4c 6c5cJh3c 8d2c6s7h 7sQhQdTd"));
  }

  @Test
  public void test_omaha_holdem_8548_3d5c8cAsTc_5s4s6d5d_Kd7cJsQs_2c6h3h4h_9h6c7s9s() {
    assertEquals(
      "Kd7cJsQs 9h6c7s9s 5s4s6d5d 2c6h3h4h",
      Solver.process("omaha-holdem 3d5c8cAsTc 5s4s6d5d Kd7cJsQs 2c6h3h4h 9h6c7s9s"));
  }

  @Test
  public void test_omaha_holdem_8549_5c7hAsKsQs_9s3sAc7d_2d5h3dKc_KhTd4c5d_7c8hQhJh_9h4hTs3h_9c8c4s6c_JsKdJdAh_2h5sQd7s() {
    assertEquals(
      "9c8c4s6c 9h4hTs3h 7c8hQhJh 2d5h3dKc=KhTd4c5d JsKdJdAh 2h5sQd7s 9s3sAc7d",
      Solver.process("omaha-holdem 5c7hAsKsQs 9s3sAc7d 2d5h3dKc KhTd4c5d 7c8hQhJh 9h4hTs3h 9c8c4s6c JsKdJdAh 2h5sQd7s"));
  }

  @Test
  public void test_omaha_holdem_8550_2h6s9sAdKc_2sAhQs5c_5dJdAs5s_Ts6h7dJh_9c6cJs8h_TcKhQc2d_5hJc3cTd_QdKs8cTh_2c7cQh3h() {
    assertEquals(
      "5hJc3cTd 2c7cQh3h Ts6h7dJh QdKs8cTh 5dJdAs5s 9c6cJs8h TcKhQc2d 2sAhQs5c",
      Solver.process("omaha-holdem 2h6s9sAdKc 2sAhQs5c 5dJdAs5s Ts6h7dJh 9c6cJs8h TcKhQc2d 5hJc3cTd QdKs8cTh 2c7cQh3h"));
  }

  @Test
  public void test_omaha_holdem_8551_3s5s7d8sKd_7c4dTs6s_QhAhJd8c_QcJhJc9d() {
    assertEquals(
      "QhAhJd8c QcJhJc9d 7c4dTs6s",
      Solver.process("omaha-holdem 3s5s7d8sKd 7c4dTs6s QhAhJd8c QcJhJc9d"));
  }

  @Test
  public void test_omaha_holdem_8552_3s5h9dJhKc_9cTdTsKs_Ac3d8dQc_AsAdJs4s_6d8c3c2h_Kd6s7s2d() {
    assertEquals(
      "6d8c3c2h Ac3d8dQc Kd6s7s2d AsAdJs4s 9cTdTsKs",
      Solver.process("omaha-holdem 3s5h9dJhKc 9cTdTsKs Ac3d8dQc AsAdJs4s 6d8c3c2h Kd6s7s2d"));
  }

  @Test
  public void test_omaha_holdem_8553_4d5s7c9sJs_Kh8d9h6h_9cJhQcKc() {
    assertEquals(
      "9cJhQcKc Kh8d9h6h",
      Solver.process("omaha-holdem 4d5s7c9sJs Kh8d9h6h 9cJhQcKc"));
  }

  @Test
  public void test_omaha_holdem_8554_4c5sKdQcQd_4s6d3sTc_6h4dAc3c_9hJsKs5c() {
    assertEquals(
      "4s6d3sTc 6h4dAc3c 9hJsKs5c",
      Solver.process("omaha-holdem 4c5sKdQcQd 4s6d3sTc 6h4dAc3c 9hJsKs5c"));
  }

  @Test
  public void test_omaha_holdem_8555_6c7h9dJcKc_QhJsAc8d_3dTd5h5c_TsJh4cAh_QsQc4s2d_AdThKd7s_6h8sKhAs_8h7d7c6d_4h8c2h6s() {
    assertEquals(
      "3dTd5h5c 4h8c2h6s QhJsAc8d=TsJh4cAh QsQc4s2d 6h8sKhAs AdThKd7s 8h7d7c6d",
      Solver.process("omaha-holdem 6c7h9dJcKc QhJsAc8d 3dTd5h5c TsJh4cAh QsQc4s2d AdThKd7s 6h8sKhAs 8h7d7c6d 4h8c2h6s"));
  }

  @Test
  public void test_omaha_holdem_8556_3c8h9hKcQd_7s4cJsAc_5d6c7hTd_6dAh4h2d_Kd3s2cQs_3dKsQc9s_Kh2hQh8d_6h7dJdTs_6sTc4s3h_9c5h5s4d() {
    assertEquals(
      "5d6c7hTd 6dAh4h2d 7s4cJsAc 6sTc4s3h 9c5h5s4d 3dKsQc9s=Kd3s2cQs=Kh2hQh8d 6h7dJdTs",
      Solver.process("omaha-holdem 3c8h9hKcQd 7s4cJsAc 5d6c7hTd 6dAh4h2d Kd3s2cQs 3dKsQc9s Kh2hQh8d 6h7dJdTs 6sTc4s3h 9c5h5s4d"));
  }

  @Test
  public void test_omaha_holdem_8557_2s6c7hJdKs_TdThJs8s_8h7d2c5h_6s6d5s2d_3h7cKh8c_Jc3c4cTc_3s4sQh5d_9s5cKcKd_4d4h7sQc() {
    assertEquals(
      "3s4sQh5d 4d4h7sQc Jc3c4cTc=TdThJs8s 8h7d2c5h 3h7cKh8c 6s6d5s2d 9s5cKcKd",
      Solver.process("omaha-holdem 2s6c7hJdKs TdThJs8s 8h7d2c5h 6s6d5s2d 3h7cKh8c Jc3c4cTc 3s4sQh5d 9s5cKcKd 4d4h7sQc"));
  }

  @Test
  public void test_omaha_holdem_8558_2h2sJdJhKc_5d4c5h9s_3s3d9d7h_Jc4d2dTh() {
    assertEquals(
      "3s3d9d7h 5d4c5h9s Jc4d2dTh",
      Solver.process("omaha-holdem 2h2sJdJhKc 5d4c5h9s 3s3d9d7h Jc4d2dTh"));
  }

  @Test
  public void test_omaha_holdem_8559_6d7s8c9sQh_3sTcQsKs_4c2sKc6h_3c4h4sTd_7c7hJcAd() {
    assertEquals(
      "3c4h4sTd 4c2sKc6h 3sTcQsKs 7c7hJcAd",
      Solver.process("omaha-holdem 6d7s8c9sQh 3sTcQsKs 4c2sKc6h 3c4h4sTd 7c7hJcAd"));
  }

  @Test
  public void test_omaha_holdem_8560_3h5d5h6s8h_Kd6c8s7d_Qd3cQh5c_7c6dAh8c_7sAcKhJd_4s2h4hKs_8dQs2sJs_TsJc9s3s_3d7hQcTh() {
    assertEquals(
      "7sAcKhJd TsJc9s3s 8dQs2sJs 7c6dAh8c=Kd6c8s7d 4s2h4hKs 3d7hQcTh Qd3cQh5c",
      Solver.process("omaha-holdem 3h5d5h6s8h Kd6c8s7d Qd3cQh5c 7c6dAh8c 7sAcKhJd 4s2h4hKs 8dQs2sJs TsJc9s3s 3d7hQcTh"));
  }

  @Test
  public void test_omaha_holdem_8561_2s4d5h7dTh_5s2c5dJs_4h3d3s6h() {
    assertEquals(
      "5s2c5dJs 4h3d3s6h",
      Solver.process("omaha-holdem 2s4d5h7dTh 5s2c5dJs 4h3d3s6h"));
  }

  @Test
  public void test_omaha_holdem_8562_2c5h7cJsQs_4h6s4sAs_8cJd9s2s_9c9dAc8d_4cTdTs8h() {
    assertEquals(
      "4h6s4sAs 9c9dAc8d 4cTdTs8h 8cJd9s2s",
      Solver.process("omaha-holdem 2c5h7cJsQs 4h6s4sAs 8cJd9s2s 9c9dAc8d 4cTdTs8h"));
  }

  @Test
  public void test_omaha_holdem_8563_2d6s7h9cTs_8c5c9d8s_3s8hKs5s_KcJhQh6c_7dJs6d6h_3dTd8d3h() {
    assertEquals(
      "KcJhQh6c 7dJs6d6h 3s8hKs5s 3dTd8d3h=8c5c9d8s",
      Solver.process("omaha-holdem 2d6s7h9cTs 8c5c9d8s 3s8hKs5s KcJhQh6c 7dJs6d6h 3dTd8d3h"));
  }

  @Test
  public void test_omaha_holdem_8564_5c5sKdKhTc_6c4cTd3d_AsKs9d7h_Jh8cQd8d_Ad5h3c2h_9c2sJs9s() {
    assertEquals(
      "Jh8cQd8d 9c2sJs9s 6c4cTd3d Ad5h3c2h AsKs9d7h",
      Solver.process("omaha-holdem 5c5sKdKhTc 6c4cTd3d AsKs9d7h Jh8cQd8d Ad5h3c2h 9c2sJs9s"));
  }

  @Test
  public void test_omaha_holdem_8565_4s7c7s9dAd_5s5h4cQc_Ac2d3hJc_AhJd2h4h_6c5c3dAs_QsKc6h5d_6d9sKh9c() {
    assertEquals(
      "QsKc6h5d 5s5h4cQc 6c5c3dAs Ac2d3hJc=AhJd2h4h 6d9sKh9c",
      Solver.process("omaha-holdem 4s7c7s9dAd 5s5h4cQc Ac2d3hJc AhJd2h4h 6c5c3dAs QsKc6h5d 6d9sKh9c"));
  }

  @Test
  public void test_omaha_holdem_8566_2c7h8sAsQh_Jd6c6dJs_5s4c5cQd() {
    assertEquals(
      "Jd6c6dJs 5s4c5cQd",
      Solver.process("omaha-holdem 2c7h8sAsQh Jd6c6dJs 5s4c5cQd"));
  }

  @Test
  public void test_omaha_holdem_8567_2s3s8d9cAs_QhTsKdJs_QsKh2h6h_4cQcTd8s_Jd4s8hJh_7sTc5hKs_3h7cKc3c_7h5c9s5s_Qd4hAc2d() {
    assertEquals(
      "QsKh2h6h 4cQcTd8s Jd4s8hJh Qd4hAc2d 3h7cKc3c 7h5c9s5s QhTsKdJs 7sTc5hKs",
      Solver.process("omaha-holdem 2s3s8d9cAs QhTsKdJs QsKh2h6h 4cQcTd8s Jd4s8hJh 7sTc5hKs 3h7cKc3c 7h5c9s5s Qd4hAc2d"));
  }

  @Test
  public void test_omaha_holdem_8568_4h8cJsQsTs_4s7c5c6c_AcThJh3s_3h8h8s5d_2dKh9h4c() {
    assertEquals(
      "4s7c5c6c AcThJh3s 3h8h8s5d 2dKh9h4c",
      Solver.process("omaha-holdem 4h8cJsQsTs 4s7c5c6c AcThJh3s 3h8h8s5d 2dKh9h4c"));
  }

  @Test
  public void test_omaha_holdem_8569_3c6hJhJsTd_5hQd4dTh_6d3s9cQh() {
    assertEquals(
      "6d3s9cQh 5hQd4dTh",
      Solver.process("omaha-holdem 3c6hJhJsTd 5hQd4dTh 6d3s9cQh"));
  }

  @Test
  public void test_omaha_holdem_8570_3sAhJcQhTs_Jd3h3d2d_Th8d3cAc_Qc7c2s6h_7d4s9cJs_KcKd5s7s_8hAdKh5h_6c8sQd4d_2h2cTd6d_9sJh4h9d() {
    assertEquals(
      "2h2cTd6d 7d4s9cJs=9sJh4h9d Qc7c2s6h 6c8sQd4d KcKd5s7s Th8d3cAc Jd3h3d2d 8hAdKh5h",
      Solver.process("omaha-holdem 3sAhJcQhTs Jd3h3d2d Th8d3cAc Qc7c2s6h 7d4s9cJs KcKd5s7s 8hAdKh5h 6c8sQd4d 2h2cTd6d 9sJh4h9d"));
  }

  @Test
  public void test_omaha_holdem_8571_5s8cQcQdQh_4h6sAd4s_JcAs2cTh_Js3s9sKc_QsAc9d5h_TdTcJd6h() {
    assertEquals(
      "Js3s9sKc JcAs2cTh 4h6sAd4s TdTcJd6h QsAc9d5h",
      Solver.process("omaha-holdem 5s8cQcQdQh 4h6sAd4s JcAs2cTh Js3s9sKc QsAc9d5h TdTcJd6h"));
  }

  @Test
  public void test_omaha_holdem_8572_2h3d4h4s7h_7cAd9sQd_KhJs2d4d_5h7dJc3s_TsAh6c3c_8sQs5cKc_3h5sKs8d_Kd8c9cTc_Td5d6h2c_QhAs6sQc() {
    assertEquals(
      "Kd8c9cTc 8sQs5cKc 3h5sKs8d TsAh6c3c 5h7dJc3s 7cAd9sQd QhAs6sQc Td5d6h2c KhJs2d4d",
      Solver.process("omaha-holdem 2h3d4h4s7h 7cAd9sQd KhJs2d4d 5h7dJc3s TsAh6c3c 8sQs5cKc 3h5sKs8d Kd8c9cTc Td5d6h2c QhAs6sQc"));
  }

  @Test
  public void test_omaha_holdem_8573_4h7d7hJcTs_Qh7s3c4d_2d2hQsTd_Ac8dKd8c_3h3s4sKc_7c2c8hQc_3d4c2sAs_6cJd8sJs() {
    assertEquals(
      "3h3s4sKc 3d4c2sAs Ac8dKd8c 2d2hQsTd 7c2c8hQc Qh7s3c4d 6cJd8sJs",
      Solver.process("omaha-holdem 4h7d7hJcTs Qh7s3c4d 2d2hQsTd Ac8dKd8c 3h3s4sKc 7c2c8hQc 3d4c2sAs 6cJd8sJs"));
  }

  @Test
  public void test_omaha_holdem_8574_2h3d7dAsTs_Tc7c8cQs_ThKs5sTd_4c3s3c3h_9s6c4d8s_Ad2dQc9h_Jd8h6s9d() {
    assertEquals(
      "9s6c4d8s Jd8h6s9d Tc7c8cQs Ad2dQc9h 4c3s3c3h ThKs5sTd",
      Solver.process("omaha-holdem 2h3d7dAsTs Tc7c8cQs ThKs5sTd 4c3s3c3h 9s6c4d8s Ad2dQc9h Jd8h6s9d"));
  }

  @Test
  public void test_omaha_holdem_8575_7s8d8h9sJd_3h4s5cTs_7h8sAhKc_6c9hKh2s_2h7dAsTd_6sJcQhJh() {
    assertEquals(
      "3h4s5cTs 6c9hKh2s 2h7dAsTd 7h8sAhKc 6sJcQhJh",
      Solver.process("omaha-holdem 7s8d8h9sJd 3h4s5cTs 7h8sAhKc 6c9hKh2s 2h7dAsTd 6sJcQhJh"));
  }

  @Test
  public void test_omaha_holdem_8576_5c6c6dAhKs_4s2hJhKc_3c8s9s9c_2sAs5sKh_Kd7hQcQh_4dAc9h6s() {
    assertEquals(
      "3c8s9s9c 4s2hJhKc Kd7hQcQh 2sAs5sKh 4dAc9h6s",
      Solver.process("omaha-holdem 5c6c6dAhKs 4s2hJhKc 3c8s9s9c 2sAs5sKh Kd7hQcQh 4dAc9h6s"));
  }

  @Test
  public void test_omaha_holdem_8577_2c2s3sAdTc_5sTs8hKh_4cJcTd8c_6c7cAh7d_QcJh4dQh_6d8d4sJs_Jd2h2d7h_As7s8sKs_6s9c3dAc_QdKd3c3h() {
    assertEquals(
      "6d8d4sJs 4cJcTd8c 5sTs8hKh QcJh4dQh 6c7cAh7d As7s8sKs 6s9c3dAc QdKd3c3h Jd2h2d7h",
      Solver.process("omaha-holdem 2c2s3sAdTc 5sTs8hKh 4cJcTd8c 6c7cAh7d QcJh4dQh 6d8d4sJs Jd2h2d7h As7s8sKs 6s9c3dAc QdKd3c3h"));
  }

  @Test
  public void test_omaha_holdem_8578_2d6c6h9sAc_7hJc3s8d_Js2s9d7d_Ah6s2hTd() {
    assertEquals(
      "7hJc3s8d Js2s9d7d Ah6s2hTd",
      Solver.process("omaha-holdem 2d6c6h9sAc 7hJc3s8d Js2s9d7d Ah6s2hTd"));
  }

  @Test
  public void test_omaha_holdem_8579_2c2d9dKcTd_TcTh8sKd_5dAh7sQs() {
    assertEquals(
      "5dAh7sQs TcTh8sKd",
      Solver.process("omaha-holdem 2c2d9dKcTd TcTh8sKd 5dAh7sQs"));
  }

  @Test
  public void test_omaha_holdem_8580_2s3c8sTcTd_9hQdQcAh_6s6hKhAc_7cAs4h4d_5d4s6dQs_TsJs7dJc_5sAd8dTh_Kc9sJh8c_2d9c2h5c_3dKs4cKd() {
    assertEquals(
      "5d4s6dQs 7cAs4h4d 6s6hKhAc Kc9sJh8c 9hQdQcAh 3dKs4cKd TsJs7dJc 2d9c2h5c 5sAd8dTh",
      Solver.process("omaha-holdem 2s3c8sTcTd 9hQdQcAh 6s6hKhAc 7cAs4h4d 5d4s6dQs TsJs7dJc 5sAd8dTh Kc9sJh8c 2d9c2h5c 3dKs4cKd"));
  }

  @Test
  public void test_omaha_holdem_8581_3h5h8dJcQs_4d2c7cKd_7dAh7hKs_9c6cQh6s_As2dQc9s() {
    assertEquals(
      "4d2c7cKd 7dAh7hKs 9c6cQh6s As2dQc9s",
      Solver.process("omaha-holdem 3h5h8dJcQs 4d2c7cKd 7dAh7hKs 9c6cQh6s As2dQc9s"));
  }

  @Test
  public void test_omaha_holdem_8582_2h3c5c7sTc_4c6hTsAc_Ad4sQs3s_3d5sQc4d_2d9dKc7c_Ks8sJdAh_KhKd2cTd_5d5h9hJc_QdJh8hJs_As6c6s4h() {
    assertEquals(
      "Ks8sJdAh QdJh8hJs 3d5sQc4d KhKd2cTd 5d5h9hJc Ad4sQs3s As6c6s4h 2d9dKc7c 4c6hTsAc",
      Solver.process("omaha-holdem 2h3c5c7sTc 4c6hTsAc Ad4sQs3s 3d5sQc4d 2d9dKc7c Ks8sJdAh KhKd2cTd 5d5h9hJc QdJh8hJs As6c6s4h"));
  }

  @Test
  public void test_omaha_holdem_8583_5c9d9hQcTh_KsTc8h2h_Qd7c4d3h_5sTd9cKd_8sQh8c3s_Ah2dKh2c_QsJh6sAc_3cJs4cAd_7s7dKc4s_8d7hJdAs() {
    assertEquals(
      "3cJs4cAd Ah2dKh2c 7s7dKc4s KsTc8h2h Qd7c4d3h 8sQh8c3s QsJh6sAc 8d7hJdAs 5sTd9cKd",
      Solver.process("omaha-holdem 5c9d9hQcTh KsTc8h2h Qd7c4d3h 5sTd9cKd 8sQh8c3s Ah2dKh2c QsJh6sAc 3cJs4cAd 7s7dKc4s 8d7hJdAs"));
  }

  @Test
  public void test_omaha_holdem_8584_4d5h9cJdQs_Ks5dTcJc_2h7c6dTs_7h9s4h3d_Qd8h8dJs() {
    assertEquals(
      "2h7c6dTs 7h9s4h3d Qd8h8dJs Ks5dTcJc",
      Solver.process("omaha-holdem 4d5h9cJdQs Ks5dTcJc 2h7c6dTs 7h9s4h3d Qd8h8dJs"));
  }

  @Test
  public void test_omaha_holdem_8585_4c6c9cKdQs_Kc7d8dTs_7h3dKs2s_Ac2dTdTh_Qd4h2c7s() {
    assertEquals(
      "Ac2dTdTh 7h3dKs2s Kc7d8dTs Qd4h2c7s",
      Solver.process("omaha-holdem 4c6c9cKdQs Kc7d8dTs 7h3dKs2s Ac2dTdTh Qd4h2c7s"));
  }

  @Test
  public void test_omaha_holdem_8586_5d7s9hJhTs_6c3h3d3c_6s8c6h7d_9dAsKc5h_KsTd2cKh_Ad2dJcAh_Kd5cQs7h_Jd2sQh4c_4s7c6d4h() {
    assertEquals(
      "6c3h3d3c 4s7c6d4h Jd2sQh4c KsTd2cKh Ad2dJcAh 9dAsKc5h 6s8c6h7d Kd5cQs7h",
      Solver.process("omaha-holdem 5d7s9hJhTs 6c3h3d3c 6s8c6h7d 9dAsKc5h KsTd2cKh Ad2dJcAh Kd5cQs7h Jd2sQh4c 4s7c6d4h"));
  }

  @Test
  public void test_omaha_holdem_8587_8s9c9hJsKh_7hKcAd6s_Jc6h6d4h_8dQsTs7s_2sAh2h2d_7c3h9dJh_5d5hTc2c_4c3sAsQc_KsKd4dAc() {
    assertEquals(
      "4c3sAsQc 2sAh2h2d 5d5hTc2c Jc6h6d4h 7hKcAd6s 8dQsTs7s 7c3h9dJh KsKd4dAc",
      Solver.process("omaha-holdem 8s9c9hJsKh 7hKcAd6s Jc6h6d4h 8dQsTs7s 2sAh2h2d 7c3h9dJh 5d5hTc2c 4c3sAsQc KsKd4dAc"));
  }

  @Test
  public void test_omaha_holdem_8588_2h5s6s9dAc_Js5dJcQd_4s6d7hJh_Ks2s9h8d() {
    assertEquals(
      "4s6d7hJh Js5dJcQd Ks2s9h8d",
      Solver.process("omaha-holdem 2h5s6s9dAc Js5dJcQd 4s6d7hJh Ks2s9h8d"));
  }

  @Test
  public void test_omaha_holdem_8589_2s8dKcQdQs_5h8hAd7c_4c2hKh7h_Tc2d6hAh_2c8c3hTh_9h3d5c4h() {
    assertEquals(
      "9h3d5c4h Tc2d6hAh 2c8c3hTh 5h8hAd7c 4c2hKh7h",
      Solver.process("omaha-holdem 2s8dKcQdQs 5h8hAd7c 4c2hKh7h Tc2d6hAh 2c8c3hTh 9h3d5c4h"));
  }

  @Test
  public void test_omaha_holdem_8590_2h5c6hJcKs_ThTs7cTc_9d9c8c4s_5sJh7dQh_3dKc4c3s_6sQcQd9s_6d7hAc6c() {
    assertEquals(
      "9d9c8c4s ThTs7cTc 6sQcQd9s 5sJh7dQh 6d7hAc6c 3dKc4c3s",
      Solver.process("omaha-holdem 2h5c6hJcKs ThTs7cTc 9d9c8c4s 5sJh7dQh 3dKc4c3s 6sQcQd9s 6d7hAc6c"));
  }

  @Test
  public void test_omaha_holdem_8591_4h6hAdJdKd_Ks9c8sTd_Ah6d6c7h_2s2c8dJc_Js5h2d6s_9h2h4d3c() {
    assertEquals(
      "9h2h4d3c 2s2c8dJc Ks9c8sTd Js5h2d6s Ah6d6c7h",
      Solver.process("omaha-holdem 4h6hAdJdKd Ks9c8sTd Ah6d6c7h 2s2c8dJc Js5h2d6s 9h2h4d3c"));
  }

  @Test
  public void test_omaha_holdem_8592_3d4h5c8dKd_TsQhJd9s_8cAsKcKh_3cTd6s7h() {
    assertEquals(
      "TsQhJd9s 8cAsKcKh 3cTd6s7h",
      Solver.process("omaha-holdem 3d4h5c8dKd TsQhJd9s 8cAsKcKh 3cTd6s7h"));
  }

  @Test
  public void test_omaha_holdem_8593_2h4s8dKdKh_AdQd8h5d_4c5c6h6c_6d6sJs2d_7d9c7cAc_4h3h7hKs_4dAsQcTc_5s2sAh3c_Jc9hTd9d() {
    assertEquals(
      "5s2sAh3c 4dAsQcTc 4c5c6h6c=6d6sJs2d 7d9c7cAc AdQd8h5d Jc9hTd9d 4h3h7hKs",
      Solver.process("omaha-holdem 2h4s8dKdKh AdQd8h5d 4c5c6h6c 6d6sJs2d 7d9c7cAc 4h3h7hKs 4dAsQcTc 5s2sAh3c Jc9hTd9d"));
  }

  @Test
  public void test_omaha_holdem_8594_5d8c8hKsQc_3h8d7c6c_4c7dQsKd_Kc9dJc6h_5sAs6dJs() {
    assertEquals(
      "5sAs6dJs Kc9dJc6h 4c7dQsKd 3h8d7c6c",
      Solver.process("omaha-holdem 5d8c8hKsQc 3h8d7c6c 4c7dQsKd Kc9dJc6h 5sAs6dJs"));
  }

  @Test
  public void test_omaha_holdem_8595_7d8d8sAsTs_Kd5cQsAc_ThQh7cJs_6cTc4c4h() {
    assertEquals(
      "6cTc4c4h ThQh7cJs Kd5cQsAc",
      Solver.process("omaha-holdem 7d8d8sAsTs Kd5cQsAc ThQh7cJs 6cTc4c4h"));
  }

  @Test
  public void test_omaha_holdem_8596_5c6c8hTdTs_4hThKh6d_KcQs8d2s_9h5d6s7h_6h8sQdAc_5s3h8c9d() {
    assertEquals(
      "5s3h8c9d KcQs8d2s 6h8sQdAc 9h5d6s7h 4hThKh6d",
      Solver.process("omaha-holdem 5c6c8hTdTs 4hThKh6d KcQs8d2s 9h5d6s7h 6h8sQdAc 5s3h8c9d"));
  }

  @Test
  public void test_omaha_holdem_8597_2s5hKhKsQd_AcAs9s7h_Js5s2d4h_5d3c2h9h_6sKc7cTh_6cQsTsJc_Ah4d4s8h_8d6h3s9d_8cTdJd7s() {
    assertEquals(
      "8d6h3s9d 8cTdJd7s Ah4d4s8h 5d3c2h9h Js5s2d4h 6cQsTsJc AcAs9s7h 6sKc7cTh",
      Solver.process("omaha-holdem 2s5hKhKsQd AcAs9s7h Js5s2d4h 5d3c2h9h 6sKc7cTh 6cQsTsJc Ah4d4s8h 8d6h3s9d 8cTdJd7s"));
  }

  @Test
  public void test_omaha_holdem_8598_2c5d9dKhTd_4d4h8sQh_QsTs8dJd_7h6s3d9h_AsTh4s5c_Kd8hQc6c_Jc2dKc3s_3h7cTcQd_8c5s2h5h() {
    assertEquals(
      "4d4h8sQh 7h6s3d9h 3h7cTcQd Kd8hQc6c AsTh4s5c Jc2dKc3s 8c5s2h5h QsTs8dJd",
      Solver.process("omaha-holdem 2c5d9dKhTd 4d4h8sQh QsTs8dJd 7h6s3d9h AsTh4s5c Kd8hQc6c Jc2dKc3s 3h7cTcQd 8c5s2h5h"));
  }

  @Test
  public void test_omaha_holdem_8599_3c3d3h5d5h_QdAc3sQh_Jh9s9hAh() {
    assertEquals(
      "Jh9s9hAh QdAc3sQh",
      Solver.process("omaha-holdem 3c3d3h5d5h QdAc3sQh Jh9s9hAh"));
  }

  @Test
  public void test_omaha_holdem_8600_2c4c8h9hJh_4hQs4s6d_8d7c4dKd_Td7h2hJd_Qd3h5sAd() {
    assertEquals(
      "Qd3h5sAd 8d7c4dKd 4hQs4s6d Td7h2hJd",
      Solver.process("omaha-holdem 2c4c8h9hJh 4hQs4s6d 8d7c4dKd Td7h2hJd Qd3h5sAd"));
  }

  @Test
  public void test_omaha_holdem_8601_2h3c3h3s9c_6dJc7d5h_9hQsAhJs_8hKh2cKd() {
    assertEquals(
      "6dJc7d5h 9hQsAhJs 8hKh2cKd",
      Solver.process("omaha-holdem 2h3c3h3s9c 6dJc7d5h 9hQsAhJs 8hKh2cKd"));
  }

  @Test
  public void test_omaha_holdem_8602_2h3c5h7hAs_Ad8c6h6d_TdJd2c9s_5dJc4s6s_5s3s3h9c_9d5c8dKs_QhAcKh7s() {
    assertEquals(
      "TdJd2c9s 9d5c8dKs Ad8c6h6d 5s3s3h9c 5dJc4s6s QhAcKh7s",
      Solver.process("omaha-holdem 2h3c5h7hAs Ad8c6h6d TdJd2c9s 5dJc4s6s 5s3s3h9c 9d5c8dKs QhAcKh7s"));
  }

  @Test
  public void test_omaha_holdem_8603_2d5s6d9sKh_JhTh5cJd_TdAd8cQc_9dTc4hJs() {
    assertEquals(
      "TdAd8cQc 9dTc4hJs JhTh5cJd",
      Solver.process("omaha-holdem 2d5s6d9sKh JhTh5cJd TdAd8cQc 9dTc4hJs"));
  }

  @Test
  public void test_omaha_holdem_8604_4c4h5s8c8d_6c9cQd2h_TcQcAh8h_3hTd7s5h_JhAc3s2d_QhKdQsTh() {
    assertEquals(
      "6c9cQd2h JhAc3s2d 3hTd7s5h QhKdQsTh TcQcAh8h",
      Solver.process("omaha-holdem 4c4h5s8c8d 6c9cQd2h TcQcAh8h 3hTd7s5h JhAc3s2d QhKdQsTh"));
  }

  @Test
  public void test_omaha_holdem_8605_2s6c8hKdKh_9d4c6s9h_4h3c2dQc_AcAhJdTh() {
    assertEquals(
      "4h3c2dQc 9d4c6s9h AcAhJdTh",
      Solver.process("omaha-holdem 2s6c8hKdKh 9d4c6s9h 4h3c2dQc AcAhJdTh"));
  }

  @Test
  public void test_omaha_holdem_8606_3s4h9hJcKs_7cQc5s8s_4c6cTd8d_5dJs2s7h_QsAs7sQh() {
    assertEquals(
      "7cQc5s8s 4c6cTd8d 5dJs2s7h QsAs7sQh",
      Solver.process("omaha-holdem 3s4h9hJcKs 7cQc5s8s 4c6cTd8d 5dJs2s7h QsAs7sQh"));
  }

  @Test
  public void test_omaha_holdem_8607_4c4s6h9hJd_6s3cJc3d_4h9sTsTd_TcKc8h5s_Qs3s2dKd_2cQd5h2s_3hKh9cQh_Qc5dAdJs_Ac7s4d7d_6cThAhJh() {
    assertEquals(
      "TcKc8h5s Qs3s2dKd 2cQd5h2s 3hKh9cQh Qc5dAdJs 6cThAhJh=6s3cJc3d Ac7s4d7d 4h9sTsTd",
      Solver.process("omaha-holdem 4c4s6h9hJd 6s3cJc3d 4h9sTsTd TcKc8h5s Qs3s2dKd 2cQd5h2s 3hKh9cQh Qc5dAdJs Ac7s4d7d 6cThAhJh"));
  }

  @Test
  public void test_omaha_holdem_8608_2c4cKsQsTc_3cThAdJh_JcTd2s5s_7h9c7s7d_2h5cJs4s_8d2d7cKc() {
    assertEquals(
      "7h9c7s7d 2h5cJs4s JcTd2s5s 3cThAdJh 8d2d7cKc",
      Solver.process("omaha-holdem 2c4cKsQsTc 3cThAdJh JcTd2s5s 7h9c7s7d 2h5cJs4s 8d2d7cKc"));
  }

  @Test
  public void test_omaha_holdem_8609_2s4d8cJsKs_2c4c8dAh_2hTsAd6d_Th6cKd8s_5d4s5sQd_3cAcJc6h_3dJhQhTd() {
    assertEquals(
      "2hTsAd6d 3dJhQhTd 3cAcJc6h 2c4c8dAh Th6cKd8s 5d4s5sQd",
      Solver.process("omaha-holdem 2s4d8cJsKs 2c4c8dAh 2hTsAd6d Th6cKd8s 5d4s5sQd 3cAcJc6h 3dJhQhTd"));
  }

  @Test
  public void test_omaha_holdem_8610_2d7sAcKsQh_5dQs7c7h_5hJh9dKd_Ad7d3d9s_3s8s5s2c_6s3h3cKc_Jc8dJs4s_5c6d4dAs() {
    assertEquals(
      "3s8s5s2c Jc8dJs4s 6s3h3cKc 5hJh9dKd 5c6d4dAs Ad7d3d9s 5dQs7c7h",
      Solver.process("omaha-holdem 2d7sAcKsQh 5dQs7c7h 5hJh9dKd Ad7d3d9s 3s8s5s2c 6s3h3cKc Jc8dJs4s 5c6d4dAs"));
  }

  @Test
  public void test_omaha_holdem_8611_3s8sAhJcJh_As2dKs4c_6c6s6d3c_Th8c4dTc_Ad9c4hTs_4s7s8h9s_QdKd5d5c_QsKh2h5h_Kc5s2c8d() {
    assertEquals(
      "QsKh2h5h QdKd5d5c 6c6s6d3c 4s7s8h9s Kc5s2c8d Th8c4dTc Ad9c4hTs As2dKs4c",
      Solver.process("omaha-holdem 3s8sAhJcJh As2dKs4c 6c6s6d3c Th8c4dTc Ad9c4hTs 4s7s8h9s QdKd5d5c QsKh2h5h Kc5s2c8d"));
  }

  @Test
  public void test_omaha_holdem_8612_2s3d7dJdTd_Kd4cKsAd_6s6d5s8d_4s8c5c7c_Qc5h4dKc_3sThTs4h_2h5d9h7s_8hAc7hJs_Jh6h9cJc_Qh2dQdAs() {
    assertEquals(
      "Qc5h4dKc 4s8c5c7c 2h5d9h7s 8hAc7hJs 3sThTs4h Jh6h9cJc 6s6d5s8d Qh2dQdAs Kd4cKsAd",
      Solver.process("omaha-holdem 2s3d7dJdTd Kd4cKsAd 6s6d5s8d 4s8c5c7c Qc5h4dKc 3sThTs4h 2h5d9h7s 8hAc7hJs Jh6h9cJc Qh2dQdAs"));
  }

  @Test
  public void test_omaha_holdem_8613_5c6h7h9cQs_3d4cKhTc_7sQc9h4s_Ks8c8sAd_AcJh4h6c_3sAhTh7d_8h3h2d3c_7c2sJc2h() {
    assertEquals(
      "8h3h2d3c AcJh4h6c 7c2sJc2h 3sAhTh7d Ks8c8sAd 7sQc9h4s 3d4cKhTc",
      Solver.process("omaha-holdem 5c6h7h9cQs 3d4cKhTc 7sQc9h4s Ks8c8sAd AcJh4h6c 3sAhTh7d 8h3h2d3c 7c2sJc2h"));
  }

  @Test
  public void test_omaha_holdem_8614_5c8hAdJsKs_3h9s5h9c_8cJcQh7d_5dAc9dQs_3cTcKc4s() {
    assertEquals(
      "3h9s5h9c 3cTcKc4s 8cJcQh7d 5dAc9dQs",
      Solver.process("omaha-holdem 5c8hAdJsKs 3h9s5h9c 8cJcQh7d 5dAc9dQs 3cTcKc4s"));
  }

  @Test
  public void test_omaha_holdem_8615_3c6d8hAcKh_9d3s6h7h_2h8d7dAs_2c4c5sKs() {
    assertEquals(
      "2c4c5sKs 9d3s6h7h 2h8d7dAs",
      Solver.process("omaha-holdem 3c6d8hAcKh 9d3s6h7h 2h8d7dAs 2c4c5sKs"));
  }

  @Test
  public void test_omaha_holdem_8616_3h4cQcQsTd_6c7dQd9c_7s9s4dAh_4s4h8cTc_Kh2h5hAd_8h6dKc3s_2c3cAc5d() {
    assertEquals(
      "Kh2h5hAd 8h6dKc3s 2c3cAc5d 7s9s4dAh 6c7dQd9c 4s4h8cTc",
      Solver.process("omaha-holdem 3h4cQcQsTd 6c7dQd9c 7s9s4dAh 4s4h8cTc Kh2h5hAd 8h6dKc3s 2c3cAc5d"));
  }

  @Test
  public void test_omaha_holdem_8617_6s8cKhQsTs_4hTdQc5c_6c3dKc3c_3hKd2s2d() {
    assertEquals(
      "3hKd2s2d 4hTdQc5c 6c3dKc3c",
      Solver.process("omaha-holdem 6s8cKhQsTs 4hTdQc5c 6c3dKc3c 3hKd2s2d"));
  }

  @Test
  public void test_omaha_holdem_8618_2c2s3h4dJh_KdKs8dTc_6hJdQhTd_Ac8sTh9c() {
    assertEquals(
      "Ac8sTh9c 6hJdQhTd KdKs8dTc",
      Solver.process("omaha-holdem 2c2s3h4dJh KdKs8dTc 6hJdQhTd Ac8sTh9c"));
  }

  @Test
  public void test_omaha_holdem_8619_3h3s7s8dQh_5hKc4d3c_5d6dThKd() {
    assertEquals(
      "5d6dThKd 5hKc4d3c",
      Solver.process("omaha-holdem 3h3s7s8dQh 5hKc4d3c 5d6dThKd"));
  }

  @Test
  public void test_omaha_holdem_8620_4d5d5sJhQs_9hThAsQd_4c9dKsAh_2s7cTs6s_4s3c9cTd_8c6hKd3h_7h7s5c8s_Kh9sTc2h_6c4h7dQh_8hJc6dKc() {
    assertEquals(
      "2s7cTs6s 8c6hKd3h Kh9sTc2h 4s3c9cTd 4c9dKsAh 8hJc6dKc 6c4h7dQh 9hThAsQd 7h7s5c8s",
      Solver.process("omaha-holdem 4d5d5sJhQs 9hThAsQd 4c9dKsAh 2s7cTs6s 4s3c9cTd 8c6hKd3h 7h7s5c8s Kh9sTc2h 6c4h7dQh 8hJc6dKc"));
  }

  @Test
  public void test_omaha_holdem_8621_2d3d5hAhJs_6sThAd7d_TcQc9hAc_Ts6d8d9s() {
    assertEquals(
      "Ts6d8d9s 6sThAd7d TcQc9hAc",
      Solver.process("omaha-holdem 2d3d5hAhJs 6sThAd7d TcQc9hAc Ts6d8d9s"));
  }

  @Test
  public void test_omaha_holdem_8622_4c6d7s8hJc_7d4dKs8s_4hQs9cJh_5d8dThQh_9d7h5c5s_QcAc8c2s_2d6h3d2h_KdTsTc3h_9s6c5hJs_As9h3s4s() {
    assertEquals(
      "As9h3s4s 2d6h3d2h QcAc8c2s KdTsTc3h 7d4dKs8s 4hQs9cJh 5d8dThQh 9d7h5c5s=9s6c5hJs",
      Solver.process("omaha-holdem 4c6d7s8hJc 7d4dKs8s 4hQs9cJh 5d8dThQh 9d7h5c5s QcAc8c2s 2d6h3d2h KdTsTc3h 9s6c5hJs As9h3s4s"));
  }

  @Test
  public void test_omaha_holdem_8623_3dAsJdQdTh_5s5h4hKd_Kh2h8sTs_8dJsAc2d_Kc7sTc9c_9sQh7d7h() {
    assertEquals(
      "5s5h4hKd 9sQh7d7h Kc7sTc9c=Kh2h8sTs 8dJsAc2d",
      Solver.process("omaha-holdem 3dAsJdQdTh 5s5h4hKd Kh2h8sTs 8dJsAc2d Kc7sTc9c 9sQh7d7h"));
  }

  @Test
  public void test_omaha_holdem_8624_3h7c9sJcJh_9d5s9h3d_Ad8h8sAh() {
    assertEquals(
      "Ad8h8sAh 9d5s9h3d",
      Solver.process("omaha-holdem 3h7c9sJcJh 9d5s9h3d Ad8h8sAh"));
  }

  @Test
  public void test_omaha_holdem_8625_3c3d4s8cKs_7s2d9s2h_TsJhTd5d_5hJd7hAc_TcQcJs2s_KhAhQdQh_3s5s2c6s() {
    assertEquals(
      "TcQcJs2s 5hJd7hAc 7s2d9s2h TsJhTd5d KhAhQdQh 3s5s2c6s",
      Solver.process("omaha-holdem 3c3d4s8cKs 7s2d9s2h TsJhTd5d 5hJd7hAc TcQcJs2s KhAhQdQh 3s5s2c6s"));
  }

  @Test
  public void test_omaha_holdem_8626_4s5d7dKdTc_8c3cTd9d_Qh9cJcAd_Ts5hTh9s_8d7s2s2c_As4hAh6h() {
    assertEquals(
      "Qh9cJcAd 8d7s2s2c As4hAh6h Ts5hTh9s 8c3cTd9d",
      Solver.process("omaha-holdem 4s5d7dKdTc 8c3cTd9d Qh9cJcAd Ts5hTh9s 8d7s2s2c As4hAh6h"));
  }

  @Test
  public void test_omaha_holdem_8627_2s3h6cAsQc_3s7cKcKh_7h2hThJd_3c5h9dTd_4hAh5d8d() {
    assertEquals(
      "7h2hThJd 3c5h9dTd 3s7cKcKh 4hAh5d8d",
      Solver.process("omaha-holdem 2s3h6cAsQc 3s7cKcKh 7h2hThJd 3c5h9dTd 4hAh5d8d"));
  }

  @Test
  public void test_omaha_holdem_8628_3d4hKdQhTh_3s9dKs6d_7d9s3hJh_JsTc2d6c_Ad5c8hTd_4d2c8d9h_6hKc4cQd_Jd5s8c7c_3c7sAc5h_Jc9c6sAs() {
    assertEquals(
      "Jd5s8c7c 3c7sAc5h 4d2c8d9h JsTc2d6c Ad5c8hTd 3s9dKs6d 6hKc4cQd Jc9c6sAs 7d9s3hJh",
      Solver.process("omaha-holdem 3d4hKdQhTh 3s9dKs6d 7d9s3hJh JsTc2d6c Ad5c8hTd 4d2c8d9h 6hKc4cQd Jd5s8c7c 3c7sAc5h Jc9c6sAs"));
  }

  @Test
  public void test_omaha_holdem_8629_2h4h6s8c9h_6dQcQs5d_3s7d5hTh_JsTd2s2c() {
    assertEquals(
      "6dQcQs5d JsTd2s2c 3s7d5hTh",
      Solver.process("omaha-holdem 2h4h6s8c9h 6dQcQs5d 3s7d5hTh JsTd2s2c"));
  }

  @Test
  public void test_omaha_holdem_8630_4s6d8dJdTd_9h6c3s5c_4h6sJh8s_4dTh7cTs() {
    assertEquals(
      "9h6c3s5c 4h6sJh8s 4dTh7cTs",
      Solver.process("omaha-holdem 4s6d8dJdTd 9h6c3s5c 4h6sJh8s 4dTh7cTs"));
  }

  @Test
  public void test_omaha_holdem_8631_2c4s6c7sAd_2h8h3d6s_9sJsAcAs_9dJc7cTd_6h9cQs2s() {
    assertEquals(
      "9dJc7cTd 2h8h3d6s=6h9cQs2s 9sJsAcAs",
      Solver.process("omaha-holdem 2c4s6c7sAd 2h8h3d6s 9sJsAcAs 9dJc7cTd 6h9cQs2s"));
  }

  @Test
  public void test_omaha_holdem_8632_3h9d9sAdKh_7cQd9c2s_8h9h6d5h_Tc6sAc5s() {
    assertEquals(
      "Tc6sAc5s 8h9h6d5h 7cQd9c2s",
      Solver.process("omaha-holdem 3h9d9sAdKh 7cQd9c2s 8h9h6d5h Tc6sAc5s"));
  }

  @Test
  public void test_omaha_holdem_8633_7hJsQcQdTd_5s8hKd7s_KhTc5h3h_5dAsJh2c_QsTh9h3s_9d6h8s6s_5cKc2h8c_Ts7d8d6d_Ks9c4dJc_3c2dAc4h() {
    assertEquals(
      "5cKc2h8c 3c2dAc4h 5s8hKd7s Ts7d8d6d KhTc5h3h 5dAsJh2c 9d6h8s6s Ks9c4dJc QsTh9h3s",
      Solver.process("omaha-holdem 7hJsQcQdTd 5s8hKd7s KhTc5h3h 5dAsJh2c QsTh9h3s 9d6h8s6s 5cKc2h8c Ts7d8d6d Ks9c4dJc 3c2dAc4h"));
  }

  @Test
  public void test_omaha_holdem_8634_4h6h8cQsTd_7d4sAc9h_6dJs8d7s_JcThTsJd_3d4d7cKh() {
    assertEquals(
      "3d4d7cKh 6dJs8d7s JcThTsJd 7d4sAc9h",
      Solver.process("omaha-holdem 4h6h8cQsTd 7d4sAc9h 6dJs8d7s JcThTsJd 3d4d7cKh"));
  }

  @Test
  public void test_omaha_holdem_8635_3c8s9cAdJs_QsAs6c7h_Qh9d9sKh_JdAc5c3s_6d5hTcTs_4sKd7cTd_2cJc2s9h() {
    assertEquals(
      "6d5hTcTs QsAs6c7h 2cJc2s9h JdAc5c3s Qh9d9sKh 4sKd7cTd",
      Solver.process("omaha-holdem 3c8s9cAdJs QsAs6c7h Qh9d9sKh JdAc5c3s 6d5hTcTs 4sKd7cTd 2cJc2s9h"));
  }

  @Test
  public void test_omaha_holdem_8636_3h5d8dJsQc_9c4h5c5h_Qh4cJc7s_TdJdTh2h_2cQd6c4d_KhJh8cKs_QsAh5sTc_7h3d8s6h() {
    assertEquals(
      "TdJdTh2h 2cQd6c4d 7h3d8s6h KhJh8cKs QsAh5sTc Qh4cJc7s 9c4h5c5h",
      Solver.process("omaha-holdem 3h5d8dJsQc 9c4h5c5h Qh4cJc7s TdJdTh2h 2cQd6c4d KhJh8cKs QsAh5sTc 7h3d8s6h"));
  }

  @Test
  public void test_omaha_holdem_8637_3s6c6d7s8h_ThKh2h4d_7h5c9cJh() {
    assertEquals(
      "ThKh2h4d 7h5c9cJh",
      Solver.process("omaha-holdem 3s6c6d7s8h ThKh2h4d 7h5c9cJh"));
  }

  @Test
  public void test_omaha_holdem_8638_2c5c6c6dKc_AcAdQc6h_7c8sTcQs_9s4h3d5h_2hTsAs9c_8d2s9dJd_4sKhQh3h() {
    assertEquals(
      "8d2s9dJd 2hTsAs9c 4sKhQh3h=9s4h3d5h 7c8sTcQs AcAdQc6h",
      Solver.process("omaha-holdem 2c5c6c6dKc AcAdQc6h 7c8sTcQs 9s4h3d5h 2hTsAs9c 8d2s9dJd 4sKhQh3h"));
  }

  @Test
  public void test_omaha_holdem_8639_2h7c9sJdTd_Qs6cAcTh_8hKh6hJs_3c3h2d4c_JhQhKd7h_As8c6s2c_5h9hAdTc() {
    assertEquals(
      "3c3h2d4c Qs6cAcTh 5h9hAdTc As8c6s2c 8hKh6hJs JhQhKd7h",
      Solver.process("omaha-holdem 2h7c9sJdTd Qs6cAcTh 8hKh6hJs 3c3h2d4c JhQhKd7h As8c6s2c 5h9hAdTc"));
  }

  @Test
  public void test_omaha_holdem_8640_3h4s5h6sAc_3cQd8s6c_4d2sJh4h_TcTs4c3d_Jc2c8hKc() {
    assertEquals(
      "Jc2c8hKc TcTs4c3d 3cQd8s6c 4d2sJh4h",
      Solver.process("omaha-holdem 3h4s5h6sAc 3cQd8s6c 4d2sJh4h TcTs4c3d Jc2c8hKc"));
  }

  @Test
  public void test_omaha_holdem_8641_6d8s9cAdQs_5c6c4sTh_4c9d8hJs_7s6h7cAh_QcKd5sJd_9h9sKhTs_QhQd3c5d_Kc7hAcTc() {
    assertEquals(
      "5c6c4sTh QcKd5sJd 4c9d8hJs 7s6h7cAh 9h9sKhTs QhQd3c5d Kc7hAcTc",
      Solver.process("omaha-holdem 6d8s9cAdQs 5c6c4sTh 4c9d8hJs 7s6h7cAh QcKd5sJd 9h9sKhTs QhQd3c5d Kc7hAcTc"));
  }

  @Test
  public void test_omaha_holdem_8642_8hAhJsQcTd_Ad8d6hKs_8c7dJd4c_KdAsAc2c() {
    assertEquals(
      "8c7dJd4c Ad8d6hKs=KdAsAc2c",
      Solver.process("omaha-holdem 8hAhJsQcTd Ad8d6hKs 8c7dJd4c KdAsAc2c"));
  }

  @Test
  public void test_omaha_holdem_8643_3c3sAdJcKh_8h6c8s4c_4h9c7d9d_4d6h2d2s_8c2cKc9h_6dTc5d4s_8d5hAsKs_QcTd6s7h_7cTsKdJh_2h7sQsAh() {
    assertEquals(
      "6dTc5d4s 4d6h2d2s 8h6c8s4c 4h9c7d9d 8c2cKc9h 7cTsKdJh 2h7sQsAh 8d5hAsKs QcTd6s7h",
      Solver.process("omaha-holdem 3c3sAdJcKh 8h6c8s4c 4h9c7d9d 4d6h2d2s 8c2cKc9h 6dTc5d4s 8d5hAsKs QcTd6s7h 7cTsKdJh 2h7sQsAh"));
  }

  @Test
  public void test_omaha_holdem_8644_2h4s7h8dQs_AhQcJd6d_2s7s5s4c_8s7d5h4d() {
    assertEquals(
      "AhQcJd6d 2s7s5s4c 8s7d5h4d",
      Solver.process("omaha-holdem 2h4s7h8dQs AhQcJd6d 2s7s5s4c 8s7d5h4d"));
  }

  @Test
  public void test_omaha_holdem_8645_6h7hAsJhTd_7c8c9s9h_3h8hJc9d_KsKd5d2d_Ac3cKhKc_6d4s2cQc_3sAd3dTs_5cAh8d5h_Jd8s5sTh_Qs4h4d9c() {
    assertEquals(
      "Qs4h4d9c 6d4s2cQc KsKd5d2d Ac3cKhKc Jd8s5sTh 3sAd3dTs 7c8c9s9h 3h8hJc9d 5cAh8d5h",
      Solver.process("omaha-holdem 6h7hAsJhTd 7c8c9s9h 3h8hJc9d KsKd5d2d Ac3cKhKc 6d4s2cQc 3sAd3dTs 5cAh8d5h Jd8s5sTh Qs4h4d9c"));
  }

  @Test
  public void test_omaha_holdem_8646_2h8hKhKsQd_7c6s3s9d_7d2c3dJh() {
    assertEquals(
      "7c6s3s9d 7d2c3dJh",
      Solver.process("omaha-holdem 2h8hKhKsQd 7c6s3s9d 7d2c3dJh"));
  }

  @Test
  public void test_omaha_holdem_8647_3c6d8sAsKh_Jh5h3d8d_6s3s7sAh_9d8hAdKs_7h7cTcTh() {
    assertEquals(
      "7h7cTcTh Jh5h3d8d 6s3s7sAh 9d8hAdKs",
      Solver.process("omaha-holdem 3c6d8sAsKh Jh5h3d8d 6s3s7sAh 9d8hAdKs 7h7cTcTh"));
  }

  @Test
  public void test_omaha_holdem_8648_3s4d7d7s9h_8cJhQc5d_Js5cKd6s_Th7cJc8d_7hKs2d5h() {
    assertEquals(
      "8cJhQc5d Th7cJc8d 7hKs2d5h Js5cKd6s",
      Solver.process("omaha-holdem 3s4d7d7s9h 8cJhQc5d Js5cKd6s Th7cJc8d 7hKs2d5h"));
  }

  @Test
  public void test_omaha_holdem_8649_2d2s5h7hTs_2cQdTdQs_3h5dAhKs_4h6s3s9h_KhAs7sJh_4sQh9s5s() {
    assertEquals(
      "4h6s3s9h 4sQh9s5s 3h5dAhKs KhAs7sJh 2cQdTdQs",
      Solver.process("omaha-holdem 2d2s5h7hTs 2cQdTdQs 3h5dAhKs 4h6s3s9h KhAs7sJh 4sQh9s5s"));
  }

  @Test
  public void test_omaha_holdem_8650_7d9hJdJhQd_QcKc8s4s_JsAc5c7c_4cTs2s5s_8h6c6s6h_2d4h3dTd() {
    assertEquals(
      "4cTs2s5s 8h6c6s6h QcKc8s4s 2d4h3dTd JsAc5c7c",
      Solver.process("omaha-holdem 7d9hJdJhQd QcKc8s4s JsAc5c7c 4cTs2s5s 8h6c6s6h 2d4h3dTd"));
  }

  @Test
  public void test_omaha_holdem_8651_3h4c7cAdJd_QsKs2h8d_3dJc9d4s_8cTd4h3c_5s5c2c9c_Js2d7s5d_2s8sJh3s_KdQcAhTs() {
    assertEquals(
      "QsKs2h8d KdQcAhTs 8cTd4h3c 2s8sJh3s 3dJc9d4s 5s5c2c9c=Js2d7s5d",
      Solver.process("omaha-holdem 3h4c7cAdJd QsKs2h8d 3dJc9d4s 8cTd4h3c 5s5c2c9c Js2d7s5d 2s8sJh3s KdQcAhTs"));
  }

  @Test
  public void test_omaha_holdem_8652_2dAsKdQsTh_3h7d9dTd_Ad8sTsAc_7sJd9hKc_4h7hKs6c() {
    assertEquals(
      "3h7d9dTd 4h7hKs6c Ad8sTsAc 7sJd9hKc",
      Solver.process("omaha-holdem 2dAsKdQsTh 3h7d9dTd Ad8sTsAc 7sJd9hKc 4h7hKs6c"));
  }

  @Test
  public void test_omaha_holdem_8653_2h2s3c7hTd_5sKh6cQs_Ah3d8d4s_Qh4hTs5c_4dKd6hKc_3h6d8hQc_As9s8sJc_9cAcTcJd_KsAdJh3s() {
    assertEquals(
      "5sKh6cQs As9s8sJc 3h6d8hQc Ah3d8d4s=KsAdJh3s Qh4hTs5c 9cAcTcJd 4dKd6hKc",
      Solver.process("omaha-holdem 2h2s3c7hTd 5sKh6cQs Ah3d8d4s Qh4hTs5c 4dKd6hKc 3h6d8hQc As9s8sJc 9cAcTcJd KsAdJh3s"));
  }

  @Test
  public void test_omaha_holdem_8654_2h3h4c6s8c_5h3c5s2c_Ts5cKdQd() {
    assertEquals(
      "Ts5cKdQd 5h3c5s2c",
      Solver.process("omaha-holdem 2h3h4c6s8c 5h3c5s2c Ts5cKdQd"));
  }

  @Test
  public void test_omaha_holdem_8655_2h4s7hAhTc_9hQcKh5d_AsTs9sKs_5s9dAdAc_5cQs7sQd_7c5h9c2s_JdJh6d8d_8sJcJs3s() {
    assertEquals(
      "8sJcJs3s=JdJh6d8d 5cQs7sQd 7c5h9c2s AsTs9sKs 5s9dAdAc 9hQcKh5d",
      Solver.process("omaha-holdem 2h4s7hAhTc 9hQcKh5d AsTs9sKs 5s9dAdAc 5cQs7sQd 7c5h9c2s JdJh6d8d 8sJcJs3s"));
  }

  @Test
  public void test_omaha_holdem_8656_2d2s5h9cJs_7h4dQsAs_KdQc5cAh_Qh7d3hJd_7c4c7sTh_3cKh9s6d_4s6s6hAc_Tc8c8h6c_TdJcJh9d_9hKcQd3d() {
    assertEquals(
      "7h4dQsAs KdQc5cAh 4s6s6hAc 7c4c7sTh Tc8c8h6c 3cKh9s6d=9hKcQd3d Qh7d3hJd TdJcJh9d",
      Solver.process("omaha-holdem 2d2s5h9cJs 7h4dQsAs KdQc5cAh Qh7d3hJd 7c4c7sTh 3cKh9s6d 4s6s6hAc Tc8c8h6c TdJcJh9d 9hKcQd3d"));
  }

  @Test
  public void test_omaha_holdem_8657_4h7dAdKdKs_Kh7h8dQs_Js4s9d7s_As5s5c8h_9cQcJd6d_2d8sTh3s_6hKc5h6s_Ac4c9hAh_2hTsTcTd() {
    assertEquals(
      "2d8sTh3s Js4s9d7s 2hTsTcTd As5s5c8h 6hKc5h6s 9cQcJd6d Kh7h8dQs Ac4c9hAh",
      Solver.process("omaha-holdem 4h7dAdKdKs Kh7h8dQs Js4s9d7s As5s5c8h 9cQcJd6d 2d8sTh3s 6hKc5h6s Ac4c9hAh 2hTsTcTd"));
  }

  @Test
  public void test_omaha_holdem_8658_2s5d6c9cTc_4c8dQc5c_7d5s6dAs_4s8c6s8s_3sKcTsKs_JcTdTh3c() {
    assertEquals(
      "4s8c6s8s 3sKcTsKs 7d5s6dAs JcTdTh3c 4c8dQc5c",
      Solver.process("omaha-holdem 2s5d6c9cTc 4c8dQc5c 7d5s6dAs 4s8c6s8s 3sKcTsKs JcTdTh3c"));
  }

  @Test
  public void test_omaha_holdem_8659_2h5c7h9hJh_Kd4c2s3s_4s4hAcKc_3hQcKhJc_Tc9d5dJd_6s8c7cJs_8d4d3cQh_9s2d6hTd() {
    assertEquals(
      "8d4d3cQh Kd4c2s3s 4s4hAcKc 9s2d6hTd Tc9d5dJd 6s8c7cJs 3hQcKhJc",
      Solver.process("omaha-holdem 2h5c7h9hJh Kd4c2s3s 4s4hAcKc 3hQcKhJc Tc9d5dJd 6s8c7cJs 8d4d3cQh 9s2d6hTd"));
  }

  @Test
  public void test_omaha_holdem_8660_3c3sJdQcTd_8c2s5s7h_Qs7sKs2c() {
    assertEquals(
      "8c2s5s7h Qs7sKs2c",
      Solver.process("omaha-holdem 3c3sJdQcTd 8c2s5s7h Qs7sKs2c"));
  }

  @Test
  public void test_omaha_holdem_8661_8cAcAdAhQs_2h7c2s6s_Kh5dQdJh_9h6d3sJd_9cJcKdKs_8s5c5h9d() {
    assertEquals(
      "9h6d3sJd Kh5dQdJh 2h7c2s6s 8s5c5h9d 9cJcKdKs",
      Solver.process("omaha-holdem 8cAcAdAhQs 2h7c2s6s Kh5dQdJh 9h6d3sJd 9cJcKdKs 8s5c5h9d"));
  }

  @Test
  public void test_omaha_holdem_8662_5d6d7c7sAd_4s8dKc7d_Jd3dAsJc_Qh4hAh8c_5s3c6h6c_5h3h3s4c_9h8h2sTh_Ac6s9dTd_9sTsKd8s() {
    assertEquals(
      "5h3h3s4c Qh4hAh8c 9h8h2sTh=9sTsKd8s 4s8dKc7d Ac6s9dTd Jd3dAsJc 5s3c6h6c",
      Solver.process("omaha-holdem 5d6d7c7sAd 4s8dKc7d Jd3dAsJc Qh4hAh8c 5s3c6h6c 5h3h3s4c 9h8h2sTh Ac6s9dTd 9sTsKd8s"));
  }

  @Test
  public void test_omaha_holdem_8663_2d5h5s8cQd_Th6d6s9d_3hTs3c7h_Qh2s6hAh_Jc8s7sAc_8h2h9s7c_QcAd2c8d_4dKhTcAs() {
    assertEquals(
      "4dKhTcAs 3hTs3c7h Th6d6s9d 8h2h9s7c Jc8s7sAc Qh2s6hAh QcAd2c8d",
      Solver.process("omaha-holdem 2d5h5s8cQd Th6d6s9d 3hTs3c7h Qh2s6hAh Jc8s7sAc 8h2h9s7c QcAd2c8d 4dKhTcAs"));
  }

  @Test
  public void test_omaha_holdem_8664_7d8d9sAdJc_5c2sQh9h_4c5hKs7h_9cQdKc4h_3dJhQsAc() {
    assertEquals(
      "4c5hKs7h 5c2sQh9h 9cQdKc4h 3dJhQsAc",
      Solver.process("omaha-holdem 7d8d9sAdJc 5c2sQh9h 4c5hKs7h 9cQdKc4h 3dJhQsAc"));
  }

  @Test
  public void test_omaha_holdem_8665_2c4h5cKhQh_3c3s6sAs_9sAc4s2h_QcJd2dTc_8d7dTd4d_5h3d8s7h_7cTsAh7s_6hThJsJc() {
    assertEquals(
      "8d7dTd4d 7cTsAh7s 9sAc4s2h QcJd2dTc 3c3s6sAs 5h3d8s7h 6hThJsJc",
      Solver.process("omaha-holdem 2c4h5cKhQh 3c3s6sAs 9sAc4s2h QcJd2dTc 8d7dTd4d 5h3d8s7h 7cTsAh7s 6hThJsJc"));
  }

  @Test
  public void test_omaha_holdem_8666_5c8c8hJdQs_Th5dKcAd_Js6c7c4h_4c6sKs9s_2cTd8sKh_4sJc2s6d_3d8d5hTc() {
    assertEquals(
      "4c6sKs9s Th5dKcAd 4sJc2s6d Js6c7c4h 2cTd8sKh 3d8d5hTc",
      Solver.process("omaha-holdem 5c8c8hJdQs Th5dKcAd Js6c7c4h 4c6sKs9s 2cTd8sKh 4sJc2s6d 3d8d5hTc"));
  }

  @Test
  public void test_omaha_holdem_8667_5h8hJhKhQs_5d8d7cJd_3s9h2s6d_7hTh4sKs_Kd3dKc8s_QcJs7s2d_4c2cAh2h_Qh9d8c7d_5s9c4h6s() {
    assertEquals(
      "3s9h2s6d 5s9c4h6s 5d8d7cJd Qh9d8c7d QcJs7s2d Kd3dKc8s 7hTh4sKs 4c2cAh2h",
      Solver.process("omaha-holdem 5h8hJhKhQs 5d8d7cJd 3s9h2s6d 7hTh4sKs Kd3dKc8s QcJs7s2d 4c2cAh2h Qh9d8c7d 5s9c4h6s"));
  }

  @Test
  public void test_omaha_holdem_8668_2h6c7hTcTh_QdKc6s5d_3cJh4s2s_9d9cJcKh_Qs9h8s2c_AcAd5h9s_2dAs8c3d_6hJd7c5c_6dKs7s8d_Js4h5s3s() {
    assertEquals(
      "Js4h5s3s 3cJh4s2s 2dAs8c3d QdKc6s5d 6hJd7c5c 6dKs7s8d 9d9cJcKh AcAd5h9s Qs9h8s2c",
      Solver.process("omaha-holdem 2h6c7hTcTh QdKc6s5d 3cJh4s2s 9d9cJcKh Qs9h8s2c AcAd5h9s 2dAs8c3d 6hJd7c5c 6dKs7s8d Js4h5s3s"));
  }

  @Test
  public void test_omaha_holdem_8669_5c6h7h9sKc_4d2h2sTh_5d5h4cKd_4hKs8sAs() {
    assertEquals(
      "4d2h2sTh 5d5h4cKd 4hKs8sAs",
      Solver.process("omaha-holdem 5c6h7h9sKc 4d2h2sTh 5d5h4cKd 4hKs8sAs"));
  }

  @Test
  public void test_omaha_holdem_8670_2d4c5h6cJh_9h9c3c5s_JdKh8cKs() {
    assertEquals(
      "JdKh8cKs 9h9c3c5s",
      Solver.process("omaha-holdem 2d4c5h6cJh 9h9c3c5s JdKh8cKs"));
  }

  @Test
  public void test_omaha_holdem_8671_3d3h5c6cAh_8d9dQd6s_Tc5dKs4h_8c6d4cQc_KcJs5h3s_ThTs9cTd() {
    assertEquals(
      "Tc5dKs4h 8c6d4cQc=8d9dQd6s ThTs9cTd KcJs5h3s",
      Solver.process("omaha-holdem 3d3h5c6cAh 8d9dQd6s Tc5dKs4h 8c6d4cQc KcJs5h3s ThTs9cTd"));
  }

  @Test
  public void test_omaha_holdem_8672_4s6h7s8s9s_3sJsAhTc_3hQh8c4h_7c5s2cKd_2d9d9c4d_Qd6c7hQc_JhKh9hTh_2s3cJdTs() {
    assertEquals(
      "Qd6c7hQc 3hQh8c4h 2d9d9c4d 7c5s2cKd JhKh9hTh 2s3cJdTs 3sJsAhTc",
      Solver.process("omaha-holdem 4s6h7s8s9s 3sJsAhTc 3hQh8c4h 7c5s2cKd 2d9d9c4d Qd6c7hQc JhKh9hTh 2s3cJdTs"));
  }

  @Test
  public void test_omaha_holdem_8673_2s5c7c8sTc_KdTd6h4s_Ah8d2h3h_9c3dAcQc_9s5d5h4d_Qd2cKsJs_6d6s7hJd_7d5sAdKh_4c9hAs2d_7sTh8cQh() {
    assertEquals(
      "Qd2cKsJs 4c9hAs2d 6d6s7hJd 7d5sAdKh Ah8d2h3h 7sTh8cQh 9s5d5h4d KdTd6h4s 9c3dAcQc",
      Solver.process("omaha-holdem 2s5c7c8sTc KdTd6h4s Ah8d2h3h 9c3dAcQc 9s5d5h4d Qd2cKsJs 6d6s7hJd 7d5sAdKh 4c9hAs2d 7sTh8cQh"));
  }

  @Test
  public void test_omaha_holdem_8674_2d3d3s4hKh_9sTs2sJh_5cAd4c2c() {
    assertEquals(
      "9sTs2sJh 5cAd4c2c",
      Solver.process("omaha-holdem 2d3d3s4hKh 9sTs2sJh 5cAd4c2c"));
  }

  @Test
  public void test_omaha_holdem_8675_5c5h8hKdKs_AhJhAs3h_Ac7sKcKh_Td3c2s5d_8sTsJs6h_4c7h9h9c_Qh9d6dTh() {
    assertEquals(
      "Qh9d6dTh 8sTsJs6h 4c7h9h9c AhJhAs3h Td3c2s5d Ac7sKcKh",
      Solver.process("omaha-holdem 5c5h8hKdKs AhJhAs3h Ac7sKcKh Td3c2s5d 8sTsJs6h 4c7h9h9c Qh9d6dTh"));
  }

  @Test
  public void test_omaha_holdem_8676_2d2h3d9hQc_Qs6c7h4d_5c5d8dTh_2c8s3cTc_9cQdJh8h_Ad3s6h7c_6d5h7s4c_3h5s9dJd_AcTdAhJc() {
    assertEquals(
      "6d5h7s4c Ad3s6h7c 5c5d8dTh 3h5s9dJd Qs6c7h4d 9cQdJh8h AcTdAhJc 2c8s3cTc",
      Solver.process("omaha-holdem 2d2h3d9hQc Qs6c7h4d 5c5d8dTh 2c8s3cTc 9cQdJh8h Ad3s6h7c 6d5h7s4c 3h5s9dJd AcTdAhJc"));
  }

  @Test
  public void test_omaha_holdem_8677_4s7c9cQcQs_Qh2d5d4h_9dAh5hKd_KhKcJh8s_Qd7d6hTd_2c3c4d3d() {
    assertEquals(
      "9dAh5hKd KhKcJh8s 2c3c4d3d Qh2d5d4h Qd7d6hTd",
      Solver.process("omaha-holdem 4s7c9cQcQs Qh2d5d4h 9dAh5hKd KhKcJh8s Qd7d6hTd 2c3c4d3d"));
  }

  @Test
  public void test_omaha_holdem_8678_2h2s4c6dKh_9s8d4sAc_Kc3h2cTh_3c8h5s5h_6cJcJd7h_5dQs7sQc_9d3d2d9h_4hAh3sQh() {
    assertEquals(
      "4hAh3sQh=9s8d4sAc 6cJcJd7h 5dQs7sQc 9d3d2d9h 3c8h5s5h Kc3h2cTh",
      Solver.process("omaha-holdem 2h2s4c6dKh 9s8d4sAc Kc3h2cTh 3c8h5s5h 6cJcJd7h 5dQs7sQc 9d3d2d9h 4hAh3sQh"));
  }

  @Test
  public void test_omaha_holdem_8679_3d3s5cAhTd_4hQsTsQd_7sAd2c8s() {
    assertEquals(
      "4hQsTsQd 7sAd2c8s",
      Solver.process("omaha-holdem 3d3s5cAhTd 4hQsTsQd 7sAd2c8s"));
  }

  @Test
  public void test_omaha_holdem_8680_2s3d5cJhTd_2cAcTs9c_6cAh8c4s_3h2hKsQd_5s5hTc9d_6dQc7h8h() {
    assertEquals(
      "6dQc7h8h 3h2hKsQd 2cAcTs9c 5s5hTc9d 6cAh8c4s",
      Solver.process("omaha-holdem 2s3d5cJhTd 2cAcTs9c 6cAh8c4s 3h2hKsQd 5s5hTc9d 6dQc7h8h"));
  }

  @Test
  public void test_omaha_holdem_8681_2d5h5s6dJs_4cQdAd9s_6c8c9d7h_Qc4sTdKc_Ts2hKdTh_As3d9h7s_Ks2sAh6h() {
    assertEquals(
      "Qc4sTdKc As3d9h7s 4cQdAd9s 6c8c9d7h Ks2sAh6h Ts2hKdTh",
      Solver.process("omaha-holdem 2d5h5s6dJs 4cQdAd9s 6c8c9d7h Qc4sTdKc Ts2hKdTh As3d9h7s Ks2sAh6h"));
  }

  @Test
  public void test_omaha_holdem_8682_2d5s8c8dJh_8hKdQs5d_QhKsQc3h_9d9h6sTd_7h7d6c7c() {
    assertEquals(
      "7h7d6c7c 9d9h6sTd QhKsQc3h 8hKdQs5d",
      Solver.process("omaha-holdem 2d5s8c8dJh 8hKdQs5d QhKsQc3h 9d9h6sTd 7h7d6c7c"));
  }

  @Test
  public void test_omaha_holdem_8683_2c8hJcJdQc_Js7cKh4c_7s2h9d3c_9c8dTd9s_Jh4sTh7h() {
    assertEquals(
      "7s2h9d3c Jh4sTh7h 9c8dTd9s Js7cKh4c",
      Solver.process("omaha-holdem 2c8hJcJdQc Js7cKh4c 7s2h9d3c 9c8dTd9s Jh4sTh7h"));
  }

  @Test
  public void test_omaha_holdem_8684_5h9dAcJcKs_Ad5sKdJd_5dQc2d6c() {
    assertEquals(
      "5dQc2d6c Ad5sKdJd",
      Solver.process("omaha-holdem 5h9dAcJcKs Ad5sKdJd 5dQc2d6c"));
  }

  @Test
  public void test_omaha_holdem_8685_2c3h4c8cQd_5s9c7h6c_2s4s9d7c_3dTh4dQc_9h8dAs5h_TsJh6dTd_8sAd9sKc_KsKd2d5d_2h6hQs8h_Jd6sAh5c() {
    assertEquals(
      "8sAd9sKc TsJh6dTd KsKd2d5d 2s4s9d7c 3dTh4dQc 2h6hQs8h 9h8dAs5h Jd6sAh5c 5s9c7h6c",
      Solver.process("omaha-holdem 2c3h4c8cQd 5s9c7h6c 2s4s9d7c 3dTh4dQc 9h8dAs5h TsJh6dTd 8sAd9sKc KsKd2d5d 2h6hQs8h Jd6sAh5c"));
  }

  @Test
  public void test_omaha_holdem_8686_4d6c6dAcAh_5s7hTd8h_Qc2cTh3s_Ts9h6h9s_Qh2d7c5h_8sQsJd8c() {
    assertEquals(
      "5s7hTd8h Qh2d7c5h Qc2cTh3s 8sQsJd8c Ts9h6h9s",
      Solver.process("omaha-holdem 4d6c6dAcAh 5s7hTd8h Qc2cTh3s Ts9h6h9s Qh2d7c5h 8sQsJd8c"));
  }

  @Test
  public void test_omaha_holdem_8687_5c6d9dAsQc_3sQhAd7c_7h5sKc4h_Jc6hKd3c_Qs5dAh7d() {
    assertEquals(
      "7h5sKc4h Jc6hKd3c 3sQhAd7c=Qs5dAh7d",
      Solver.process("omaha-holdem 5c6d9dAsQc 3sQhAd7c 7h5sKc4h Jc6hKd3c Qs5dAh7d"));
  }

  @Test
  public void test_omaha_holdem_8688_5h7c8hKdQh_AdAh3s2c_Ts9s4s4h_5cKs8d2s_6dJd9dQd_7d9c6cQs_TdAc3hTh_Kh3d4dQc_6sKc5s2h() {
    assertEquals(
      "Ts9s4s4h AdAh3s2c 6sKc5s2h 5cKs8d2s Kh3d4dQc 6dJd9dQd=7d9c6cQs TdAc3hTh",
      Solver.process("omaha-holdem 5h7c8hKdQh AdAh3s2c Ts9s4s4h 5cKs8d2s 6dJd9dQd 7d9c6cQs TdAc3hTh Kh3d4dQc 6sKc5s2h"));
  }

  @Test
  public void test_omaha_holdem_8689_2h7c8cAcAh_7s7d5sAs_8h4s4c4h_3dTs6sQh_ThAdTcJs_6d7h4d3s() {
    assertEquals(
      "3dTs6sQh 6d7h4d3s 8h4s4c4h ThAdTcJs 7s7d5sAs",
      Solver.process("omaha-holdem 2h7c8cAcAh 7s7d5sAs 8h4s4c4h 3dTs6sQh ThAdTcJs 6d7h4d3s"));
  }

  @Test
  public void test_omaha_holdem_8690_2h2s7c7d9s_Jh5dJd8s_5c9hQdAh() {
    assertEquals(
      "5c9hQdAh Jh5dJd8s",
      Solver.process("omaha-holdem 2h2s7c7d9s Jh5dJd8s 5c9hQdAh"));
  }

  @Test
  public void test_omaha_holdem_8691_2s6c9dAcAs_4s8sKc2h_3sJd9c4d_5hQd8h4c_Qh4h5c8d_5sJh7dTd_9sKh2d7c() {
    assertEquals(
      "5sJh7dTd 5hQd8h4c=Qh4h5c8d 4s8sKc2h 3sJd9c4d 9sKh2d7c",
      Solver.process("omaha-holdem 2s6c9dAcAs 4s8sKc2h 3sJd9c4d 5hQd8h4c Qh4h5c8d 5sJh7dTd 9sKh2d7c"));
  }

  @Test
  public void test_omaha_holdem_8692_6sAcJsKcTh_Qc4h2s3c_2cAh5d6d_2dQs3dTc_4s8sJdQh_Td8h4d5c_7s7c5sQd_7d8cTs7h_9s2h3s5h() {
    assertEquals(
      "9s2h3s5h Qc4h2s3c 7s7c5sQd 7d8cTs7h=Td8h4d5c 2cAh5d6d 2dQs3dTc=4s8sJdQh",
      Solver.process("omaha-holdem 6sAcJsKcTh Qc4h2s3c 2cAh5d6d 2dQs3dTc 4s8sJdQh Td8h4d5c 7s7c5sQd 7d8cTs7h 9s2h3s5h"));
  }

  @Test
  public void test_omaha_holdem_8693_5s6s7cAhTd_JsKc4dJh_QhTh7s8h_QdKh8d3c() {
    assertEquals(
      "QdKh8d3c JsKc4dJh QhTh7s8h",
      Solver.process("omaha-holdem 5s6s7cAhTd JsKc4dJh QhTh7s8h QdKh8d3c"));
  }

  @Test
  public void test_omaha_holdem_8694_2h3s4cQdQs_6d6sTs3d_AcQc4s3h_5h7cTc4d_6h8hJs6c_TdKhKc5c_As5s2c9c_Jd7d9s5d_8sThAdQh_8c7s2sJc() {
    assertEquals(
      "Jd7d9s5d 8c7s2sJc 5h7cTc4d 6d6sTs3d=6h8hJs6c TdKhKc5c 8sThAdQh As5s2c9c AcQc4s3h",
      Solver.process("omaha-holdem 2h3s4cQdQs 6d6sTs3d AcQc4s3h 5h7cTc4d 6h8hJs6c TdKhKc5c As5s2c9c Jd7d9s5d 8sThAdQh 8c7s2sJc"));
  }

  @Test
  public void test_omaha_holdem_8695_5d6h6sJdQh_5s3sKsQd_7c4h9c6d_7s4d7d9d_9s3d3c8h() {
    assertEquals(
      "9s3d3c8h 7s4d7d9d 5s3sKsQd 7c4h9c6d",
      Solver.process("omaha-holdem 5d6h6sJdQh 5s3sKsQd 7c4h9c6d 7s4d7d9d 9s3d3c8h"));
  }

  @Test
  public void test_omaha_holdem_8696_9hAhJsKsQc_Jh4h7s4d_4s9s5d3d_Kc3h6hTh_5hTdAd5c_7cQdKd4c_7d2h9c3c_Jc2d9d5s() {
    assertEquals(
      "4s9s5d3d 7d2h9c3c Jh4h7s4d Jc2d9d5s 7cQdKd4c 5hTdAd5c=Kc3h6hTh",
      Solver.process("omaha-holdem 9hAhJsKsQc Jh4h7s4d 4s9s5d3d Kc3h6hTh 5hTdAd5c 7cQdKd4c 7d2h9c3c Jc2d9d5s"));
  }

  @Test
  public void test_omaha_holdem_8697_2d6c7d8c8d_Js5cTs9c_9d5sJc4d_8s3d6sQh_2h4sQc4c_2sKcTd3h_As7h6d9s_Jd9hQsTc_Ah7sAcKd_3s8h2cKs() {
    assertEquals(
      "2sKcTd3h 2h4sQc4c As7h6d9s Ah7sAcKd Jd9hQsTc=Js5cTs9c 9d5sJc4d 3s8h2cKs 8s3d6sQh",
      Solver.process("omaha-holdem 2d6c7d8c8d Js5cTs9c 9d5sJc4d 8s3d6sQh 2h4sQc4c 2sKcTd3h As7h6d9s Jd9hQsTc Ah7sAcKd 3s8h2cKs"));
  }

  @Test
  public void test_omaha_holdem_8698_3s7s9sJdQs_Qc2c5h7c_KhKsKdJs_8hQd4s9d_7hJhQh4h_9h3h6s6d() {
    assertEquals(
      "9h3h6s6d Qc2c5h7c 8hQd4s9d 7hJhQh4h KhKsKdJs",
      Solver.process("omaha-holdem 3s7s9sJdQs Qc2c5h7c KhKsKdJs 8hQd4s9d 7hJhQh4h 9h3h6s6d"));
  }

  @Test
  public void test_omaha_holdem_8699_2d2h4h5cKh_QcTs9hTd_Qs3d5s7c_AcKd8sAd_QhThQd4d() {
    assertEquals(
      "Qs3d5s7c QcTs9hTd AcKd8sAd QhThQd4d",
      Solver.process("omaha-holdem 2d2h4h5cKh QcTs9hTd Qs3d5s7c AcKd8sAd QhThQd4d"));
  }

  @Test
  public void test_omaha_holdem_8700_4cAcJhKdQc_2dQs4s7c_8s5s6cKh_TdTcAhKs_2c8hJs8c_As9c5d2s_4hJd8d3s_QdAd7h2h_Jc6d4d3d() {
    assertEquals(
      "8s5s6cKh As9c5d2s 4hJd8d3s=Jc6d4d3d 2dQs4s7c QdAd7h2h TdTcAhKs 2c8hJs8c",
      Solver.process("omaha-holdem 4cAcJhKdQc 2dQs4s7c 8s5s6cKh TdTcAhKs 2c8hJs8c As9c5d2s 4hJd8d3s QdAd7h2h Jc6d4d3d"));
  }

  @Test
  public void test_omaha_holdem_8701_3c5h7dQcTs_JdAc4s7h_4hKcQhTd_3s9s5c9h_Ad9c9dJh_Ks6sKd8s_Jc4c2s5d_Th6hKhAs_Js7c3d7s_2cTcQdAh() {
    assertEquals(
      "Jc4c2s5d JdAc4s7h Ad9c9dJh Th6hKhAs Ks6sKd8s 3s9s5c9h 2cTcQdAh=4hKcQhTd Js7c3d7s",
      Solver.process("omaha-holdem 3c5h7dQcTs JdAc4s7h 4hKcQhTd 3s9s5c9h Ad9c9dJh Ks6sKd8s Jc4c2s5d Th6hKhAs Js7c3d7s 2cTcQdAh"));
  }

  @Test
  public void test_omaha_holdem_8702_2c5dJcJdTs_2hAc8sQh_4s7cQd8c_Kc9sAhJh_3cJs6s5s_9h3d5cAd_4cKsQs5h_6d6c4hTc_As3hTh9c_8h8d2d4d() {
    assertEquals(
      "4s7cQd8c 2hAc8sQh 4cKsQs5h 9h3d5cAd 8h8d2d4d 6d6c4hTc As3hTh9c Kc9sAhJh 3cJs6s5s",
      Solver.process("omaha-holdem 2c5dJcJdTs 2hAc8sQh 4s7cQd8c Kc9sAhJh 3cJs6s5s 9h3d5cAd 4cKsQs5h 6d6c4hTc As3hTh9c 8h8d2d4d"));
  }

  @Test
  public void test_omaha_holdem_8703_2d2s3h4h5s_As9dTcJc_JhKc2cAd_Js3s8sAh() {
    assertEquals(
      "As9dTcJc JhKc2cAd=Js3s8sAh",
      Solver.process("omaha-holdem 2d2s3h4h5s As9dTcJc JhKc2cAd Js3s8sAh"));
  }

  @Test
  public void test_omaha_holdem_8704_6h9cAhJsQd_4c7hTsKc_3s2d5hQh_3c3h6s4d_JdTdAc9d_6c2s9s4h_9h8dJc8h() {
    assertEquals(
      "3c3h6s4d 3s2d5hQh 6c2s9s4h 9h8dJc8h JdTdAc9d 4c7hTsKc",
      Solver.process("omaha-holdem 6h9cAhJsQd 4c7hTsKc 3s2d5hQh 3c3h6s4d JdTdAc9d 6c2s9s4h 9h8dJc8h"));
  }

  @Test
  public void test_omaha_holdem_8705_3h7h9c9hJh_Qh5d7dJs_3dQsKcKs_Kh4d7c2c_3s8h5sAc() {
    assertEquals(
      "3s8h5sAc Kh4d7c2c Qh5d7dJs 3dQsKcKs",
      Solver.process("omaha-holdem 3h7h9c9hJh Qh5d7dJs 3dQsKcKs Kh4d7c2c 3s8h5sAc"));
  }

  @Test
  public void test_omaha_holdem_8706_6h7d9cAhKs_Ac4cAs9h_QhJcKcTh_4h8c7s4d_2sTd8d6c_2dTsJh3c_2c3s8h2h() {
    assertEquals(
      "2dTsJh3c 2c3s8h2h 4h8c7s4d QhJcKcTh Ac4cAs9h 2sTd8d6c",
      Solver.process("omaha-holdem 6h7d9cAhKs Ac4cAs9h QhJcKcTh 4h8c7s4d 2sTd8d6c 2dTsJh3c 2c3s8h2h"));
  }

  @Test
  public void test_omaha_holdem_8707_2d2h5c7hTs_2cJs9hAh_QdJdQsAs() {
    assertEquals(
      "QdJdQsAs 2cJs9hAh",
      Solver.process("omaha-holdem 2d2h5c7hTs 2cJs9hAh QdJdQsAs"));
  }

  @Test
  public void test_omaha_holdem_8708_5h6d9hKcTd_8dKd2h4d_2cQh9cQc_TsTh5d8h_Jh4h3h9d_7hQs7cTc_Js7s7d6s_2d6h3s4c_Jc3c8s4s_KhJd9s8c() {
    assertEquals(
      "Jc3c8s4s 2d6h3s4c Js7s7d6s Jh4h3h9d 7hQs7cTc 2cQh9cQc 8dKd2h4d KhJd9s8c TsTh5d8h",
      Solver.process("omaha-holdem 5h6d9hKcTd 8dKd2h4d 2cQh9cQc TsTh5d8h Jh4h3h9d 7hQs7cTc Js7s7d6s 2d6h3s4c Jc3c8s4s KhJd9s8c"));
  }

  @Test
  public void test_omaha_holdem_8709_6d7h9hAsJc_KdKcKh9d_AhKsTc8h_4hQs5h4s_5c9c8sTd_5s3c9s8d_2h6cAd2d_3h4cJsJd_2c6s7dTs_5d7s2sTh() {
    assertEquals(
      "4hQs5h4s 5d7s2sTh KdKcKh9d 2c6s7dTs 2h6cAd2d 3h4cJsJd 5s3c9s8d 5c9c8sTd=AhKsTc8h",
      Solver.process("omaha-holdem 6d7h9hAsJc KdKcKh9d AhKsTc8h 4hQs5h4s 5c9c8sTd 5s3c9s8d 2h6cAd2d 3h4cJsJd 2c6s7dTs 5d7s2sTh"));
  }

  @Test
  public void test_omaha_holdem_8710_2d7h8cAhQd_3d4h5cAd_5dTh5h3s() {
    assertEquals(
      "5dTh5h3s 3d4h5cAd",
      Solver.process("omaha-holdem 2d7h8cAhQd 3d4h5cAd 5dTh5h3s"));
  }

  @Test
  public void test_omaha_holdem_8711_2h5c8hAdQd_KhKs2s9d_6cJh2cTc_QcJc9s8d() {
    assertEquals(
      "6cJh2cTc KhKs2s9d QcJc9s8d",
      Solver.process("omaha-holdem 2h5c8hAdQd KhKs2s9d 6cJh2cTc QcJc9s8d"));
  }

  @Test
  public void test_omaha_holdem_8712_2c2d4c5sTd_Kd6sTc9c_3d2h5c2s_3hKsAsQd_3s5h8c7s_QsKhAdTh() {
    assertEquals(
      "3s5h8c7s Kd6sTc9c QsKhAdTh 3hKsAsQd 3d2h5c2s",
      Solver.process("omaha-holdem 2c2d4c5sTd Kd6sTc9c 3d2h5c2s 3hKsAsQd 3s5h8c7s QsKhAdTh"));
  }

  @Test
  public void test_omaha_holdem_8713_3d5h7hAcAh_JhKcQc9c_Td4c6cJc_7d6s7c3h_4h9s2cTs_KhAd4s6d_8h3s5dQh_5c2d9dKs() {
    assertEquals(
      "JhKcQc9c 5c2d9dKs 4h9s2cTs KhAd4s6d=Td4c6cJc 8h3s5dQh 7d6s7c3h",
      Solver.process("omaha-holdem 3d5h7hAcAh JhKcQc9c Td4c6cJc 7d6s7c3h 4h9s2cTs KhAd4s6d 8h3s5dQh 5c2d9dKs"));
  }

  @Test
  public void test_omaha_holdem_8714_6s7cJsKsTd_4c2s5c4h_Ac7d4s9c_7hJh4dQd_Jd3d5d2h_3sKhTsAs_6d8hJc3h() {
    assertEquals(
      "4c2s5c4h Ac7d4s9c Jd3d5d2h 6d8hJc3h 7hJh4dQd 3sKhTsAs",
      Solver.process("omaha-holdem 6s7cJsKsTd 4c2s5c4h Ac7d4s9c 7hJh4dQd Jd3d5d2h 3sKhTsAs 6d8hJc3h"));
  }

  @Test
  public void test_omaha_holdem_8715_2h4d5h6hKc_QcTh8hTs_9s3c2sAd_3h9dJh5c_7dKhJd4h_Tc2c9c8d_6cQs3sJs_AhJc3d8s() {
    assertEquals(
      "Tc2c9c8d AhJc3d8s 6cQs3sJs=9s3c2sAd QcTh8hTs 3h9dJh5c 7dKhJd4h",
      Solver.process("omaha-holdem 2h4d5h6hKc QcTh8hTs 9s3c2sAd 3h9dJh5c 7dKhJd4h Tc2c9c8d 6cQs3sJs AhJc3d8s"));
  }

  @Test
  public void test_omaha_holdem_8716_4d5s7c9dKs_5cQh4sTd_7hAs6d8c_3c9c3h2d_4c4hQdTs_2hQc6cJd_6sKhAh3s_7sKdAcTc_JcKc9h2c_AdQs6h8d() {
    assertEquals(
      "2hQc6cJd 3c9c3h2d 5cQh4sTd 7sKdAcTc JcKc9h2c 4c4hQdTs 6sKhAh3s 7hAs6d8c=AdQs6h8d",
      Solver.process("omaha-holdem 4d5s7c9dKs 5cQh4sTd 7hAs6d8c 3c9c3h2d 4c4hQdTs 2hQc6cJd 6sKhAh3s 7sKdAcTc JcKc9h2c AdQs6h8d"));
  }

  @Test
  public void test_omaha_holdem_8717_3c6d8h9sQh_7s4h9hTs_3sJd2dAs_Kc4dQd5h_Kh5c5d6c_8dTd6sKd_7dJcThJh_Ks8s4c9d_4s2s6h7c() {
    assertEquals(
      "3sJd2dAs 4s2s6h7c Kh5c5d6c Kc4dQd5h 8dTd6sKd Ks8s4c9d 7s4h9hTs 7dJcThJh",
      Solver.process("omaha-holdem 3c6d8h9sQh 7s4h9hTs 3sJd2dAs Kc4dQd5h Kh5c5d6c 8dTd6sKd 7dJcThJh Ks8s4c9d 4s2s6h7c"));
  }

  @Test
  public void test_omaha_holdem_8718_3s9cJcKdTc_4s3cJd6h_2c6s8hAs_Qc5s7d2h_9h8cJhKc_AcKhQh7h_3d6cTdKs_2dQs4h5d_Js9sAd5c_6dTh7sQd() {
    assertEquals(
      "2dQs4h5d Qc5s7d2h 2c6s8hAs 4s3cJd6h Js9sAd5c 3d6cTdKs 6dTh7sQd AcKhQh7h 9h8cJhKc",
      Solver.process("omaha-holdem 3s9cJcKdTc 4s3cJd6h 2c6s8hAs Qc5s7d2h 9h8cJhKc AcKhQh7h 3d6cTdKs 2dQs4h5d Js9sAd5c 6dTh7sQd"));
  }

  @Test
  public void test_omaha_holdem_8719_5h9sAdKhTd_5d2d7d8d_7h2s9c2h_Qs6dQc7c_9h7s4sTh_3c5s6s6c() {
    assertEquals(
      "5d2d7d8d 3c5s6s6c 7h2s9c2h Qs6dQc7c 9h7s4sTh",
      Solver.process("omaha-holdem 5h9sAdKhTd 5d2d7d8d 7h2s9c2h Qs6dQc7c 9h7s4sTh 3c5s6s6c"));
  }

  @Test
  public void test_omaha_holdem_8720_3h7dAdKdQs_6c9s7s8h_Td8s9d3c_KhKcKsQc_Jd4hTs6s_9h2s2d4s_4d7h5dAh_ThJs8c6d_Qd8d6h5s_2hQh3s5h() {
    assertEquals(
      "9h2s2d4s 6c9s7s8h 2hQh3s5h KhKcKsQc Jd4hTs6s=ThJs8c6d 4d7h5dAh Td8s9d3c Qd8d6h5s",
      Solver.process("omaha-holdem 3h7dAdKdQs 6c9s7s8h Td8s9d3c KhKcKsQc Jd4hTs6s 9h2s2d4s 4d7h5dAh ThJs8c6d Qd8d6h5s 2hQh3s5h"));
  }

  @Test
  public void test_omaha_holdem_8721_4sAhKsThTs_2c3dKh6s_Tc8d9h8h() {
    assertEquals(
      "2c3dKh6s Tc8d9h8h",
      Solver.process("omaha-holdem 4sAhKsThTs 2c3dKh6s Tc8d9h8h"));
  }

  @Test
  public void test_omaha_holdem_8722_6h8h8sJsTc_5d2d4c3d_4s6sKc9d_Ah7dKdAd_AcKs6c7s_As2h3cTs_9h3s3h2s_Qc4d5sQh_8cKh6d7c_7hQd5h5c() {
    assertEquals(
      "5d2d4c3d 9h3s3h2s 7hQd5h5c 4s6sKc9d AcKs6c7s As2h3cTs Qc4d5sQh Ah7dKdAd 8cKh6d7c",
      Solver.process("omaha-holdem 6h8h8sJsTc 5d2d4c3d 4s6sKc9d Ah7dKdAd AcKs6c7s As2h3cTs 9h3s3h2s Qc4d5sQh 8cKh6d7c 7hQd5h5c"));
  }

  @Test
  public void test_omaha_holdem_8723_6d8h9hAcJh_6sKc9s2d_Th7c4hJd_Qc9cQhTs_5dAs4d2h_Qs7d9dJs_2s5s4sTc_4c2c8c6h_5h3c5cAd() {
    assertEquals(
      "2s5s4sTc 5dAs4d2h=5h3c5cAd 4c2c8c6h 6sKc9s2d Qs7d9dJs Qc9cQhTs Th7c4hJd",
      Solver.process("omaha-holdem 6d8h9hAcJh 6sKc9s2d Th7c4hJd Qc9cQhTs 5dAs4d2h Qs7d9dJs 2s5s4sTc 4c2c8c6h 5h3c5cAd"));
  }

  @Test
  public void test_omaha_holdem_8724_4h4s6c8dTs_KcJc5cJs_Qs8s4dTd_3h3d3sKs_9h7cQh6s_8h6dAs7d_9s8c5s3c_5dAdTcAh_2d6h2hJh_QcJd9d2c() {
    assertEquals(
      "QcJd9d2c 3h3d3sKs 2d6h2hJh 9s8c5s3c 8h6dAs7d KcJc5cJs 5dAdTcAh 9h7cQh6s Qs8s4dTd",
      Solver.process("omaha-holdem 4h4s6c8dTs KcJc5cJs Qs8s4dTd 3h3d3sKs 9h7cQh6s 8h6dAs7d 9s8c5s3c 5dAdTcAh 2d6h2hJh QcJd9d2c"));
  }

  @Test
  public void test_omaha_holdem_8725_6d7s8dQcTs_3h3s6sKh_9s4s9c7c() {
    assertEquals(
      "3h3s6sKh 9s4s9c7c",
      Solver.process("omaha-holdem 6d7s8dQcTs 3h3s6sKh 9s4s9c7c"));
  }

  @Test
  public void test_omaha_holdem_8726_2s7s9cKdKs_6s8s7cQd_Js9s6cTh_AdQcKh7d_4sAhTd9d_AsAc8dTs_QsJh5cKc_Jc9hJd2d_2h6d8c4d_6h8h5d5h() {
    assertEquals(
      "2h6d8c4d 6h8h5d5h 4sAhTd9d Jc9hJd2d QsJh5cKc 6s8s7cQd Js9s6cTh AsAc8dTs AdQcKh7d",
      Solver.process("omaha-holdem 2s7s9cKdKs 6s8s7cQd Js9s6cTh AdQcKh7d 4sAhTd9d AsAc8dTs QsJh5cKc Jc9hJd2d 2h6d8c4d 6h8h5d5h"));
  }

  @Test
  public void test_omaha_holdem_8727_4s5c6sQdQs_2c9d2d2s_3h2hQcJs_8sTd7sTh_6h8h9cKs_KhJh5h6c() {
    assertEquals(
      "2c9d2d2s 6h8h9cKs=KhJh5h6c 3h2hQcJs 8sTd7sTh",
      Solver.process("omaha-holdem 4s5c6sQdQs 2c9d2d2s 3h2hQcJs 8sTd7sTh 6h8h9cKs KhJh5h6c"));
  }

  @Test
  public void test_omaha_holdem_8728_2s4d7h9d9s_4hKc5s2h_7s8d6h8c() {
    assertEquals(
      "4hKc5s2h 7s8d6h8c",
      Solver.process("omaha-holdem 2s4d7h9d9s 4hKc5s2h 7s8d6h8c"));
  }

  @Test
  public void test_omaha_holdem_8729_3c5h6c8cTh_4d7cJdAc_9s6s2hKh_AdKc2c7h_Td9d3dJc_4h3s9h6d() {
    assertEquals(
      "9s6s2hKh 4h3s9h6d Td9d3dJc AdKc2c7h 4d7cJdAc",
      Solver.process("omaha-holdem 3c5h6c8cTh 4d7cJdAc 9s6s2hKh AdKc2c7h Td9d3dJc 4h3s9h6d"));
  }

  @Test
  public void test_omaha_holdem_8730_5s8c9hKcKd_Ts7sJs8s_6dJd3sQh() {
    assertEquals(
      "6dJd3sQh Ts7sJs8s",
      Solver.process("omaha-holdem 5s8c9hKcKd Ts7sJs8s 6dJd3sQh"));
  }

  @Test
  public void test_omaha_holdem_8731_2h4c7c9cKh_Qh3sAd3c_4d5d8h8s_Ah6d4h3h_QcJc9d9h() {
    assertEquals(
      "Qh3sAd3c Ah6d4h3h 4d5d8h8s QcJc9d9h",
      Solver.process("omaha-holdem 2h4c7c9cKh Qh3sAd3c 4d5d8h8s Ah6d4h3h QcJc9d9h"));
  }

  @Test
  public void test_omaha_holdem_8732_2d2s5d6dJd_7h2hQs3s_QcJcQd7d_Td6h8d3d_AcAs4c5c_7s6cQhJh_8h3c9cKs() {
    assertEquals(
      "8h3c9cKs 7s6cQhJh AcAs4c5c 7h2hQs3s Td6h8d3d QcJcQd7d",
      Solver.process("omaha-holdem 2d2s5d6dJd 7h2hQs3s QcJcQd7d Td6h8d3d AcAs4c5c 7s6cQhJh 8h3c9cKs"));
  }

  @Test
  public void test_omaha_holdem_8733_4c4d4s6d8s_4h9s2dAd_AsTdJh6h_Ts9dQd2s_JcKhKcAc_Ah2c8h7c_8c9cTh7d_Ks6cQhKd_8d5c5sJd_6s5d3s9h() {
    assertEquals(
      "6s5d3s9h 8c9cTh7d Ts9dQd2s Ah2c8h7c AsTdJh6h 8d5c5sJd JcKhKcAc=Ks6cQhKd 4h9s2dAd",
      Solver.process("omaha-holdem 4c4d4s6d8s 4h9s2dAd AsTdJh6h Ts9dQd2s JcKhKcAc Ah2c8h7c 8c9cTh7d Ks6cQhKd 8d5c5sJd 6s5d3s9h"));
  }

  @Test
  public void test_omaha_holdem_8734_3d5h6c9cAh_Kh7c6hTs_9sTdJh5s() {
    assertEquals(
      "Kh7c6hTs 9sTdJh5s",
      Solver.process("omaha-holdem 3d5h6c9cAh Kh7c6hTs 9sTdJh5s"));
  }

  @Test
  public void test_omaha_holdem_8735_5c6c8c8sQc_QsKs3hJd_JcTdJs4h_8d6h5d2c_3s2s6dKh_KdAc3cQd_As5h9h7d_9s3d2hTh() {
    assertEquals(
      "9s3d2hTh 3s2s6dKh JcTdJs4h QsKs3hJd As5h9h7d KdAc3cQd 8d6h5d2c",
      Solver.process("omaha-holdem 5c6c8c8sQc QsKs3hJd JcTdJs4h 8d6h5d2c 3s2s6dKh KdAc3cQd As5h9h7d 9s3d2hTh"));
  }

  @Test
  public void test_omaha_holdem_8736_4cAcAdQsTh_8dTsJs2d_Qh8h3d9c_8s4d6c6s_Ah9s9hQd_JcTd4sKs_3cTc2hKc_5hKhAs9d_2s5s5d6d_6h7c2c7d() {
    assertEquals(
      "2s5s5d6d 8s4d6c6s 6h7c2c7d 8dTsJs2d 3cTc2hKc Qh8h3d9c 5hKhAs9d JcTd4sKs Ah9s9hQd",
      Solver.process("omaha-holdem 4cAcAdQsTh 8dTsJs2d Qh8h3d9c 8s4d6c6s Ah9s9hQd JcTd4sKs 3cTc2hKc 5hKhAs9d 2s5s5d6d 6h7c2c7d"));
  }

  @Test
  public void test_omaha_holdem_8737_2h4d7cAdKs_3s6d9s8h_KdAc7hQs_2sJh7s8s_9h4hTh3d_8d3c4s6c_9c5sTd7d() {
    assertEquals(
      "3s6d9s8h 8d3c4s6c 9h4hTh3d 9c5sTd7d 2sJh7s8s KdAc7hQs",
      Solver.process("omaha-holdem 2h4d7cAdKs 3s6d9s8h KdAc7hQs 2sJh7s8s 9h4hTh3d 8d3c4s6c 9c5sTd7d"));
  }

  @Test
  public void test_omaha_holdem_8738_5c6dAhKdQs_5sJsAsAd_2hQcJh9h_JdTd4s8c_7h7s9s3d_8s4d7cKs_7d3c3h9c_AcThQd6h_3s5dKc4h() {
    assertEquals(
      "7d3c3h9c 7h7s9s3d 2hQcJh9h 8s4d7cKs 3s5dKc4h AcThQd6h 5sJsAsAd JdTd4s8c",
      Solver.process("omaha-holdem 5c6dAhKdQs 5sJsAsAd 2hQcJh9h JdTd4s8c 7h7s9s3d 8s4d7cKs 7d3c3h9c AcThQd6h 3s5dKc4h"));
  }

  @Test
  public void test_omaha_holdem_8739_2c2h3hAhTh_7cQcTc3c_Td9d8h5c_9s7h8c4s_6s6dJc2s_6cJs7sTs_8s3d4c8d() {
    assertEquals(
      "9s7h8c4s 8s3d4c8d Td9d8h5c 6cJs7sTs 7cQcTc3c 6s6dJc2s",
      Solver.process("omaha-holdem 2c2h3hAhTh 7cQcTc3c Td9d8h5c 9s7h8c4s 6s6dJc2s 6cJs7sTs 8s3d4c8d"));
  }

  @Test
  public void test_omaha_holdem_8740_2h3s9cQhTs_4s3d5h4d_JhQcQdAd_4hTc6c2c() {
    assertEquals(
      "4s3d5h4d 4hTc6c2c JhQcQdAd",
      Solver.process("omaha-holdem 2h3s9cQhTs 4s3d5h4d JhQcQdAd 4hTc6c2c"));
  }

  @Test
  public void test_omaha_holdem_8741_2d2h2sQcTc_9cKcTh7h_Kh8dQhQs_9s3c4s3s_4d3d2c8c_7cAd3h7s_8sAs5h4h_4c8hJs5d_5cAc6c7d_6sKd9hJh() {
    assertEquals(
      "4c8hJs5d 9cKcTh7h 6sKd9hJh 5cAc6c7d 8sAs5h4h 9s3c4s3s 7cAd3h7s Kh8dQhQs 4d3d2c8c",
      Solver.process("omaha-holdem 2d2h2sQcTc 9cKcTh7h Kh8dQhQs 9s3c4s3s 4d3d2c8c 7cAd3h7s 8sAs5h4h 4c8hJs5d 5cAc6c7d 6sKd9hJh"));
  }

  @Test
  public void test_omaha_holdem_8742_4h9c9dJdQs_JhQd5c2s_Ad5hJs6d_3sTd6c8c_Th2h7cKd_8hQcKs7h_8s3c5d3h_9s6s4sQh_TcAs7s5s() {
    assertEquals(
      "TcAs7s5s 8s3c5d3h Ad5hJs6d 8hQcKs7h JhQd5c2s 3sTd6c8c Th2h7cKd 9s6s4sQh",
      Solver.process("omaha-holdem 4h9c9dJdQs JhQd5c2s Ad5hJs6d 3sTd6c8c Th2h7cKd 8hQcKs7h 8s3c5d3h 9s6s4sQh TcAs7s5s"));
  }

  @Test
  public void test_omaha_holdem_8743_2h5c5h8sTh_Jc3c5dKh_8c8d3hAs() {
    assertEquals(
      "Jc3c5dKh 8c8d3hAs",
      Solver.process("omaha-holdem 2h5c5h8sTh Jc3c5dKh 8c8d3hAs"));
  }

  @Test
  public void test_omaha_holdem_8744_5s7hAhJhTc_9h4hJs5d_KdJc7c4c_Jd3c8c5c_QdAd4dTs_2cTh9c8h_3h7s9d2s_7d8sKc6c_Td3d2hKh_Qh8d6hAs() {
    assertEquals(
      "3h7s9d2s 7d8sKc6c Jd3c8c5c KdJc7c4c QdAd4dTs 9h4hJs5d 2cTh9c8h Qh8d6hAs Td3d2hKh",
      Solver.process("omaha-holdem 5s7hAhJhTc 9h4hJs5d KdJc7c4c Jd3c8c5c QdAd4dTs 2cTh9c8h 3h7s9d2s 7d8sKc6c Td3d2hKh Qh8d6hAs"));
  }

  @Test
  public void test_omaha_holdem_8745_4d4h7d8sQd_Kd6cTd4c_9cQhAsTs_6d8cKhJd_3h6s6hQs_7c3s4sKs() {
    assertEquals(
      "3h6s6hQs 9cQhAsTs 6d8cKhJd Kd6cTd4c 7c3s4sKs",
      Solver.process("omaha-holdem 4d4h7d8sQd Kd6cTd4c 9cQhAsTs 6d8cKhJd 3h6s6hQs 7c3s4sKs"));
  }

  @Test
  public void test_omaha_holdem_8746_4h7c8d8hAh_5dJcKc6s_As9c7s8s_KsAd7d6c_6d2s4dAc_Td6hQh4c() {
    assertEquals(
      "6d2s4dAc KsAd7d6c 5dJcKc6s Td6hQh4c As9c7s8s",
      Solver.process("omaha-holdem 4h7c8d8hAh 5dJcKc6s As9c7s8s KsAd7d6c 6d2s4dAc Td6hQh4c"));
  }

  @Test
  public void test_omaha_holdem_8747_4cAsQcTdTs_Ad8hQsKd_3hAcTc8s_6c9d7dQh_2sKs9c9s_JhQd6d6h_Kh5h4h7s() {
    assertEquals(
      "Kh5h4h7s 2sKs9c9s 6c9d7dQh JhQd6d6h Ad8hQsKd 3hAcTc8s",
      Solver.process("omaha-holdem 4cAsQcTdTs Ad8hQsKd 3hAcTc8s 6c9d7dQh 2sKs9c9s JhQd6d6h Kh5h4h7s"));
  }

  @Test
  public void test_omaha_holdem_8748_2s9hKdKsQs_7cTd3d9c_6s2c6h4h_7s4d4s5d_3s8d5c6c_4cTc9dAh_Kc2d6dJd_8c8hKhAs_3cJh5hTs() {
    assertEquals(
      "3s8d5c6c 6s2c6h4h 7cTd3d9c 4cTc9dAh 8c8hKhAs 3cJh5hTs 7s4d4s5d Kc2d6dJd",
      Solver.process("omaha-holdem 2s9hKdKsQs 7cTd3d9c 6s2c6h4h 7s4d4s5d 3s8d5c6c 4cTc9dAh Kc2d6dJd 8c8hKhAs 3cJh5hTs"));
  }

  @Test
  public void test_omaha_holdem_8749_2c3dJcQsTd_Js9d5c8c_3hKs7c3s_6c9c4s6d_JdKc6s9h_2d4d4cKd_AcAh4h7h_8hTc7d5h_6hQh9s7s_5sTsTh2h() {
    assertEquals(
      "2d4d4cKd 6c9c4s6d 8hTc7d5h 6hQh9s7s AcAh4h7h 3hKs7c3s 5sTsTh2h Js9d5c8c JdKc6s9h",
      Solver.process("omaha-holdem 2c3dJcQsTd Js9d5c8c 3hKs7c3s 6c9c4s6d JdKc6s9h 2d4d4cKd AcAh4h7h 8hTc7d5h 6hQh9s7s 5sTsTh2h"));
  }

}
