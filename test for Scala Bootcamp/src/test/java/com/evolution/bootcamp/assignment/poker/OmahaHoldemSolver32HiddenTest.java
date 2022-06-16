
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver32HiddenTest {


  @Test
  public void test_omaha_holdem_8000_3h4h4s7h8h_JsJh5d3d_AdTs9hJc_Qc7cKs3c_8c7sAcQs_QhKd2cTd_TcAsAhTh() {
    assertEquals(
      "QhKd2cTd AdTs9hJc Qc7cKs3c 8c7sAcQs JsJh5d3d TcAsAhTh",
      Solver.process("omaha-holdem 3h4h4s7h8h JsJh5d3d AdTs9hJc Qc7cKs3c 8c7sAcQs QhKd2cTd TcAsAhTh"));
  }

  @Test
  public void test_omaha_holdem_8001_2c4d7c8dJc_Kd3h9s4c_Td3d6dQc_9h4sQh5d() {
    assertEquals(
      "Td3d6dQc 9h4sQh5d Kd3h9s4c",
      Solver.process("omaha-holdem 2c4d7c8dJc Kd3h9s4c Td3d6dQc 9h4sQh5d"));
  }

  @Test
  public void test_omaha_holdem_8002_6s7c7h8dKc_4s4d8s2s_Ts2h2cJs_3hQh6h6d_3cTcJhAs_AhQs9c3s_9sJc5c7d_4hKs9dTd_9hAc3d5h() {
    assertEquals(
      "3cTcJhAs AhQs9c3s Ts2h2cJs 4s4d8s2s 9hAc3d5h=9sJc5c7d 4hKs9dTd 3hQh6h6d",
      Solver.process("omaha-holdem 6s7c7h8dKc 4s4d8s2s Ts2h2cJs 3hQh6h6d 3cTcJhAs AhQs9c3s 9sJc5c7d 4hKs9dTd 9hAc3d5h"));
  }

  @Test
  public void test_omaha_holdem_8003_2s3c9d9sJs_Ts2c9c5c_2hKh6sQc_8d7c4dQs_4cKc4sJh_8s8hThAh_8cKs6c4h_Jc5s3s9h() {
    assertEquals(
      "8d7c4dQs 8cKs6c4h 2hKh6sQc 8s8hThAh 4cKc4sJh Ts2c9c5c Jc5s3s9h",
      Solver.process("omaha-holdem 2s3c9d9sJs Ts2c9c5c 2hKh6sQc 8d7c4dQs 4cKc4sJh 8s8hThAh 8cKs6c4h Jc5s3s9h"));
  }

  @Test
  public void test_omaha_holdem_8004_2d8sAcKhTh_5d3h9cQs_TdKcTcJh_Kd6d2s7h_As2c5s4h_JdAhQc8c_Ts4c6c7c_6h5c9s6s() {
    assertEquals(
      "5d3h9cQs 6h5c9s6s Ts4c6c7c Kd6d2s7h As2c5s4h TdKcTcJh JdAhQc8c",
      Solver.process("omaha-holdem 2d8sAcKhTh 5d3h9cQs TdKcTcJh Kd6d2s7h As2c5s4h JdAhQc8c Ts4c6c7c 6h5c9s6s"));
  }

  @Test
  public void test_omaha_holdem_8005_3d5d7sKhQc_Ts9hJd5h_9s8c4h4s() {
    assertEquals(
      "9s8c4h4s Ts9hJd5h",
      Solver.process("omaha-holdem 3d5d7sKhQc Ts9hJd5h 9s8c4h4s"));
  }

  @Test
  public void test_omaha_holdem_8006_2h8hAsJdTh_5h3h3d4s_7dKs5cQd_2s5s2cJs_9h4cTd8d_7s3sTc6d_KhAc9cKd_5d7hKc8s() {
    assertEquals(
      "5d7hKc8s 7s3sTc6d KhAc9cKd 9h4cTd8d 2s5s2cJs 7dKs5cQd 5h3h3d4s",
      Solver.process("omaha-holdem 2h8hAsJdTh 5h3h3d4s 7dKs5cQd 2s5s2cJs 9h4cTd8d 7s3sTc6d KhAc9cKd 5d7hKc8s"));
  }

  @Test
  public void test_omaha_holdem_8007_3h7d8hAcTd_6d3s5sKh_Jh6c6hKc_5c9dQs7h_2d4hAd5h_7sTcTh8c_4c8s2c9c_Ts9h7c4s_Kd5d2s4d() {
    assertEquals(
      "Kd5d2s4d 6d3s5sKh Jh6c6hKc 5c9dQs7h 4c8s2c9c 2d4hAd5h Ts9h7c4s 7sTcTh8c",
      Solver.process("omaha-holdem 3h7d8hAcTd 6d3s5sKh Jh6c6hKc 5c9dQs7h 2d4hAd5h 7sTcTh8c 4c8s2c9c Ts9h7c4s Kd5d2s4d"));
  }

  @Test
  public void test_omaha_holdem_8008_3s5cAhJhQc_5sTdQdAd_4h2d3d4c_8d4d6d7s_4s8h3cKh_7d6s8cAs() {
    assertEquals(
      "8d4d6d7s 4s8h3cKh 7d6s8cAs 5sTdQdAd 4h2d3d4c",
      Solver.process("omaha-holdem 3s5cAhJhQc 5sTdQdAd 4h2d3d4c 8d4d6d7s 4s8h3cKh 7d6s8cAs"));
  }

  @Test
  public void test_omaha_holdem_8009_3s6cAcKdQc_Td5s2dAh_3d5hJdQd_Jh6dKs7d() {
    assertEquals(
      "Td5s2dAh 3d5hJdQd Jh6dKs7d",
      Solver.process("omaha-holdem 3s6cAcKdQc Td5s2dAh 3d5hJdQd Jh6dKs7d"));
  }

  @Test
  public void test_omaha_holdem_8010_6s8cJdTcTs_2h4s3d2c_3s6h5d9s_ThKc7hTd_Jc8d5c3h_AdAs7dQs_6d9cAhJs_2d5s9hAc_Jh2sKsQd_7cQh9dQc() {
    assertEquals(
      "2d5s9hAc 2h4s3d2c 3s6h5d9s Jc8d5c3h Jh2sKsQd 6d9cAhJs AdAs7dQs 7cQh9dQc ThKc7hTd",
      Solver.process("omaha-holdem 6s8cJdTcTs 2h4s3d2c 3s6h5d9s ThKc7hTd Jc8d5c3h AdAs7dQs 6d9cAhJs 2d5s9hAc Jh2sKsQd 7cQh9dQc"));
  }

  @Test
  public void test_omaha_holdem_8011_8dAdKsTcTh_4h3c7s6c_QsKd3sJc_Qd7d9h2s() {
    assertEquals(
      "4h3c7s6c Qd7d9h2s QsKd3sJc",
      Solver.process("omaha-holdem 8dAdKsTcTh 4h3c7s6c QsKd3sJc Qd7d9h2s"));
  }

  @Test
  public void test_omaha_holdem_8012_6h9hAhJdTc_7sKc3dTd_2hKh6d5h() {
    assertEquals(
      "7sKc3dTd 2hKh6d5h",
      Solver.process("omaha-holdem 6h9hAhJdTc 7sKc3dTd 2hKh6d5h"));
  }

  @Test
  public void test_omaha_holdem_8013_2h3c4s5sJd_2c6c4dKc_QhTcQcJs_7h3d8d7d_7c9c4h8s_KdTs4cKh_Th3h5c6d_AhAc6sJc_9h6h8cQs_Td8hQd5h() {
    assertEquals(
      "9h6h8cQs 7c9c4h8s Td8hQd5h 7h3d8d7d QhTcQcJs KdTs4cKh AhAc6sJc 2c6c4dKc=Th3h5c6d",
      Solver.process("omaha-holdem 2h3c4s5sJd 2c6c4dKc QhTcQcJs 7h3d8d7d 7c9c4h8s KdTs4cKh Th3h5c6d AhAc6sJc 9h6h8cQs Td8hQd5h"));
  }

  @Test
  public void test_omaha_holdem_8014_5c9cAsKcTh_6c8sTcQc_Ad9dJs4c_Jh6sKs2h_Td7c4hQd_Qh7h6h8h_4s5d3s4d_5h2cKh2s_Jc9h7sKd() {
    assertEquals(
      "Qh7h6h8h 4s5d3s4d Td7c4hQd Jh6sKs2h 5h2cKh2s Jc9h7sKd Ad9dJs4c 6c8sTcQc",
      Solver.process("omaha-holdem 5c9cAsKcTh 6c8sTcQc Ad9dJs4c Jh6sKs2h Td7c4hQd Qh7h6h8h 4s5d3s4d 5h2cKh2s Jc9h7sKd"));
  }

  @Test
  public void test_omaha_holdem_8015_3d7s9dJdKd_Jc4sThTs_Ac5hQdKs_8cJh9cTd_Qs2c9s8d_6h5s5cKh() {
    assertEquals(
      "Qs2c9s8d Jc4sThTs 6h5s5cKh Ac5hQdKs 8cJh9cTd",
      Solver.process("omaha-holdem 3d7s9dJdKd Jc4sThTs Ac5hQdKs 8cJh9cTd Qs2c9s8d 6h5s5cKh"));
  }

  @Test
  public void test_omaha_holdem_8016_3c3s8h9cTd_6sKh5h3d_Qc6dJs6c_7s9d7h9h_Ah2c6hJc_4sKc4cJd_5s8dQd5c_TsAs3hAc() {
    assertEquals(
      "Ah2c6hJc 4sKc4cJd 5s8dQd5c 6sKh5h3d Qc6dJs6c TsAs3hAc 7s9d7h9h",
      Solver.process("omaha-holdem 3c3s8h9cTd 6sKh5h3d Qc6dJs6c 7s9d7h9h Ah2c6hJc 4sKc4cJd 5s8dQd5c TsAs3hAc"));
  }

  @Test
  public void test_omaha_holdem_8017_4s9sAsJdJs_JhKs7h7d_6hQs6sQc_ThTdAhTc_2d3d7sTs_5cQd7c9d_QhJc3h5d_6d4c2c8d_Kc8cKh9h() {
    assertEquals(
      "6d4c2c8d 5cQd7c9d Kc8cKh9h ThTdAhTc QhJc3h5d JhKs7h7d 2d3d7sTs 6hQs6sQc",
      Solver.process("omaha-holdem 4s9sAsJdJs JhKs7h7d 6hQs6sQc ThTdAhTc 2d3d7sTs 5cQd7c9d QhJc3h5d 6d4c2c8d Kc8cKh9h"));
  }

  @Test
  public void test_omaha_holdem_8018_4d4h6s9dJs_7h3c5dAs_3d7cAc6c_Ks6h8d5c_4sQd7sQh_TcQcKd2d_9h8h8c3h_4c8sJcJh_3sQsKcKh() {
    assertEquals(
      "TcQcKd2d 7h3c5dAs Ks6h8d5c 3d7cAc6c 9h8h8c3h 3sQsKcKh 4sQd7sQh 4c8sJcJh",
      Solver.process("omaha-holdem 4d4h6s9dJs 7h3c5dAs 3d7cAc6c Ks6h8d5c 4sQd7sQh TcQcKd2d 9h8h8c3h 4c8sJcJh 3sQsKcKh"));
  }

  @Test
  public void test_omaha_holdem_8019_6d6h6sQcTh_Qs2d4d3s_7s8h9dTd_JhAd4s8d() {
    assertEquals(
      "7s8h9dTd Qs2d4d3s JhAd4s8d",
      Solver.process("omaha-holdem 6d6h6sQcTh Qs2d4d3s 7s8h9dTd JhAd4s8d"));
  }

  @Test
  public void test_omaha_holdem_8020_5s7d9cAdKd_9sKs8c3s_3dJc6sQs_Kh3h2dQh_JhQd5c9d() {
    assertEquals(
      "3dJc6sQs Kh3h2dQh 9sKs8c3s JhQd5c9d",
      Solver.process("omaha-holdem 5s7d9cAdKd 9sKs8c3s 3dJc6sQs Kh3h2dQh JhQd5c9d"));
  }

  @Test
  public void test_omaha_holdem_8021_3c3h4c7dQh_4h3dKs7h_2sJd8dTd_3s5sTh2h_5h9h6s6d_8sKhTsTc_2c7c5cQs_7sJs4d4s() {
    assertEquals(
      "2sJd8dTd 8sKhTsTc 2c7c5cQs 3s5sTh2h 5h9h6s6d 4h3dKs7h 7sJs4d4s",
      Solver.process("omaha-holdem 3c3h4c7dQh 4h3dKs7h 2sJd8dTd 3s5sTh2h 5h9h6s6d 8sKhTsTc 2c7c5cQs 7sJs4d4s"));
  }

  @Test
  public void test_omaha_holdem_8022_5d7d9c9dTc_Ah5s4dQh_JcAsKcQs_5c2sQd3s_8h6d7s7h_3c9h8c4c_9sKh2cJs_TsTh3hJd() {
    assertEquals(
      "JcAsKcQs 5c2sQd3s Ah5s4dQh 3c9h8c4c 9sKh2cJs 8h6d7s7h TsTh3hJd",
      Solver.process("omaha-holdem 5d7d9c9dTc Ah5s4dQh JcAsKcQs 5c2sQd3s 8h6d7s7h 3c9h8c4c 9sKh2cJs TsTh3hJd"));
  }

  @Test
  public void test_omaha_holdem_8023_4h9c9sKdTh_8d2sQs6c_Ac6s9hKc_Qc5d2d5h_Js8sJdTd_2h7hQd8c_2c6d3s5c_AhAsTs3d_4sAd5sKs() {
    assertEquals(
      "2c6d3s5c 2h7hQd8c=8d2sQs6c Qc5d2d5h Js8sJdTd 4sAd5sKs AhAsTs3d Ac6s9hKc",
      Solver.process("omaha-holdem 4h9c9sKdTh 8d2sQs6c Ac6s9hKc Qc5d2d5h Js8sJdTd 2h7hQd8c 2c6d3s5c AhAsTs3d 4sAd5sKs"));
  }

  @Test
  public void test_omaha_holdem_8024_6d6s8cKsQs_6c9sJdJc_As7h9d6h_Tc8d8hQd_JsAd2d3d_2h3cKdTh_4s2cTd7d_7s5d4cKh() {
    assertEquals(
      "4s2cTd7d JsAd2d3d 7s5d4cKh 2h3cKdTh 6c9sJdJc As7h9d6h Tc8d8hQd",
      Solver.process("omaha-holdem 6d6s8cKsQs 6c9sJdJc As7h9d6h Tc8d8hQd JsAd2d3d 2h3cKdTh 4s2cTd7d 7s5d4cKh"));
  }

  @Test
  public void test_omaha_holdem_8025_2d5s6c7d9s_AhKh8dTc_Th4sAd5d_Jh2s6h4d_9d3c3s3d_TsQsAs7s_5c3h4hQd_8hKc7c2c() {
    assertEquals(
      "Th4sAd5d TsQsAs7s 9d3c3s3d Jh2s6h4d 5c3h4hQd 8hKc7c2c AhKh8dTc",
      Solver.process("omaha-holdem 2d5s6c7d9s AhKh8dTc Th4sAd5d Jh2s6h4d 9d3c3s3d TsQsAs7s 5c3h4hQd 8hKc7c2c"));
  }

  @Test
  public void test_omaha_holdem_8026_4h5c8d9c9d_Th6h6dQs_TcKh4dAh_Jh5s2c7h_QhQc5dKc_8sJs4c3c() {
    assertEquals(
      "TcKh4dAh Jh5s2c7h Th6h6dQs 8sJs4c3c QhQc5dKc",
      Solver.process("omaha-holdem 4h5c8d9c9d Th6h6dQs TcKh4dAh Jh5s2c7h QhQc5dKc 8sJs4c3c"));
  }

  @Test
  public void test_omaha_holdem_8027_4s6c7c7dJh_2d3dTd7s_4dQd8hQs_JdKs9cTc_Ad4h5hKd() {
    assertEquals(
      "Ad4h5hKd JdKs9cTc 4dQd8hQs 2d3dTd7s",
      Solver.process("omaha-holdem 4s6c7c7dJh 2d3dTd7s 4dQd8hQs JdKs9cTc Ad4h5hKd"));
  }

  @Test
  public void test_omaha_holdem_8028_2s5h6d7sTc_3h3sJd5c_2c7c4cAd_Qd2d8hJh_4dQs4h6c_Ts9d9s8d_Kd9hTdTh_Ac7dKs2h_Qc6h8s9c_Qh5dAs8c() {
    assertEquals(
      "Qd2d8hJh 3h3sJd5c Qh5dAs8c 4dQs4h6c 2c7c4cAd=Ac7dKs2h Kd9hTdTh Qc6h8s9c=Ts9d9s8d",
      Solver.process("omaha-holdem 2s5h6d7sTc 3h3sJd5c 2c7c4cAd Qd2d8hJh 4dQs4h6c Ts9d9s8d Kd9hTdTh Ac7dKs2h Qc6h8s9c Qh5dAs8c"));
  }

  @Test
  public void test_omaha_holdem_8029_2d4h5cAcTd_3h3sJhJs_QsTc8s8c_6h9h8d4c_6d7hKsJc_Qd9s4s7d_2c7sKh3c() {
    assertEquals(
      "6d7hKsJc 6h9h8d4c Qd9s4s7d QsTc8s8c 3h3sJhJs 2c7sKh3c",
      Solver.process("omaha-holdem 2d4h5cAcTd 3h3sJhJs QsTc8s8c 6h9h8d4c 6d7hKsJc Qd9s4s7d 2c7sKh3c"));
  }

  @Test
  public void test_omaha_holdem_8030_5h6c7c7hKd_QhThAcQd_4cKh7d4d() {
    assertEquals(
      "QhThAcQd 4cKh7d4d",
      Solver.process("omaha-holdem 5h6c7c7hKd QhThAcQd 4cKh7d4d"));
  }

  @Test
  public void test_omaha_holdem_8031_3h4s9c9dAc_4c8d8sTd_Qd2dTh4d_Tc7d3d2s_6dKh9h8c_2hJh5d6s_Ah8hJd2c_KdQh7cQs() {
    assertEquals(
      "Tc7d3d2s Qd2dTh4d 4c8d8sTd KdQh7cQs Ah8hJd2c 6dKh9h8c 2hJh5d6s",
      Solver.process("omaha-holdem 3h4s9c9dAc 4c8d8sTd Qd2dTh4d Tc7d3d2s 6dKh9h8c 2hJh5d6s Ah8hJd2c KdQh7cQs"));
  }

  @Test
  public void test_omaha_holdem_8032_3h6dQdTcTh_Jh4s8h5s_2hKhAcQc_8c3c3s5c_2s5dJsJc_3dJd9h7s_Qh4d6hAd_2d7cKc2c_5h4c8s9c() {
    assertEquals(
      "5h4c8s9c Jh4s8h5s 2d7cKc2c 3dJd9h7s 2s5dJsJc 2hKhAcQc=Qh4d6hAd 8c3c3s5c",
      Solver.process("omaha-holdem 3h6dQdTcTh Jh4s8h5s 2hKhAcQc 8c3c3s5c 2s5dJsJc 3dJd9h7s Qh4d6hAd 2d7cKc2c 5h4c8s9c"));
  }

  @Test
  public void test_omaha_holdem_8033_3s6d7s8cKs_5s2cJs2h_Ac8hQcQh_7cAh4cKd_8dTsTh9d_Ad4h2dKh_2s5h6cJh_9cQd8s6h_5d6sTdJd_Tc5cAs4s() {
    assertEquals(
      "2s5h6cJh=5d6sTdJd Ac8hQcQh Ad4h2dKh 9cQd8s6h 7cAh4cKd 8dTsTh9d 5s2cJs2h Tc5cAs4s",
      Solver.process("omaha-holdem 3s6d7s8cKs 5s2cJs2h Ac8hQcQh 7cAh4cKd 8dTsTh9d Ad4h2dKh 2s5h6cJh 9cQd8s6h 5d6sTdJd Tc5cAs4s"));
  }

  @Test
  public void test_omaha_holdem_8034_3d4h5h7d8c_Jc5dJdAd_QsTc4dAc_2cQcQh3s_AsJs8d5c_2h9dTh2s() {
    assertEquals(
      "2h9dTh2s QsTc4dAc Jc5dJdAd 2cQcQh3s AsJs8d5c",
      Solver.process("omaha-holdem 3d4h5h7d8c Jc5dJdAd QsTc4dAc 2cQcQh3s AsJs8d5c 2h9dTh2s"));
  }

  @Test
  public void test_omaha_holdem_8035_3s5h6hJcKh_As9s2c7s_JsAc9d7d_4c4dAh5d_8d7h8s5s_2h3d3hTh_8h5cQc2d_8c2s3cJd() {
    assertEquals(
      "As9s2c7s 8h5cQc2d 4c4dAh5d 8d7h8s5s JsAc9d7d 8c2s3cJd 2h3d3hTh",
      Solver.process("omaha-holdem 3s5h6hJcKh As9s2c7s JsAc9d7d 4c4dAh5d 8d7h8s5s 2h3d3hTh 8h5cQc2d 8c2s3cJd"));
  }

  @Test
  public void test_omaha_holdem_8036_4d6sAhJsKs_2sAd8s7s_Qd3c5c8d_2h6dTs5d_Qh2d6c9d() {
    assertEquals(
      "Qd3c5c8d 2h6dTs5d Qh2d6c9d 2sAd8s7s",
      Solver.process("omaha-holdem 4d6sAhJsKs 2sAd8s7s Qd3c5c8d 2h6dTs5d Qh2d6c9d"));
  }

  @Test
  public void test_omaha_holdem_8037_3s7h9sJcKc_9cKsQh7d_5c9d6c3d_7s2sQd4c_AcAdQs5d_8d6h6d7c() {
    assertEquals(
      "8d6h6d7c 7s2sQd4c AcAdQs5d 5c9d6c3d 9cKsQh7d",
      Solver.process("omaha-holdem 3s7h9sJcKc 9cKsQh7d 5c9d6c3d 7s2sQd4c AcAdQs5d 8d6h6d7c"));
  }

  @Test
  public void test_omaha_holdem_8038_4d4hKcQsTs_2s9dQcTd_5d3h2dAd_Th5hAcJd_JhJcJs3d() {
    assertEquals(
      "5d3h2dAd JhJcJs3d 2s9dQcTd Th5hAcJd",
      Solver.process("omaha-holdem 4d4hKcQsTs 2s9dQcTd 5d3h2dAd Th5hAcJd JhJcJs3d"));
  }

  @Test
  public void test_omaha_holdem_8039_2d5h8hAsKs_5c3s4s7s_Js2h8dQc_Jh6sTsKc() {
    assertEquals(
      "Jh6sTsKc Js2h8dQc 5c3s4s7s",
      Solver.process("omaha-holdem 2d5h8hAsKs 5c3s4s7s Js2h8dQc Jh6sTsKc"));
  }

  @Test
  public void test_omaha_holdem_8040_4sQcQdQhQs_Jc8hKhAc_3sAs4h2c_9d5cTc3d_Kc9h8d6s() {
    assertEquals(
      "9d5cTc3d Kc9h8d6s 3sAs4h2c Jc8hKhAc",
      Solver.process("omaha-holdem 4sQcQdQhQs Jc8hKhAc 3sAs4h2c 9d5cTc3d Kc9h8d6s"));
  }

  @Test
  public void test_omaha_holdem_8041_2c6c7dAhJc_8sJsQhKh_7sKs8h5c_ThTc9s3c_4c2h7cAs_8c4d8dTd_Kd3d9c9d() {
    assertEquals(
      "7sKs8h5c 8c4d8dTd Kd3d9c9d 8sJsQhKh 4c2h7cAs ThTc9s3c",
      Solver.process("omaha-holdem 2c6c7dAhJc 8sJsQhKh 7sKs8h5c ThTc9s3c 4c2h7cAs 8c4d8dTd Kd3d9c9d"));
  }

  @Test
  public void test_omaha_holdem_8042_2d2h8s9dTd_Ts4h2s9c_JsQsKcQc_4s5cTc3d_2cKs8h5d_Jh7hAh9h_Kd6d6c6s_3sAd8d7d() {
    assertEquals(
      "4s5cTc3d Jh7hAh9h JsQsKcQc Kd6d6c6s 3sAd8d7d 2cKs8h5d Ts4h2s9c",
      Solver.process("omaha-holdem 2d2h8s9dTd Ts4h2s9c JsQsKcQc 4s5cTc3d 2cKs8h5d Jh7hAh9h Kd6d6c6s 3sAd8d7d"));
  }

  @Test
  public void test_omaha_holdem_8043_3c3h8sAcKs_5sJcQhJh_8d4d9s7d_AdQsTs6d_2c5d8h3s_4cQc6c2s_KcQd7c5h_Ah4h7h7s() {
    assertEquals(
      "4cQc6c2s 8d4d9s7d 5sJcQhJh KcQd7c5h Ah4h7h7s AdQsTs6d 2c5d8h3s",
      Solver.process("omaha-holdem 3c3h8sAcKs 5sJcQhJh 8d4d9s7d AdQsTs6d 2c5d8h3s 4cQc6c2s KcQd7c5h Ah4h7h7s"));
  }

  @Test
  public void test_omaha_holdem_8044_4c4h5c9dJh_5h7c5d3c_KdQc7d9h_6s8cJd6h() {
    assertEquals(
      "KdQc7d9h 6s8cJd6h 5h7c5d3c",
      Solver.process("omaha-holdem 4c4h5c9dJh 5h7c5d3c KdQc7d9h 6s8cJd6h"));
  }

  @Test
  public void test_omaha_holdem_8045_5h7c8cJdJs_8hAdKc5d_4sKh7dQd_As9dKdAh() {
    assertEquals(
      "4sKh7dQd 8hAdKc5d As9dKdAh",
      Solver.process("omaha-holdem 5h7c8cJdJs 8hAdKc5d 4sKh7dQd As9dKdAh"));
  }

  @Test
  public void test_omaha_holdem_8046_4d4h7c7hKd_2h6d8hKc_7s9h6s4s() {
    assertEquals(
      "2h6d8hKc 7s9h6s4s",
      Solver.process("omaha-holdem 4d4h7c7hKd 2h6d8hKc 7s9h6s4s"));
  }

  @Test
  public void test_omaha_holdem_8047_3c5d5s6sAs_KdTd6h6d_Kc3s7c2h_QhTsQcJd_7sQs2s6c_5c8c3h2c_JcKs4s7h_Ac9dAd9c_Kh3d7dTc_9h2dQd4d() {
    assertEquals(
      "Kc3s7c2h=Kh3d7dTc QhTsQcJd 9h2dQd4d 7sQs2s6c JcKs4s7h 5c8c3h2c KdTd6h6d Ac9dAd9c",
      Solver.process("omaha-holdem 3c5d5s6sAs KdTd6h6d Kc3s7c2h QhTsQcJd 7sQs2s6c 5c8c3h2c JcKs4s7h Ac9dAd9c Kh3d7dTc 9h2dQd4d"));
  }

  @Test
  public void test_omaha_holdem_8048_2s7h7sTcTh_9h7d3s9c_Qd4c2d3d_3h4dAsKs() {
    assertEquals(
      "3h4dAsKs Qd4c2d3d 9h7d3s9c",
      Solver.process("omaha-holdem 2s7h7sTcTh 9h7d3s9c Qd4c2d3d 3h4dAsKs"));
  }

  @Test
  public void test_omaha_holdem_8049_2c2h8d9sTh_Kh6d3sKd_AhTd4hKc_2d5dKs3d_3h3c8c5h_Qc4c4s9d_Tc7hQsQh_Jd7dTsAd() {
    assertEquals(
      "3h3c8c5h Qc4c4s9d AhTd4hKc Tc7hQsQh Kh6d3sKd 2d5dKs3d Jd7dTsAd",
      Solver.process("omaha-holdem 2c2h8d9sTh Kh6d3sKd AhTd4hKc 2d5dKs3d 3h3c8c5h Qc4c4s9d Tc7hQsQh Jd7dTsAd"));
  }

  @Test
  public void test_omaha_holdem_8050_3c6h8hAdKc_8sKdTc2c_KsTd9s6d_5h4dJcQh() {
    assertEquals(
      "5h4dJcQh KsTd9s6d 8sKdTc2c",
      Solver.process("omaha-holdem 3c6h8hAdKc 8sKdTc2c KsTd9s6d 5h4dJcQh"));
  }

  @Test
  public void test_omaha_holdem_8051_2d7d9hAcTs_7cTh8c5h_Qd4dTc5s_3sKh2h3h_Qs6s6cTd_Ks9c2sJd_3c2cQc3d_8hJh4hQh_Kd9dAh4c_As4sJs8s() {
    assertEquals(
      "3c2cQc3d=3sKh2h3h Qd4dTc5s=Qs6s6cTd Ks9c2sJd 7cTh8c5h Kd9dAh4c 8hJh4hQh=As4sJs8s",
      Solver.process("omaha-holdem 2d7d9hAcTs 7cTh8c5h Qd4dTc5s 3sKh2h3h Qs6s6cTd Ks9c2sJd 3c2cQc3d 8hJh4hQh Kd9dAh4c As4sJs8s"));
  }

  @Test
  public void test_omaha_holdem_8052_2hAcAdJcKs_7c6s5s5d_As3s4h4s_5cQdJh3h_Qs8d7h7s_4dTs2c6h_Kh6d8cKd_8sJd9dAh() {
    assertEquals(
      "4dTs2c6h 7c6s5s5d Qs8d7h7s 5cQdJh3h As3s4h4s Kh6d8cKd 8sJd9dAh",
      Solver.process("omaha-holdem 2hAcAdJcKs 7c6s5s5d As3s4h4s 5cQdJh3h Qs8d7h7s 4dTs2c6h Kh6d8cKd 8sJd9dAh"));
  }

  @Test
  public void test_omaha_holdem_8053_5c5h8dQcQh_Ks2hAd7d_Kh2d2sAc_2cTcQd6d() {
    assertEquals(
      "Ks2hAd7d Kh2d2sAc 2cTcQd6d",
      Solver.process("omaha-holdem 5c5h8dQcQh Ks2hAd7d Kh2d2sAc 2cTcQd6d"));
  }

  @Test
  public void test_omaha_holdem_8054_2h3h6c6sQc_8sAd7c4d_4s3sQdTh_QsJhTsKs_9cKdJc8d() {
    assertEquals(
      "9cKdJc8d 8sAd7c4d 4s3sQdTh QsJhTsKs",
      Solver.process("omaha-holdem 2h3h6c6sQc 8sAd7c4d 4s3sQdTh QsJhTsKs 9cKdJc8d"));
  }

  @Test
  public void test_omaha_holdem_8055_2d6cAsThTs_Ad7s8cQh_3h9s6h4c_KdQsQd5h_6s7d4s9d_5cQcKh4d_8d2hAh3s_9h8sJcKc() {
    assertEquals(
      "9h8sJcKc 5cQcKh4d 3h9s6h4c=6s7d4s9d KdQsQd5h 8d2hAh3s Ad7s8cQh",
      Solver.process("omaha-holdem 2d6cAsThTs Ad7s8cQh 3h9s6h4c KdQsQd5h 6s7d4s9d 5cQcKh4d 8d2hAh3s 9h8sJcKc"));
  }

  @Test
  public void test_omaha_holdem_8056_2d9c9dKhQh_7cJs4hKd_7d5sTdJc_KsTc3h9h() {
    assertEquals(
      "7cJs4hKd 7d5sTdJc KsTc3h9h",
      Solver.process("omaha-holdem 2d9c9dKhQh 7cJs4hKd 7d5sTdJc KsTc3h9h"));
  }

  @Test
  public void test_omaha_holdem_8057_3s5s7hKdQh_9hQc3h2d_5hJcJs4s_Ac2cTh7c_9c9s6h9d_6c4dAd8d_8s6sJhTd_3dQsKcKh_8h7d5c7s() {
    assertEquals(
      "8s6sJhTd Ac2cTh7c 9c9s6h9d 5hJcJs4s 9hQc3h2d 8h7d5c7s 3dQsKcKh 6c4dAd8d",
      Solver.process("omaha-holdem 3s5s7hKdQh 9hQc3h2d 5hJcJs4s Ac2cTh7c 9c9s6h9d 6c4dAd8d 8s6sJhTd 3dQsKcKh 8h7d5c7s"));
  }

  @Test
  public void test_omaha_holdem_8058_3d8c8h8sJh_3c5s2sKc_ThKhQd4c_3s2h9c6h_5c6cKdKs_4dTd3h7c_5h2c7d8d_TcJdAh7s_6d4s6s9d_2dQsTs7h() {
    assertEquals(
      "3s2h9c6h 4dTd3h7c 2dQsTs7h 3c5s2sKc ThKhQd4c TcJdAh7s 6d4s6s9d 5c6cKdKs 5h2c7d8d",
      Solver.process("omaha-holdem 3d8c8h8sJh 3c5s2sKc ThKhQd4c 3s2h9c6h 5c6cKdKs 4dTd3h7c 5h2c7d8d TcJdAh7s 6d4s6s9d 2dQsTs7h"));
  }

  @Test
  public void test_omaha_holdem_8059_6c7dJdJsQh_Kh8d3c5h_7c4hAd4d_2sTcKs7h_AsThQc5d_6h8sJh8h_2c9cQs7s_5cJc5sTd() {
    assertEquals(
      "Kh8d3c5h 2sTcKs7h 7c4hAd4d 2c9cQs7s AsThQc5d 5cJc5sTd 6h8sJh8h",
      Solver.process("omaha-holdem 6c7dJdJsQh Kh8d3c5h 7c4hAd4d 2sTcKs7h AsThQc5d 6h8sJh8h 2c9cQs7s 5cJc5sTd"));
  }

  @Test
  public void test_omaha_holdem_8060_3h4h6d6hQd_2s3cJcKd_7sJsTdQs_Ad5sQhKh() {
    assertEquals(
      "2s3cJcKd 7sJsTdQs Ad5sQhKh",
      Solver.process("omaha-holdem 3h4h6d6hQd 2s3cJcKd 7sJsTdQs Ad5sQhKh"));
  }

  @Test
  public void test_omaha_holdem_8061_2d5cAhKdQs_TdJd8dKc_6cJsTs3c_5d6d2hKh_9h9d8c7h_2s2cTh9c() {
    assertEquals(
      "9h9d8c7h 5d6d2hKh 2s2cTh9c 6cJsTs3c=TdJd8dKc",
      Solver.process("omaha-holdem 2d5cAhKdQs TdJd8dKc 6cJsTs3c 5d6d2hKh 9h9d8c7h 2s2cTh9c"));
  }

  @Test
  public void test_omaha_holdem_8062_2c2d7s8sAs_3cQcJd4c_7h5dKc6s_6d5h8hTd_AcKsQd5c_9h2hJh8c_9s2s7c6c_8d4h3sQs_4d9d4sAh() {
    assertEquals(
      "3cQcJd4c 7h5dKc6s 6d5h8hTd 4d9d4sAh AcKsQd5c 8d4h3sQs 9s2s7c6c 9h2hJh8c",
      Solver.process("omaha-holdem 2c2d7s8sAs 3cQcJd4c 7h5dKc6s 6d5h8hTd AcKsQd5c 9h2hJh8c 9s2s7c6c 8d4h3sQs 4d9d4sAh"));
  }

  @Test
  public void test_omaha_holdem_8063_2h6cJsKdTh_8d9s3cQc_4c2d8c8s() {
    assertEquals(
      "4c2d8c8s 8d9s3cQc",
      Solver.process("omaha-holdem 2h6cJsKdTh 8d9s3cQc 4c2d8c8s"));
  }

  @Test
  public void test_omaha_holdem_8064_6s7s8cKhTc_8d2s7cKc_8sQd5s5d() {
    assertEquals(
      "8sQd5s5d 8d2s7cKc",
      Solver.process("omaha-holdem 6s7s8cKhTc 8d2s7cKc 8sQd5s5d"));
  }

  @Test
  public void test_omaha_holdem_8065_6s8s9h9sAd_As7c3s9d_6c9c7s4s_6d2hTd2c_8dQcTsAh_5h2d3hJs() {
    assertEquals(
      "5h2d3hJs 6d2hTd2c 8dQcTsAh 6c9c7s4s As7c3s9d",
      Solver.process("omaha-holdem 6s8s9h9sAd As7c3s9d 6c9c7s4s 6d2hTd2c 8dQcTsAh 5h2d3hJs"));
  }

  @Test
  public void test_omaha_holdem_8066_2h5d5s7cAd_7s2s2c3s_9cAsTh8d_Qs4h6h9d_8hQh2d4d_Ks9sAh7h_9hJhTs8c_Tc4cJd3d_TdQc7d6c_3hQd8s6d() {
    assertEquals(
      "9hJhTs8c 3hQd8s6d Qs4h6h9d 8hQh2d4d TdQc7d6c 9cAsTh8d Ks9sAh7h Tc4cJd3d 7s2s2c3s",
      Solver.process("omaha-holdem 2h5d5s7cAd 7s2s2c3s 9cAsTh8d Qs4h6h9d 8hQh2d4d Ks9sAh7h 9hJhTs8c Tc4cJd3d TdQc7d6c 3hQd8s6d"));
  }

  @Test
  public void test_omaha_holdem_8067_2s6c7h8sAh_Qc4c6dKc_6sAdJcKs_Js4h5sQs_8dTs5cJh_Kh8hJd2h_5h7s2c3d_2d3c9dAc_4s9sTc7c() {
    assertEquals(
      "Qc4c6dKc 8dTs5cJh 5h7s2c3d Kh8hJd2h 2d3c9dAc 6sAdJcKs Js4h5sQs 4s9sTc7c",
      Solver.process("omaha-holdem 2s6c7h8sAh Qc4c6dKc 6sAdJcKs Js4h5sQs 8dTs5cJh Kh8hJd2h 5h7s2c3d 2d3c9dAc 4s9sTc7c"));
  }

  @Test
  public void test_omaha_holdem_8068_2h3c5c8hQh_5d3dKs7h_Kh2d9sQd_6c7d6h6s_8cTh7c8d() {
    assertEquals(
      "6c7d6h6s 5d3dKs7h Kh2d9sQd 8cTh7c8d",
      Solver.process("omaha-holdem 2h3c5c8hQh 5d3dKs7h Kh2d9sQd 6c7d6h6s 8cTh7c8d"));
  }

  @Test
  public void test_omaha_holdem_8069_7hJcJhJsQs_AhQc7dTh_9dTc8c8d() {
    assertEquals(
      "AhQc7dTh 9dTc8c8d",
      Solver.process("omaha-holdem 7hJcJhJsQs AhQc7dTh 9dTc8c8d"));
  }

  @Test
  public void test_omaha_holdem_8070_6d8d8sKsQs_3h9sAh4d_QcJh9hKh() {
    assertEquals(
      "3h9sAh4d QcJh9hKh",
      Solver.process("omaha-holdem 6d8d8sKsQs 3h9sAh4d QcJh9hKh"));
  }

  @Test
  public void test_omaha_holdem_8071_2sJcJdKcQh_8s5dAcTs_Qd4hTd2d() {
    assertEquals(
      "Qd4hTd2d 8s5dAcTs",
      Solver.process("omaha-holdem 2sJcJdKcQh 8s5dAcTs Qd4hTd2d"));
  }

  @Test
  public void test_omaha_holdem_8072_2c7dAsKcQs_Td8c6h8h_3dKd5cAc_8s5sQcAh_4cQdThAd_9d2s3sJs_9h2dQhKs_4d7c6s4s() {
    assertEquals(
      "9d2s3sJs 4d7c6s4s Td8c6h8h 9h2dQhKs 4cQdThAd=8s5sQcAh 3dKd5cAc",
      Solver.process("omaha-holdem 2c7dAsKcQs Td8c6h8h 3dKd5cAc 8s5sQcAh 4cQdThAd 9d2s3sJs 9h2dQhKs 4d7c6s4s"));
  }

  @Test
  public void test_omaha_holdem_8073_5c6d6h9sJd_Ts2cJsQd_4c3d7d5s_As8s9d8d_Kh5h7cQs_KdTc3hJh_4d7s3c4s_JcKsQh6s() {
    assertEquals(
      "4d7s3c4s 4c3d7d5s Kh5h7cQs As8s9d8d Ts2cJsQd KdTc3hJh JcKsQh6s",
      Solver.process("omaha-holdem 5c6d6h9sJd Ts2cJsQd 4c3d7d5s As8s9d8d Kh5h7cQs KdTc3hJh 4d7s3c4s JcKsQh6s"));
  }

  @Test
  public void test_omaha_holdem_8074_2c5c5h6d8c_Js4sAh3s_KsQd2hKd_9c4d2d6c_5dQh7s6h_4h7cTs3c_7hKc7dJd_8s8d5sAc_QsAsJh9s() {
    assertEquals(
      "QsAsJh9s 7hKc7dJd KsQd2hKd Js4sAh3s 4h7cTs3c 9c4d2d6c 5dQh7s6h 8s8d5sAc",
      Solver.process("omaha-holdem 2c5c5h6d8c Js4sAh3s KsQd2hKd 9c4d2d6c 5dQh7s6h 4h7cTs3c 7hKc7dJd 8s8d5sAc QsAsJh9s"));
  }

  @Test
  public void test_omaha_holdem_8075_5s6c8sAsTd_Jc2hQh9d_9cQdTs4d() {
    assertEquals(
      "Jc2hQh9d 9cQdTs4d",
      Solver.process("omaha-holdem 5s6c8sAsTd Jc2hQh9d 9cQdTs4d"));
  }

  @Test
  public void test_omaha_holdem_8076_3s4h4s6sAs_7c8h8sJh_7d9h7hQs_Ks4dJcQc_2sThJd7s() {
    assertEquals(
      "7d9h7hQs 7c8h8sJh Ks4dJcQc 2sThJd7s",
      Solver.process("omaha-holdem 3s4h4s6sAs 7c8h8sJh 7d9h7hQs Ks4dJcQc 2sThJd7s"));
  }

  @Test
  public void test_omaha_holdem_8077_3h6c6s7c9h_Jd6d4sAs_QhJcQs7h_2cAhAc7s_9c2dQdTs_Jh6hKc9d() {
    assertEquals(
      "9c2dQdTs QhJcQs7h 2cAhAc7s Jd6d4sAs Jh6hKc9d",
      Solver.process("omaha-holdem 3h6c6s7c9h Jd6d4sAs QhJcQs7h 2cAhAc7s 9c2dQdTs Jh6hKc9d"));
  }

  @Test
  public void test_omaha_holdem_8078_4c7h8d9cQd_5cAsKcQs_7c2h9dAh_9s3hJhKd_Jd8sQhAd_7s3d2sTc_KsJc5dTs_4dJsTd6d() {
    assertEquals(
      "7s3d2sTc 9s3hJhKd 5cAsKcQs 7c2h9dAh Jd8sQhAd 4dJsTd6d=KsJc5dTs",
      Solver.process("omaha-holdem 4c7h8d9cQd 5cAsKcQs 7c2h9dAh 9s3hJhKd Jd8sQhAd 7s3d2sTc KsJc5dTs 4dJsTd6d"));
  }

  @Test
  public void test_omaha_holdem_8079_7s8d8h9hAc_8cTcQcAd_KsTdJc6c_7c5h3s6d_QhKh9c9d_8s4s7d5d() {
    assertEquals(
      "7c5h3s6d KsTdJc6c 8s4s7d5d 8cTcQcAd QhKh9c9d",
      Solver.process("omaha-holdem 7s8d8h9hAc 8cTcQcAd KsTdJc6c 7c5h3s6d QhKh9c9d 8s4s7d5d"));
  }

  @Test
  public void test_omaha_holdem_8080_2s3dJdKdQs_8d9h3s5s_7d5d6dQc_8s4sQdJs_Td4cTh7c_AdAc5h9c() {
    assertEquals(
      "8d9h3s5s Td4cTh7c AdAc5h9c 8s4sQdJs 7d5d6dQc",
      Solver.process("omaha-holdem 2s3dJdKdQs 8d9h3s5s 7d5d6dQc 8s4sQdJs Td4cTh7c AdAc5h9c"));
  }

  @Test
  public void test_omaha_holdem_8081_2c8d8h9dJs_Ac5hTd8c_5c7hQd5d_Jh2h2d4c_7sTh3dQc() {
    assertEquals(
      "5c7hQd5d Ac5hTd8c 7sTh3dQc Jh2h2d4c",
      Solver.process("omaha-holdem 2c8d8h9dJs Ac5hTd8c 5c7hQd5d Jh2h2d4c 7sTh3dQc"));
  }

  @Test
  public void test_omaha_holdem_8082_3d4d5s6cAd_2sQc6hKs_7h4cJc2h_9hQh4hTh_Jh8d4sQs_Js5h5cJd_TcKc8c5d() {
    assertEquals(
      "9hQh4hTh=Jh8d4sQs TcKc8c5d Js5h5cJd 2sQc6hKs 7h4cJc2h",
      Solver.process("omaha-holdem 3d4d5s6cAd 2sQc6hKs 7h4cJc2h 9hQh4hTh Jh8d4sQs Js5h5cJd TcKc8c5d"));
  }

  @Test
  public void test_omaha_holdem_8083_AcJdKhKsQs_Qc8h6d9s_ThTd5d2s_3s6sAdTs_4d4hKd7s_3h9d2cJs_Jc2hKc8s_6hAs6c5s() {
    assertEquals(
      "ThTd5d2s 3h9d2cJs Qc8h6d9s 6hAs6c5s 4d4hKd7s 3s6sAdTs Jc2hKc8s",
      Solver.process("omaha-holdem AcJdKhKsQs Qc8h6d9s ThTd5d2s 3s6sAdTs 4d4hKd7s 3h9d2cJs Jc2hKc8s 6hAs6c5s"));
  }

  @Test
  public void test_omaha_holdem_8084_2c2s4d5hAc_As5sTh9s_7cTs6d5d_3c6s3h8h_9dAdTd5c_7sKsKd3s_8sQdTc9h_Jc7dAh8c_6h7h3d2d_9cQc8d4s() {
    assertEquals(
      "8sQdTc9h 9cQc8d4s 7cTs6d5d 7sKsKd3s Jc7dAh8c 9dAdTd5c=As5sTh9s 3c6s3h8h=6h7h3d2d",
      Solver.process("omaha-holdem 2c2s4d5hAc As5sTh9s 7cTs6d5d 3c6s3h8h 9dAdTd5c 7sKsKd3s 8sQdTc9h Jc7dAh8c 6h7h3d2d 9cQc8d4s"));
  }

  @Test
  public void test_omaha_holdem_8085_2d4d5cAsTc_3d4s3sJs_3cQs9dKc_KdAd2h6c_JhJd9h6h_8d4cQh9c() {
    assertEquals(
      "3cQs9dKc 8d4cQh9c JhJd9h6h KdAd2h6c 3d4s3sJs",
      Solver.process("omaha-holdem 2d4d5cAsTc 3d4s3sJs 3cQs9dKc KdAd2h6c JhJd9h6h 8d4cQh9c"));
  }

  @Test
  public void test_omaha_holdem_8086_6s7h8sAhTs_Kc3s7d7c_4hJhTcJs_Ad8h5s2c_JdTd9c4d_2h9d8d3c() {
    assertEquals(
      "4hJhTcJs Ad8h5s2c Kc3s7d7c 2h9d8d3c JdTd9c4d",
      Solver.process("omaha-holdem 6s7h8sAhTs Kc3s7d7c 4hJhTcJs Ad8h5s2c JdTd9c4d 2h9d8d3c"));
  }

  @Test
  public void test_omaha_holdem_8087_3d6d6hAhJd_5c8hThJc_5d2h4h7s_9dJhQs8d_7dTc4d8c() {
    assertEquals(
      "5d2h4h7s 5c8hThJc 7dTc4d8c 9dJhQs8d",
      Solver.process("omaha-holdem 3d6d6hAhJd 5c8hThJc 5d2h4h7s 9dJhQs8d 7dTc4d8c"));
  }

  @Test
  public void test_omaha_holdem_8088_4d4h5sQdTc_7c8c5c7d_8sTs4cAd_3hQcKs9s_3s5d2c9h_Jd6cThKc_QsJsAs2d_8hJc9d8d_9cKh3d6h_6sJh2s6d() {
    assertEquals(
      "9cKh3d6h 3s5d2c9h 6sJh2s6d 7c8c5c7d 8hJc9d8d Jd6cThKc 3hQcKs9s QsJsAs2d 8sTs4cAd",
      Solver.process("omaha-holdem 4d4h5sQdTc 7c8c5c7d 8sTs4cAd 3hQcKs9s 3s5d2c9h Jd6cThKc QsJsAs2d 8hJc9d8d 9cKh3d6h 6sJh2s6d"));
  }

  @Test
  public void test_omaha_holdem_8089_3c4h4sKcQd_AdJd6s7d_7c4c2h6c() {
    assertEquals(
      "AdJd6s7d 7c4c2h6c",
      Solver.process("omaha-holdem 3c4h4sKcQd AdJd6s7d 7c4c2h6c"));
  }

  @Test
  public void test_omaha_holdem_8090_4d5d5s6cKs_4s9sTs8d_4hThKd6s_8c3hQcAh_9dAsTd7h_2c2sKc3c_2hTcJh5c_9cQdJdQh() {
    assertEquals(
      "9dAsTd7h 8c3hQcAh 4s9sTs8d 9cQdJdQh 4hThKd6s 2hTcJh5c 2c2sKc3c",
      Solver.process("omaha-holdem 4d5d5s6cKs 4s9sTs8d 4hThKd6s 8c3hQcAh 9dAsTd7h 2c2sKc3c 2hTcJh5c 9cQdJdQh"));
  }

  @Test
  public void test_omaha_holdem_8091_3d8dJcKsTc_Ac2dKhJh_Jd7s8s2c_6h5s5d4s_Ad3h5cKd_8cTd6dQd_As7h9s4h() {
    assertEquals(
      "6h5s5d4s 8cTd6dQd Jd7s8s2c Ad3h5cKd Ac2dKhJh As7h9s4h",
      Solver.process("omaha-holdem 3d8dJcKsTc Ac2dKhJh Jd7s8s2c 6h5s5d4s Ad3h5cKd 8cTd6dQd As7h9s4h"));
  }

  @Test
  public void test_omaha_holdem_8092_4h5s8d9dKc_Ad2cJsTh_5d8s7h3s_6s3cAs2s_9cQd6hAc_9sTs2dQs_5h3d8c5c_9hTc4d7c() {
    assertEquals(
      "6s3cAs2s Ad2cJsTh 9sTs2dQs 9cQd6hAc 5d8s7h3s 9hTc4d7c 5h3d8c5c",
      Solver.process("omaha-holdem 4h5s8d9dKc Ad2cJsTh 5d8s7h3s 6s3cAs2s 9cQd6hAc 9sTs2dQs 5h3d8c5c 9hTc4d7c"));
  }

  @Test
  public void test_omaha_holdem_8093_3h4c5h8sTh_7c2hAsJd_5cTs4hTd_KdAh7d2s_JsQc7hQs_AcKsTc7s() {
    assertEquals(
      "AcKsTc7s JsQc7hQs 5cTs4hTd 7c2hAsJd=KdAh7d2s",
      Solver.process("omaha-holdem 3h4c5h8sTh 7c2hAsJd 5cTs4hTd KdAh7d2s JsQc7hQs AcKsTc7s"));
  }

  @Test
  public void test_omaha_holdem_8094_4h8h9sJsQc_4c5hQd6s_4dTh6cKs_8c9hKc2h_QhAh5sKd_AsKh3d8s_5dJd9c6h() {
    assertEquals(
      "AsKh3d8s QhAh5sKd 8c9hKc2h 5dJd9c6h 4c5hQd6s 4dTh6cKs",
      Solver.process("omaha-holdem 4h8h9sJsQc 4c5hQd6s 4dTh6cKs 8c9hKc2h QhAh5sKd AsKh3d8s 5dJd9c6h"));
  }

  @Test
  public void test_omaha_holdem_8095_3d5h6dKcKd_9sAs4cTh_AcTd2sJc() {
    assertEquals(
      "9sAs4cTh AcTd2sJc",
      Solver.process("omaha-holdem 3d5h6dKcKd 9sAs4cTh AcTd2sJc"));
  }

  @Test
  public void test_omaha_holdem_8096_2s3s4d6sKh_4hTs2hQc_8dJhJc7s_6h9dJd4c_5c6d7d9s_Kc6c5hQd_5dQhAdAc_8sTd9cQs() {
    assertEquals(
      "8dJhJc7s 4hTs2hQc 6h9dJd4c 5dQhAdAc Kc6c5hQd 5c6d7d9s 8sTd9cQs",
      Solver.process("omaha-holdem 2s3s4d6sKh 4hTs2hQc 8dJhJc7s 6h9dJd4c 5c6d7d9s Kc6c5hQd 5dQhAdAc 8sTd9cQs"));
  }

  @Test
  public void test_omaha_holdem_8097_2c3c8d8sQd_Ts2d4sTh_Kd5sAh8c() {
    assertEquals(
      "Ts2d4sTh Kd5sAh8c",
      Solver.process("omaha-holdem 2c3c8d8sQd Ts2d4sTh Kd5sAh8c"));
  }

  @Test
  public void test_omaha_holdem_8098_6h9cJcQcTc_QdKs4s8d_3h6s7h8c_5s4d4c2d_9hAdTd2s_7s7dThJs_Kd6dAsQs_9s9dAh8s_6cQh3c5d_5cJd8h4h() {
    assertEquals(
      "5s4d4c2d 9hAdTd2s 7s7dThJs 3h6s7h8c 5cJd8h4h=9s9dAh8s QdKs4s8d Kd6dAsQs 6cQh3c5d",
      Solver.process("omaha-holdem 6h9cJcQcTc QdKs4s8d 3h6s7h8c 5s4d4c2d 9hAdTd2s 7s7dThJs Kd6dAsQs 9s9dAh8s 6cQh3c5d 5cJd8h4h"));
  }

  @Test
  public void test_omaha_holdem_8099_2cAsJhQsTd_2dTc5c4c_4s6h9s5s() {
    assertEquals(
      "4s6h9s5s 2dTc5c4c",
      Solver.process("omaha-holdem 2cAsJhQsTd 2dTc5c4c 4s6h9s5s"));
  }

  @Test
  public void test_omaha_holdem_8100_2d6h8d9dTc_AsQd7hKc_AhQhTsAd() {
    assertEquals(
      "AsQd7hKc AhQhTsAd",
      Solver.process("omaha-holdem 2d6h8d9dTc AsQd7hKc AhQhTsAd"));
  }

  @Test
  public void test_omaha_holdem_8101_5d9c9dAsQd_9s8dKsJd_4s8s4h3d_Js8h2d7h_7dAhTh4c_Td8c4dKh_Ac3hJcJh_Qs3s7s6d_5s9h7cAd() {
    assertEquals(
      "Js8h2d7h 4s8s4h3d Qs3s7s6d 7dAhTh4c Ac3hJcJh Td8c4dKh 9s8dKsJd 5s9h7cAd",
      Solver.process("omaha-holdem 5d9c9dAsQd 9s8dKsJd 4s8s4h3d Js8h2d7h 7dAhTh4c Td8c4dKh Ac3hJcJh Qs3s7s6d 5s9h7cAd"));
  }

  @Test
  public void test_omaha_holdem_8102_2d6cAcJhTs_8s9d4dKc_ThQdQcJc_3d5h9h7s_6h2c5s6d_9s8c8dQh_AdJs4s2s_Tc2h9cKs_3cJd6sQs() {
    assertEquals(
      "3d5h9h7s 8s9d4dKc 9s8c8dQh Tc2h9cKs 3cJd6sQs ThQdQcJc AdJs4s2s 6h2c5s6d",
      Solver.process("omaha-holdem 2d6cAcJhTs 8s9d4dKc ThQdQcJc 3d5h9h7s 6h2c5s6d 9s8c8dQh AdJs4s2s Tc2h9cKs 3cJd6sQs"));
  }

  @Test
  public void test_omaha_holdem_8103_4h7c7dAdQc_5h2s7sTs_Qh2h5d6h_Jd4d2c8d_4cKdTh8s_KsAs9s3d() {
    assertEquals(
      "Jd4d2c8d 4cKdTh8s Qh2h5d6h KsAs9s3d 5h2s7sTs",
      Solver.process("omaha-holdem 4h7c7dAdQc 5h2s7sTs Qh2h5d6h Jd4d2c8d 4cKdTh8s KsAs9s3d"));
  }

  @Test
  public void test_omaha_holdem_8104_3s5cAhTcTs_9cJd2d4d_9sJc8cJh_4h8d5hAc_Kc3c6h9h() {
    assertEquals(
      "Kc3c6h9h 9sJc8cJh 4h8d5hAc 9cJd2d4d",
      Solver.process("omaha-holdem 3s5cAhTcTs 9cJd2d4d 9sJc8cJh 4h8d5hAc Kc3c6h9h"));
  }

  @Test
  public void test_omaha_holdem_8105_2h3s5c5h7h_Kh9sTc6c_QsJd9h6s() {
    assertEquals(
      "QsJd9h6s Kh9sTc6c",
      Solver.process("omaha-holdem 2h3s5c5h7h Kh9sTc6c QsJd9h6s"));
  }

  @Test
  public void test_omaha_holdem_8106_8d8h8sJcQd_3sJsQcTs_KsQhJdTc_6h4h8cKd() {
    assertEquals(
      "3sJsQcTs KsQhJdTc 6h4h8cKd",
      Solver.process("omaha-holdem 8d8h8sJcQd 3sJsQcTs KsQhJdTc 6h4h8cKd"));
  }

  @Test
  public void test_omaha_holdem_8107_3h5h7dJsKs_5s2d6c5d_As7s8hQh_9sTdAdKc() {
    assertEquals(
      "As7s8hQh 9sTdAdKc 5s2d6c5d",
      Solver.process("omaha-holdem 3h5h7dJsKs 5s2d6c5d As7s8hQh 9sTdAdKc"));
  }

  @Test
  public void test_omaha_holdem_8108_6c9cKdKsQc_2h5c4hJd_QdJh9sKc_Td4d6d8c_5s5dAd9d_6s2sAs3d_Kh8d3h7s() {
    assertEquals(
      "2h5c4hJd Td4d6d8c 6s2sAs3d 5s5dAd9d Kh8d3h7s QdJh9sKc",
      Solver.process("omaha-holdem 6c9cKdKsQc 2h5c4hJd QdJh9sKc Td4d6d8c 5s5dAd9d 6s2sAs3d Kh8d3h7s"));
  }

  @Test
  public void test_omaha_holdem_8109_6h8s9sAhTc_4d2dJd7c_2hAc5s2c() {
    assertEquals(
      "2hAc5s2c 4d2dJd7c",
      Solver.process("omaha-holdem 6h8s9sAhTc 4d2dJd7c 2hAc5s2c"));
  }

  @Test
  public void test_omaha_holdem_8110_2s3c5h7hAd_5sAsQdTs_Ah6hKdKs_2c8sTcTh_2h4d9c3d() {
    assertEquals(
      "2c8sTcTh Ah6hKdKs 5sAsQdTs 2h4d9c3d",
      Solver.process("omaha-holdem 2s3c5h7hAd 5sAsQdTs Ah6hKdKs 2c8sTcTh 2h4d9c3d"));
  }

  @Test
  public void test_omaha_holdem_8111_5s8d8h9hQh_Ad4s2d7s_Th5cJd3s_4d7hKd9c_Jc7dJhAs_6d3dQs3c() {
    assertEquals(
      "Ad4s2d7s 4d7hKd9c Jc7dJhAs 6d3dQs3c Th5cJd3s",
      Solver.process("omaha-holdem 5s8d8h9hQh Ad4s2d7s Th5cJd3s 4d7hKd9c Jc7dJhAs 6d3dQs3c"));
  }

  @Test
  public void test_omaha_holdem_8112_7dAcKhKsTs_Kd7h3c8c_Ad3h4cTd() {
    assertEquals(
      "Ad3h4cTd Kd7h3c8c",
      Solver.process("omaha-holdem 7dAcKhKsTs Kd7h3c8c Ad3h4cTd"));
  }

  @Test
  public void test_omaha_holdem_8113_4d5s6c9dTd_Qs7s2sJc_Qh6hKh7h_6sTc3s3h_AsAh9c7c_Kd8c3c5h_2h2cTsJd_5d6d4hJh_2dAcAd8d_ThJs9s8s() {
    assertEquals(
      "Qs7s2sJc Kd8c3c5h Qh6hKh7h 2h2cTsJd AsAh9c7c 6sTc3s3h ThJs9s8s 5d6d4hJh 2dAcAd8d",
      Solver.process("omaha-holdem 4d5s6c9dTd Qs7s2sJc Qh6hKh7h 6sTc3s3h AsAh9c7c Kd8c3c5h 2h2cTsJd 5d6d4hJh 2dAcAd8d ThJs9s8s"));
  }

  @Test
  public void test_omaha_holdem_8114_4s6c7cAhKc_9d8c7s8h_5c6d2s4d_QcJc6sAs_Qs5s9c9h_Qd4hJs2h_3s9s3c6h_5dTh2c3h_TdKs8d5h() {
    assertEquals(
      "Qd4hJs2h 3s9s3c6h 9d8c7s8h Qs5s9c9h 5c6d2s4d 5dTh2c3h TdKs8d5h QcJc6sAs",
      Solver.process("omaha-holdem 4s6c7cAhKc 9d8c7s8h 5c6d2s4d QcJc6sAs Qs5s9c9h Qd4hJs2h 3s9s3c6h 5dTh2c3h TdKs8d5h"));
  }

  @Test
  public void test_omaha_holdem_8115_4d8s9h9sJs_6dTc8h4h_Qc5h5dJd_2hKs3hQs_4sQhKd7c_Jh6sAhJc() {
    assertEquals(
      "4sQhKd7c 6dTc8h4h Qc5h5dJd 2hKs3hQs Jh6sAhJc",
      Solver.process("omaha-holdem 4d8s9h9sJs 6dTc8h4h Qc5h5dJd 2hKs3hQs 4sQhKd7c Jh6sAhJc"));
  }

  @Test
  public void test_omaha_holdem_8116_4h5h6d7sKs_AdQh5s4s_2cQs8h6h_KdQd3s3h() {
    assertEquals(
      "KdQd3s3h AdQh5s4s 2cQs8h6h",
      Solver.process("omaha-holdem 4h5h6d7sKs AdQh5s4s 2cQs8h6h KdQd3s3h"));
  }

  @Test
  public void test_omaha_holdem_8117_5d6s7h8c8s_3sQc5h4c_Jd5s7dAs() {
    assertEquals(
      "Jd5s7dAs 3sQc5h4c",
      Solver.process("omaha-holdem 5d6s7h8c8s 3sQc5h4c Jd5s7dAs"));
  }

  @Test
  public void test_omaha_holdem_8118_2h3sKsQhQs_Ac5c8d2d_9d6c4s7d_7s5d3d5h_Qd3h3cQc_Kc4hJs5s_2s9s2c7h_8cKd4c6s_JdJhKh8s_9cThTc8h() {
    assertEquals(
      "9d6c4s7d Ac5c8d2d 7s5d3d5h 9cThTc8h 8cKd4c6s JdJhKh8s Kc4hJs5s 2s9s2c7h Qd3h3cQc",
      Solver.process("omaha-holdem 2h3sKsQhQs Ac5c8d2d 9d6c4s7d 7s5d3d5h Qd3h3cQc Kc4hJs5s 2s9s2c7h 8cKd4c6s JdJhKh8s 9cThTc8h"));
  }

  @Test
  public void test_omaha_holdem_8119_2c3c7c7hKc_JcJh8sQs_Ah6h6c9h_4d9cKdTs_3s9dKsAs() {
    assertEquals(
      "Ah6h6c9h JcJh8sQs 4d9cKdTs 3s9dKsAs",
      Solver.process("omaha-holdem 2c3c7c7hKc JcJh8sQs Ah6h6c9h 4d9cKdTs 3s9dKsAs"));
  }

  @Test
  public void test_omaha_holdem_8120_5d7s9cAhQh_Kh2c8dKc_6h3d4d7h_4h2dQd5h_TdQcKd6c_JcTc5c3h_7d8cJd9d_6s5s4cKs() {
    assertEquals(
      "JcTc5c3h 6s5s4cKs 6h3d4d7h TdQcKd6c Kh2c8dKc 7d8cJd9d 4h2dQd5h",
      Solver.process("omaha-holdem 5d7s9cAhQh Kh2c8dKc 6h3d4d7h 4h2dQd5h TdQcKd6c JcTc5c3h 7d8cJd9d 6s5s4cKs"));
  }

  @Test
  public void test_omaha_holdem_8121_6cJhQhQsTd_4s2h2d4d_8dJdKh8s_5d4hKsQc_6d2sTsAh_6hAd7h8h() {
    assertEquals(
      "4s2h2d4d 6hAd7h8h 6d2sTsAh 8dJdKh8s 5d4hKsQc",
      Solver.process("omaha-holdem 6cJhQhQsTd 4s2h2d4d 8dJdKh8s 5d4hKsQc 6d2sTsAh 6hAd7h8h"));
  }

  @Test
  public void test_omaha_holdem_8122_5d6sJdKhTc_9c6dTsKd_Kc3d7c3s_2dQcAh3c_KsQsJcTd_8d8c3hJh() {
    assertEquals(
      "8d8c3hJh Kc3d7c3s 9c6dTsKd KsQsJcTd 2dQcAh3c",
      Solver.process("omaha-holdem 5d6sJdKhTc 9c6dTsKd Kc3d7c3s 2dQcAh3c KsQsJcTd 8d8c3hJh"));
  }

  @Test
  public void test_omaha_holdem_8123_4d5d8dQdTd_5sQhKc6d_7s6sJcJh_Kd4s7h8c_7cTsKsAc_5cAs9h2d_9s2s9dJs_Ah4h9c6c() {
    assertEquals(
      "Ah4h9c6c 5cAs9h2d 7cTsKsAc Kd4s7h8c 5sQhKc6d 7s6sJcJh 9s2s9dJs",
      Solver.process("omaha-holdem 4d5d8dQdTd 5sQhKc6d 7s6sJcJh Kd4s7h8c 7cTsKsAc 5cAs9h2d 9s2s9dJs Ah4h9c6c"));
  }

  @Test
  public void test_omaha_holdem_8124_6c6s8hAcQh_QsJs8sKc_Ts5h9dKh_4dKs2hAd_2cTc5sAs() {
    assertEquals(
      "Ts5h9dKh QsJs8sKc 2cTc5sAs 4dKs2hAd",
      Solver.process("omaha-holdem 6c6s8hAcQh QsJs8sKc Ts5h9dKh 4dKs2hAd 2cTc5sAs"));
  }

  @Test
  public void test_omaha_holdem_8125_2s3s4dAhJs_3d3c9h5s_8c5h8s2d_QdQs6d4c_7hAd8d9s_Jh4h3h9c_AcThKdTc_6s5c9d7c_4sJc8h2h_5dQh2cTs() {
    assertEquals(
      "QdQs6d4c 7hAd8d9s AcThKdTc 4sJc8h2h=Jh4h3h9c 3d3c9h5s=5dQh2cTs=8c5h8s2d 6s5c9d7c",
      Solver.process("omaha-holdem 2s3s4dAhJs 3d3c9h5s 8c5h8s2d QdQs6d4c 7hAd8d9s Jh4h3h9c AcThKdTc 6s5c9d7c 4sJc8h2h 5dQh2cTs"));
  }

  @Test
  public void test_omaha_holdem_8126_2d3h8sJsQh_3c9s5h9h_8hTd6sJd_2c4hQs6d_3sTc3dKh() {
    assertEquals(
      "3c9s5h9h 8hTd6sJd 2c4hQs6d 3sTc3dKh",
      Solver.process("omaha-holdem 2d3h8sJsQh 3c9s5h9h 8hTd6sJd 2c4hQs6d 3sTc3dKh"));
  }

  @Test
  public void test_omaha_holdem_8127_6h9dKhQdTd_AsTsQh5s_9s5cAcKc_4s8c3dKs_8h6cJc6s_2h7s7h4d_7cJdQs4c_5d5h4h2c_3s7d9h9c() {
    assertEquals(
      "5d5h4h2c 2h7s7h4d 4s8c3dKs AsTsQh5s 9s5cAcKc 3s7d9h9c 8h6cJc6s 7cJdQs4c",
      Solver.process("omaha-holdem 6h9dKhQdTd AsTsQh5s 9s5cAcKc 4s8c3dKs 8h6cJc6s 2h7s7h4d 7cJdQs4c 5d5h4h2c 3s7d9h9c"));
  }

  @Test
  public void test_omaha_holdem_8128_3c8cJcKsTh_QsTcAc5d_Qc6c8s5s_6sJhJs5c_Kh5h4s6h_4cAdTs3s_8h9h3d7c_2dAsKc9c_7d4d3h2c() {
    assertEquals(
      "7d4d3h2c Kh5h4s6h 4cAdTs3s 6sJhJs5c 8h9h3d7c Qc6c8s5s 2dAsKc9c QsTcAc5d",
      Solver.process("omaha-holdem 3c8cJcKsTh QsTcAc5d Qc6c8s5s 6sJhJs5c Kh5h4s6h 4cAdTs3s 8h9h3d7c 2dAsKc9c 7d4d3h2c"));
  }

  @Test
  public void test_omaha_holdem_8129_3h6c7hJsKc_Qh8h6h4s_AdJd4hJh_5d9s5hKh_6d4dTd7c_2sJc5sAc_As7s4cKd() {
    assertEquals(
      "Qh8h6h4s 2sJc5sAc 5d9s5hKh 6d4dTd7c As7s4cKd AdJd4hJh",
      Solver.process("omaha-holdem 3h6c7hJsKc Qh8h6h4s AdJd4hJh 5d9s5hKh 6d4dTd7c 2sJc5sAc As7s4cKd"));
  }

  @Test
  public void test_omaha_holdem_8130_2s8sAsJsTh_QhQd3s8h_Jh8d5h6h_3d7h3h7s_4s9d4d2h_3cKd6d7c_9sKsJd8c_6cQc2dAc_JcTs2cAh_Qs5cKc6s() {
    assertEquals(
      "3cKd6d7c 4s9d4d2h 3d7h3h7s QhQd3s8h Jh8d5h6h 6cQc2dAc JcTs2cAh Qs5cKc6s 9sKsJd8c",
      Solver.process("omaha-holdem 2s8sAsJsTh QhQd3s8h Jh8d5h6h 3d7h3h7s 4s9d4d2h 3cKd6d7c 9sKsJd8c 6cQc2dAc JcTs2cAh Qs5cKc6s"));
  }

  @Test
  public void test_omaha_holdem_8131_2s4hAhJsQh_5h6s5dKc_9c4c3s7c_6dKs8c4d() {
    assertEquals(
      "9c4c3s7c 6dKs8c4d 5h6s5dKc",
      Solver.process("omaha-holdem 2s4hAhJsQh 5h6s5dKc 9c4c3s7c 6dKs8c4d"));
  }

  @Test
  public void test_omaha_holdem_8132_3h6h8s9dJd_AsKdKhQh_6s4c9hQc_4h6d4sTc() {
    assertEquals(
      "4h6d4sTc AsKdKhQh 6s4c9hQc",
      Solver.process("omaha-holdem 3h6h8s9dJd AsKdKhQh 6s4c9hQc 4h6d4sTc"));
  }

  @Test
  public void test_omaha_holdem_8133_3c4s7d7sTc_4h8d9c8s_As8cTs7c_Kd2cKh3d_TdAdQd6d() {
    assertEquals(
      "4h8d9c8s TdAdQd6d Kd2cKh3d As8cTs7c",
      Solver.process("omaha-holdem 3c4s7d7sTc 4h8d9c8s As8cTs7c Kd2cKh3d TdAdQd6d"));
  }

  @Test
  public void test_omaha_holdem_8134_4d5s8dQdTh_8cAhKhAs_Jh3h6s5h_7s2s5c7h() {
    assertEquals(
      "Jh3h6s5h 7s2s5c7h 8cAhKhAs",
      Solver.process("omaha-holdem 4d5s8dQdTh 8cAhKhAs Jh3h6s5h 7s2s5c7h"));
  }

  @Test
  public void test_omaha_holdem_8135_3c7cAcKcKh_Qd5h3s7h_5c4s2sQh_JhKs8s5s_Ad2d3h6d_6c6s8h9s_Jc4h3dKd_7sTh9dJs_2cJdTc8d() {
    assertEquals(
      "5c4s2sQh 6c6s8h9s 7sTh9dJs Qd5h3s7h Ad2d3h6d JhKs8s5s 2cJdTc8d Jc4h3dKd",
      Solver.process("omaha-holdem 3c7cAcKcKh Qd5h3s7h 5c4s2sQh JhKs8s5s Ad2d3h6d 6c6s8h9s Jc4h3dKd 7sTh9dJs 2cJdTc8d"));
  }

  @Test
  public void test_omaha_holdem_8136_3c4s7h8hQs_5sQhAh9s_Tc9h5h9d() {
    assertEquals(
      "Tc9h5h9d 5sQhAh9s",
      Solver.process("omaha-holdem 3c4s7h8hQs 5sQhAh9s Tc9h5h9d"));
  }

  @Test
  public void test_omaha_holdem_8137_5s7d9cAsTd_8cJsAcKh_4h3cJc7s_Th6d5hJh_2d2c6cAh_5cAd7c2s_3s8sTsKc_QcKsTc4s_3d7hQh4d() {
    assertEquals(
      "4h3cJc7s 3d7hQh4d 3s8sTsKc=QcKsTc4s 2d2c6cAh Th6d5hJh 5cAd7c2s 8cJsAcKh",
      Solver.process("omaha-holdem 5s7d9cAsTd 8cJsAcKh 4h3cJc7s Th6d5hJh 2d2c6cAh 5cAd7c2s 3s8sTsKc QcKsTc4s 3d7hQh4d"));
  }

  @Test
  public void test_omaha_holdem_8138_7s9cJdQcTh_6s5c2d6d_3d7cQhKs_Tc2h4hQs_5d8hAsAc_2sTd8s5s_AdQd8c5h() {
    assertEquals(
      "6s5c2d6d 5d8hAsAc Tc2h4hQs 2sTd8s5s=AdQd8c5h 3d7cQhKs",
      Solver.process("omaha-holdem 7s9cJdQcTh 6s5c2d6d 3d7cQhKs Tc2h4hQs 5d8hAsAc 2sTd8s5s AdQd8c5h"));
  }

  @Test
  public void test_omaha_holdem_8139_5d6d8hKcTh_Qh6c3hAc_5hJd7s3d_Td9cAh4c() {
    assertEquals(
      "5hJd7s3d Qh6c3hAc Td9cAh4c",
      Solver.process("omaha-holdem 5d6d8hKcTh Qh6c3hAc 5hJd7s3d Td9cAh4c"));
  }

  @Test
  public void test_omaha_holdem_8140_4h4s6h8sJh_Jc5sKcJd_5cKs3s6c() {
    assertEquals(
      "5cKs3s6c Jc5sKcJd",
      Solver.process("omaha-holdem 4h4s6h8sJh Jc5sKcJd 5cKs3s6c"));
  }

  @Test
  public void test_omaha_holdem_8141_6d8cAcJsQd_3hJh9cQs_9dTsTd3d_8h5hAd4d_Qc6h6sJc_5dTcKc2c_KdKsQh4h_7s9h7d5s_As2h7cTh_9s4s5c2s() {
    assertEquals(
      "9s4s5c2s 7s9h7d5s KdKsQh4h As2h7cTh 3hJh9cQs 8h5hAd4d Qc6h6sJc 9dTsTd3d 5dTcKc2c",
      Solver.process("omaha-holdem 6d8cAcJsQd 3hJh9cQs 9dTsTd3d 8h5hAd4d Qc6h6sJc 5dTcKc2c KdKsQh4h 7s9h7d5s As2h7cTh 9s4s5c2s"));
  }

  @Test
  public void test_omaha_holdem_8142_7d8s9hAcJc_KsQc3s7h_6c9d3d7c_JsQd5hJd() {
    assertEquals(
      "KsQc3s7h 6c9d3d7c JsQd5hJd",
      Solver.process("omaha-holdem 7d8s9hAcJc KsQc3s7h 6c9d3d7c JsQd5hJd"));
  }

  @Test
  public void test_omaha_holdem_8143_6c6d6hTcTh_8sAsQcQh_AdJd9s7c() {
    assertEquals(
      "AdJd9s7c 8sAsQcQh",
      Solver.process("omaha-holdem 6c6d6hTcTh 8sAsQcQh AdJd9s7c"));
  }

  @Test
  public void test_omaha_holdem_8144_2d4h5dJsTh_AcTc2s7d_6d2cJdTd() {
    assertEquals(
      "AcTc2s7d 6d2cJdTd",
      Solver.process("omaha-holdem 2d4h5dJsTh AcTc2s7d 6d2cJdTd"));
  }

  @Test
  public void test_omaha_holdem_8145_5c6c8hQcTd_6h7d5d9s_2d4sJsQd_2hAc6s6d_3hAdAs4d_Tc9h3s4h_Qs7c8d4c_Kd8sJc2s_Qh3d2c7h_TsJd8c9c() {
    assertEquals(
      "Kd8sJc2s Tc9h3s4h Qh3d2c7h 2d4sJsQd 3hAdAs4d 2hAc6s6d 6h7d5d9s Qs7c8d4c TsJd8c9c",
      Solver.process("omaha-holdem 5c6c8hQcTd 6h7d5d9s 2d4sJsQd 2hAc6s6d 3hAdAs4d Tc9h3s4h Qs7c8d4c Kd8sJc2s Qh3d2c7h TsJd8c9c"));
  }

  @Test
  public void test_omaha_holdem_8146_2c3h6dJdJh_9d3c3d8s_7s7h2dAs_2s4d2h5h_TdAhJc5d_8h7d8dAd() {
    assertEquals(
      "7s7h2dAs 8h7d8dAd TdAhJc5d 2s4d2h5h 9d3c3d8s",
      Solver.process("omaha-holdem 2c3h6dJdJh 9d3c3d8s 7s7h2dAs 2s4d2h5h TdAhJc5d 8h7d8dAd"));
  }

  @Test
  public void test_omaha_holdem_8147_4h8h9sKdTs_AdKh7h5h_7s3hThJs_5sTcTd8c_5dKc3d9c_3c6dJh3s_2d2hJcAh_4s6sAcAs_4d5c4c6h_Qc2cQsQd() {
    assertEquals(
      "2d2hJcAh 3c6dJh3s Qc2cQsQd AdKh7h5h 4s6sAcAs 5dKc3d9c 4d5c4c6h 5sTcTd8c 7s3hThJs",
      Solver.process("omaha-holdem 4h8h9sKdTs AdKh7h5h 7s3hThJs 5sTcTd8c 5dKc3d9c 3c6dJh3s 2d2hJcAh 4s6sAcAs 4d5c4c6h Qc2cQsQd"));
  }

  @Test
  public void test_omaha_holdem_8148_8dAhQcTcTs_5dKs9d6d_2cKh3d8c_9sTh7dQs_Jc9h5c7h_Qd2dKdAc() {
    assertEquals(
      "5dKs9d6d 2cKh3d8c Qd2dKdAc Jc9h5c7h 9sTh7dQs",
      Solver.process("omaha-holdem 8dAhQcTcTs 5dKs9d6d 2cKh3d8c 9sTh7dQs Jc9h5c7h Qd2dKdAc"));
  }

  @Test
  public void test_omaha_holdem_8149_4d7d9sTcTh_Kh2s9dAs_KcTsTd7c() {
    assertEquals(
      "Kh2s9dAs KcTsTd7c",
      Solver.process("omaha-holdem 4d7d9sTcTh Kh2s9dAs KcTsTd7c"));
  }

  @Test
  public void test_omaha_holdem_8150_2h7s8cJcKd_7cKc8hAc_Qh5d9cJd_KsTd4dTh_7dJs5sAd_As6s2s3h_3sTsKh4h_4s8sQc8d() {
    assertEquals(
      "As6s2s3h Qh5d9cJd 3sTsKh4h=KsTd4dTh 7dJs5sAd 7cKc8hAc 4s8sQc8d",
      Solver.process("omaha-holdem 2h7s8cJcKd 7cKc8hAc Qh5d9cJd KsTd4dTh 7dJs5sAd As6s2s3h 3sTsKh4h 4s8sQc8d"));
  }

  @Test
  public void test_omaha_holdem_8151_3d5d5s8hAc_4d5hQsJs_4h6c7s2c_TsKhAs6d_QdTh7h3s() {
    assertEquals(
      "QdTh7h3s TsKhAs6d 4d5hQsJs 4h6c7s2c",
      Solver.process("omaha-holdem 3d5d5s8hAc 4d5hQsJs 4h6c7s2c TsKhAs6d QdTh7h3s"));
  }

  @Test
  public void test_omaha_holdem_8152_2d4dKhQdTh_3dKd9s7h_4hQh3s9d_As5cQsKc_2c3h3cKs_Tc8c7d7s_9h8dJhAh() {
    assertEquals(
      "Tc8c7d7s 4hQh3s9d 2c3h3cKs As5cQsKc 9h8dJhAh 3dKd9s7h",
      Solver.process("omaha-holdem 2d4dKhQdTh 3dKd9s7h 4hQh3s9d As5cQsKc 2c3h3cKs Tc8c7d7s 9h8dJhAh"));
  }

  @Test
  public void test_omaha_holdem_8153_3d7c8h9sTd_4d3hAcTc_Qd8d6s2d_9dKd9hJc_2h4c5s9c_6cJs3cAd_Kh8sAsAh_3sQc5h4s() {
    assertEquals(
      "3sQc5h4s 6cJs3cAd 2h4c5s9c Kh8sAsAh 4d3hAcTc Qd8d6s2d 9dKd9hJc",
      Solver.process("omaha-holdem 3d7c8h9sTd 4d3hAcTc Qd8d6s2d 9dKd9hJc 2h4c5s9c 6cJs3cAd Kh8sAsAh 3sQc5h4s"));
  }

  @Test
  public void test_omaha_holdem_8154_3c3s7hQdTc_Ac6c5hJh_KcAs9hJc() {
    assertEquals(
      "Ac6c5hJh KcAs9hJc",
      Solver.process("omaha-holdem 3c3s7hQdTc Ac6c5hJh KcAs9hJc"));
  }

  @Test
  public void test_omaha_holdem_8155_6c7s8hKsTs_6dQhAs4s_Tc7hKcTh_8c3h3s2s_Qs9sQc4d_9d5h7d6s_Jc9h5sTd_8s6hKd4h() {
    assertEquals(
      "8s6hKd4h Tc7hKcTh 9d5h7d6s Jc9h5sTd 8c3h3s2s Qs9sQc4d 6dQhAs4s",
      Solver.process("omaha-holdem 6c7s8hKsTs 6dQhAs4s Tc7hKcTh 8c3h3s2s Qs9sQc4d 9d5h7d6s Jc9h5sTd 8s6hKd4h"));
  }

  @Test
  public void test_omaha_holdem_8156_2h4d9dJdTd_3h9c6h2d_JhQh2c8d_Qd6d8sJs_5d8cAhKd_Qc6s3s5c_5h5s3dAc_9hAd7d7c() {
    assertEquals(
      "Qc6s3s5c 5h5s3dAc 3h9c6h2d JhQh2c8d Qd6d8sJs 5d8cAhKd 9hAd7d7c",
      Solver.process("omaha-holdem 2h4d9dJdTd 3h9c6h2d JhQh2c8d Qd6d8sJs 5d8cAhKd Qc6s3s5c 5h5s3dAc 9hAd7d7c"));
  }

  @Test
  public void test_omaha_holdem_8157_3c9h9sKdTc_AhQcQh9d_5hJdAs5c_8dKcQs8h_4sAc6d2s() {
    assertEquals(
      "4sAc6d2s 5hJdAs5c 8dKcQs8h AhQcQh9d",
      Solver.process("omaha-holdem 3c9h9sKdTc AhQcQh9d 5hJdAs5c 8dKcQs8h 4sAc6d2s"));
  }

  @Test
  public void test_omaha_holdem_8158_3h4d4h6sJc_AdJsKc8d_3sTc6c2c_5sKh3dKd_5h3c8h2h_7h7c4cTs_6hAh5cAc_7sJhJdQc() {
    assertEquals(
      "3sTc6c2c AdJsKc8d 5sKh3dKd 6hAh5cAc 7h7c4cTs 5h3c8h2h 7sJhJdQc",
      Solver.process("omaha-holdem 3h4d4h6sJc AdJsKc8d 3sTc6c2c 5sKh3dKd 5h3c8h2h 7h7c4cTs 6hAh5cAc 7sJhJdQc"));
  }

  @Test
  public void test_omaha_holdem_8159_3cJcJdJhQs_Kh7d5s9c_Ts3s9dAc_8s5h9h5c_Ks2s6hAh_As4c2d4d_3d2c3h2h() {
    assertEquals(
      "Kh7d5s9c Ts3s9dAc Ks2s6hAh 3d2c3h2h As4c2d4d 8s5h9h5c",
      Solver.process("omaha-holdem 3cJcJdJhQs Kh7d5s9c Ts3s9dAc 8s5h9h5c Ks2s6hAh As4c2d4d 3d2c3h2h"));
  }

  @Test
  public void test_omaha_holdem_8160_4c5c7d8h8s_4s7hJs4h_5hKhAcJc_8d9s5d3h() {
    assertEquals(
      "5hKhAcJc 4s7hJs4h 8d9s5d3h",
      Solver.process("omaha-holdem 4c5c7d8h8s 4s7hJs4h 5hKhAcJc 8d9s5d3h"));
  }

  @Test
  public void test_omaha_holdem_8161_2c3d4d8hKh_6d7hJhTd_9hQd6cJc_8d8sKd2d_AhJd5c5h_7s9cTc7d() {
    assertEquals(
      "6d7hJhTd 9hQd6cJc 7s9cTc7d 8d8sKd2d AhJd5c5h",
      Solver.process("omaha-holdem 2c3d4d8hKh 6d7hJhTd 9hQd6cJc 8d8sKd2d AhJd5c5h 7s9cTc7d"));
  }

  @Test
  public void test_omaha_holdem_8162_2c3d6cAdAs_Th7h9d2h_7s8h8d2d_6dKs5s4s_6s3s7dKc_TcKd6h3h() {
    assertEquals(
      "Th7h9d2h 6s3s7dKc=TcKd6h3h 7s8h8d2d 6dKs5s4s",
      Solver.process("omaha-holdem 2c3d6cAdAs Th7h9d2h 7s8h8d2d 6dKs5s4s 6s3s7dKc TcKd6h3h"));
  }

  @Test
  public void test_omaha_holdem_8163_5s8sAsKdQd_5c5d4cJc_Qc7s7c3h_2s7dJh9d_4h9cJsTd_Th2hAdQh_Ks8h5h4s_3dTcJd8d() {
    assertEquals(
      "2s7dJh9d Qc7s7c3h Th2hAdQh 5c5d4cJc 3dTcJd8d=4h9cJsTd Ks8h5h4s",
      Solver.process("omaha-holdem 5s8sAsKdQd 5c5d4cJc Qc7s7c3h 2s7dJh9d 4h9cJsTd Th2hAdQh Ks8h5h4s 3dTcJd8d"));
  }

  @Test
  public void test_omaha_holdem_8164_4h8s9sJcQc_4d2cKcJd_3sTh5s2d_6h8h4c7h_Qd6s7dAc_Js4sJhQs_Qh2hAs5d_2s7cKhTd_TcKs9cAh_5c7s3d8c() {
    assertEquals(
      "3sTh5s2d 5c7s3d8c Qd6s7dAc=Qh2hAs5d 6h8h4c7h 4d2cKcJd Js4sJhQs 2s7cKhTd=TcKs9cAh",
      Solver.process("omaha-holdem 4h8s9sJcQc 4d2cKcJd 3sTh5s2d 6h8h4c7h Qd6s7dAc Js4sJhQs Qh2hAs5d 2s7cKhTd TcKs9cAh 5c7s3d8c"));
  }

  @Test
  public void test_omaha_holdem_8165_5d6c8c9dKc_TdTcQhKh_7s8h2h8s_Kd7cAc2c_3hJh2dTs_4sQsAd5h_7d5s4h6s_Js3sQd4d_3d6h6d9h() {
    assertEquals(
      "3hJh2dTs Js3sQd4d 4sQsAd5h TdTcQhKh 3d6h6d9h 7d5s4h6s=7s8h2h8s Kd7cAc2c",
      Solver.process("omaha-holdem 5d6c8c9dKc TdTcQhKh 7s8h2h8s Kd7cAc2c 3hJh2dTs 4sQsAd5h 7d5s4h6s Js3sQd4d 3d6h6d9h"));
  }

  @Test
  public void test_omaha_holdem_8166_4s5d6h8d8h_Jh9s2hTs_JdKd2c6c_QdAdKcJs_7hQh2dAh_Th8cTc4d_2sQc8s7d() {
    assertEquals(
      "Jh9s2hTs 7hQh2dAh QdAdKcJs JdKd2c6c 2sQc8s7d Th8cTc4d",
      Solver.process("omaha-holdem 4s5d6h8d8h Jh9s2hTs JdKd2c6c QdAdKcJs 7hQh2dAh Th8cTc4d 2sQc8s7d"));
  }

  @Test
  public void test_omaha_holdem_8167_5h9dAsJsKd_4hQc4c9c_3s7h8d9s_Kc3h8c5s_4dJd5c6s_2cTcJc7s() {
    assertEquals(
      "3s7h8d9s 4hQc4c9c 2cTcJc7s 4dJd5c6s Kc3h8c5s",
      Solver.process("omaha-holdem 5h9dAsJsKd 4hQc4c9c 3s7h8d9s Kc3h8c5s 4dJd5c6s 2cTcJc7s"));
  }

  @Test
  public void test_omaha_holdem_8168_2s3d8dJhQs_2dAhTd5h_7d7h6dAc_KdQc6c8s_Ts4cAdQh() {
    assertEquals(
      "2dAhTd5h 7d7h6dAc Ts4cAdQh KdQc6c8s",
      Solver.process("omaha-holdem 2s3d8dJhQs 2dAhTd5h 7d7h6dAc KdQc6c8s Ts4cAdQh"));
  }

  @Test
  public void test_omaha_holdem_8169_4c5h6c9sKd_7c2dTs6d_Qs8cAhQh_9dKsQc6h() {
    assertEquals(
      "7c2dTs6d Qs8cAhQh 9dKsQc6h",
      Solver.process("omaha-holdem 4c5h6c9sKd 7c2dTs6d Qs8cAhQh 9dKsQc6h"));
  }

  @Test
  public void test_omaha_holdem_8170_5sAcKcKdTc_Td3h4s9h_3c9s7c6d_Qh2s4h2d_6hQc9dAd_3d6c7s5d() {
    assertEquals(
      "Qh2s4h2d 3d6c7s5d Td3h4s9h 6hQc9dAd 3c9s7c6d",
      Solver.process("omaha-holdem 5sAcKcKdTc Td3h4s9h 3c9s7c6d Qh2s4h2d 6hQc9dAd 3d6c7s5d"));
  }

  @Test
  public void test_omaha_holdem_8171_2s3c3d9hKs_Qh4dJsQs_9cAhJc8d_2c7h5s2d_5h7cKh3s_ThTd9d8c_3hQdKdAd_QcJd5d4c() {
    assertEquals(
      "QcJd5d4c 9cAhJc8d ThTd9d8c Qh4dJsQs 2c7h5s2d 3hQdKdAd=5h7cKh3s",
      Solver.process("omaha-holdem 2s3c3d9hKs Qh4dJsQs 9cAhJc8d 2c7h5s2d 5h7cKh3s ThTd9d8c 3hQdKdAd QcJd5d4c"));
  }

  @Test
  public void test_omaha_holdem_8172_2h5s6c6hQd_6d2dQc6s_2c7sQhKh_Ah8d9s4c() {
    assertEquals(
      "Ah8d9s4c 2c7sQhKh 6d2dQc6s",
      Solver.process("omaha-holdem 2h5s6c6hQd 6d2dQc6s 2c7sQhKh Ah8d9s4c"));
  }

  @Test
  public void test_omaha_holdem_8173_2h5d5sAsQs_9h4c4hQh_2s5cTsTh_8dQcKdAd_8c7h3sJh_2d7d3dKc_3cAc5h2c_9cKs9dJs_4sJd4dKh() {
    assertEquals(
      "8c7h3sJh 2d7d3dKc 4sJd4dKh 9h4c4hQh 8dQcKdAd 9cKs9dJs 2s5cTsTh 3cAc5h2c",
      Solver.process("omaha-holdem 2h5d5sAsQs 9h4c4hQh 2s5cTsTh 8dQcKdAd 8c7h3sJh 2d7d3dKc 3cAc5h2c 9cKs9dJs 4sJd4dKh"));
  }

  @Test
  public void test_omaha_holdem_8174_3h4s9hJhKc_7cTcAdAc_2c6cAsQh_Qs4d3d2d_AhKd9cTs_Th5s8cTd_2h6d7d3c() {
    assertEquals(
      "2c6cAsQh 2h6d7d3c Th5s8cTd 7cTcAdAc Qs4d3d2d AhKd9cTs",
      Solver.process("omaha-holdem 3h4s9hJhKc 7cTcAdAc 2c6cAsQh Qs4d3d2d AhKd9cTs Th5s8cTd 2h6d7d3c"));
  }

  @Test
  public void test_omaha_holdem_8175_2h3c4c9cTh_6d3h8sKs_3sQdQcKd() {
    assertEquals(
      "6d3h8sKs 3sQdQcKd",
      Solver.process("omaha-holdem 2h3c4c9cTh 6d3h8sKs 3sQdQcKd"));
  }

  @Test
  public void test_omaha_holdem_8176_4d6c6d6s8c_Jh2s8hQs_9d9s9c2d_8dThKs3d() {
    assertEquals(
      "Jh2s8hQs 8dThKs3d 9d9s9c2d",
      Solver.process("omaha-holdem 4d6c6d6s8c Jh2s8hQs 9d9s9c2d 8dThKs3d"));
  }

  @Test
  public void test_omaha_holdem_8177_3d3h8c9hAc_TcKc4s7d_6cQd5d8d_Ad8s6h8h_2cAsAh6d_2sKs4cJs_3sTsKd7s_JcJdTh5s() {
    assertEquals(
      "TcKc4s7d 2sKs4cJs 6cQd5d8d JcJdTh5s 3sTsKd7s Ad8s6h8h 2cAsAh6d",
      Solver.process("omaha-holdem 3d3h8c9hAc TcKc4s7d 6cQd5d8d Ad8s6h8h 2cAsAh6d 2sKs4cJs 3sTsKd7s JcJdTh5s"));
  }

  @Test
  public void test_omaha_holdem_8178_5c6c7d9sTs_4cTd9c5s_KhQd7hAh() {
    assertEquals(
      "KhQd7hAh 4cTd9c5s",
      Solver.process("omaha-holdem 5c6c7d9sTs 4cTd9c5s KhQd7hAh"));
  }

  @Test
  public void test_omaha_holdem_8179_5s7d9hJdTd_Ad3c9c4h_7h8sAs9s_Ac8hQdKs_2c6cQs3d_2h7cTh3s() {
    assertEquals(
      "2c6cQs3d Ad3c9c4h 2h7cTh3s 7h8sAs9s Ac8hQdKs",
      Solver.process("omaha-holdem 5s7d9hJdTd Ad3c9c4h 7h8sAs9s Ac8hQdKs 2c6cQs3d 2h7cTh3s"));
  }

  @Test
  public void test_omaha_holdem_8180_2c5d6c9sAc_5c3sKcKh_JhTcAh9d_Ks5hQs4d_3c4hQcTs_7cQd8h9h_As6d2d9c() {
    assertEquals(
      "Ks5hQs4d As6d2d9c=JhTcAh9d 7cQd8h9h 3c4hQcTs 5c3sKcKh",
      Solver.process("omaha-holdem 2c5d6c9sAc 5c3sKcKh JhTcAh9d Ks5hQs4d 3c4hQcTs 7cQd8h9h As6d2d9c"));
  }

  @Test
  public void test_omaha_holdem_8181_5c9cQsTdTs_8dTh8s2c_7d2d4h5h_4s6hAh6d_7s7cJc3h_Ad6c9hQc_Js2h5s6s() {
    assertEquals(
      "7d2d4h5h Js2h5s6s 4s6hAh6d 7s7cJc3h Ad6c9hQc 8dTh8s2c",
      Solver.process("omaha-holdem 5c9cQsTdTs 8dTh8s2c 7d2d4h5h 4s6hAh6d 7s7cJc3h Ad6c9hQc Js2h5s6s"));
  }

  @Test
  public void test_omaha_holdem_8182_2h5d8sKcTh_9cJsQcAc_9h4dTc8h_5s3cJhKh_2s7cKd7s_9d4s3h7h_QsJdQh3s_6h8d2d9s() {
    assertEquals(
      "9d4s3h7h 9cJsQcAc QsJdQh3s 6h8d2d9s 9h4dTc8h 2s7cKd7s 5s3cJhKh",
      Solver.process("omaha-holdem 2h5d8sKcTh 9cJsQcAc 9h4dTc8h 5s3cJhKh 2s7cKd7s 9d4s3h7h QsJdQh3s 6h8d2d9s"));
  }

  @Test
  public void test_omaha_holdem_8183_2d2s6dJsTd_QhTs4cJd_Kh3c7d2c_6sKc6hAs_5c9c8c7h_3d3s4s8d_9hKs5h5s_6cQcJcTh_4dQdKdQs() {
    assertEquals(
      "5c9c8c7h 9hKs5h5s 6cQcJcTh=QhTs4cJd Kh3c7d2c 3d3s4s8d 4dQdKdQs 6sKc6hAs",
      Solver.process("omaha-holdem 2d2s6dJsTd QhTs4cJd Kh3c7d2c 6sKc6hAs 5c9c8c7h 3d3s4s8d 9hKs5h5s 6cQcJcTh 4dQdKdQs"));
  }

  @Test
  public void test_omaha_holdem_8184_2h8cJsQdQh_2d4h6cKc_6dTd5sQc() {
    assertEquals(
      "2d4h6cKc 6dTd5sQc",
      Solver.process("omaha-holdem 2h8cJsQdQh 2d4h6cKc 6dTd5sQc"));
  }

  @Test
  public void test_omaha_holdem_8185_4c5c6sAcQs_Th7s5d3d_4sAs9s8c_2c6d2s5s_Ks6cAh9d_QdKh7hJs_8h7dAdJc() {
    assertEquals(
      "QdKh7hJs 2c6d2s5s 4sAs9s8c Ks6cAh9d Th7s5d3d 8h7dAdJc",
      Solver.process("omaha-holdem 4c5c6sAcQs Th7s5d3d 4sAs9s8c 2c6d2s5s Ks6cAh9d QdKh7hJs 8h7dAdJc"));
  }

  @Test
  public void test_omaha_holdem_8186_4s5d7d8hQh_8dTd9cQd_6d2cTsJd_AhAdQs2h() {
    assertEquals(
      "6d2cTsJd AhAdQs2h 8dTd9cQd",
      Solver.process("omaha-holdem 4s5d7d8hQh 8dTd9cQd 6d2cTsJd AhAdQs2h"));
  }

  @Test
  public void test_omaha_holdem_8187_6c7h9hAdQc_8c6h2hQd_4h2c6s5c_7c5dQh9s_9d3d4d7s_Ac3s2s2d_JhTs8dJd_4cKh5h6d_Ah3c3hKc_8h7d9cTh() {
    assertEquals(
      "4h2c6s5c 4cKh5h6d Ac3s2s2d Ah3c3hKc 9d3d4d7s 8c6h2hQd 7c5dQh9s 8h7d9cTh=JhTs8dJd",
      Solver.process("omaha-holdem 6c7h9hAdQc 8c6h2hQd 4h2c6s5c 7c5dQh9s 9d3d4d7s Ac3s2s2d JhTs8dJd 4cKh5h6d Ah3c3hKc 8h7d9cTh"));
  }

  @Test
  public void test_omaha_holdem_8188_5s6sAcKhTh_TsTcQs4d_4c3cTd2s_QdAh8s9s_4s3hAsKd_7c8h7d9d_Jh8d2d5h_4h7sQc6c_3s8c7h9c() {
    assertEquals(
      "3s8c7h9c Jh8d2d5h 4h7sQc6c 7c8h7d9d 4c3cTd2s QdAh8s9s 4s3hAsKd TsTcQs4d",
      Solver.process("omaha-holdem 5s6sAcKhTh TsTcQs4d 4c3cTd2s QdAh8s9s 4s3hAsKd 7c8h7d9d Jh8d2d5h 4h7sQc6c 3s8c7h9c"));
  }

  @Test
  public void test_omaha_holdem_8189_2c5s8h9cQh_7h6d4cTd_QcAsTh2d_7d8cKs8d_JcKd9s2s_6h7c3cJh() {
    assertEquals(
      "JcKd9s2s QcAsTh2d 7d8cKs8d 6h7c3cJh=7h6d4cTd",
      Solver.process("omaha-holdem 2c5s8h9cQh 7h6d4cTd QcAsTh2d 7d8cKs8d JcKd9s2s 6h7c3cJh"));
  }

  @Test
  public void test_omaha_holdem_8190_2h5d5s6sJh_3s3d7h4h_9sKsQc5c_7dAsTs5h_Kc8d9h8s_7sQd4d3h() {
    assertEquals(
      "Kc8d9h8s 9sKsQc5c 7dAsTs5h 3s3d7h4h=7sQd4d3h",
      Solver.process("omaha-holdem 2h5d5s6sJh 3s3d7h4h 9sKsQc5c 7dAsTs5h Kc8d9h8s 7sQd4d3h"));
  }

  @Test
  public void test_omaha_holdem_8191_3c4d8hAdAh_Qh2h7c9d_Qd6h3d7d_5cAs3sJs_9cKc7hKd() {
    assertEquals(
      "Qh2h7c9d Qd6h3d7d 9cKc7hKd 5cAs3sJs",
      Solver.process("omaha-holdem 3c4d8hAdAh Qh2h7c9d Qd6h3d7d 5cAs3sJs 9cKc7hKd"));
  }

  @Test
  public void test_omaha_holdem_8192_3c9cJdThTs_KsAh6dQh_6hQd6cQc_KcAc9s2s_Tc4c4dJs_8d4sKd7c_9hAdJcQs_2d7s4h9d_7d6s2h3d_2cJh8c3s() {
    assertEquals(
      "7d6s2h3d 2d7s4h9d KcAc9s2s 2cJh8c3s 9hAdJcQs 6hQd6cQc 8d4sKd7c KsAh6dQh Tc4c4dJs",
      Solver.process("omaha-holdem 3c9cJdThTs KsAh6dQh 6hQd6cQc KcAc9s2s Tc4c4dJs 8d4sKd7c 9hAdJcQs 2d7s4h9d 7d6s2h3d 2cJh8c3s"));
  }

  @Test
  public void test_omaha_holdem_8193_3d4d8d8hQd_9sTsAh6s_7h8c4cAd_Jh3cKhAc_QhTdTh5c_7sQs2s5h_Kd7cJs6h() {
    assertEquals(
      "Kd7cJs6h 9sTsAh6s Jh3cKhAc 7sQs2s5h QhTdTh5c 7h8c4cAd",
      Solver.process("omaha-holdem 3d4d8d8hQd 9sTsAh6s 7h8c4cAd Jh3cKhAc QhTdTh5c 7sQs2s5h Kd7cJs6h"));
  }

  @Test
  public void test_omaha_holdem_8194_6d8dQcThTs_9s5h3cAh_6c7sQsQd_Kh2s8h4c_3hTd6s8c() {
    assertEquals(
      "9s5h3cAh Kh2s8h4c 3hTd6s8c 6c7sQsQd",
      Solver.process("omaha-holdem 6d8dQcThTs 9s5h3cAh 6c7sQsQd Kh2s8h4c 3hTd6s8c"));
  }

  @Test
  public void test_omaha_holdem_8195_5d5h6c8hTh_Qh7d2cJd_AcKc6s8d_Qc8cTsJc_Tc4dAs3h() {
    assertEquals(
      "Qh7d2cJd AcKc6s8d Tc4dAs3h Qc8cTsJc",
      Solver.process("omaha-holdem 5d5h6c8hTh Qh7d2cJd AcKc6s8d Qc8cTsJc Tc4dAs3h"));
  }

  @Test
  public void test_omaha_holdem_8196_3s4c6hQcQs_AcAd3hJc_2hQhAs4d_Kh6dTc5h_Ts2c8cJh_JdQd9hKc_5d4s7h8d_Td6c5sTh_7c7s8h2d() {
    assertEquals(
      "Ts2c8cJh Kh6dTc5h 7c7s8h2d Td6c5sTh AcAd3hJc JdQd9hKc 5d4s7h8d 2hQhAs4d",
      Solver.process("omaha-holdem 3s4c6hQcQs AcAd3hJc 2hQhAs4d Kh6dTc5h Ts2c8cJh JdQd9hKc 5d4s7h8d Td6c5sTh 7c7s8h2d"));
  }

  @Test
  public void test_omaha_holdem_8197_4c4s5s7c9d_7hAc2dTd_Th8hAd9c_8d5d6dKd_2sTsJdJc() {
    assertEquals(
      "7hAc2dTd Th8hAd9c 2sTsJdJc 8d5d6dKd",
      Solver.process("omaha-holdem 4c4s5s7c9d 7hAc2dTd Th8hAd9c 8d5d6dKd 2sTsJdJc"));
  }

  @Test
  public void test_omaha_holdem_8198_6c6d6s7hQd_Td8c5hJd_QcTh5s4h_2c5d4d3d_4c7sKh2h_5cTc3s9d_AsKc8sJc_Ah2sKdKs_2d8h9sAd_8dJs3h9h() {
    assertEquals(
      "2c5d4d3d 5cTc3s9d 8dJs3h9h Td8c5hJd QcTh5s4h 4c7sKh2h 2d8h9sAd AsKc8sJc Ah2sKdKs",
      Solver.process("omaha-holdem 6c6d6s7hQd Td8c5hJd QcTh5s4h 2c5d4d3d 4c7sKh2h 5cTc3s9d AsKc8sJc Ah2sKdKs 2d8h9sAd 8dJs3h9h"));
  }

  @Test
  public void test_omaha_holdem_8199_4c5d6h6sAh_8h4h4sJc_8cJsTs9d() {
    assertEquals(
      "8cJsTs9d 8h4h4sJc",
      Solver.process("omaha-holdem 4c5d6h6sAh 8h4h4sJc 8cJsTs9d"));
  }

  @Test
  public void test_omaha_holdem_8200_6cJhKdQcTc_3d8cQs9h_JdJs7sKc_Jc5s9c5c_2hAd4s2d_Ts5d5hTd_8sQh7c7h_6s3sKs3c_As8d6dTh() {
    assertEquals(
      "2hAd4s2d 8sQh7c7h 6s3sKs3c Ts5d5hTd JdJs7sKc 3d8cQs9h As8d6dTh Jc5s9c5c",
      Solver.process("omaha-holdem 6cJhKdQcTc 3d8cQs9h JdJs7sKc Jc5s9c5c 2hAd4s2d Ts5d5hTd 8sQh7c7h 6s3sKs3c As8d6dTh"));
  }

  @Test
  public void test_omaha_holdem_8201_5d5sKcKhTc_3c8s9d7h_2s4c8dJc() {
    assertEquals(
      "3c8s9d7h 2s4c8dJc",
      Solver.process("omaha-holdem 5d5sKcKhTc 3c8s9d7h 2s4c8dJc"));
  }

  @Test
  public void test_omaha_holdem_8202_2s4hAsKdQs_Tc8c5d3d_8sKs8dKh_Jh2h5hJs_ThAc6d6c_Td9d4sTs_9c5c6h3s_Jd4c7sAd() {
    assertEquals(
      "Jh2h5hJs ThAc6d6c Jd4c7sAd 9c5c6h3s=Tc8c5d3d Td9d4sTs 8sKs8dKh",
      Solver.process("omaha-holdem 2s4hAsKdQs Tc8c5d3d 8sKs8dKh Jh2h5hJs ThAc6d6c Td9d4sTs 9c5c6h3s Jd4c7sAd"));
  }

  @Test
  public void test_omaha_holdem_8203_2d2s5s8cKs_3sJd8s5h_2h8h5cTh_6dAdJs6h() {
    assertEquals(
      "6dAdJs6h 3sJd8s5h 2h8h5cTh",
      Solver.process("omaha-holdem 2d2s5s8cKs 3sJd8s5h 2h8h5cTh 6dAdJs6h"));
  }

  @Test
  public void test_omaha_holdem_8204_3d5cAhJsKs_6hJc2d9s_3c7h9dAs_2h6s8h9h_Kd4h7c7s_8dThJd9c_8sQsTdJh_Ac2c6dTc() {
    assertEquals(
      "2h6s8h9h 6hJc2d9s 8dThJd9c Kd4h7c7s Ac2c6dTc 3c7h9dAs 8sQsTdJh",
      Solver.process("omaha-holdem 3d5cAhJsKs 6hJc2d9s 3c7h9dAs 2h6s8h9h Kd4h7c7s 8dThJd9c 8sQsTdJh Ac2c6dTc"));
  }

  @Test
  public void test_omaha_holdem_8205_5c9cJhQdTc_Js4s4c8c_2dTdTs4h() {
    assertEquals(
      "2dTdTs4h Js4s4c8c",
      Solver.process("omaha-holdem 5c9cJhQdTc Js4s4c8c 2dTdTs4h"));
  }

  @Test
  public void test_omaha_holdem_8206_2s8h9hKhTh_As7s5c2c_2h2dTcQd_8cJh6h6s_3sKc5h9d() {
    assertEquals(
      "As7s5c2c 3sKc5h9d 2h2dTcQd 8cJh6h6s",
      Solver.process("omaha-holdem 2s8h9hKhTh As7s5c2c 2h2dTcQd 8cJh6h6s 3sKc5h9d"));
  }

  @Test
  public void test_omaha_holdem_8207_4d8s9d9hJd_7cKcJh7d_5hKh2sJs_6d5dQhQs_AcTs8h4h() {
    assertEquals(
      "AcTs8h4h 5hKh2sJs=7cKcJh7d 6d5dQhQs",
      Solver.process("omaha-holdem 4d8s9d9hJd 7cKcJh7d 5hKh2sJs 6d5dQhQs AcTs8h4h"));
  }

  @Test
  public void test_omaha_holdem_8208_3c4s7c8sQc_Qd2dTh4c_AdTd8h9c_8d2sKcQs_7hAs6h3h_QhKd5cJc_4hAc6cJs_9sTcKs9d() {
    assertEquals(
      "AdTd8h9c 9sTcKs9d 7hAs6h3h Qd2dTh4c 8d2sKcQs QhKd5cJc 4hAc6cJs",
      Solver.process("omaha-holdem 3c4s7c8sQc Qd2dTh4c AdTd8h9c 8d2sKcQs 7hAs6h3h QhKd5cJc 4hAc6cJs 9sTcKs9d"));
  }

  @Test
  public void test_omaha_holdem_8209_3h3s9hThTs_Jh6c6sQs_KhQdAc5d_7h3dKdKc_3c5c2c9s_8sAh2d8h_Td4sTc9d_Qh7s4dQc_9c4hAs8c_6hJdJc7c() {
    assertEquals(
      "KhQdAc5d Jh6c6sQs 9c4hAs8c 6hJdJc7c Qh7s4dQc 7h3dKdKc 8sAh2d8h 3c5c2c9s Td4sTc9d",
      Solver.process("omaha-holdem 3h3s9hThTs Jh6c6sQs KhQdAc5d 7h3dKdKc 3c5c2c9s 8sAh2d8h Td4sTc9d Qh7s4dQc 9c4hAs8c 6hJdJc7c"));
  }

  @Test
  public void test_omaha_holdem_8210_2h3c3dJcJs_Td9c4c7h_8c7s7d2d_QhAcQdJh_4sTs5s5d_6dJd4d8h_9s8d7c9h_AhKcAdQc() {
    assertEquals(
      "Td9c4c7h 4sTs5s5d 8c7s7d2d 9s8d7c9h AhKcAdQc 6dJd4d8h QhAcQdJh",
      Solver.process("omaha-holdem 2h3c3dJcJs Td9c4c7h 8c7s7d2d QhAcQdJh 4sTs5s5d 6dJd4d8h 9s8d7c9h AhKcAdQc"));
  }

  @Test
  public void test_omaha_holdem_8211_5c5s6s8hKh_9s6cAd9c_8c4c7c7d_6dJh8s3c_2s8dTcQd_2hAs2d7h_Td7sTsQc_4dKd5hQs() {
    assertEquals(
      "2hAs2d7h 2s8dTcQd 6dJh8s3c 9s6cAd9c Td7sTsQc 8c4c7c7d 4dKd5hQs",
      Solver.process("omaha-holdem 5c5s6s8hKh 9s6cAd9c 8c4c7c7d 6dJh8s3c 2s8dTcQd 2hAs2d7h Td7sTsQc 4dKd5hQs"));
  }

  @Test
  public void test_omaha_holdem_8212_3cAdJdQcTc_3h8h7hJh_Ks4s4d9h_9c4cAc6c_Kd9d5d3d() {
    assertEquals(
      "3h8h7hJh Kd9d5d3d=Ks4s4d9h 9c4cAc6c",
      Solver.process("omaha-holdem 3cAdJdQcTc 3h8h7hJh Ks4s4d9h 9c4cAc6c Kd9d5d3d"));
  }

  @Test
  public void test_omaha_holdem_8213_2c3h9dJsKc_8c7s8h6d_TdTs7hKd_3c9s2s5c_4d5dAs6h_4s5sThJd() {
    assertEquals(
      "4d5dAs6h 8c7s8h6d 4s5sThJd TdTs7hKd 3c9s2s5c",
      Solver.process("omaha-holdem 2c3h9dJsKc 8c7s8h6d TdTs7hKd 3c9s2s5c 4d5dAs6h 4s5sThJd"));
  }

  @Test
  public void test_omaha_holdem_8214_5s7d7hKdTh_Ac2dQc7s_3dTd3c8h_6c3sQs8c_AhKs9s2h() {
    assertEquals(
      "6c3sQs8c 3dTd3c8h AhKs9s2h Ac2dQc7s",
      Solver.process("omaha-holdem 5s7d7hKdTh Ac2dQc7s 3dTd3c8h 6c3sQs8c AhKs9s2h"));
  }

  @Test
  public void test_omaha_holdem_8215_3s6c9cAhTd_QcKcJs8h_Kh8sQs6d() {
    assertEquals(
      "QcKcJs8h Kh8sQs6d",
      Solver.process("omaha-holdem 3s6c9cAhTd QcKcJs8h Kh8sQs6d"));
  }

  @Test
  public void test_omaha_holdem_8216_7d9c9h9sJd_2d5sKs6h_3dKcTcQh_4hKhQcJh_ThTdAh8d_2c5h2s2h_Ts5d3s6d_JsQs6c4c_Kd3c8h8s() {
    assertEquals(
      "Ts5d3s6d JsQs6c4c 2d5sKs6h 3dKcTcQh=4hKhQcJh 2c5h2s2h Kd3c8h8s ThTdAh8d",
      Solver.process("omaha-holdem 7d9c9h9sJd 2d5sKs6h 3dKcTcQh 4hKhQcJh ThTdAh8d 2c5h2s2h Ts5d3s6d JsQs6c4c Kd3c8h8s"));
  }

  @Test
  public void test_omaha_holdem_8217_9d9hAcJhTd_6h6d8c6s_Th5d8hAd_9c3d7hKh_Jd5h5c3h_2h2sKsTs_3s4c9s8s_Js7s2c7c() {
    assertEquals(
      "6h6d8c6s 2h2sKsTs Jd5h5c3h Js7s2c7c Th5d8hAd 3s4c9s8s 9c3d7hKh",
      Solver.process("omaha-holdem 9d9hAcJhTd 6h6d8c6s Th5d8hAd 9c3d7hKh Jd5h5c3h 2h2sKsTs 3s4c9s8s Js7s2c7c"));
  }

  @Test
  public void test_omaha_holdem_8218_3c3h5cAhKc_Qh6sAd4c_2d4s5d6d_8cThQdTd_7s5sJhQs() {
    assertEquals(
      "7s5sJhQs 8cThQdTd Qh6sAd4c 2d4s5d6d",
      Solver.process("omaha-holdem 3c3h5cAhKc Qh6sAd4c 2d4s5d6d 8cThQdTd 7s5sJhQs"));
  }

  @Test
  public void test_omaha_holdem_8219_2c9hJdJhQs_9dTh3cQc_7s5h4hAh_6s8hTd6d_2h3d5cJs_Kc7h5s6h_Tc3h8c5d_2sKh6c4s_2dTsKs8s_Qd4cKdAc() {
    assertEquals(
      "Kc7h5s6h 7s5h4hAh 2sKh6c4s 9dTh3cQc Qd4cKdAc 6s8hTd6d=Tc3h8c5d 2dTsKs8s 2h3d5cJs",
      Solver.process("omaha-holdem 2c9hJdJhQs 9dTh3cQc 7s5h4hAh 6s8hTd6d 2h3d5cJs Kc7h5s6h Tc3h8c5d 2sKh6c4s 2dTsKs8s Qd4cKdAc"));
  }

  @Test
  public void test_omaha_holdem_8220_4c6dKhQdQs_9d9hKc4h_5dQh6hQc_3d8s7h2s_Kd2c6c4s_5c9cJsTs_9s8c7dJh() {
    assertEquals(
      "3d8s7h2s 9s8c7dJh 5c9cJsTs Kd2c6c4s 9d9hKc4h 5dQh6hQc",
      Solver.process("omaha-holdem 4c6dKhQdQs 9d9hKc4h 5dQh6hQc 3d8s7h2s Kd2c6c4s 5c9cJsTs 9s8c7dJh"));
  }

  @Test
  public void test_omaha_holdem_8221_6d9d9sKhTc_As5c6s3d_Kd2s2dTs_6h6c8c7d_QcJcQd7s_Qh4hJdJh_Ks3sTh2c_7c8sJs4s_9h4dKcAd() {
    assertEquals(
      "As5c6s3d Kd2s2dTs=Ks3sTh2c 7c8sJs4s QcJcQd7s=Qh4hJdJh 6h6c8c7d 9h4dKcAd",
      Solver.process("omaha-holdem 6d9d9sKhTc As5c6s3d Kd2s2dTs 6h6c8c7d QcJcQd7s Qh4hJdJh Ks3sTh2c 7c8sJs4s 9h4dKcAd"));
  }

  @Test
  public void test_omaha_holdem_8222_4cAdKcQsTc_JsTsJhJd_2dQc8s7d_Td7hJcAc_2h2s5c5d_Th2c3c4d_9s8d5s4s_3d6cKhQh_7c3s6d6h() {
    assertEquals(
      "9s8d5s4s 2h2s5c5d 7c3s6d6h 2dQc8s7d 3d6cKhQh JsTsJhJd Th2c3c4d Td7hJcAc",
      Solver.process("omaha-holdem 4cAdKcQsTc JsTsJhJd 2dQc8s7d Td7hJcAc 2h2s5c5d Th2c3c4d 9s8d5s4s 3d6cKhQh 7c3s6d6h"));
  }

  @Test
  public void test_omaha_holdem_8223_2s8d9dJsKh_2c8hAdQd_Ts6s7d8c_2h5s3c3s_Qh7cTd6d_QcKs4c9h_9c4s7h5d_JdTh5hJh() {
    assertEquals(
      "2h5s3c3s 9c4s7h5d 2c8hAdQd QcKs4c9h JdTh5hJh Ts6s7d8c Qh7cTd6d",
      Solver.process("omaha-holdem 2s8d9dJsKh 2c8hAdQd Ts6s7d8c 2h5s3c3s Qh7cTd6d QcKs4c9h 9c4s7h5d JdTh5hJh"));
  }

  @Test
  public void test_omaha_holdem_8224_2h2s5dJsTh_9cKc7c4s_Tc5s5cJh_8sKhQd4c() {
    assertEquals(
      "9cKc7c4s 8sKhQd4c Tc5s5cJh",
      Solver.process("omaha-holdem 2h2s5dJsTh 9cKc7c4s Tc5s5cJh 8sKhQd4c"));
  }

  @Test
  public void test_omaha_holdem_8225_4d5c5dKhQc_JhAcTh7h_9hTcJs3d_3h5sTs4c_Qs8sQhKs_2d2sAd2h_2c7cTd9c_7d6hAsKc_6sQd6d7s_JdAh9dJc() {
    assertEquals(
      "2c7cTd9c 9hTcJs3d JhAcTh7h 2d2sAd2h JdAh9dJc 6sQd6d7s 7d6hAsKc 3h5sTs4c Qs8sQhKs",
      Solver.process("omaha-holdem 4d5c5dKhQc JhAcTh7h 9hTcJs3d 3h5sTs4c Qs8sQhKs 2d2sAd2h 2c7cTd9c 7d6hAsKc 6sQd6d7s JdAh9dJc"));
  }

  @Test
  public void test_omaha_holdem_8226_3s7s8dKsQh_9dJs7c5h_AsKhAh3d_8h2s2c5d_5sJcTh2h_Tc3h6hTd_3cKd6d9s_4h9hQcAd() {
    assertEquals(
      "5sJcTh2h 9dJs7c5h 8h2s2c5d Tc3h6hTd 4h9hQcAd 3cKd6d9s=AsKhAh3d",
      Solver.process("omaha-holdem 3s7s8dKsQh 9dJs7c5h AsKhAh3d 8h2s2c5d 5sJcTh2h Tc3h6hTd 3cKd6d9s 4h9hQcAd"));
  }

  @Test
  public void test_omaha_holdem_8227_5h6dAcKhTd_9d8dTh7c_Jd2s7hTs_4dAh9hAd_4c8hQh9s_5s3cJh6c() {
    assertEquals(
      "4c8hQh9s 9d8dTh7c Jd2s7hTs 5s3cJh6c 4dAh9hAd",
      Solver.process("omaha-holdem 5h6dAcKhTd 9d8dTh7c Jd2s7hTs 4dAh9hAd 4c8hQh9s 5s3cJh6c"));
  }

  @Test
  public void test_omaha_holdem_8228_4cAsJhJsTh_5c9h6dTd_6cQhKd8d_2cQs5sQc() {
    assertEquals(
      "5c9h6dTd 2cQs5sQc 6cQhKd8d",
      Solver.process("omaha-holdem 4cAsJhJsTh 5c9h6dTd 6cQhKd8d 2cQs5sQc"));
  }

  @Test
  public void test_omaha_holdem_8229_2c3c5s6hQd_AdAcQcJs_KdTc3h3s_KhTh8c6s_Jd4sTsTd() {
    assertEquals(
      "KhTh8c6s Jd4sTsTd AdAcQcJs KdTc3h3s",
      Solver.process("omaha-holdem 2c3c5s6hQd AdAcQcJs KdTc3h3s KhTh8c6s Jd4sTsTd"));
  }

  @Test
  public void test_omaha_holdem_8230_4s5dJhKcKs_8c9dQc6d_8s7c4c7h_2dJc2hQd() {
    assertEquals(
      "8c9dQc6d 8s7c4c7h 2dJc2hQd",
      Solver.process("omaha-holdem 4s5dJhKcKs 8c9dQc6d 8s7c4c7h 2dJc2hQd"));
  }

  @Test
  public void test_omaha_holdem_8231_3c3sAsJhKd_8h5h9d9h_6cTs6s2s_JdAd5c2d_TdQc7sKs_Ah7h3dQd_4d4s8cTh_Kc6h4h7c() {
    assertEquals(
      "4d4s8cTh 6cTs6s2s 8h5h9d9h Kc6h4h7c JdAd5c2d TdQc7sKs Ah7h3dQd",
      Solver.process("omaha-holdem 3c3sAsJhKd 8h5h9d9h 6cTs6s2s JdAd5c2d TdQc7sKs Ah7h3dQd 4d4s8cTh Kc6h4h7c"));
  }

  @Test
  public void test_omaha_holdem_8232_3h4s9dJsQs_JhTs4d3c_7hKc8d6d_JcTdJdKd_Ah3s7s2s_KhAs9cQh_6c5cTh8c_6sAc9h6h() {
    assertEquals(
      "7hKc8d6d 6sAc9h6h JhTs4d3c KhAs9cQh 6c5cTh8c JcTdJdKd Ah3s7s2s",
      Solver.process("omaha-holdem 3h4s9dJsQs JhTs4d3c 7hKc8d6d JcTdJdKd Ah3s7s2s KhAs9cQh 6c5cTh8c 6sAc9h6h"));
  }

  @Test
  public void test_omaha_holdem_8233_AhJcQsTdTh_9dJdJs2d_3h2sAc4d_KdTs7hTc_3s9hQc9s_2cAs8c2h_Qh8h4hAd_6h5sKhQd() {
    assertEquals(
      "3s9hQc9s 3h2sAc4d 2cAs8c2h Qh8h4hAd 6h5sKhQd 9dJdJs2d KdTs7hTc",
      Solver.process("omaha-holdem AhJcQsTdTh 9dJdJs2d 3h2sAc4d KdTs7hTc 3s9hQc9s 2cAs8c2h Qh8h4hAd 6h5sKhQd"));
  }

  @Test
  public void test_omaha_holdem_8234_3h5d6sAsTc_3s5s4dKh_Ts7hJhTh_Ah3c2hQd_6hKcQh3d_5c4cAc9s_7cQs9c4s_2dJd8h5h() {
    assertEquals(
      "2dJd8h5h 3s5s4dKh 6hKcQh3d Ah3c2hQd 5c4cAc9s Ts7hJhTh 7cQs9c4s",
      Solver.process("omaha-holdem 3h5d6sAsTc 3s5s4dKh Ts7hJhTh Ah3c2hQd 6hKcQh3d 5c4cAc9s 7cQs9c4s 2dJd8h5h"));
  }

  @Test
  public void test_omaha_holdem_8235_5d6dQdQsTd_8d7h7cKc_JhTsJcAd_Ks9sKhAh_4h2cQc2d_4c3cAc5c_6h9dThKd() {
    assertEquals(
      "4c3cAc5c 8d7h7cKc JhTsJcAd Ks9sKhAh 4h2cQc2d 6h9dThKd",
      Solver.process("omaha-holdem 5d6dQdQsTd 8d7h7cKc JhTsJcAd Ks9sKhAh 4h2cQc2d 4c3cAc5c 6h9dThKd"));
  }

  @Test
  public void test_omaha_holdem_8236_4h9hAhQcQh_6sQdAcTs_Jd8sTd5d_Ks4d7c7h_2d9dKhJc_3c6h3hKc_9s5cAdAs_8c6c3d5h_4cThJsKd_2s3s2c7d() {
    assertEquals(
      "8c6c3d5h Jd8sTd5d 2s3s2c7d 4cThJsKd Ks4d7c7h 2d9dKhJc 3c6h3hKc 6sQdAcTs 9s5cAdAs",
      Solver.process("omaha-holdem 4h9hAhQcQh 6sQdAcTs Jd8sTd5d Ks4d7c7h 2d9dKhJc 3c6h3hKc 9s5cAdAs 8c6c3d5h 4cThJsKd 2s3s2c7d"));
  }

  @Test
  public void test_omaha_holdem_8237_2d5h6c6d7h_AsAh2s6h_4dJh7c9s_9dTd8h9c_3s5sJsQs_Ts2cKdQh_2h9h8c8s_TcKs3h3d_4cAd7s3c_Th4hJcQd() {
    assertEquals(
      "Th4hJcQd Ts2cKdQh TcKs3h3d 3s5sJsQs 4dJh7c9s 4cAd7s3c 2h9h8c8s=9dTd8h9c AsAh2s6h",
      Solver.process("omaha-holdem 2d5h6c6d7h AsAh2s6h 4dJh7c9s 9dTd8h9c 3s5sJsQs Ts2cKdQh 2h9h8c8s TcKs3h3d 4cAd7s3c Th4hJcQd"));
  }

  @Test
  public void test_omaha_holdem_8238_2c2h8d9dQd_3c6d5d6h_5sQcKd8h_Jd9h8sTd_3d2s4h7c() {
    assertEquals(
      "5sQcKd8h 3d2s4h7c 3c6d5d6h Jd9h8sTd",
      Solver.process("omaha-holdem 2c2h8d9dQd 3c6d5d6h 5sQcKd8h Jd9h8sTd 3d2s4h7c"));
  }

  @Test
  public void test_omaha_holdem_8239_AhJcQdQsTs_3d2c2h4s_9d4d3sKh_7d9c5s4c_Tc4h9s2s_8s6cThAd_3h5d8d9h() {
    assertEquals(
      "7d9c5s4c 3d2c2h4s Tc4h9s2s 8s6cThAd 3h5d8d9h 9d4d3sKh",
      Solver.process("omaha-holdem AhJcQdQsTs 3d2c2h4s 9d4d3sKh 7d9c5s4c Tc4h9s2s 8s6cThAd 3h5d8d9h"));
  }

  @Test
  public void test_omaha_holdem_8240_4d7c7h8d9c_8hTc3h2h_KcQd3s9d_AsTh7dQh() {
    assertEquals(
      "8hTc3h2h KcQd3s9d AsTh7dQh",
      Solver.process("omaha-holdem 4d7c7h8d9c 8hTc3h2h KcQd3s9d AsTh7dQh"));
  }

  @Test
  public void test_omaha_holdem_8241_2s4d5c9cKd_6h5s4s2c_Td4hAs3h_8d6s8cAd_QcQhJc9s_7hThKh4c() {
    assertEquals(
      "8d6s8cAd QcQhJc9s 6h5s4s2c 7hThKh4c Td4hAs3h",
      Solver.process("omaha-holdem 2s4d5c9cKd 6h5s4s2c Td4hAs3h 8d6s8cAd QcQhJc9s 7hThKh4c"));
  }

  @Test
  public void test_omaha_holdem_8242_4c6s8d9dKh_ThJd3s8h_6d8s6cQc_Qs3h7d2c_4h2s6h5s_Ks2dTsAs_3dAcKc3c_4sJc9c5d_7h7cTc4d() {
    assertEquals(
      "Qs3h7d2c ThJd3s8h 3dAcKc3c=Ks2dTsAs 4h2s6h5s 4sJc9c5d 6d8s6cQc 7h7cTc4d",
      Solver.process("omaha-holdem 4c6s8d9dKh ThJd3s8h 6d8s6cQc Qs3h7d2c 4h2s6h5s Ks2dTsAs 3dAcKc3c 4sJc9c5d 7h7cTc4d"));
  }

  @Test
  public void test_omaha_holdem_8243_5s7sJsQdQs_9d2d6sTd_7dAc3dKc_Ts9s5hJc_4d2s2hTc() {
    assertEquals(
      "9d2d6sTd 4d2s2hTc 7dAc3dKc Ts9s5hJc",
      Solver.process("omaha-holdem 5s7sJsQdQs 9d2d6sTd 7dAc3dKc Ts9s5hJc 4d2s2hTc"));
  }

  @Test
  public void test_omaha_holdem_8244_4s7h8dAsJs_AhAc6h7s_Jh2d3c4c_2s6s3s2c_KhKc8h5h_7c9hJdQh_Qs5dTcTh() {
    assertEquals(
      "Qs5dTcTh KhKc8h5h Jh2d3c4c 7c9hJdQh AhAc6h7s 2s6s3s2c",
      Solver.process("omaha-holdem 4s7h8dAsJs AhAc6h7s Jh2d3c4c 2s6s3s2c KhKc8h5h 7c9hJdQh Qs5dTcTh"));
  }

  @Test
  public void test_omaha_holdem_8245_3c3s5s8c8h_9c7cQhKd_TsJc4c7s_2cAh6hTh_Ks6c5dTc_9s4sJhJd() {
    assertEquals(
      "TsJc4c7s 9c7cQhKd 2cAh6hTh Ks6c5dTc 9s4sJhJd",
      Solver.process("omaha-holdem 3c3s5s8c8h 9c7cQhKd TsJc4c7s 2cAh6hTh Ks6c5dTc 9s4sJhJd"));
  }

  @Test
  public void test_omaha_holdem_8246_7s9sAhAsTh_5s8d6d2c_9d3c5d7d_6sJcKdJd() {
    assertEquals(
      "9d3c5d7d 6sJcKdJd 5s8d6d2c",
      Solver.process("omaha-holdem 7s9sAhAsTh 5s8d6d2c 9d3c5d7d 6sJcKdJd"));
  }

  @Test
  public void test_omaha_holdem_8247_4s6h6sKdTs_KsAs3sAc_Ad3h9c9s_5h7sKc2s() {
    assertEquals(
      "Ad3h9c9s 5h7sKc2s KsAs3sAc",
      Solver.process("omaha-holdem 4s6h6sKdTs KsAs3sAc Ad3h9c9s 5h7sKc2s"));
  }

  @Test
  public void test_omaha_holdem_8248_5c5dAcJdJs_Ah2s3d9d_3s5hJhQc_Th8c7s8d_2hKh2d4s_6c9cTs6d_Kd5s3cQs_3hQh7cAs_8hTcAdJc_6s6hKc9s() {
    assertEquals(
      "2hKh2d4s 6c9cTs6d=6s6hKc9s Th8c7s8d Ah2s3d9d 3hQh7cAs Kd5s3cQs 3s5hJhQc 8hTcAdJc",
      Solver.process("omaha-holdem 5c5dAcJdJs Ah2s3d9d 3s5hJhQc Th8c7s8d 2hKh2d4s 6c9cTs6d Kd5s3cQs 3hQh7cAs 8hTcAdJc 6s6hKc9s"));
  }

  @Test
  public void test_omaha_holdem_8249_6c9sJsKcTc_2s5h6s4d_Ts5s7s5c_JdJhThAc() {
    assertEquals(
      "2s5h6s4d Ts5s7s5c JdJhThAc",
      Solver.process("omaha-holdem 6c9sJsKcTc 2s5h6s4d Ts5s7s5c JdJhThAc"));
  }

}
